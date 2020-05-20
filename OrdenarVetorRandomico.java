/*

 */
public class OrdenarVetorRandomico{

  public static void main(String[] args){
   
    int tamanho = (int) (Math.random() * 60) + 1;
    int[] numeros = new int[35];
    for(){
      numeros[i] = (int) (Math.random() * 60) + 1
    }
    
    /*System.out.println(Funcoes.obterHoraAtual());
    int temp = 0;
    for(int i = 0; i < tam - 1; i++){
      for(int x = 0; x < tam - i - 1; x++){
        if(numeros[x] > numeros[(x+1)]){
          temp = numeros[x];
          numeros[x] = numeros[(x+1)];
          numeros[(x+1)] = temp;
        }
      }
    }*/
    
    for(int i = 0; i < numeros.length; i++){
      System.out.println(numeros[i]);
    }
    System.out.println(Funcoes.obterHoraAtual());
    
    System.out.println("Fim do programa");
    
  }

}