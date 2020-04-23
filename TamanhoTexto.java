/**
 6 - FUP que diga a quantidade de caracteres dentro de determinado texto (EXTRA)
 */
public class TamanhoTexto {
  
  public static void main(String[] args) { 
   
    String texto = new String("  Algoritmos e Programação     ");
    //texto = texto.trim(); // -> A função .trim() remove os espaços em branco na frente e atrás do texto
    texto = texto.replace(" ", "");
    int tamanho = texto.length();
    System.out.println(texto + " tem " + tamanho + " caracteres");
    
  }
  
}
