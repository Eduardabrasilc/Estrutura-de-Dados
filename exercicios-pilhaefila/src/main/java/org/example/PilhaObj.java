package org.example;

public class PilhaObj<T> {
    private Object[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        pilha = new Object[capacidade];
        topo = -1;
    }

    public void empilha(T elemento) {
        if (topo == pilha.length - 1) {
            throw new RuntimeException("Pilha cheia");
        }
        pilha[++topo] = elemento;
    }

    public T desempilha() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia");
        }
        T elemento = (T) pilha[topo];
        topo--;
        return elemento;
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}
