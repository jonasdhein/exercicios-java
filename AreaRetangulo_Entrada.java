/**
 FUP que calcule a �rea de um ret�ngulo
 */
public class AreaRetangulo_Entrada {
  
  public static void main(String[] args) { 
    
    int base = Entrada.leiaInt("Informe a base do ret�ngulo:");
    int altura = Entrada.leiaInt("Informe a altura do ret�ngulo:");
    
    double area = base * altura;
    System.out.println("�rea do ret�ngulo (cm): " + area);
  }
  
}