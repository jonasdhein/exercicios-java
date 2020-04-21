/*
 *Nesta atividade voc� dever� criar uma esp�cie de jogo em formato de labirinto, ou seja, 
 * com base em perguntas e respostas, o usu�rio ser� levado a um caminho onde encontrar� 
 * monstros que o atacar�o caso ele decida ir para o caminho errado. 
 * O jogo se baseia em probabilidade apenas. Finalizar o labirinto � o desafio aqui.
 * 
 * author: Jonas A. Dhein
 */
public class Labirinto_v2{
  public static void main(String[] args){
    
    int vida = 100; //vida do nosso personagem
    int dado = 0; //exemplo de utiliza��o de um dado 20 lados (0 a 19)
    int dificuldade = -1;
    
    Entrada.mostraTexto("JOGO DO LABIRINTO", "Seja bem-vindo ao labirinto do caos. Escolha o lado errado e voc� se ****");
    
    while(dificuldade != 0 && dificuldade != 1 && dificuldade != 2){
      dificuldade = Entrada.leiaInt("Escolha uma dificuldade:\n 0-F�cil\n 1-M�dio\n 2-Dif�cil");
    }
    
    int direcao = 0;
    
    for(int i = 0; i < (10 + dificuldade); i++){
      System.out.println("PASSO " + (i+1));
      while(direcao != 1 && direcao != 2 && direcao != 3){
        direcao = Entrada.leiaInt("Informe uma dire��o:\n 1-Frente\n 2-Direita\n 3-Esquerda");
      }
      
      dado = (int) (Math.random() * (3 + dificuldade)) + 1; //jogar o dado
      System.out.println("jogou o dado: " + dado);
      if(direcao != dado){
        dado = (int) (Math.random() * 40); //jogar o dado
        vida = vida - dado;
        if(vida < 0){
          vida = 0;
        }
        System.out.println("Voc� pisou em um monstro, que azar. (" + vida + ")");
      }else{
        //achou um frasco de vida
        vida = vida + (int) (Math.random() * 5);
        if(vida > 100){//validando se a vida passou de 100
          vida = 100;//volta para 100 neste caso
        }
      };
      
      if(vida == 0){
        System.out.println("GAME OVER. VOC� CONSEGUIU ANDAR " + (i+1) + " PASSOS!!!");
        return;
      }
    
      direcao = 0;
    }
    
    System.out.println("PARAB�NS!!! VOC� FINALIZOU O LABIRINTO COM OS "+ (10 + dificuldade) +" PASSOS");
    
  }
}