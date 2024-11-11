package org.example;

public class FilaObj<T> {
    private Object[] fila;
    private int frente;
    private int tras;
    private int tamanho;

    public FilaObj(int capacidade) {
        fila = new Object[capacidade];
        frente = 0;
        tras = -1;
        tamanho = 0;
    }

    public void enfileira(T elemento) {
        if (tamanho == fila.length) {
            throw new RuntimeException("Fila cheia");
        }
        tras = (tras + 1) % fila.length;
        fila[tras] = elemento;
        tamanho++;
    }

    public T desenfileira() {
        if (tamanho == 0) {
            throw new RuntimeException("Fila vazia");
        }
        T elemento = (T) fila[frente];
        frente = (frente + 1) % fila.length;
        tamanho--;
        return elemento;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}
