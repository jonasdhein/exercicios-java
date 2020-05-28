public class MatrizInimigos{
 
  public static void main(String[] args){
    
    String[] inimigos = new String[3]; //vetor para os inimigos
    double[][] dados = new double[3][2]; //matriz para os dados
    
    for(int i = 0; i < inimigos.length; i++){
      inimigos[i] = EntradaScanner.leiaString("Informe o nome do inimigo: ");
      
      dados[i][0] = EntradaScanner.leiaInt("Vida: ");
      dados[i][1] = EntradaScanner.leiaInt("Ataque: ");
      
    }
    
    //impressão
    for(int i = 0; i < inimigos.length; i++){
      System.out.println(inimigos[i] + "\t" + "Vida:" + dados[i][0] + "\t" + "Ataque:" + dados[i][1]);
    }
   
  }
}