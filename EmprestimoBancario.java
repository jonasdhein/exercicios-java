/*
FUP que dado o valor de um empr�stimo calcula o valor total do financiamento em
6 meses. A taxa de juros � 3,5% (juros simples) SE o valor est� abaixo de 12000 Reais ou 4,0% 
se o valor do empr�stimo � superior ou igual a 12000 Reais.
*/
public class EmprestimoBancario{
  
  public static void main(String[] args){
   
    double valor = Entrada.leiaDouble("Informe o valor do empr�stimo");
    double emprestimo = 0;
    
    if(valor >= 12000){
      //4%
      System.out.println("Juros de 4%");
      emprestimo = valor + ((valor * 4) / 100) * 6;
    }else{
      //3.5%
      System.out.println("Juros de 3.5%");
      emprestimo = valor + ((valor * 3.5) / 100) * 6;
    }
    System.out.println("Valor do empr�stimo � de: " + emprestimo);
  }
  
}