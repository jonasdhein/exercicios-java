/*
 * FUP que solicite 3 n�meros para o usu�rio, armazenando-os em um vetor de 3 posi��es.
 * Em seguida, imprima a tabuada de cada n�mero informado.
 */

public class TabuadaVetor{
 
  public static void main(String[] args){
    
    int[] tabuada = new int[4];
    for(int i = 0; i < tabuada.length; i++){
      tabuada[i] = Entrada.leiaInt("Informe um n�mero qualquer");
    }//la�o para armazenar os n�meros das tabuadas
    
    for(int i = 0; i < tabuada.length; i++){
      System.out.println("TABUADA DO " + tabuada[i] + ":");
      for(int x = 1; x <= 10; x++){
         System.out.println(x + " x " + tabuada[i] + " = " + (x  * tabuada[i]));
      }//passo para cada valor da tabuada
      
    }//la�o para percorrer os n�meros informados pelo usu�rio
  }
}