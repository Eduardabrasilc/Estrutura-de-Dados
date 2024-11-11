import java.util.Arrays;

public class SelectionSortOtimizado {
    public static void main(String[] args) {
        int[] vetorNumeros2 = {10, 35, 40, 56, 32, 13, 67, 98, 9, 3, 90, 86, 204, 2};
        Integer[] vetorNumeros = {10, 35, 40, 56, 32, 13, 67, 98, 9, 3, 90, 86, 204, 2, 1, -50, 78};


        for (int i = 0; i < vetorNumeros.length - 1; i++) {
            int indMenor = i;

            // Percorre o resto do array para encontrar o menor valor
            for (int j = i + 1; j < vetorNumeros.length; j++) {
                if (vetorNumeros[j] < vetorNumeros[indMenor]) {
                    indMenor = j;  // Atualiza o índice do menor valor
                }
            }

            // Se o menor valor encontrado não for o valor da posição atual, faz a troca
            if (indMenor != i) {
                int aux = vetorNumeros[indMenor];
                vetorNumeros[indMenor] = vetorNumeros[i];
                vetorNumeros[i] = aux;
            }
        }

        System.out.println(Arrays.toString(vetorNumeros));
        System.out.println("Bubble Sort");
        bubbleSort(vetorNumeros2);
        System.out.println("Binária: ");
        System.out.println(pesquisaBin(vetorNumeros, 204));
    }


    public static void bubbleSort(int[] vetorNumeros2) {

        for (int i = 0; i < vetorNumeros2.length - 1; i++) {
            for (int j = 1; j < vetorNumeros2.length - i; j++) {
                if (vetorNumeros2[j - 1] > vetorNumeros2[j]) {
                    int aux = vetorNumeros2[j];
                    vetorNumeros2[j] = vetorNumeros2[j - 1];
                    vetorNumeros2[j - 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetorNumeros2));
    }

    // Insertion Sort, metodo de inserção, considera dois segmentos do vetor um ordenado e outro não ordenado
    // Considera o 1 numero como ordenado e os demais como não ordenados
    // Percorre o vetor e insere o numero na posição correta

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int x = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > x) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = x;
        }
        System.out.println(Arrays.toString(vetor));
    }


    //Pesquisa Binária
    //Ao invés de procurar no ínicio, procura no meio
    //Se o valor procurado for menor que o valor do meio, procura na metade direita
    //Se o valor procurado for maior que o valor do meio, procura na metade esquerda
    //Se o valor procurado for igual ao valor do meio, retorna o índice
    //Se o valor procurado não for encontrado, retorna -1

    public static Integer pesquisaBin(Integer[] vetorNumeros, Integer x) {
        System.out.println(Arrays.toString(vetorNumeros));
        Integer indinf, indsup, meio;
        indinf = 0;
        indsup = vetorNumeros.length - 1;
        while (indinf <= indsup) {
            meio = (indinf + indsup) / 2;
            if (vetorNumeros[meio].equals(x)) {
                return meio;
            } else if (x < vetorNumeros[meio]) {
                indsup = meio - 1;
            } else {
                indinf = meio + 1;
            }

        }
        return -1;
    }




    //Mini desafio

    // Tamanho do vetor
    int tamanhoVetor = 1000;
    int[] vetor = new int[tamanhoVetor];

    // Preenche o vetor de maneira ordenada somando 10 a cada iteração
        for (int i = 0; i < tamanhoVetor; i++) {
        vetor[i] = (i + 1) * 10;
    }

    // Aplica a Pesquisa Sequencial
    public static int pesquisaSequencial(int[] vetor, int valor) {
        int operacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            operacoes++;
            if (vetor[i] == valor) {
                break;
            }
        }
        return operacoes;
    }

    public static int pesquisaBinaria(int[] vetor, int valor) {
        int operacoes = 0;
        int indinf = 0;
        int indsup = vetor.length - 1;
        while (indinf <= indsup) {
            operacoes++;
            int meio = (indinf + indsup) / 2;
            if (vetor[meio] == valor) {
                break;
            } else if (valor < vetor[meio]) {
                indsup = meio - 1;
            } else {
                indinf = meio + 1;
            }
        }
        return operacoes;
    }




        }

}