public class Banco {

    static String historico = "";
        
    public static void main(String[] args){

        int pos_conta = -1;
        //1º = leitura do arquivo de contas
        String[] arquivo = EntradaScanner.leiaArquivo("D:/JAVA/contas.txt");

        //2º = criar uma matriz com as contas lidas
        String[][] matriz_contas = new String[5][4];
        for(int i = 0; i < arquivo.length; i++){
            String[] colunas = arquivo[i].split("\\|");
            for(int j = 0; j < colunas.length; j++){
                matriz_contas[i][j] = colunas[j];
            }
        }

        //3º = fazer login na agência bancária
        String conta = EntradaScanner.leiaString("Conta: ");
        String senha = EntradaScanner.leiaString("Senha: ");
        boolean logado = false; //variável para identificar se o login deu certo

        //Percorre a matriz de contas para validar a conta informada com a senha
        for(int i = 0; i < matriz_contas.length; i++){
            if(conta.equals(matriz_contas[i][0]) && senha.equals(matriz_contas[i][1])){
                pos_conta = i;
                System.out.printf("Olá %s\n", matriz_contas[i][2]);
                logado = true;
                break;
            }
        }

        //Testar se o usuário logou corretamente, se não, fecha o programa
        if(logado){
            int opcao = 0;
            do{
                imprimeSaldo(pos_conta, matriz_contas);
                imprimeMenu();
                opcao = EntradaScanner.leiaInt("Operação desejada: ");

                if(opcao == 1){//transferencia
                    matriz_contas = transferencia(pos_conta, matriz_contas);
                }else if(opcao == 2){//saque
                    matriz_contas = saque(pos_conta, matriz_contas);
                }else if(opcao == 3){//deposito
                    matriz_contas = deposito(pos_conta, matriz_contas);
                }else if(opcao == 0){//SAIR
                    return;
                }

            }while(opcao != 0);
                

        }else{
            System.out.println("Conta inválida");
            return;
        }

        System.out.println("Fim do Programa");

    }

    private static void imprimeMenu(){
        System.out.println("Operações disponíveis");
        System.out.println("1 - Transferência entre contas");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("0 - SAIR");
    }

    private static void imprimeSaldo(int pos_conta, String[][] matriz_contas){
        System.out.println("------------------");
        System.out.printf("Conta: %s - %s\n", matriz_contas[pos_conta][0], matriz_contas[pos_conta][2]);
        System.out.printf("Saldo: R$ %2f\n", Double.parseDouble(matriz_contas[pos_conta][3]));
        System.out.println("------------------");
        System.out.println("");
    }

    private static String[][] transferencia(int pos_conta, String[][] matriz_contas){

        String[][] matriz_retorno = matriz_contas;
        int pos_destino = -1;
        try{
            
            //perguntar a conta de destino
            boolean op_realizada = false;
            String conta = EntradaScanner.leiaString("Conta de destino: ");
            double valor = EntradaScanner.leiaDouble("Valor da Transferência: ");

            //Verificar se tem saldo suficiente para a operação
            if(Double.parseDouble(matriz_retorno[pos_conta][3]) >= valor){
                //validar a conta de destino informada
                for(int i = 0; i < matriz_retorno.length; i++){
                    if(conta.equals(matriz_retorno[i][0])){
                        if(i == pos_conta){//o usuário informou a sua própria conta
                            op_realizada = false;
                            break;
                        }
                        pos_destino = i;
                        op_realizada = true;
                        break;
                    }
                }

                if(op_realizada){
                    matriz_retorno[pos_conta][3] = String.valueOf(Double.parseDouble(matriz_retorno[pos_conta][3]) - valor);
                    matriz_retorno[pos_destino][3] = String.valueOf(Double.parseDouble(matriz_retorno[pos_destino][3]) + valor);
                    System.out.println("Operação realizada com sucesso");

                    historico += "Transferiu da conta X para a Y";
                }else{
                    System.out.println("Conta não localizada");
                }

            }else{
                System.out.println("Saldo insuficiente para a operação");
            }            

        }catch(Exception ex){
            System.out.println("ERRO: " + ex.getMessage());
        }finally{
            return matriz_retorno;
        }
    }

    private static String[][] saque(int pos_conta, String[][] matriz_contas){

        String[][] matriz_retorno = matriz_contas;

        double valor = EntradaScanner.leiaDouble("Valor da Transferência: ");

        if(Double.parseDouble(matriz_retorno[pos_conta][3]) >= valor){
            matriz_retorno[pos_conta][3] = String.valueOf(Double.parseDouble(matriz_retorno[pos_conta][3]) - valor);
            System.out.println("Operação realizada com sucesso");
        }else{
            System.out.println("Saldo insuficiente para a operação");
        }

        historico += "Saque de R$ " + valor + " da conta " + matriz_retorno[pos_conta][0] + " ("+ matriz_retorno[pos_conta][2] +")";

        return matriz_retorno;

    }

    private static String[][] deposito(int pos_conta, String[][] matriz_contas){


        String[][] matriz_retorno = matriz_contas;

        double valor = EntradaScanner.leiaDouble("Valor da Transferência: ");
        
        matriz_retorno[pos_conta][3] = String.valueOf(Double.parseDouble(matriz_retorno[pos_conta][3]) + valor);
        System.out.println("Operação realizada com sucesso");

        historico += "depósito de R$ " + valor + " da conta " + matriz_retorno[pos_conta][0] + " ("+ matriz_retorno[pos_conta][2] +")";

        return matriz_retorno;

    }
}