
public class LabirintoMariana {
  
  
  public static void main(String[] args) { 
    
    int vida = 100;
    int poder = 20;
    int sorte = 1;
    boolean inimigo_existe = false;
    int inimigo;
    int cont_inimigo = 0; 
    
    Entrada.mostraTexto("LABIRINTO DOS DEUSES", " Bem-vindo ao Labirinto dos Deuses - Escolha um deus e entre na batalha do Labirinto");
    
    int personagem = Entrada.leiaOpcao("Escolha um Deus e adentre o labirinto, escolha com sabedoria", "Atenas","Afrodite","Poseidon","Zeus");
    
    if (personagem == 1){
      Entrada.mostraTexto("Atenas","Vo a Deusa da sabedoria e das Artes, utilize isto para fazer boas escolhas no labirinto");
    }if ( personagem == 2){
      Entrada.mostraTexto("Afrodite","Vo a Deusa do amor e da beleza, utilize isto ao seu favor no labirinto");
    } if ( personagem == 3 ){
      Entrada.mostraTexto("Podeidom","Voc  o Deus dos Mares, utilize seu Tridente no labirinto");
    } if( personagem == 4 ){
      Entrada.mostraTexto("Zeus","Voc o Deus dos C s, utilize o Raio no labirinto");
    } 
    
    
    sorte = Entrada.leiaOpcao("Teste sua sorte e escolha um frasco", "Frasco 1", "Frasco 2", "Frasco 3");
    System.out.println(sorte);
    if(sorte == 1){
      vida = 50;
      poder = 10;
      Entrada.mostraTexto("Frasco 1","Vo  ganhou " + vida + " vidas e " + poder + " poderes ");
    }else if(sorte == 2){
      vida = 100;
      poder = 20;
      Entrada.mostraTexto("Frasco 2","  ganhou " + vida + " vidas e " + poder + " poderes ");
    }else if(sorte == 3){
      vida = 200;
      poder = 30;
      Entrada.mostraTexto("Frasco 3","Voc  ganhou " + vida + " vidas e " + poder + " poderes ");
    }
    
    imprimePersonagem(personagem, vida, sorte, poder);
    
    
    int direcao = 0;
    
    String[] vetor_inimigos = {"Hades", "Medusa", "Gaia", "Tifao", "Urano"};
    int[] inimigos_enfrentados = new int[5];
    
    for(int i = 0; i < (10 + sorte); i++){
      System.out.println("PASSO " + (i+1));
      while(direcao != 1 && direcao != 2 && direcao != 3){
        direcao = Entrada.leiaOpcao(" Avance no labirinto", "Direita", "Esquerda", "Frente");
        System.out.println(direcao);
        
        for(int j = 0; j < 5; j++){
          
          do{
            inimigo_existe = false;
            inimigo = jogarDado(5);
            for(int x = 0; x < inimigos_enfrentados.length; x++){
              if(inimigo == inimigos_enfrentados[x]){
                inimigo_existe = true;
              }
            }
          }while(inimigo_existe == true);
          
          inimigos_enfrentados[i] = inimigo;
          
          Entrada.mostraTexto("Batalha","Voce enfrentara: " + vetor_inimigos[inimigo-1]);
          
          int valor_confronto = confronto(inimigo);
          vida = vida - valor_confronto;
          if(vida <= 0){
            Entrada.mostraTexto("Resultado","Os deuses nao estao com voce, voce perdeu a batalha para o inimigo " + vetor_inimigos[inimigo-1]);
            return;
          }
        }
        
        Entrada.mostraTexto("Resultado"," Voce ganhou a batalha, os Deuses estao com voce");
        
        int[] vetor = {1,2,3};
        for(int z = 0; z < vetor.length; z++){
          System.out.println("Vetor na posicao " + i + " = " + vetor[i]); 
        }
        
        System.out.println("Alterando o vetor...");
        vetor = mudarVetor();
        for(int z = 0; z < vetor.length; z++){
          System.out.println("Vetor na posicao " + i + " = " + vetor[i]); 
        }
        
        boolean voltou_vivo = confronto(inimigos[cont_inimigo]); //cont_inimigo = 0
        if(voltou_vivo){
          cont_inimigo += 1;
        }
        
        boolean voltou_vivo = confronto(inimigos[cont_inimigo]); //cont_inimigo = 1
        if(voltou_vivo){
          cont_inimigo += 1;
        }
        
        vida = vetor[0];
        poder = vetor[1];
        
        imprimePersonagem(personagem, vida, sorte, poder);
        
        int dado = 0; 
        int sorte = 1;
        
      }
      
    }
    
  }//fechamento do metodo main
  
  private static int jogarDado(int tamanho){    
    int dado = (int) (Math.random() * tamanho) + 1;
    System.out.println("Jogou o dado: " + dado);
    return dado;
  }//fechando do metodo jogarDado
  
  private static int confronto(int inimigo){
    int valor = jogarDado(200);
    if ( valor >= 100 ){
      confronto = -50;
    }else{
      confronto = 50;
    }
    return valor;
  }//fechamento do m�todo confronto
  
  private static void imprimePersonagem(int personagem, int vida, int sorte, int poder){
    System.out.println("-------------");
    if (personagem == 1){
      System.out.println("ATENA");
    } if (personagem == 2){
      System.out.println("AFRODITE");
    } if (personagem == 3){
      System.out.println("POSEIDOM");
    } if (personagem == 4){
      System.out.println("ZEUS");
    }
    
    if(sorte == 1){
      System.out.println("Sorte:\tFraca");
    } if(sorte == 2){
      System.out.println("Sorte:\tMedia");
    } if(sorte == 3){
      System.out.println("Sorte:\tForte");
    }
    
    System.out.println("Vida:\t" + vida);
    System.out.println("Poder:\t" + poder);
    Entrada.mostraTexto("Vidas e Poder ", " Voce tem " + vida + " vidas " + " e " + poder + " poderes ");
    
  }//Fechamento do m�todo imprime personagem
  
  private static int[] mudarVetor(){
    int v1 = jogarDado(6);
    int v2 = jogarDado(50);
    int v3 = jogarDado(100);
    
    int[] vet = {v1, v2, v3};
    
    return vet;
  }//Fechamento do m�todo mudarvetor
  
}
