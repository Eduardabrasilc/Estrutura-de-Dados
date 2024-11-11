import java.util.Scanner;

public class exercicio02 {

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Números [" + i + "]:" + vetor[i]);
        }
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorNumeros = new int[10];

        Double somaTotal = 0.0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Preencha o vetor [" + i + "]: ");
            vetorNumeros[i] = leitor.nextInt();
            somaTotal += vetorNumeros[i];
        }
        System.out.println("média: " + somaTotal / vetorNumeros.length);






    }

}
