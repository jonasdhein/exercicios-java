/*
<<<<<<< HEAD

=======
 * FUP utilizando a atividade anterior. Porém agora o vetor inicial precisa ser dinâmico 
 * no tamanho e com valores preenchidos aleatoriamente.
>>>>>>> 8605f01b4730ce320bf44d019754dede80f8b1c2
 */
public class OrdenarVetorRandomico{

  public static void main(String[] args){
   
<<<<<<< HEAD
    int tamanho = (int) (Math.random() * 60) + 1;
    int[] numeros = new int[35];
    for(){
      numeros[i] = (int) (Math.random() * 60) + 1
    }
    
    /*System.out.println(Funcoes.obterHoraAtual());
=======
    //definindo o tamanho do vetor dinamicamente
    int tam = (int) (Math.random() * 100) + 1;
    System.out.println("Tamanho do vetor: " + tam);
    
    int[] numeros = new int[tam];//declaracao do nosso vetor com tamanho = tamanho
    
    //laco para preencher o vetor
    for(int i = 0; i < tam; i++){
      numeros[i] = (int) (Math.random() * 5000) + 1;
    }
    
    //laco para imprimir o vetor antigo
    String nao_ordenado = "";
    for(int i = 0; i < numeros.length; i++){
      nao_ordenado += numeros[i] + ",";
    }
    System.out.println(nao_ordenado);
    
    //Entrada.mostraTexto("Continuar", "Clique OK para ordenar o vetor");
>>>>>>> 8605f01b4730ce320bf44d019754dede80f8b1c2
    int temp = 0;
    for(int i = 0; i < tam - 1; i++){
      for(int x = 0; x < tam - i - 1; x++){
        if(numeros[x] > numeros[(x+1)]){
          temp = numeros[x];
          numeros[x] = numeros[(x+1)];
          numeros[(x+1)] = temp;
        }
      }
<<<<<<< HEAD
    }*/
    
    for(int i = 0; i < numeros.length; i++){
      System.out.println(numeros[i]);
    }
    System.out.println(Funcoes.obterHoraAtual());
    
    System.out.println("Fim do programa");
=======
    }
    
    String ordenado = "";
    System.out.println("\nVetor ordenado:");
    for(int i = 0; i < numeros.length; i++){
      ordenado += numeros[i] + ",";
    }
    
    System.out.println(ordenado);
    
    System.out.println("\nFim do programa");
>>>>>>> 8605f01b4730ce320bf44d019754dede80f8b1c2
    
  }

}