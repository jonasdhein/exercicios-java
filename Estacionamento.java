/*
Considere um parque de estacionamento que pratica os preços seguintes: 
primeira hora: R$ 2,00; 
segunda hora: R$ 1,50;
a partir da segunda hora: R$ 1,00 por hora. 
O tempo de permanência no parque é contabilizado em horas e minutos. Por exemplo, se um veículo permanecer 2 horas e 30 minutos no parque, pagará R$ 2 (primeira hora) + R$ 1,50 (segunda hora) + R$ 0,50 (30 minutos a R$ 1/hora) = R$ 4. Elabore um algoritmo que, lido o tempo que determinado veículo permaneceu estacionado no parque (horas e minutos), diga a quantia que deve ser pagar
*/
public class Estacionamento{

  public static void main(String[] args){
    
    int horas = Entrada.leiaInt("Quantidade de horas:");
    double minutos = Entrada.leiaDouble("Quantidade de minutos:");
    double valor = 0;
    
    //contabilizando as horas
    if(horas == 1){
      valor = 2;
      System.out.println("Vai pagar por 1 hora");
    }else if(horas == 2){
      valor = 2 + 1.5;
      System.out.println("Vai pagar por 2 horas");
    }else if(horas > 2){
      valor = 2 + 1.5 + (horas - 2);
      System.out.println("Vai pagar por mais de 2 horas");
    }
    
    //contabilizando os minutos
    if(minutos > 0 && horas == 1){
      valor += (minutos / 60) * 1.5;
      System.out.println("Vai pagar por minutos também: " + (minutos / 60));
    }else if(minutos > 0 && horas >= 1){
      valor += (minutos / 60) * 1;
      System.out.println("Vai pagar por minutos também: " + (minutos / 60));
    }
    
    System.out.println("Você precisa pagar: R$ " + (double) Math.round(valor * 100) / 100);
    
  }

}