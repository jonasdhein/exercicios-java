public class TabuadaConsole{
  public static void main(String[] args){
    
    if(args.length == 1){
      if(Integer.parseInt(args[0]) > 0){
         System.out.println("Tabuada do " + args[0] + ":");
         for(int x = 0; x <= 10; x++){
           System.out.println(x + " x " + args[0] + " = " + x * Integer.parseInt(args[0]));
         }
      }else{
        System.out.println("Parâmetro Inválido");
      }
    }else{
      System.out.println("Parâmetro Inválido");
    }
    
  }
}