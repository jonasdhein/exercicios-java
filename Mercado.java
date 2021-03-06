/*
Crie uma matriz 10x2 (10 linhas e 2 colunas) ou então 2 vetores, para armazenar nomes de produtos e 
seu respectivo valor. Exemplo: Maça - R$ 2,90.
Com base nessa tabela, você deverá simular uma compra em um supermercado pelo usuário. 
Apresente a lista para ele e através do método entrada ele deverá escolher, 1 a 1, os itens que quer colocar 
no carrinho. Ao final, você deverá mostrar quanto irá custar o carrinho e quais os itens que ele possui.
*/
public class Mercado {
    
    public static void main(String[] args){
        
        double soma = 0;
        String compras = new String("");

        String[][] mercado = {
            {"Abacaxi", "5.45"}, {"Batata", "5.50"}, {"Carne", "20.10"}, {"Cerveja", "8.80"}, 
            {"Erva", "9.40"}, {"Laranja", "3.33"}, {"Maça", "3.90"}, {"Mamão", "5.90"}, 
            {"Ovo", "5.10"}, {"Peixe", "15.00"}
        };

        int produto = 0;
        double quant = 0;

        while(true){

            do{
                produto = Entrada.leiaInt(imprimeProdutos(mercado));
            }while(produto < 0 || produto > mercado.length);//só vai poder escolher um produto que existe no mercado, ou ZERO para SAIR

            if(produto == 0){
                imprimeCompras(compras, soma);
                return;//para a execução do programa
            }

            do{
                quant = Entrada.leiaDouble("Informe a quantidade de " + mercado[produto-1][0]);
            }while(quant <= 0);//fica perguntando enquanto a quantidade digitada for 0 ou menor

            compras += mercado[produto-1][0] + " \t Quant: " + quant + "\n";
            soma += quant * Double.parseDouble(mercado[produto-1][1]);

            System.out.println("Acumulado: R$ " + soma);
        }

    }//fechamento do main

    private static String imprimeProdutos(String[][] mercado){
        String resultado = "Escolha um item para adicionar ao carrinho:\n\n";
        for(int i = 0; i < mercado.length; i++){
            //System.out.println(mercado[i][0] + "\t" + mercado[i][1]);
            resultado += (i+1) + " - " + mercado[i][0] + "\t" + " R$ " + mercado[i][1] + "\n";
        }

        resultado += "\n0 = SAIR";
        return resultado;
    }

    private static void imprimeCompras(String compras, double valor){
        Entrada.mostraTexto("Carrinho de Compras", "Itens comprados:\n" + compras + "\n\n" + "Total: R$" + (double) (Math.round(valor * 100) / 100));
    }

}