public class ExemplosEntrada{
  
  public static void main(String[] args){
    
    boolean atacar;
    int retorno;
    
    boolean teste = Entrada.leiaBoolean("Escolha");
    System.out.println(teste);
      
    for(int i = 0; i < 5; i++){
      retorno = Entrada.leiaOpcao("Escolha uma opção", "Frente", "Direita", "Esquerda");
      
      if(retorno == 2){
        System.out.println("Que azar, achou um inimigo no caminho");
      
        atacar = Entrada.leiaBoolean("Desja atacar ou evitar o inimigo?", "Atacar", "Desviar");
        if(atacar == true){
           System.out.println("Você escolheu atacar o inimigo");
        }else{
           System.out.println("Você escolheu desistir");
        }
        
      }
    }
    
  }
}