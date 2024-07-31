import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {

    public static void main(String[] args) {
        // Especifica o caminho do arquivo a ser lido
        String caminhoArquivo = "exemplo.txt";

        // Tenta abrir o arquivo e ler seu conteúdo
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
