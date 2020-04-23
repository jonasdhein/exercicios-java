/*
 * FUP que solicite um número para o usuário e através deste número, imprima a sua tabuada.
 */

public class Tabuada{
 
  public static void main(String[] args){
    
    int tabuada = Entrada.leiaInt("Informe um número para a tabuada");
    int resultado = 0;
    for(int x = 0; x <= 10; x++){
      resultado = x * tabuada;
      System.out.println(x + " x " + tabuada + " = " + resultado);
    }
    
  }

}