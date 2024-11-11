package org.example;

public class Teste {
    public static void separaPositivoNegativoEmOrdem(int[] v) {
        FilaObj<Integer> positivos = new FilaObj<>(v.length);
        FilaObj<Integer> negativos = new FilaObj<>(v.length);

        for (int num : v) {
            if (num >= 0) {
                positivos.enfileira(num);
            } else {
                negativos.enfileira(num);
            }
        }


        while (!positivos.estaVazia()) {
            System.out.print(positivos.desenfileira() + " ");
        }


        while (!negativos.estaVazia()) {
            System.out.print(negativos.desenfileira() + " ");
        }
    }

    public static void main(String[] args) {
        int[] v = {2, 7, -3, -50, 45, -4, 30, -21, 38};
        separaPositivoNegativoEmOrdem(v);
    }

}
