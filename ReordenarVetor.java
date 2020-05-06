/*
 * FUP que dado um vetor: vetor[] = {1,2,3,4,5}, reordene os valores dentro do vetor, 
 * imprimindo no final os valores de trás para frente
 */ 
public class ReordenarVetor{

  public static void main(String[] args){
    
    int[] vetor = {1,2,3,4,5};
    int[] invertido = new int[vetor.length];
    //tamanho do vetor é igual ao tamanho de itens dentro dele
    
    System.out.println("laço original:"); 
    for(int i = 0; i < vetor.length; i++){//i vai de 0 até 4
     System.out.println("vetor["+ i +"]:" + vetor[i]);
    }
    
    //exemplo 1 para percorrer um vetor ao contrário
    System.out.println("Segundo laço:");
    for(int i = vetor.length - 1; i >= 0; i--){//i vai de 4 até 0
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
    
    //exemplo 2 para percorrer um vetor ao contrário
    System.out.println("Mesmo laço do anterior em while:");
    int num = vetor.length - 1;
    while(num >= 0){
      System.out.println("vetor[" + num + "]: " + vetor[num]);
      //aqui a gente preenche o valor do invertido a partir do indice 0
      invertido[(vetor.length - 1 - num)] = vetor[num];//0-4, 1-3, 2-2, 3-1, 4-0
      num--;
    }
    
    System.out.println("Vetor invertido:");
    for(int i = 0; i < invertido.length; i++){
      System.out.println("invertido[" + i + "]: " + invertido[i]);
    }
      
    System.out.println("Fim do Programa"); 
  }

}