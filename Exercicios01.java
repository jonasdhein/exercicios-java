/*
 1) FUP utilizando a classe Entrada que some as idades maiores ou iguais a 60 anos E concatene os nomes das pessoas 
 que moram em Lajeado (5 pessoas). Imprima o resultado.
 */
public class Exercicios01{
  
  public static void main(String[] args){
    
    int totalIdade = 0;
    String nomes = "";
  
    String nome1 = Entrada.leiaString("Informe o seu nome");
    String cidade1 = Entrada.leiaString("Informe a sua cidade");
    int idade1 = Entrada.leiaInt("Informe a sua idade");
    
    /*
      toLowerCase = lAJeaDo > lajeado
      toUpperCase = lajeado > LAJEADO
      equals = comparar Strings
      equalsIgnoreCase = comparar as Strings ignorando a formatação do texto quanto a CAIXA ALTA e caixa baixa
    */
    if(idade1 >= 60 && cidade1.trim().toLowerCase().equals("lajeado")){
      totalIdade += idade1;
      nomes += nome1 + ", ";
    }
    
    String nome2 = Entrada.leiaString("Informe o seu nome");
    String cidade2 = Entrada.leiaString("Informe a sua cidade");
    int idade2 = Entrada.leiaInt("Informe a sua idade");
    
    if(idade2 >= 60 && cidade2.equalsIgnoreCase("LAJEADO")){
      totalIdade += idade2;
      nomes += nome2 + ", ";
    }
    
    System.out.println("Soma das idades maiores que 60: " + totalIdade);
    System.out.println("Relação de nomes: " + nomes);
    
  }
}