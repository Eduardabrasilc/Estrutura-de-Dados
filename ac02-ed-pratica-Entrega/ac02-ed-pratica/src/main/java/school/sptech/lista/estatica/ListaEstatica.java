package school.sptech.lista.estatica;

public class ListaEstatica {

    private int[] vetor;

    private int nroElem;

    public ListaEstatica(int capacidade) {
        vetor = new int[capacidade];
        nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException();
        } else {
            vetor[nroElem++] = elemento;
        }
    }

    public int busca(int elemento) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false;
        } else {
            for (int i = indice; i < nroElem - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            nroElem--;
            return true;
        }
    }

    public boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento));
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("Lista vazia!");
        } else {
            for (int i = 0; i < nroElem; i++) {
                System.out.printf(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }

    // [COMPLETAR CÓDIGO ABAIXO] - Complete o corpo do método adicionaNoMeio:
    public void adicionaNoMeio(int elementoNovo) {
        if (nroElem >= vetor.length){
            throw new IllegalStateException();
        } else {
            int meio = nroElem / 2;
            for (int i = nroElem; i > meio; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[meio] = elementoNovo;
            nroElem++;
        }

    }

    // [COMPLETAR CÓDIGO ABAIXO] - Complete o corpo do método removeImpares:
    public int removeImpares() {
        int cont = 0;
        for (int i = 0; i < nroElem; i++){
            if (vetor[i] % 2 != 0){
                removePeloIndice(i);
                cont++;
                i--;
            }
        }
        return cont;
    }
}
