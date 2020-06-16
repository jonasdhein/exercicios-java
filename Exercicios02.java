/*
 2) FUP que calcula a idade de uma pessoa, solicitando mês e ano do seu nascimento, 
 também utilizando a classe Entrada.
*/
public class Exercicios02{
  
  public static void main(String[] args){
  
    int anoAtual = 2020;
    int mesAtual = 4;
    
    int anoNascimento = Entrada.leiaInt("Informe o seu ano de nascimento");
    int mesNascimento = Entrada.leiaInt("Informe o seu mês de nascimento");
    
    int idadePessoa = anoAtual - anoNascimento;
    
    //se o mês de aniversário ainda não chegou
    if(mesNascimento > mesAtual){
     idadePessoa -= 1;
    }
    
    System.out.println("Sua idade é: " + idadePessoa);
  
  } 
  
}