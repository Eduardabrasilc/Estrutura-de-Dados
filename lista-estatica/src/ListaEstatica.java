public class ListaEstatica {
//    private int[] vetor;
//    private int nroElem;
//
//    public ListaEstatica(int tamanhoLista){
//        vetor = new int[tamanhoLista];
//        nroElem = 0;
//    }
//
//    public void adicionar(int elemento){
//        if (nroElem >= vetor.length){
//            System.out.println("Lista cheia");
//        } else {
//            vetor[nroElem] = elemento;
//            nroElem++;
//        }
//    }
//
//    public void exibir(){
//        for (int i = 0; i < nroElem; i++){
//            System.out.println(vetor[i]);
//        }
//    }
//
//    public int busca(int elemento) {
//        for (int i = 0; i < nroElem; i++) {
//            if (vetor[i] == elemento) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public boolean removePeloIndice(int indice) {
//        if (indice < 0 || indice >= nroElem) {
//            return false; // Índice inválido
//        }
//        for (int i = indice; i < nroElem - 1; i++) {
//            vetor[i] = vetor[i + 1];
//        }
//        nroElem--;
//        return true;
//    }
//
//    public boolean removerElemento(int elemento){
//        int indice = busca(elemento);
//        if(indice == -1){
//            return false;
//        }
//        return removePeloIndice(indice);
//    }
//
//    public boolean substitui(int valorAntigo, int valorNovo) {
//        int indice = busca(valorAntigo);
//        if (indice == -1) {
//            System.out.println("valor não encontrado");
//            return false;
//        }
//        vetor[indice] = valorNovo;
//        return true;
//    }
//
//    public int contaOcorrencias(int valor){
//        int contador = 0;
//        for (int i = 0; i < nroElem; i++){
//            if (vetor[i] == valor){
//                contador++;
//            }
//        }
//        return contador;
//    }
//
//    public boolean adicionaNoInicio(int valor) {
//        if (nroElem >= vetor.length) {
//            System.out.println("Lista cheia");
//            return false;
//        }
//        for (int i = nroElem; i > 0; i--) {
//            vetor[i] = vetor[i - 1];
//        }
//        vetor[0] = valor;
//        nroElem++;
//        return true;
//    }
}