import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorEMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite números inteiros para adicionar à lista (Digite 'sair' para finalizar):");

        // Lê números do usuário
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro ou 'sair' para finalizar.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi adicionado à lista.");
        } else {
            // Encontra o maior e o menor valor
            int maiorValor = Collections.max(numeros);
            int menorValor = Collections.min(numeros);

            // Exibe o maior e o menor valor
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
        }

        scanner.close();
    }
}
