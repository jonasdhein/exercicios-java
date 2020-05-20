import java.util.*;

/* created at: 2020-05-20
 * author: Jonas Dhein
*/

public class EntradaScanner{
  
  public static String leiaString(String texto){
     System.out.print(texto);
     Scanner leia = new Scanner(System.in);
     return leia.nextLine();
  }
  
  public static int leiaInt(String texto){
    System.out.print(texto);
     Scanner leia = new Scanner(System.in);
     return leia.nextInt();
  }
  
  public static Double leiaDouble(String texto){
    System.out.print(texto);
     Scanner leia = new Scanner(System.in);
     return leia.nextDouble();
  }
  
}