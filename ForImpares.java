/*
 FUP que atrav�s do la�o de repeti��o FOR, solicite ao usu�rio 4 n�meros inteiros e ao final, 
 imprima todos os n�meros impares que ele informou
 */
public class ForImpares{
  public static void main(String[] args){
  
    String numeros_impares = "";
    int numero = 0; //variavel que o usuario vai preencher
    for(int x = 0; x < 4; x++){
      numero = Entrada.leiaInt("Informe um n�mero inteiro:");
      if(numero%2 != 0){
        numeros_impares += numero + ", ";
        //System.out.println("N�meros impares informados: " + numero);
      }
    }
    
    System.out.println("N�meros impares informados: " + numeros_impares);
  
  }
}