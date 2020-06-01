public class ExemplosLabirinto{
  
  public static void main(String[] args){
 
    boolean atacar;
    
    atacar = Entrada.leiaBoolean("Irá atacar?","Sim!!","Não");
    if(atacar == true){
      System.out.println("Atacouuuuuuu");
    }else{
     System.out.println("Covarde"); 
    }
    
  }
  
  
}