import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetorDeInteiros(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);

        }
    }

    public static void main(String[] args) {

        //Vetor de String:
        String[] palavras = new String[50];
        palavras[42] = "Resposta";

        //Vetor com valores iniciais:
        int[] vetorComValores = {10, 20, 30, 40,50};

        //tipo primitivo sempre tem valor inicial
        //tipo wrapper não possui, como classe aparece null além do valor
        //Vetor de inteiros:
        int[] vetor = new int[5];
        vetor[0]= 10;
        vetor[1] = 20;

        exibeVetorDeInteiros(vetor);

        Scanner leitor = new Scanner(System.in);
        int[] vetorUsuario = new int[5];

//        for (int i = 0; i < vetorUsuario.length; i++) {
//            System.out.println("Preencha o vetor[" + i + "]: ");
//            vetorUsuario[i] = leitor.nextInt();
//        }
        exibeVetorDeInteiros(vetorUsuario);


        //Toda vez que criamos uma String no java, é uma criação de um vetor de char, já que char só armazena
        //1 caractere. Por isso não existe string em forma primitiva
//        String palavra = "Teste";
//        System.out.println("A palavra é: " + palavra);


    }


}
