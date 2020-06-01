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
    
    int vida = 100;
    int ataque = 20;
    int classe = 1;
    
    String nome = EntradaScanner.leiaString("Informe o seu nome"); //nome do nosso personagem
    
    for(int i = 0; i < 5; i++){
      int d1 = jogarDado(10);
      if(d1 == 1 || d1 == 2){//20% de chance neste exemplo
        System.out.println("Dano crítico!"); 
      }
    }
    
    int[] vetor = {1,2,3};
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Vetor na posição " + i + " = " + vetor[i]); 
    }
    
    System.out.println("Alterando o vetor...");
    vetor = mudarVetor();
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Vetor na posição " + i + " = " + vetor[i]); 
    }
    
    vida = vetor[0];
    ataque = vetor[1];
    imprimePersonagem(nome, vida, classe, ataque);
    
    Entrada.mostraTexto("JOGO DO LABIRINTO", "");
    enfrentarInimigo();
    
    imprimePersonagem(nome, vida, classe, ataque);
    
    Entrada.mostraTexto("JOGO DO LABIRINTO", "");
    
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
  
  private static int[] mudarVetor(){
    int v1 = jogarDado(6);
    int v2 = jogarDado(50);
    int v3 = jogarDado(100);
    
    int[] vet = {v1, v2, v3};
    
    return vet;
  }
  
  private static int jogarDado(int tamanho){
    
    int dado = (int) (Math.random() * tamanho) + 1;
    System.out.println("Jogou o dado: " + dado);
    return dado;
    
  }
  
  private static void enfrentarInimigo(){
    System.out.println("Começou o confronto");
    if(jogarDado(10) < 4){
      vida-= 20;
    }else{
      vida-= 10; 
    }
    
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