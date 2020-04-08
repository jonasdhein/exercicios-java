/*
FUP que diga se um número é par ou ímpar através do resto da divisão (%)
*/
public class NumeroParOuImpar{

  public static void main(String[] args){
  
    int numero = 6;
    int resto = numero%2;
    
    if(resto == 0){
      System.out.println("PAR");
    }else{
      System.out.println("IMPAR");
    }
  
  }

}