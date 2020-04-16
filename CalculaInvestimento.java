public class CalculaInvestimento{
 
  public static void main(String[] args){
    
    int cliente = 0;
    int tipo = 0;
    double valor = 0;
    do{
      cliente = Entrada.leiaInt("Informe o seu c�digo de cliente\n(Digite 0 para sair):");
      if(cliente <= 0){
        break; //c�digo para finalizar o la�o de repeti��o
      }
      
      tipo = Entrada.leiaInt("Escolha um Tipo de Investimento:\n1-Poupan�a = 1,5% ao m�s\n2-Poupan�a Plus = 2% ao m�s\n3-Fundos de renda fixa = 4% ao m�s");
      valor = Entrada.leiaDouble("Informe o valor a ser investido:");
      
      if(tipo == 1){
        System.out.println("Rendimentos sobre R$ " + valor + ": " + (valor * 1.5)/100);
      }else if(tipo == 2){
        System.out.println("Rendimentos sobre R$ " + valor + ": " + (valor * 2)/100);
      }else if(tipo == 3){
        System.out.println("Rendimentos sobre R$ " + valor + ": " + (valor * 4)/100);
      }
      
    }while(cliente > 0 && tipo > 0);
    
    System.out.println("Final do Programa");
    
  }
}