import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(234, "Bob da Silva", 8.4, 3);
        Aluno aluno02 = new Aluno(235, "Xampson Sousa", 6.7, 1);
        Aluno aluno03 = new Aluno(236, "Joaquim Barbosa", 9.2, 0);

        //crie uma lista com 3 alunos
        //exiba a tabela abaixo percorrendo a lista de alunos
        //ra    nome            nota faltas

        System.out.printf("%-6s %-15s %6s %6s", "ra", "nome", "nota", "faltas");
        //exiba uma tabela percorrendo a lista de alunos
        List<Aluno> listaAlunos = List.of(aluno01, aluno02, aluno03);
        for (Aluno aluno : listaAlunos) {
            System.out.printf("\n%06d %-15s %6.2f %6d", aluno.getRa(), aluno.getNome(), aluno.getNotaFinal(), aluno.getQtdFaltas());
        }


//        System.out.printf("\n%06d %-15s %6.2f %6d", aluno01.getRa(), aluno01.getNome(), aluno01.getNotaFinal(), aluno01.getQtdFaltas());

    }
}