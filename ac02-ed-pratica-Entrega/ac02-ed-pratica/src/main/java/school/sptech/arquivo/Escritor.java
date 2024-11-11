package school.sptech.arquivo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Escritor {
    public static void escreverArquivo() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(100, "Potes", "Cozinha", 5, 10.65, 67));
        produtos.add(new Produto(101, "Sabão em Pó", "Limpeza", 2, 9.99, 8));
        produtos.add(new Produto(102, "Mouse", "Eletronicos", 5, 80.50, 10));
        produtos.add(new Produto(103, "Teclado", "Eletronicos", 1, 150.93, 5));
        produtos.add(new Produto(104, "Pão Francês", "Padaria", 3, 5.33, 23));
        produtos.add(new Produto(105, "Brigadeiro", "Padaria", 4, 4.10, 130));

        try {
            OutputStream outputStream = new FileOutputStream("produtos.csv");

            BufferedWriter escritor = new BufferedWriter(
                    new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)
            );

            // [COMPLETAR CÓDIGO ABAIXO]
            // Escrevendo cabeçalho: complete a linha abaixo trocando "x" pelo código necessário por gravar o cabeçalho do csv
            escritor.write("id;nome;categoria;pontuacao;preco;quantidadeEstoque");
            escritor.newLine();

            // [COMPLETAR CÓDIGO ABAIXO]
            // Escrevendo corpo (dados): complete a linha abaixo trocando "x" pelo código necessário por gravar o corpo do csv
            // Lembre-se de percorrer a lista para escrever um produto por vez
            for (Produto produto : produtos) {
                escritor.write(String.format("%d;%s;%s;%d;%.2f;%d",
                        produto.getId(),
                        produto.getNome(),
                        produto.getCategoria(),
                        produto.getPontuacao(),
                        produto.getPreco(),
                        produto.getQuantidadeEstoque()));
                escritor.newLine();
            }

            escritor.close();
            outputStream.close();


        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo");
        }
    }

    public static void main(String[] args) {
        //Rode esse main caso queira testar a escrita do arquivo além dos testes automátizados:
        escreverArquivo();
    }
}
