public class ExemplosEntrada{
  
  public static void main(String[] args){
    
    boolean atacar;
    int retorno;
    
    boolean teste = Entrada.leiaBoolean("Escolha");
    System.out.println(teste);
      
    for(int i = 0; i < 5; i++){
      //leiaOpcao retorna um INT (1,2,3 ou 1,2,3,4)
      
      retorno = Entrada.leiaOpcao("Escolha uma opção", "Opção 1", "Opção 2", "Opção 3");
      System.out.println(retorno);
      
      retorno = Entrada.leiaOpcao("Escolha uma opção", "Opção 1", "Opção 2", "Opção 3", "Opção 4");
      System.out.println(retorno);
      
    }
    
  }
}