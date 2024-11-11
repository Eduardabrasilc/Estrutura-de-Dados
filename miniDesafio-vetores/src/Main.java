import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunosT1 = new String[10];
        String[] alunosT2 = new String[10];
        int contagemT1 = 0;
        int contagemT2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a turma do aluno (T1 ou T2): ");
            String turma = scanner.nextLine();

            if (turma.equals("T1")) {
                alunosT1[contagemT1] = nome;
                contagemT1++;
            } else if (turma.equals("T2")) {
                alunosT2[contagemT2] = nome;
                contagemT2++;
            } else {
                System.out.println("Turma inválida. Tente novamente.");
                i--;
            }
        }

        System.out.println("Quantidade de alunos na T1: " + contagemT1);
        System.out.println("Alunos da T1:");
        for (int i = 0; i < contagemT1; i++) {
            System.out.println(alunosT1[i]);
        }

        System.out.println("Quantidade de alunos na T2: " + contagemT2);
        System.out.println("Alunos da T2:");
        for (int i = 0; i < contagemT2; i++) {
            System.out.println(alunosT2[i]);
        }

    }
}