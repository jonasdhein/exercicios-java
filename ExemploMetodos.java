public class ExemploMetodos{
 
  public static void main(String[] args){
    
    mostraTexto();//chamada de método sem retorno
    
    String teste = mostraTexto("Método 222");//chamada de método com retorno
    
    System.out.println(teste);
    
    int resultado = soma(1,3);//chamada de método com retorno int
    System.out.println("Resultado = " + resultado);
    
  }
  
  public static void mostraTexto(){
     System.out.println("Método mostraTexto()"); 
  }
  
  //Assinatura diferente (passando argumentos)
  public static String mostraTexto(String texto){
    String retorno = "Estou retornando " + texto;
    return retorno;
  }
  
  //private = acessível somente dentro desta Classe
  private static int soma(int num1, int num2){
   return (num1 + num2); 
  }
  
}