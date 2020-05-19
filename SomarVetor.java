/*
 * FUP que tenha 1 método: somar todos os números de um vetor
 * MAIS 1 MÉTODO: Multiplicar os valores do vetor
 */
public class SomarVetor{
  
  public static void main(String[] args){
    
    int[] vetor = {1,2,3,4,5,6};
    
    int soma = 0;
    soma = somarNumeros(1, 2);
    soma += somarNumeros(3, 4);
    soma += somarNumeros(5, 6);
    System.out.println("Soma dos números: " + soma);
    
    soma = somarNumeros(vetor);
    System.out.println("Soma do vetor: " + soma);
    
    int multiplicacao = multiplicarNumeros(vetor);
    System.out.println("Multiplicação do vetor: " + multiplicacao);
    
  }
  
  private static int somarNumeros(int n1, int n2){
    int soma = (n1 + n2);
    return soma;
  }
  
  //private = Este método está disponível apenas dentro desta Classe
  //static = Não necessitamos criar uma instância da Classe para utilizar este método
  //void = Método sem retorno, quando tiver retorno, devemos colocar o tipo do retorno
  private static int somarNumeros(int[] v1){
    int soma = 0;
    for(int i = 0; i < v1.length; i++){
      soma += v1[i];
    }
    return soma;
  }
  
  private static int multiplicarNumeros(int[] v1){
    int multiplicacao = 1;
    for(int i = 0; i < v1.length; i++){
      multiplicacao = multiplicacao * v1[i];
    }
    return multiplicacao;
  }
}
