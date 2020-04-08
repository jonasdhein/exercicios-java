public class IfElseIfPaises{

  public static void main(String[] args){
    
    String cidade = Entrada.leiaString("Informe um país (Brasil, Egito, Alemanha):");
    
    if(cidade.equalsIgnoreCase("Brasil")){
      System.out.println("Você informou um país da América do Sul");
    }else if(cidade.equalsIgnoreCase("EUA")){
      System.out.println("Você informou um país da América do Norte");
    }else if(cidade.equalsIgnoreCase("Alemanha")){
      System.out.println("Você informou um país da Europa");
    }else{
      System.out.println("Você informou um país que eu não conheço");
    }
  
  }

}