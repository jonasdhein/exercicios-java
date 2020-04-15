public class Correcao{
 
  public static void main(String[] args){
  
   double hora = Entrada.leiaDouble("Informe o tempo de estacionamento em HORAS");
double minutos = Entrada.leiaDouble("Informe o tempo de estacionamento em MINUTOS");
    double valor = 0;
    
    double uma_hora = 2;
    double segunda_hora = 1.50;
    double hora_restante = 1;
    double minuto = 0.016;
    double menos = 2;
    double mais_hora = uma_hora + segunda_hora + ( hora * hora_restante ) + ( minutos * minuto ) - menos;
    
    if(hora > 1){
      System.out.println("Mais de uma hora");
      valor = mais_hora;
      System.out.println("O valor do estacionamento é de: " + valor + " reais");
     }else{
       System.out.println("Apenas uma hora");
       valor = uma_hora;
    
    System.out.println("O valor do estacionamento é de: " + valor + " reais");
  }
     
     
   }
}