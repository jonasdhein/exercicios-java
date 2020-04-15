/*
 FUP que através do laço de repetição FOR, solicite ao usuário 4 números inteiros e ao final, 
 imprima todos os números impares que ele informou
 */
public class ForImpares{
  public static void main(String[] args){
  
    String numeros_impares = "";
    int numero = 0; //variavel que o usuario vai preencher
    for(int x = 0; x < 4; x++){
      numero = Entrada.leiaInt("Informe um número inteiro:");
      if(numero%2 != 0){
        numeros_impares += numero + ", ";
        //System.out.println("Números impares informados: " + numero);
      }
    }
    
    System.out.println("Números impares informados: " + numeros_impares);
  
  }
}