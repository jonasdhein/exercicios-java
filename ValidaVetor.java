/*
 * FUP que solicite 3 n�meros maiores que zero distintos para o usu�rio. 
 * Sempre informe o usu�rio quando ele fornecer um n�mero j� existente no vetor.
*/
public class ValidaVetor{
 
  public static void main(String[] args){
   
    int[] vetor = new int[3];//tamanho 3 = indices 0, 1 e 2
    
    int count = 0;
    int numero = 0;
    boolean rep = false;
    while(count < 3){
      //antes = veriricar se o n�mero j� n�o existe no vetor (EXIGE UM NOVO LA�O)
      
      numero = Entrada.leiaInt("Informe um n�mero maior que zero");
      if(numero > 0){
        //percorrer o vetor para ver se o n�mero j� est� presente nele
        for(int i = 0; i < vetor.length; i++){
          if(numero == vetor[i]){//se n�o existe
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
        Entrada.mostraTexto("Aten��o", "Voc� informou um n�mero inv�lido!"); 
      }
      
    }
    
    String resultado = "";
    //la�o para imprimir os valores do vetor
    for(int i = 0; i < vetor.length; i++){
      resultado += "posi��o " + i + " = " + vetor[i] + "\n";
    }
    Entrada.mostraTexto("Resultado", resultado);
    System.out.println("Fim do programa");
    
  }
  
}