/*
 Qual o animal escolhido
*/

public class AnimalEscolhido{
  
  public static void main(String[] args){
    
    boolean quadrupede = Entrada.leiaBoolean("O animal é quadrúpede?");
    
    if(quadrupede){
        boolean carnivoro = Entrada.leiaBoolean("O animal é carnívoro?");
        if(carnivoro){
          System.out.println("O animal escolhido é o LEÃO");
        }else{
          System.out.println("O animal escolhido é o CAVALO");
        }
    }else{
      boolean bipede = Entrada.leiaBoolean("O animal é bípede?");
      if(bipede == true){
        boolean onivoro = Entrada.leiaBoolean("O animal é onívoro?");
        if(onivoro == true){
          System.out.println("O animal escolhido é o HOMEM");
        }else{
          System.out.println("O animal escolhido é o MACACO");
        }
      }else{
        boolean voador = Entrada.leiaBoolean("O animal é voador?");
        if(voador == true){
          System.out.println("O animal é o MORCEGO");
        }else{
          System.out.println("O animal é a BALEIA");
        }
      }
    }
    
  }

}