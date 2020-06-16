/*
Considere um parque de estacionamento que pratica os preços seguintes: 
primeira hora: R$ 2,00; 
segunda hora: R$ 1,50;
a partir da segunda hora: R$ 1,00 por hora. 
O tempo de permanência no parque é contabilizado em horas e minutos. Por exemplo, 
se um veículo permanecer 2 horas e 30 minutos no parque, 
pagará R$ 2 (primeira hora) + R$ 1,50 (segunda hora) + R$ 0,50 (30 minutos a R$ 1/hora) = R$ 4. 
Elabore um algoritmo que, lido o tempo que determinado veéculo permaneceu estacionado no parque 
(horas e minutos), diga a quantia que deve ser pagar
*/
public class EstacionamentoEmMinutos{

  public static void main(String[] args){
    
    int horas = Entrada.leiaInt("Quantidade de horas:");
    double minutos = Entrada.leiaDouble("Quantidade de minutos:");
    double valor = 0;
    
    double minutos_total = (horas * 60) + minutos;
    System.out.println("Minutos totais: " + minutos_total);
    
    if(minutos_total <= 60){
      valor = 2;
    }else if(minutos_total > 60 && minutos_total <= 120){
      valor = 2 + 1.5;
    }else if(minutos_total > 120){
      valor = (double) (minutos_total - 120)/60 + 3.5;
    }
    
    System.out.println("Valor a ser pago: R$ " + (double) Math.round(valor * 100) / 100);
    
  }
  
}