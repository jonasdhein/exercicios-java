/*FUP que dado um vetor: vetor[] = {1,2,3,4,5}, reordene os valores dentro do vetor, 
 * imprimindo no final os valores de trás para frente.
 */
public class PercorreVetor{
  
  public static void main(String[] args){
   
    int[] vetor = {2,5,5,15,1};
    //resultado esperado: vetor = {1,15,5,5,2}
    
    for(int i = 0; i < 5; i++){
      System.out.println("posição " + i + " = " + vetor[i]);
    }
    
    
  }
  
}