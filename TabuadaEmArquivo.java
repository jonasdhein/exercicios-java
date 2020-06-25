/*
FUP que solicite um número para o usuário e gere a tabuada dele.
Toda a tabuada gerada deverá ser gravada em um arquivo TXT.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TabuadaEmArquivo {
    
    public static void main(String[] args){

        try{
            int num_tab = 0;
            num_tab = EntradaScanner.leiaInt("Informe um número para a tabuada: ");
            
            File arquivo1 = new File("C:\\Users\\Usuario\\Desktop\\tabuada_" + num_tab + ".txt");
            
            if(arquivo1.exists()){
                System.out.println("Arquivo será sobrescrito!!!!");
            }

            FileWriter arquivo = new FileWriter("C:\\Users\\Usuario\\Desktop\\tabuada_" + num_tab + ".txt");
            PrintWriter texto = new PrintWriter(arquivo);

            for(int i = 1; i <= 10; i++){
                texto.printf("%d x %d = %d\n", i, num_tab, (i * num_tab));
            }

            arquivo.close();

            System.out.println("Fim do programa");

        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }

}