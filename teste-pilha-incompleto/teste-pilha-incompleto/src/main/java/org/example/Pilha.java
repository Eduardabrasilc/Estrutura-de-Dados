package org.example;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    // 03) Método isEmpty
    public Boolean isEmpty() {
        return topo == -1;
    }

    // 04) Método isFull
    public Boolean isFull() {
        return topo == pilha.length - 1;
    }

    // 05) Método push
    public void push(int info) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia!");
        }
        pilha[++topo] = info;
    }

    // 06) Método pop
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return pilha[topo--];
    }

    // 07) Método peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return pilha[topo];
    }

    // 08) Método exibe
    public void exibe() {
        for (int i = 0; i <= topo; i++) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    // Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}