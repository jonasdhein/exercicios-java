/*
 *  FUP que l� altura e peso de uma pessoa e calcula o IMC usando a seguinte f�rmula: 
 * IMC = peso/(altura*altura).
Ap�s calcular o IMC o programa verifica se essa a pessoa est� no peso ideal, 
sabendo que o peso � ideal se o IMC � menor ou igual a 20,7
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
