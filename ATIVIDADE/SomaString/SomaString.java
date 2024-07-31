import java.util.Scanner;

public class SomaString {

    public static int somarNumerosNaString(String input) {
        // Divide a string em partes com base nos espaços
        String[] partes = input.split(" ");
        
        int soma = 0;
        
        // Itera sobre cada parte e soma os números
        for (String parte : partes) {
            try {
                // Converte a parte para um número inteiro e adiciona à soma
                int numero = Integer.parseInt(parte);
                soma += numero;
            } catch (NumberFormatException e) {
                // Trata o caso onde a parte não pode ser convertida para um número inteiro
                System.err.println("A parte '" + parte + "' não é um número válido.");
            }
        }
        
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string de números separados por espaços:");
        String entrada = scanner.nextLine();

        int somaTotal = somarNumerosNaString(entrada);
        System.out.println("A soma total dos números é: " + somaTotal);

        scanner.close();
    }
}
