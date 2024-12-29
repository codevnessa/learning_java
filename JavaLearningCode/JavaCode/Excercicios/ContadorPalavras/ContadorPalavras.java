package ContadorPalavras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContadorPalavras {

    public static void main(String[] args) {
        // Nomes dos arquivos
        String arquivoEntrada = "texto.txt";
        String arquivoSaida = "contagem_palavras.txt";

        try {
            // 1. Ler o arquivo de texto
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
            StringBuilder conteudo = new StringBuilder();
            String linha;

            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            leitor.close();

            // 2. Contar o número de palavras
            String texto = conteudo.toString();
            String[] palavras = texto.split("\\s+"); // Divide o texto em palavras usando espaços como delimitador
            int numeroPalavras = palavras.length;

            // 3. Escrever o resultado em um novo arquivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida));
            escritor.write("Número de palavras no arquivo '" + arquivoEntrada + "': " + numeroPalavras);
            escritor.close();

            System.out.println("Contagem de palavras concluída. Resultado salvo em '" + arquivoSaida + "'.");
        } catch (IOException e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}