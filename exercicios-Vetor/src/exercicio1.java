import java.util.Scanner;

public class exercicio1 {

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Números [" + i + "]:" + vetor[i]);
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetorNumeros = new int[7];

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Preencha o vetor [" + i + "]: ");
            vetorNumeros[i] = leitor.nextInt();
        }

        exibirVetor(vetorNumeros);


        for (int i = vetorNumeros.length - 1; i >= 0 ; i--) {
            System.out.println("Números: " + vetorNumeros[i]);
        }
    }

}

