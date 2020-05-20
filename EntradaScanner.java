import java.util.*;

/* created at: 2020-05-20
 * author: Jonas Dhein
*/

public class EntradaScanner{
  
  public static String leiaString(){
     Scanner leia = new Scanner(System.in);
     return leia.nextLine();
  }
  
  public static int leiaInt(){
     Scanner leia = new Scanner(System.in);
     return leia.nextInt();
  }
  
  public static Double leiaDouble(){
     Scanner leia = new Scanner(System.in);
     return leia.nextDouble();
  }
  
}