import java.util.ArrayList;
import java.util.Arrays;

public class Recursao {

    public static int buscarQuantidadeVendas(double[] precos, int index) {
        if (index == precos.length) {
            return 0;
        }
        return 1 + buscarQuantidadeVendas(precos, index + 1);
    }

    // Método para somar o valor total das vendas
    public static double somarVendas(double[] precos, int index) {
        if (index == precos.length) {
            return 0;
        }
        return precos[index] + somarVendas(precos, index + 1);
    }

    // Método para verificar se o preço existe no vetor
    public static boolean buscarPreco(double[] precos, double precoPesquisa, int index) {
        if (index == precos.length) {
            return false;
        }
        if (precos[index] == precoPesquisa) {
            return true;
        }
        return buscarPreco(precos, precoPesquisa, index + 1);
    }

    public static double buscarMaiorPreco(double[] precos, int index, double maiorAtual) {
        if (index == precos.length) {
            return maiorAtual;
        }
        if (precos[index] > maiorAtual) {
            maiorAtual = precos[index];
        }
        return buscarMaiorPreco(precos, index + 1, maiorAtual);
    }

    // Método para buscar o menor preço no vetor
    public static double buscarMenorPreco(double[] precos, int index, double menorAtual) {
        if (index == precos.length) {
            return menorAtual;
        }
        if (precos[index] < menorAtual) {
            menorAtual = precos[index];
        }
        return buscarMenorPreco(precos, index + 1, menorAtual);
    }

    // Método para buscar preços maiores ou iguais a um preço mínimo
    public static double[] buscarPorPrecoMinimo(double[] precos, double precoMinimo, int index, ArrayList<Double> resultado) {
        if (index == precos.length) {
            double[] resultadoArray = new double[resultado.size()];
            for (int i = 0; i < resultado.size(); i++) {
                resultadoArray[i] = resultado.get(i);
            }
            return resultadoArray;
        }
        if (precos[index] >= precoMinimo) {
            resultado.add(precos[index]);
        }
        return buscarPorPrecoMinimo(precos, precoMinimo, index + 1, resultado);
    }

    public static void main(String[] args) {
        double[] precos = { 100.0, 150.0, 200.0, 50.0, 75.0, 120.0 };

        System.out.println("Quantidade de vendas: " + buscarQuantidadeVendas(precos, 0));
        System.out.println("Total de vendas: " + somarVendas(precos, 0));
        System.out.println("Preço 150 existe? " + buscarPreco(precos, 150.0, 0));
        System.out.println("Maior preço: " + buscarMaiorPreco(precos, 0, Double.MIN_VALUE));
        System.out.println("Menor preço: " + buscarMenorPreco(precos, 0, Double.MAX_VALUE));
        System.out.println("Preços maiores ou iguais a 100: " + Arrays.toString(buscarPorPrecoMinimo(precos, 100.0, 0, new ArrayList<>())));
    }
}