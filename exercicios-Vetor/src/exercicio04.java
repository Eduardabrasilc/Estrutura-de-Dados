import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número qualquer: ");
        int numeroQualquer = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroQualquer) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("O número " + numeroQualquer + " ocorre " + contador + " vez(es) no vetor.");
        } else {
            System.out.println("O número " + numeroQualquer + " não ocorre nenhuma vez no vetor.");
        }

    }
}
