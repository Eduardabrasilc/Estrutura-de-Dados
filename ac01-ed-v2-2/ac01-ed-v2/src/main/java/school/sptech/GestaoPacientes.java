package school.sptech;

public class GestaoPacientes {

    public static boolean alterarValorConsulta(Paciente[] pacientes, Integer id, Double valorNovo) {
        for (Paciente paciente : pacientes){
            if (paciente.getId().equals(id)){
                paciente.setValorConsulta(valorNovo);
                return true;
            }
        }
        return false;
    }

    public static Double somaValorConsulta(Paciente[] pacientes) {
        double soma = 0.0;
        for (Paciente paciente : pacientes) {
            soma += paciente.getValorConsulta();
        }
        return soma;
    }

    public static void trocaPacientes(Paciente[] pacientes, Integer idPaciente01, Integer idPaciente02) {
        Paciente paciente01 = null;
        Paciente paciente02 = null;
        for (Paciente paciente : pacientes) {
            if (paciente.getId().equals(idPaciente01)) {
                paciente01 = paciente;
            }
            if (paciente.getId().equals(idPaciente02)) {
                paciente02 = paciente;
            }
        }
        if (paciente01 != null && paciente02 != null) {
            int indicePaciente01 = -1;
            int indicePaciente02 = -1;
            for (int i = 0; i < pacientes.length; i++) {
                if (pacientes[i].getId().equals(idPaciente01)) {
                    indicePaciente01 = i;
                }
                if (pacientes[i].getId().equals(idPaciente02)) {
                    indicePaciente02 = i;
                }
            }
            if (indicePaciente01 != -1 && indicePaciente02 != -1) {
                pacientes[indicePaciente01] = paciente02;
                pacientes[indicePaciente02] = paciente01;
            }
        }
    }

    //Corrija o erro na ordenação abaixo:
    public static void ordenarPorIdade(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < pacientes.length; j++) {
                if (pacientes[j].getIdade() < pacientes[indiceMenor].getIdade()) {
                    indiceMenor = j;
                }
            }
            Paciente aux = pacientes[i];
            pacientes[i] = pacientes[indiceMenor];
            pacientes[indiceMenor] = aux;
        }
    }

    //Corrija o erro na ordenação abaixo:
    public static void ordenarPorIdadeDecrescente(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length -1; i++){
            int indiceMaior = i;
            for (int j = i + 1; j < pacientes.length; j++){
                if (pacientes[j].getIdade() > pacientes[indiceMaior].getIdade()){
                    indiceMaior = j;
                }
            }
            Paciente aux = pacientes[i];
            pacientes[i] = pacientes[indiceMaior];
            pacientes[indiceMaior] = aux;
        }
    }

    //Complete o código da ordenação abaixo dentro do "if"
    public static void ordenarPorNomePaciente(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length - 1; i++) {
            for (int j = 1; j < pacientes.length - i; j++) {
                if (pacientes[j - 1].getNome().compareTo(pacientes[j].getNome()) > 0) {
                    Paciente aux = pacientes[j];
                    pacientes[j] = pacientes[j - 1];
                    pacientes[j - 1] = aux;
                }
            }
        }
    }

    //Exibe os itens do vetor
    //Já está pronto para usar no main se quiser testar :)
    public static void exibePacientes(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i]);
        }
    }
}
