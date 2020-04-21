/**
 * Autor: Augusto Rosli Neto
 * 
 * Jogo tipo labirinto - "Navegando pelo Taquari"
 * 
 * Neste jogo de labirinto o jogador estar� navegando pelo Rio Taquari em uma canoa. A cada trifurca��o do rio ser� escolhido um caminho: frente, esquerda ou direira.
 * O jogador inicia o jogo com n�vel de energia = 100.
 * Em cada caminho, poder� haver uma pedra (que tirar� 20 pts da energia), um tronco (tira 10 pts) ou n�o haver obst�culos (o que deixar� o n�vel de energia intacto e em alguns pontos pode ter
 * um schnapps, que dar� 10 pts de energia).
 * 
 * Usado o Math.random para definir as sequ�ncias dos caminhos.
 * Livre: 1/3/2/2/2/1/1/3/1/2
 * -10 pts: 2/2/3/3/3/2/2/1/3/1
 * -20 pts: 3/1/1/1/1/3/3/2/2/3
 * 
 */

import javax.swing.*;

public class NavegandoPeloTaquari {
  
  public static void main(String args[]){
  
  JOptionPane.showMessageDialog(null, "Voc� navegar� pelo Rio Taquari em sua canoa. A cada trifurca��o do rio escolha entre ir para frente, para a direita ou para a esquerda", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);  
  JOptionPane.showMessageDialog(null, "Voc� inicia o jogo com 100 pontos de energia", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null, "A cada escolha voc� poder� encontrar um obst�culo que tirar� 20 pontos de sua energia; 10 pontos de sua energia ou n�o encontrar obst�culo - o que manter� sua energia no mesmo n�vel.", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null, "Nestes �ltimos poder� haver um schnapps, que lhe dar�o 10 pontos de energia", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);

  int passo1 = Entrada.leiaInt("Escolha qual dire��o seguir: \n 1 - Frente \n 2 - Direita \n 3 - Esquerda");     
  
  int energia = 100;
  int tronco = 10;
  int pedra = 20;
  int schnapps = 10;

 
    if(passo1 == 1){
    energia = energia;
    System.out.println("Voc� desviou dos obst�culos e manteve seu n�vel de energia. Sua energia � " + energia + ".");
    }else if(passo1 == 2){
    energia = energia - tronco;
    System.out.println("Voc� bateu em um tronco e perdeu 10 pontos de energia. Seu n�vel de energia agora � " + energia + ".");
    }else if(passo1 == 3){
    energia = energia - pedra;
    System.out.println("Voc� bateu em uma pedra e perdeu 20 pontos de energia. Seu n�vel de energia agora � " + energia + ".");
    }

    int passo2 = Entrada.leiaInt("Escolha qual dire��o seguir: \n 1 - Frente \n 2 - Direita \n 3 - Esquerda");     
   
    if(passo2 == 1){
    int energia = energia - pedra;
    System.out.println("Voc� bateu em uma pedra e perdeu 20 pontos de energia. Seu n�vel de energia agora � " + energia + ".");
    } else if(passo2 == 2){
    int energia = energia - tronco;
    System.out.println("Voc� bateu em um tronco e perdeu 10 pontos de energia. Seu n�vel de energia agora � " + energia + ".");
    } else if(passo2 == 3){
    int energia = energia;
    System.out.println("Voc� desviou dos obst�culos e manteve seu n�vel de energia. Sua energia � " + energia + ".");
    }

   
    
  }
  
}
