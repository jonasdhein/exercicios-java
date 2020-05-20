/*
 * FUP que tenha uma matriz (ideia) 5x2 (5 linhas e 2 colunas) para armazenar o nome de 
 * uma fruta e o seu preço. Ao final, percorra a matriz e diga qual a fruta com o menor 
 * valor e qual a com o maior valor.
 */

public class MatrizFrutas{
 
  public static void main(String[] args){
    
    String[][] frutas = new String[5][2];
    
    //for(int i = 0; i < frutas.length; i++){
      frutas[0][0] = EntradaScanner.leiaString("Informe o nome da fruta: ");
      frutas[0][1] = EntradaScanner.leiaDouble("Informe o valor da fruta: ") + "";
    //}
    
    
  }
   
}