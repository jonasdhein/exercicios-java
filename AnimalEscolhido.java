/*
 Qual o animal escolhido
*/

public class AnimalEscolhido{
  
  public static void main(String[] args){
    
    boolean quadrupede = Entrada.leiaBoolean("O animal � quadr�pede?");
    
    if(quadrupede){
        boolean carnivoro = Entrada.leiaBoolean("O animal � carn�voro?");
        if(carnivoro){
          System.out.println("O animal escolhido � o LE�O");
        }else{
          System.out.println("O animal escolhido � o CAVALO");
        }
    }else{
      boolean bipede = Entrada.leiaBoolean("O animal � b�pede?");
      if(bipede == true){
        boolean onivoro = Entrada.leiaBoolean("O animal � on�voro?");
        if(onivoro == true){
          System.out.println("O animal escolhido � o HOMEM");
        }else{
          System.out.println("O animal escolhido � o MACACO");
        }
      }else{
        boolean voador = Entrada.leiaBoolean("O animal � voador?");
        if(voador == true){
          System.out.println("O animal � o MORCEGO");
        }else{
          System.out.println("O animal � a BALEIA");
        }
      }
    }
    
  }

}