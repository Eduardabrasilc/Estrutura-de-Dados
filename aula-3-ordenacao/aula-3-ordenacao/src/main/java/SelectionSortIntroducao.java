import java.util.Arrays;

public class SelectionSortIntroducao {
    public static void main(String[] args) {
        int[] vetorNumeros = {10, 35, 40, 56, 32, 13, 67, 98, 9, 3, 90, 86, 204, 2, 1, -50, 78};

        for (int i = 0; i < vetorNumeros.length-1; i++) {
            for (int j = i+1; j < vetorNumeros.length; j++) {
                if (vetorNumeros[j] < vetorNumeros[i]) {
                    int aux = vetorNumeros[j];
                    vetorNumeros[j] = vetorNumeros[i];
                    vetorNumeros[i] = aux;

                }
            }
        }
        System.out.println(Arrays.toString(vetorNumeros));
    }

    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
