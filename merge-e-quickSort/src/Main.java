import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class Main {
    public static void main(String[] args) {
        int[] vetorNumeros = {10, 35, 40, 56, 32, 13, 67, 98, 9, 3, 90, 86, 204, 2, 1, -50, 78};
        mergeSort(vetorNumeros, 0, vetorNumeros.length - 1);
        quickSort(vetorNumeros, 0, vetorNumeros.length - 1);
        System.out.println("merge " + Arrays.toString(vetorNumeros));
        System.out.println("quick " + Arrays.toString(vetorNumeros));

    }


    //MergeSort
    public static void mergeSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            intercala(vetor, inicio, meio, fim);
        }


    }

    public static void intercala(int vetor[], int inicio, int meio, int fim) {
        int[] vetorTemp = new int[vetor.length];
        for (int i = inicio; i <= fim; i++) {
            vetorTemp[i] = vetor[i];
        }
        int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (vetorTemp[i] < vetorTemp[j]) {
                vetor[k] = vetorTemp[i];
                i++;
            } else {
                vetor[k] = vetorTemp[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            vetor[k] = vetorTemp[i];
            k++;
            i++;
        }
    }


    //quick sort
    public static void quickSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separar(int vetor[], int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) i++;
            else if (pivo < vetor[f]) f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}

