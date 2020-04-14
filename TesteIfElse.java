public class TesteIfElse{

  public static void main(String[] args){
  
    int numero = 10;
    
    System.out.println("Só IFS --");
    if(numero <= 10){
      System.out.println("Entro no 1");
    }
    if(numero < 20){
      System.out.println("Entro no 2");
    }
    
    System.out.println("Com ElseIfs --");
    if(numero <= 10){
      System.out.println("Entro no 1");
    }else if(numero < 20){
      System.out.println("Entro no 2");
    }
  
  }

}