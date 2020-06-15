
public class Labirinto_deuses {
  
  
  public static void main(String[] args) { 
    int  vida_jogador = 100; // vida do jogador, inicia com 100
    int dado = 0; // valor do dado, dado de 20 lados valores de 1 a 19
    int nivel = 1; // nivel de dificuldade que o jogador quer jogar
    
    Entrada.mostraTexto("LABIRINTO DOS DEUSES", " Bem-vindo ao Labirinto dos Deuses - Escolha um deus e entre na batalha do Labirinto");
    
    personagem = Entrada.leiaOpcao("Escolha um Deus e adentre o labirinto, escolha com sabedoria", "Atenas","Afrodite","Poseidon","Zeus");
    System.out.println(nivel);
    if (personagem == 1){
      Entrada.mostraTexto("Voce e a Deusa da sabedoria e das Artes, utilize isto para fazer boas escolhas no labirinto");
    }if ( personagem == 2){
      Entrada.mostraTexto("Voce e a Deusa do amor e da beleza, utilize isto ao seu favor no labirinto");
    } if ( personagem == 3 ){
      Entrada.mostraTexto("Voce e o Deus dos Mares, utilize seu Tridente no labirinto");
    } if( personagem == 4 ){
      Entrada.mostraTexto("Voce e o Deus dos Ceus, utilize o Raio no labirinto");
    }
    
    
    nivel = Entrada.leiaOpcao("Escolha um nivel de dificuldade", "Facil", "Medio", "Dificil");
    System.out.println(nivel);
    
  
  
  int direcao = 0;
  
  for ( int i = 0; i< (10 + nivel); i++ ){
    System.out.println( "Passo " + (i+1));
    while( direcao != 1 &&  direcao!=2 && direcao!=3){     
      direcao = Entrada.leiaOpcao(" Avance no labirinto", "Direita", "Esquerda", "Frente");
      System.out.println(direcao);
    }
    
    dado = (int) (Math.random() * (3 + nivel)) +1; // sorteio de um nemero - jogar o dado
    System.out.println( " Numero sorteado: " + dado);
    if (direcao != dado ){
      dado = (int) (Math.random() * 40); // sorteio de um nemero - jogar o dado
      vida_jogador = vida_jogador - dado;
      if (vida_jogador < 0 ){
        vida_jogador = 0;
      }
      Entrada.mostraTexto( " Voce encontrou Hades, perdeu vidas e agora este no submundo " + vida_jogador ); 
    } else  {
      // ganhou vidas
      vida_jogador = vida_jogador + (int) (Math.random() * 5);
      if ( vida_jogador > 100 ){ // para o jogador neo ficar com vida maior que 100
        vida_jogador = 100; 
      }
      Entrada.mostraTexto( " Voce encontrou Afrodite, ganhou vidas e agora este no paraeso" + vida_jogador );
    };
    if ( vida_jogador == 0 ){
      Entrada.mostraTexto( " Fim do jogo.Voce perdeu todas as vidas e ficare para sempre no submundo. Voce conseguiu andar " + ( i+1) + " Passos! ");
      return;
    }
    
    direcao = 0;
    
  }
  
  Entrada.mostraTexto("Parabens, voce ganhou o jogo e ficare para sempre no paraeso. Voce foi abeneoado por Zeus e finalizou o labirinto com " + ( 10 + nivel ) + " passos ");
  
  
  
}

}
