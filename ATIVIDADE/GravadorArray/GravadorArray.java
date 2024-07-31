import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravadorArray {

    public static void main(String[] args) {
        // Define o array de strings que será gravado no arquivo
        String[] arrayDeStrings = {
            "Linha 1",
            "Linha 2",
            "Linha 3",
            "Linha 4",
            "Linha 5"
        };

        // Especifica o caminho do arquivo onde o array será gravado
        String caminhoArquivo = "array.txt";

        // Tenta gravar o array de strings no arquivo
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (String linha : arrayDeStrings) {
                escritor.write(linha);
                escritor.newLine(); // Adiciona uma nova linha após cada string
            }

            System.out.println("Array gravado com sucesso no arquivo!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
