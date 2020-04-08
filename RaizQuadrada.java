/*
 FUP que utilize o laço ENQUANTO para solicitar 3 números ao usuário, e para cada número, 
 informe a sua raiz quadrada
 */
public class RaizQuadrada{
  
  public static void main(String[] args){
    
    int contador = 0;
    int numero;
    
    while(contador < 3){
      numero = Entrada.leiaInt("Informe um número para calcular a sua raiz quadrada:");
      System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
      contador += 1;
    }
    
    System.out.println("Fim do programa");
    
  }

}