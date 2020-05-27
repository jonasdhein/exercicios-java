public class ImpressaoMatriz{
 
  public static void main(String[] args){
    
    int [][] mat = new int [10][4];
    
    //Preenchimento e impressão da matriz
    System.out.println ("-----MATRIZ-----");
    for (int lin = 0; lin < mat.length; lin ++) {
      for (int col = 0; col < mat[0].length; col ++) {
        mat[lin][col] = (int)((Math.random() * 99) + 1);
        System.out.print(mat[lin][col]+"\t");
      }
      System.out.println();
    }
    
    //Verifica se existem elementos repetidos
    boolean rep = false;
    for (int lin = 0; lin < mat.length; lin ++) {
      for (int col = 0; col < mat[0].length; col ++) {
        int qtd = 0;
        for (int lin2 = 0; lin2 < mat.length; lin2 ++) {
          for (int col2 = 0; col2 < mat[0].length; col2 ++) {
            if (mat[lin][col] == mat[lin2][col2]) {
              qtd ++;
            }
          }
        }
        if (qtd > 1) {
          rep = true;
          col = mat[0].length;
          lin = mat.length;
        }
      }
    }
    //Caso houver algum elemento repetido, mostra a mensagem apropriada
    if (rep == true) {
      System.out.printf ("\nExistem elementos repetidos na matriz!!!");
    } else {
      System.out.printf ("\nNão existem elementos repetidos na matriz!!!");
    }
    
  }
}