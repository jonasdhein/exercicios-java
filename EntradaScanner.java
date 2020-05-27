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
     int retorno = 0;
     
     Scanner leia = new Scanner(System.in);
     
     int cont = 0;
     do{
       try{
         System.out.print(texto);
         leia = new Scanner(System.in);
         retorno = leia.nextInt();
         cont += 1;
       }catch(Exception ex){
         System.out.print("Erro\n");
       }
       
     }while(cont == 0);
     
     return retorno;
  }
  
  public static Double leiaDouble(String texto){
     double retorno = 0;
     
     Scanner leia = new Scanner(System.in);
     
     int cont = 0;
     do{
       try{
         System.out.print(texto);
         leia = new Scanner(System.in);
         retorno = leia.nextDouble();
         cont += 1;
       }catch(Exception ex){
         System.out.print("Erro\n");
       }
       
     }while(cont == 0);
     
     return retorno;
  }
  
}