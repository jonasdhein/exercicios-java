/* la�o de repeti��o
a partir do numero 1, quatas vezes a variavel primo deu resultado ZERO?
*/
public class NumeroPrimo{
  public static void main(String[] args){
    
    Entrada.mostraTexto("N�mero Primo","Este programa far� a verifica��o do n�mero informado para saber se ele � um n�mero primo\nDigite 0 para SAIR");
    int primo = 0;
    int divisoes = 0; //incrementar esse contador com os n�meros s�o divis�veis
    do{ //n�o precisa fazer o teste de mesa com o do-while.
      primo = Entrada.leiaInt("Informe um n�mero:");
      for(int i = 1; i <= primo; i++){
        if(primo%i == 0){
          divisoes = divisoes + 1; // -> count++ ou count += 1
        }
      }
      
      if(divisoes == 2){
        System.out.println("O n�mero "+ primo +" � primo");
      }else{
        System.out.println("O n�mero "+ primo +" n�o � primo");
      }
      divisoes = 0;
    }while(primo > 0);
    
    System.out.println("Fim do programa");
    
  }
}