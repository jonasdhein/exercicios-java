public class CalculaDesconto{
  public static void main(String[] args){
     
    Entrada.mostraTexto("Compra realizada", "A seguir serão solicitados:\n -Valor da compra\n -Nível de cliente");
    
    int codigo_cliente = 0;
    double perc_desconto = 0;
    double valor_final = 0;
    double valor_compra = Entrada.leiaDouble("Informe o valor da sua compra:");
    
    //Opção 1
    //codigo_cliente = Entrada.leiaInt("Informe o seu nível de cliente:\n 1-Cliente normal \n 2-Funcionário \n 3-VIP");
    
    //Opção 2
    boolean nivel_cliente = Entrada.leiaBoolean("Você é um cliente especial?");
    if(nivel_cliente){ //mesma coisa que (nivel_cliente == true)
      nivel_cliente = Entrada.leiaBoolean("Você é um fucionário?");
      if(nivel_cliente){ //mesma coisa que (nivel_cliente == true)
        codigo_cliente = 2;
      }else{
        codigo_cliente = 3;
      }
    }else{
      codigo_cliente = 1; //cliente normal
    }
    
    if(codigo_cliente == 2){
      perc_desconto = 5;
    }else if(codigo_cliente == 3){
      perc_desconto = 10;
    }
    
    double valor_desconto = (valor_compra * perc_desconto)/100;
    valor_final = valor_compra - valor_desconto;
    
    System.out.println("Total a pagar: R$ "+ valor_final +"\nDesconto concedido: R$ " + valor_desconto);
  }

}