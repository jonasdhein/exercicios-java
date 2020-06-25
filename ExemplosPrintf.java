public class ExemplosPrintf {

    public static void main(String[] args){

        System.out.printf("Texto\nDecimal\n");
        
        String nome = EntradaScanner.leiaString("Informe o seu nome: ");
        System.out.printf("Meu nome é: %s\n", nome);

        int numero = 10;
        System.out.printf("Número 1 = %d, número 2 = %d", numero, (numero + 5));

    }
    
}