/*
 2) FUP que calcula a idade de uma pessoa, solicitando m�s e ano do seu nascimento, 
 tamb�m utilizando a classe Entrada.
*/
public class Exercicios02{
  
  public static void main(String[] args){
  
    int anoAtual = 2020;
    int mesAtual = 4;
    
    int anoNascimento = Entrada.leiaInt("Informe o seu ano de nascimento");
    int mesNascimento = Entrada.leiaInt("Informe o seu m�s de nascimento");
    
    int idadePessoa = anoAtual - anoNascimento;
    
    //se o m�s de anivers�rio ainda n�o chegou
    if(mesNascimento > mesAtual){
     idadePessoa -= 1;
    }
    
    System.out.println("Sua idade �: " + idadePessoa);
  
  } 
  
}