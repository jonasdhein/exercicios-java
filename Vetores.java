public class Vetores{

  public static void main(String[] args){
   
    int[] vetor = {1,2,3};
    
    for(int i = 0; i < vetor.length; i++){
      System.out.println("vetor["+ i +"] = " + vetor[i]);
    }
    
    vetor[0] = Entrada.leiaInt("Informe um n�mero");
    vetor[1] = Entrada.leiaInt("Informe um n�mero");
    vetor[2] = Entrada.leiaInt("Informe um n�mero");
    
    for(int i = 0; i < vetor.length; i++){
      System.out.println("vetor["+ i +"] = " + vetor[i]);
    }
    
  }
}