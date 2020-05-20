public class TratamentoDeErros{
  
  public static void main(String[] args){
    
    int vida = 0;
    double numero = 0;
    try{//código a ser executado
      numero = 5 /  vida;
      
    }catch(Exception ex){//captura do erro
      //System.out.println(ex);
      numero = 0;
    } 
    
    System.out.println("Valor do número = " + numero);
    
  }
  
  
}