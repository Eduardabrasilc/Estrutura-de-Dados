package org.example;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.print("Pilha: ");
        pilha.exibe();

        //metodo pop
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());


        System.out.print("Pilha após pop: ");
        pilha.exibe();

        //método peek
        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.print("Pilha final: ");
        pilha.exibe();
    }
}