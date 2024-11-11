public class ListaObj<T> {
    private T[] vetor;
    private int nroElem;

    public ListaObj(int tamanhoLista) {
        vetor = (T[]) new Object[tamanhoLista];
        nroElem = 0;
    }

    public void adiciona(T elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
        } else {
            vetor[nroElem] = elemento;
            nroElem++;
        }
    }

    public void exibir() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int busca(T elemento) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false; // Índice inválido
        }
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        return true;
    }

    public boolean removerElemento(T elemento) {
        int indice = busca(elemento);
        if (indice == -1) {
            return false;
        }
        return removePeloIndice(indice);
    }

    public boolean substitui(T valorAntigo, T valorNovo) {
        int indice = busca(valorAntigo);
        if (indice == -1) {
            System.out.println("valor não encontrado");
            return false;
        }
        vetor[indice] = valorNovo;
        return true;
    }

    public int contaOcorrencias(T valor) {
        int contador = 0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(valor)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean adicionaNoInicio(T valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
            return false;
        }
        for (int i = nroElem; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = valor;
        nroElem++;
        return true;
    }

    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        return vetor[indice];
    }

    public void limpa() {
        nroElem = 0;
    }
}
