import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorFrequenciaPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> frequencias = new HashMap<>();
        
        System.out.println("Digite um texto (pressione Enter duas vezes para finalizar):");

        // Lê o texto do usuário
        StringBuilder texto = new StringBuilder();
        String linha;
        while (!(linha = scanner.nextLine()).isEmpty()) {
            texto.append(linha).append(" ");
        }

        // Converte o texto em minúsculas e divide em palavras
        String[] palavras = texto.toString().toLowerCase().split("\\s+");

        // Conta a frequência das palavras
        for (String palavra : palavras) {
            frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
        }

        // Exibe a frequência das palavras
        System.out.println("Frequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
