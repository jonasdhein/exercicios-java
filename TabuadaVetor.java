/*
 * FUP que solicite 3 números para o usuário, armazenando-os em um vetor de 3 posições.
 * Em seguida, imprima a tabuada de cada número informado.
 */

public class TabuadaVetor{
 
  public static void main(String[] args){
    
    int[] tabuada = new int[4];
    for(int i = 0; i < tabuada.length; i++){
      tabuada[i] = Entrada.leiaInt("Informe um número qualquer");
    }//laço para armazenar os números das tabuadas
    
    for(int i = 0; i < tabuada.length; i++){
      System.out.println("TABUADA DO " + tabuada[i] + ":");
      for(int x = 1; x <= 10; x++){
         System.out.println(x + " x " + tabuada[i] + " = " + (x  * tabuada[i]));
      }//passo para cada valor da tabuada
      
    }//laço para percorrer os números informados pelo usuário
  }
}