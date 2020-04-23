/* laço de repetição
a partir do numero 1, quatas vezes a variavel primo deu resultado ZERO?
*/
public class NumeroPrimo{
  public static void main(String[] args){
    
    Entrada.mostraTexto("Número Primo","Este programa fará a verificação do número informado para saber se ele é um número primo\nDigite 0 para SAIR");
    int primo = 0;
    int divisoes = 0; //incrementar esse contador com os números são divisíveis
    do{ //não precisa fazer o teste de mesa com o do-while.
      primo = Entrada.leiaInt("Informe um número:");
      for(int i = 1; i <= primo; i++){
        if(primo%i == 0){
          divisoes = divisoes + 1; // -> count++ ou count += 1
        }
      }
      
      if(divisoes == 2){
        System.out.println("O número "+ primo +" é primo");
      }else{
        System.out.println("O número "+ primo +" não é primo");
      }
      divisoes = 0;
    }while(primo > 0);
    
    System.out.println("Fim do programa");
    
  }
}