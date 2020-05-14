/*
 * FUP que consiga ordenar um vetor de inteiros em ordem crescente de valor
 * Bubble sort (ordenacao por flutuacao)
 */
public class OrdenarVetor{

  public static void main(String[] args){
   
    int[] numeros = {4,3,5,1,2}; //
    int tam = numeros.length; //armazenando o tamanho do vetor
    
    int temp = 0;
    for(int i = 0; i < tam - 1; i++){
      for(int x = 0; x < tam - i - 1; x++){
        if(numeros[x] > numeros[(x+1)]){
          temp = numeros[x];
          numeros[x] = numeros[(x+1)];
          numeros[(x+1)] = temp;
        }
      }
    }
    
    for(int i = 0; i < numeros.length; i++){
      System.out.print(numeros[i] + ",");
    }
    
    System.out.println("\nFim do programa");
    
  }

}