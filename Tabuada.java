/*
 * FUP que solicite um n�mero para o usu�rio e atrav�s deste n�mero, imprima a sua tabuada.
 */

public class Tabuada{
 
  public static void main(String[] args){
    
    int tabuada = Entrada.leiaInt("Informe um n�mero para a tabuada");
    int resultado = 0;
    for(int x = 0; x <= 10; x++){
      resultado = x * tabuada;
      System.out.println(x + " x " + tabuada + " = " + resultado);
    }
    
  }

}