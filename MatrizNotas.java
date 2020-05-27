public class MatrizNotas{
 
  public static void main(String[] args){
    
    String[] nomes = new String[4]; //vetor para os nomes
    double[][] notas = new double[4][3]; //matriz para as notas
    
    for(int i = 0; i < nomes.length; i++){
      nomes[i] = EntradaScanner.leiaString("Informe o nome do aluno: ");
      
      for(int x = 0; x < notas[i].length; x++){
        notas[i][x] = EntradaScanner.leiaDouble("Nota (NÚMERO AQUI): ");
      }
      
    }
    
    
  }
}