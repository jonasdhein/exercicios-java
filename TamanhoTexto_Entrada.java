/*
 6 - FUP que diga a quantidade de caracteres dentro de determinado texto (EXTRA)
 */
public class TamanhoTexto_Entrada {
  
  public static void main(String[] args) { 
   
    String texto;
    int tamanho;
    
    texto = Entrada.leiaString("Informe um texto qualquer:");
    texto = texto.trim(); // -> A fun��o .trim() remove os espa�os em branco na frente e atr�s do texto
    /*texto = texto.replace(" ", ""); /* -> .replace() neste exemplo est� trocando os caracteres com espa�o por nada. 
                              Ou seja, est� removendo os espa�os */
    tamanho = texto.length();
    System.out.println(texto + " tem " + tamanho + " caracteres");
    
  }
  
}
