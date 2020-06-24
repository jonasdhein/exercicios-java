import java.io.File;
import java.util.Scanner;

public class LeituraDeArquivos {
    
    public static void main(String[] args){

        try {
            File arquivo = new File("E:/arquivo.txt"); //   / ou \\ para separar os caminhos
            Scanner scan = new Scanner(arquivo);

            while(scan.hasNextLine()){ //busca linha a linha
                String linha = scan.nextLine();
                System.out.println(linha);
            }

            scan.close();

        }catch (Exception e) {
            System.out.println("Erro na leitura do arquivo");
        }

    }

}