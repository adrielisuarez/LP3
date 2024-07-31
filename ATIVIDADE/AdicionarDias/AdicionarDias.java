import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AdicionarDias {

    public static LocalDate adicionarDias(LocalDate data, int dias) {
        // Adiciona o número específico de dias à data
        return data.plusDays(dias);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate data = null;
        int dias = 0;

        // Lê a data
        while (data == null) {
            System.out.println("Digite a data (formato yyyy-MM-dd):");
            String entradaData = scanner.nextLine();
            try {
                data = LocalDate.parse(entradaData, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato yyyy-MM-dd.");
            }
        }

        // Lê o número de dias a adicionar
        System.out.println("Digite o número de dias a adicionar:");
        while (true) {
            try {
                dias = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Por favor, insira um número inteiro.");
            }
        }

        // Adiciona os dias à data
        LocalDate novaData = adicionarDias(data, dias);
        System.out.println("A nova data após adicionar " + dias + " dias é: " + novaData);

        scanner.close();
    }
}
