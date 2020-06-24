/*
FUP que transforme as linha de um arquivo TXT em um vetor (String[] vetor)
*/
import java.io.File;
import java.util.Scanner;

public class VetorPorArquivo{

    public static void main(String[] args){

        try {
            File arq = new File("C:\\Users\\Usuario\\Desktop\\arquivo.txt"); //   / ou \\ para separar os caminhos
            Scanner scan = new Scanner(arq);

            //encontrar o número de linhas do arquivo lido
            int linhas = 0;
            while(scan.hasNextLine()){//verifica se existe uma próxima linha
                scan.nextLine(); //retorna o conteúdo até a próxima linha do arquivo e posiciona a variável na próxima linha
                linhas += 1;
            }
            
            scan.close();
            scan = new Scanner(arq);
            int pos = 0;
            String[] vetor = new String[linhas];
            while(scan.hasNextLine()){ //busca linha a linha
                String linha = scan.nextLine();
                vetor[pos] = linha;
                pos += 1;
            }
            scan.close();

        }catch (Exception e) {
            System.out.println("Erro na leitura do arquivo");
        }
    }
}