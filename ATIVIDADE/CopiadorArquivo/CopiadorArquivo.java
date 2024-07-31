import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiadorArquivo {

    public static void main(String[] args) {
        // Especifica os caminhos dos arquivos de origem e destino
        String caminhoArquivoOrigem = "origem.txt";
        String caminhoArquivoDestino = "destino.txt";

        // Tenta copiar o conteúdo do arquivo de origem para o arquivo de destino
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivoOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivoDestino))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha);
                escritor.newLine(); // Adiciona uma nova linha no arquivo de destino
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
