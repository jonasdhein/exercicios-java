public class Console{

  public static void main(String[] args){
    
    if(args.length == 1){
      System.out.println("1 argumento foi identificado");
    }else if(args.length > 1){
      System.out.println("Foram identificados " + args.length + " argumentos");
    }else{
      System.out.println("Não foram passados argumentos");
    }
  
  }

}