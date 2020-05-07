import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Funcoes{

  public static String obterHoraAtual(){
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
     LocalDateTime now = LocalDateTime.now();  
     return dtf.format(now);  
  }

}