/* 1 - sortear os inimigos
 * 2 - não pegar inimigo repetido
 * 3 - atualizar variável de vida após confronto
*/
public class MetodosLabirinto_v2{
  
  public static void main(String[] args){
    
    int vida = 9000;
    int ataque = 20;
    int classe = 1;
    boolean existe = false;
    int inimigo;
    
    String[] vetor_inimigos = {"Piccolo", "Android 18", "Yamcha", "Cell", "Raditz"};
    int[] inimigos_enfrentados = new int[5];
    
    for(int i = 0; i < 5; i++){
      do{
        existe = false;
        inimigo = jogarDado(5);
        for(int x = 0; x < inimigos_enfrentados.length; x++){
          if(inimigo == inimigos_enfrentados[x]){
            existe = true;
          }
        }
      }while(existe == true);
      
      inimigos_enfrentados[i] = inimigo;
      
      System.out.println("O inimigo sorteado é o: " + vetor_inimigos[inimigo-1]);
      
      int valor_confronto = confronto(inimigo);
      vida = vida - valor_confronto;//atualizar a vida depois do confronto
      if(vida <= 0){
        System.out.println("GAME OVER, VOCÊ MORREU PARA O " + vetor_inimigos[inimigo-1]);
        return;
      }
    }
    
    System.out.println("Se imprimiu isso, é pq você ganhou, parabéns!");
    
  }//fechamento do método main
  
  private static int jogarDado(int tamanho){
    int dado = (int) (Math.random() * tamanho) + 1;
    System.out.println("Jogou o dado: " + dado);
    return dado;
  }//fechando do método jogarDado
  
  private static int confronto(int inimigo){
    int valor = jogarDado(300);
    return valor;
  }//fechamento do método confronto
  
}