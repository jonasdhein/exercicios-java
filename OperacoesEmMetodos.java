/*
 * FUP que tenha 1 método: somar os números passados nos argumentos
 */
public class OperacoesEmMetodos{
  
  public static void main(String[] args){
    
    int num1 = 5;
    int num2 = 12;
    int num3 = 3;
    somarNumeros(1,2,3);
    
  }
  
  //recebe 4 argumentos do tipo int
  private static void somarNumeros(int n1, int n2, int n3, int n4){
    int soma = n1 + n2 + n3 + n4;
    System.out.println("Soma dos números: " + soma);
  }
  
  private static void somarNumeros(int n1, int n2, int n3){
    int soma = n1 + n2 + n3;
    System.out.println("Soma dos números: " + soma);
  }
  
}