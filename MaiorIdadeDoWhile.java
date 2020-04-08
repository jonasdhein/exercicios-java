/*
 FUP que solicite a idade da pessoa, e enquanto essa idade for menor que 18, 
 imprima o texto PESSOA MENOR DE IDADE 
 e solicite a idade até o usuário informar uma idade igual ou superior a 18.
 */
public class MaiorIdadeDoWhile{
  
  public static void main(String[] args){
    
    int idade = 0;
    
    do{
      idade = Entrada.leiaInt("Informe uma idade:");
      if(idade < 18){
        System.out.println("PESSOA MENOR DE IDADE");
      }
    }while(idade < 18);
    
    System.out.println("PESSOA MAIOR DE IDADE\nFim do programa");
    
  }

}