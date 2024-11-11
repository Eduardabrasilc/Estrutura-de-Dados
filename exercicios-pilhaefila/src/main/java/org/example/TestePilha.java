package org.example;

public class TestePilha {
    public static void separaPositivoNegativoOrdemDiferente(int[] v) {
        FilaObj<Integer> filaPositivos = new FilaObj<>(v.length);
        PilhaObj<Integer> pilhaNegativos = new PilhaObj<>(v.length);

        for (int num : v) {
            if (num >= 0) {
                filaPositivos.enfileira(num);
            } else {
                pilhaNegativos.empilha(num);
            }
        }


        while (!filaPositivos.estaVazia()) {
            System.out.print(filaPositivos.desenfileira() + " ");
        }


        while (!pilhaNegativos.estaVazia()) {
            System.out.print(pilhaNegativos.desempilha() + " ");
        }
    }

    public static void main(String[] args) {
        int[] v = {2, 7, -3, -50, 45, -4, 30, -21, 38};
        separaPositivoNegativoOrdemDiferente(v);
    }
}
