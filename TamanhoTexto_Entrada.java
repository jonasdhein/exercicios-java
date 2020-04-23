/*
 6 - FUP que diga a quantidade de caracteres dentro de determinado texto (EXTRA)
 */
public class TamanhoTexto_Entrada {
  
  public static void main(String[] args) { 
   
    String texto;
    int tamanho;
    
    texto = Entrada.leiaString("Informe um texto qualquer:");
    texto = texto.trim(); // -> A função .trim() remove os espaços em branco na frente e atrás do texto
    /*texto = texto.replace(" ", ""); /* -> .replace() neste exemplo está trocando os caracteres com espaço por nada. 
                              Ou seja, está removendo os espaços */
    tamanho = texto.length();
    System.out.println(texto + " tem " + tamanho + " caracteres");
    
  }
  
}
