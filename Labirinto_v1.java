/*
 *Nesta atividade voc� dever� criar uma esp�cie de jogo em formato de labirinto, ou seja, 
 * com base em perguntas e respostas, o usu�rio ser� levado a um caminho onde encontrar� 
 * monstros que o atacar�o caso ele decida ir para o caminho errado. 
 * O jogo se baseia em probabilidade apenas. Finalizar o labirinto � o desafio aqui.
 * 
 * author: Jonas A. Dhein
 */
public class Labirinto_v1{
  public static void main(String[] args){
  
    int vida = 100; //vida do nosso personagem
    int dado = 0; //exemplo de utiliza��o de um dado 20 lados (0 a 19)
    
    //1� passo
    String direcao = "";
    while(!direcao.equalsIgnoreCase("direita") && !direcao.equalsIgnoreCase("esquerda") 
            && !direcao.equalsIgnoreCase("frente")){
      
      direcao = Entrada.leiaString("Informe uma dire��o");
      
    }
    
    if(direcao.equalsIgnoreCase("frente")){
      System.out.println("Voc� pisou em uma cobra, que azar.");
      dado = (int) (Math.random() * 20); //jogar o dado
      vida = vida - dado;
    }else{
      //achou um frasco de vida
      vida = vida + (int) (Math.random() * 5);
      if(vida > 100){//validando se a vida passou de 100
        vida = 100;//volta para 100 neste caso
      }
    };
    
    if(vida <= 0){
      //mensagem de GAME OVER
      return;
    }
    
    //2� passo
    direcao = "";
    while(!direcao.equalsIgnoreCase("direita") && !direcao.equalsIgnoreCase("esquerda")
            && !direcao.equalsIgnoreCase("frente")){
      direcao = Entrada.leiaString("Informe uma dire��o");
    }
    
    if(direcao.equalsIgnoreCase("direita") || direcao.equalsIgnoreCase("esquerda")){
      System.out.println("Voc� pisou em um urso, que azar.");
      dado = (int) (Math.random() * 30);
      vida = vida - dado;
    }else{
      //mensagem de OK
    };
    
    System.out.println("Fim do Programa. Vida = " + vida);
    
  }
}