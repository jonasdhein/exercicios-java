public class TratamentoDeErros {

    public static void main(String[] args){

        float c;

        try{
            
            int a = EntradaScanner.leiaInt("Informe um número");
            int b = EntradaScanner.leiaInt("Informe um número");

        }catch(Exception ex){
            System.out.println("OPS, erro na operação");
        }finally{
            System.out.println("Chegou no fim do código");
        }

    }
    
}