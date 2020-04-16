public class CalculaDescontoItens{
 
  public static void main(String[] args){
    
    double valor_compra = Entrada.leiaDouble("Informe o valor da sua compra:");
    double itens = Entrada.leiaDouble("Informe a quantidade de itens comprados:");
    
    double perc_desconto = 0;
    
    if(itens >= 11 && itens <= 20){
      perc_desconto = 10;
    }else if(itens >= 21 && itens <= 50){
      perc_desconto = 20;
    }else if(itens > 50){
      perc_desconto = 30;
    }
    
    double resultado = valor_compra - (valor_compra * perc_desconto)/100;
    System.out.println("Desconto de: " + perc_desconto + "%");
    System.out.println("Valor final: R$ " + resultado);
    
  }

}