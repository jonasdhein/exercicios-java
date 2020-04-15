/*
FUP que solicite ao usuário um dia da semana (1 a 7 apenas) e com base nisso, imprima o dia da semana 
(sendo que o 1 representa o domingo)
*/
public class DiaDaSemana{

  public static void main(String[] args){
  
    int dia_semana = Entrada.leiaInt("Informe um dia da semana (1,2,3,4,5,6 ou 7):");
    
    if(dia_semana == 1){
      System.out.println("Domingo");
    }else if(dia_semana == 2){
      System.out.println("Segunda-Feira");
    }else if(dia_semana == 3){
      System.out.println("Terça-Feira");
    }else if(dia_semana == 4){
      System.out.println("Quarta-Feira");
    }else if(dia_semana == 5){
      System.out.println("Quinta-Feira");
    }else if(dia_semana == 6){
      System.out.println("Sexta-Feira");
    }else if(dia_semana == 7){
      System.out.println("Sábado");
    }else{
      System.out.println("Você não informou um dia da semana válido");
    }
    
  }

}