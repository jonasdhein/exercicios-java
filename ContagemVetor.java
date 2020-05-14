/*
 *  FUP que através de um vetor já preenchido, diga quantas vezes determinado número se repete nele
 */
public class ContagemVetor{
  
  public static void main(String[] args){
   
    int[] vetor = {1,1,2,1,2,3,4,2,4,4,2,5,6,7,2};
    int tam = vetor.length;
    
    int cont = 0;
    int numero = 2;//quantas vezes o numero 2 existe dentro do meu vetor?
    
    for(int i = 0; i < tam; i++){
      if(vetor[i] == numero){
        cont++;
      }
    }
    
    System.out.println("Número " + numero + " se repete " + cont + " vezes");
    System.out.println("Fim do Programa");
    
  }
  
}