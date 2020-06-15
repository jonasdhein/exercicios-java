/**
 FUP que calcule a Área de um retângulo
 */
public class AreaRetangulo_Entrada {
  
  public static void main(String[] args) { 
    
    int base = Entrada.leiaInt("Informe a base do retângulo:");
    int altura = Entrada.leiaInt("Informe a altura do retângulo:");
    
    double area = base * altura;
    System.out.println("Área do retângulo (cm): " + area);
  }
  
}