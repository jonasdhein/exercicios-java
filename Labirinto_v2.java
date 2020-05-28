/*
 *Nesta atividade você deverá criar uma espécie de jogo em formato de labirinto, ou seja, 
 * com base em perguntas e respostas, o usuário será levado a um caminho onde encontrará 
 * monstros que o atacarão caso ele decida ir para o caminho errado. 
 * O jogo se baseia em probabilidade apenas. Finalizar o labirinto é o desafio aqui.
 * 
 * author: Jonas A. Dhein
 */
public class Labirinto_v2{
  
  public static void main(String[] args){
    
    int vida = 0; //vida do nosso personagem
    int ataque = 0; //ataque do nosso personagem
    String nome = Entrada.leiaString("Informe o seu nome"); //nome do nosso personagem
    
    int classe = Entrada.leiaOpcao("Escolha uma classe", "Guerreiro", "Mago", "Cartman");
    if(classe == 1){
      vida = 80;
      ataque = 10;
    }else if(classe == 2){
      vida = 60;
      ataque = 20;
    }else if(classe == 3){
      vida = 200;
      ataque = 2;
    }
    
    int dado = 0; //exemplo de utilização de um dado 20 lados (0 a 19)
    int dificuldade = -1;
    
    Entrada.mostraTexto("JOGO DO LABIRINTO", "Seja bem-vindo ao labirinto do caos. Escolha o lado errado e você se ****");
    
    while(dificuldade != 0 && dificuldade != 1 && dificuldade != 2){
      dificuldade = Entrada.leiaInt("Escolha uma dificuldade:\n 0-Fácil\n 1-Médio\n 2-Difícil");
    }
    
    int direcao = 0;
    
    for(int i = 0; i < (10 + dificuldade); i++){
      System.out.println("PASSO " + (i+1));
      while(direcao != 1 && direcao != 2 && direcao != 3){
        direcao = Entrada.leiaInt("Informe uma direção:\n 1-Frente\n 2-Direita\n 3-Esquerda");
      }
      
      dado = (int) (Math.random() * (3 + dificuldade)) + 1; //jogar o dado
      System.out.println("jogou o dado: " + dado);
      if(direcao != dado){
        dado = (int) (Math.random() * 40); //jogar o dado
        vida = vida - dado;
        if(vida < 0){
          vida = 0;
        }
        System.out.println("Você pisou em um matriz[i][x], que azar. (" + vida + ")");
      }else{
        //achou um frasco de vida
        vida = vida + (int) (Math.random() * 5);
        if(vida > 100){//validando se a vida passou de 100
          vida = 100;//volta para 100 neste caso
        }
      };
      
      imprimePersonagem(nome, vida, classe, ataque);
      
      if(vida == 0){
        System.out.println("GAME OVER. VOCÊ CONSEGUIU ANDAR " + (i+1) + " PASSOS!!!");
        return;
      }
    
      direcao = 0;
    }
    
    System.out.println("PARABÉNS!!! VOCÊ FINALIZOU O LABIRINTO COM OS "+ (10 + dificuldade) +" PASSOS");
    
  }
  
  private static void imprimePersonagem(String nome, int vida, int classe, int ataque){
     System.out.println("-------------");
     System.out.println(nome);
     if(classe == 1){
       System.out.println("Classe:\tGuerreiro");
     }
     
     System.out.println("Vida:\t" + vida);
     System.out.println("Ataque:\t" + ataque);
  }
  
  
}