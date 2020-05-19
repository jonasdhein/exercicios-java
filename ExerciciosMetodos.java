/*
 * FUP que some e subtraia o valor de uma variável declarada no método MAIN, através de métodos
 * Crie também um método para mostrar o valor atualizado da variável vida
 */
public class ExerciciosMetodos{
 
  public static void main(String[] args){
    
    int vida = 100;
    mostrarVida(vida);
    
    vida = subtrairVida(vida, 20);
    mostrarVida(vida);
    
    vida = somarVida(vida, 15);
    mostrarVida(vida);
    
  }
  
  private static int subtrairVida(int vida, int valor){
    return (vida - valor); 
  }
  
  private static int somarVida(int vida, int valor){
    return (vida + valor); 
  }
  
  private static void mostrarVida(int vida){
    System.out.println("------");
    System.out.println("Vida: " + vida);
    System.out.println("Força: " + 90);
    System.out.println("------\n");
  }
  
  
}