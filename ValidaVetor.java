/*
 * FUP que solicite 3 números maiores que zero distintos para o usuário. 
 * Sempre informe o usuário quando ele fornecer um número já existente no vetor.
*/
public class ValidaVetor{
 
  public static void main(String[] args){
   
    int[] vetor = new int[3];//tamanho 3 = indices 0, 1 e 2
    
    int count = 0;
    int numero = 0;
    boolean rep = false;
    while(count < 3){
      //antes = veriricar se o número já não existe no vetor (EXIGE UM NOVO LAÇO)
      
      numero = Entrada.leiaInt("Informe um número maior que zero");
      if(numero > 0){
        //percorrer o vetor para ver se o número já está presente nele
        for(int i = 0; i < vetor.length; i++){
          if(numero == vetor[i]){//se não existe
            rep = true;
            break;
          }
        }
        
        if(rep == false){
          vetor[count] = numero;
          count += 1;
        }
        rep = false;
        
      }else{
        Entrada.mostraTexto("Atenção", "Você informou um número inválido!"); 
      }
      
    }
    
    String resultado = "";
    //laço para imprimir os valores do vetor
    for(int i = 0; i < vetor.length; i++){
      resultado += "posição " + i + " = " + vetor[i] + "\n";
    }
    Entrada.mostraTexto("Resultado", resultado);
    System.out.println("Fim do programa");
    
  }
  
}