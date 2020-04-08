/*
 *  FUP que lê altura e peso de uma pessoa e calcula o IMC usando a seguinte fórmula: 
 * IMC = peso/(altura*altura).
Após calcular o IMC o programa verifica se essa a pessoa está no peso ideal, 
sabendo que o peso é ideal se o IMC é menor ou igual a 20,7
*/
public class CalculoImc{
  
  public static void main(String[] args){
    
     double altura = Entrada.leiaDouble("Informe a sua altura em metros:");
     double peso = Entrada.leiaDouble("Informe o seu peso em quilos:");
     
     double imc = peso/(altura*altura);
     
     if(imc >= 20.7){
       System.out.println("IMC acima = " + imc);
     }else{
       System.out.println("IMC ideal = " + imc);
     }
     
  }

}
