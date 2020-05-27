/*
 * FUP que preencha uma matriz com duas tabuadas
 * Código compartilhado já
 */
public class TabuadaMatrizesV2{
  
  public static void main(String[] args){
  
    int[] tabuada = {2,5,8};
    int[][] matriz = new int[3][10];
    
    //preencher a matriz com as tabuadas do vetor tabuada[]
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        matriz[x][y] = tabuada[x] * (y + 1);
      }
    }
    
    System.out.println("----TABUADAS----");
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        System.out.print(matriz[x][y] + "\t");
      }
      System.out.println("");
    }
    
    System.out.println("Fim do Programa");

  }
  
}

