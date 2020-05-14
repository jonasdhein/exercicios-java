/*
 * FUP que preencha uma matriz com duas tabuadas
 * Código compartilhado já
 */
public class TabuadaMatrizes{
  
  public static void main(String[] args){
  
    int[] tabuada = {2,5,8};
    int[][] matriz = new int[3][10];
    
    //preencher a matriz com as tabuadas do vetor tabuada[]
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        matriz[x][y] = tabuada[x] * (y + 1);
      }
    }
    
    String resultado = new String("");
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        resultado += matriz[x][y] + "-";
      }
      resultado = resultado.substring(0, resultado.length() - 1) + "\n";
    }
    
    System.out.println(resultado.substring(0, resultado.length() - 1));
    System.out.println("Fim do Programa");

  }
  
}

