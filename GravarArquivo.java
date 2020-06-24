import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravarArquivo {
    
    public static void main(String[] args){

        try{
            FileWriter arquivo = new FileWriter("C:\\Users\\Usuario\\Desktop\\gravacao.txt");
            PrintWriter texto = new PrintWriter(arquivo);

            texto.println("Texto no arquivo");
            texto.println("Nova linha 1");
            texto.println("Nova linha 2");
            texto.println("Nova linha 3");

            arquivo.close();

            System.out.println("Fim do programa");

        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }
}