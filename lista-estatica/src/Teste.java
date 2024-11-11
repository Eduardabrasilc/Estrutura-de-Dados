public class Teste {
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F"); // Lista cheia

        // Exibir lista
        System.out.println("Lista:");
        lista.exibir();

        // Testar substitui
        lista.substitui("B", "Z");
        System.out.println("Lista após substituir B por Z:");
        lista.exibir();

        // Testar contaOcorrencias
        System.out.println("Ocorrências de Z: " + lista.contaOcorrencias("Z"));

        // Testar adicionaNoInicio
        lista.adicionaNoInicio("X");
        System.out.println("Lista após adicionar X no início:");
        lista.exibir();

        // Testar getTamanho
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        // Testar getElemento
        System.out.println("Elemento no índice 2: " + lista.getElemento(2));

        // Testar limpa
        lista.limpa();
        System.out.println("Lista após limpar:");
        lista.exibir();
    }
}
