public class MegaSena{
 
  public static void main(String[] args){
    
    //for(int i = 0; i < 100; i++){
    //  System.out.println(Math.random());//Math.random gera n�meros de 0 at� 0.99
    //}
    for(int i = 0; i < 6; i++){
      System.out.print((int) (Math.random() * 60) + 1 + " - ");
    }
    
    
  }
  
  
}