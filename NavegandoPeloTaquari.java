/**
 * Autor: Augusto Rosli Neto
 * 
 * Jogo tipo labirinto - "Navegando pelo Taquari"
 * 
 * Neste jogo de labirinto o jogador estará navegando pelo Rio Taquari em uma canoa. A cada trifurcação do rio será escolhido um caminho: frente, esquerda ou direira.
 * O jogador inicia o jogo com nível de energia = 100.
 * Em cada caminho, poderá haver uma pedra (que tirará 20 pts da energia), um tronco (tira 10 pts) ou não haver obstáculos (o que deixará o nível de energia intacto e em alguns pontos pode ter
 * um schnapps, que dará 10 pts de energia).
 * 
 * Usado o Math.random para definir as sequências dos caminhos.
 * Livre: 1/3/2/2/2/1/1/3/1/2
 * -10 pts: 2/2/3/3/3/2/2/1/3/1
 * -20 pts: 3/1/1/1/1/3/3/2/2/3
 * 
 */

import javax.swing.*;

public class NavegandoPeloTaquari {
  
  public static void main(String args[]){
  
  JOptionPane.showMessageDialog(null, "Você navegará pelo Rio Taquari em sua canoa. A cada trifurcação do rio escolha entre ir para frente, para a direita ou para a esquerda", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);  
  JOptionPane.showMessageDialog(null, "Você inicia o jogo com 100 pontos de energia", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null, "A cada escolha você poderá encontrar um obstáculo que tirará 20 pontos de sua energia; 10 pontos de sua energia ou não encontrar obstáculo - o que manterá sua energia no mesmo nível.", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null, "Nestes últimos poderá haver um schnapps, que lhe darão 10 pontos de energia", "Navegando pelo Taquari", JOptionPane.INFORMATION_MESSAGE);

  int passo1 = Entrada.leiaInt("Escolha qual direção seguir: \n 1 - Frente \n 2 - Direita \n 3 - Esquerda");     
  
  int energia = 100;
  int tronco = 10;
  int pedra = 20;
  int schnapps = 10;

 
    if(passo1 == 1){
    energia = energia;
    System.out.println("Você desviou dos obstáculos e manteve seu nível de energia. Sua energia é " + energia + ".");
    }else if(passo1 == 2){
    energia = energia - tronco;
    System.out.println("Você bateu em um tronco e perdeu 10 pontos de energia. Seu nível de energia agora é " + energia + ".");
    }else if(passo1 == 3){
    energia = energia - pedra;
    System.out.println("Você bateu em uma pedra e perdeu 20 pontos de energia. Seu nível de energia agora é " + energia + ".");
    }

    int passo2 = Entrada.leiaInt("Escolha qual direção seguir: \n 1 - Frente \n 2 - Direita \n 3 - Esquerda");     
   
    if(passo2 == 1){
    int energia = energia - pedra;
    System.out.println("Você bateu em uma pedra e perdeu 20 pontos de energia. Seu nível de energia agora é " + energia + ".");
    } else if(passo2 == 2){
    int energia = energia - tronco;
    System.out.println("Você bateu em um tronco e perdeu 10 pontos de energia. Seu nível de energia agora é " + energia + ".");
    } else if(passo2 == 3){
    int energia = energia;
    System.out.println("Você desviou dos obstáculos e manteve seu nível de energia. Sua energia é " + energia + ".");
    }

   
    
  }
  
}
