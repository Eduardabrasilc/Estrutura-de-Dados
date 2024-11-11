import java.util.Scanner;

public class exercicio03 {

    public static void exibirVetor(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Nomes: [" + i + "]:" + vetor[i]);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorNomes = new String[10];

        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println("Preencha o vetor [" + i + "]: ");
            vetorNomes[i] = leitor.nextLine();
        }

        System.out.print("Digite um nome qualquer: ");
        String nomeQualquer = leitor.nextLine();

        boolean encontrado = false;
        int indice = -1;

        for (int i = 0; i < vetorNomes.length; i++) {
            if (vetorNomes[i].equalsIgnoreCase(nomeQualquer)) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado) {
            System.out.println("Nome encontrado no índice " + indice);
        } else {
            System.out.println("Nome não encontrado");
        }



    }
}
