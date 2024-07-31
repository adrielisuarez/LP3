import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarLista {

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

        // Ordena a lista
        Collections.sort(numeros);

        // Exibe a lista ordenada
        System.out.println("Lista de números ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
