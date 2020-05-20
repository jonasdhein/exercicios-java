public class TesteEntrada{

  public static void main(String[] args){
  
    String nome = Entrada.leiaString("Informe o seu nome: ");
    
    int idade = Entrada.leiaInt("Informe a sua idade: ");
    
    System.out.println(nome);
    System.out.println(idade);
  
  }
  
}