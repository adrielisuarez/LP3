import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DiferencaEmDias {

    public static int calcularDiferencaEmDias(LocalDate data1, LocalDate data2) {
        // Calcula o período entre as duas datas
        Period periodo = Period.between(data1, data2);
        
        // Retorna a diferença em dias
        return periodo.getDays();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate data1 = null;
        LocalDate data2 = null;

        // Lê a primeira data
        while (data1 == null) {
            System.out.println("Digite a primeira data (formato yyyy-MM-dd):");
            String entrada1 = scanner.nextLine();
            try {
                data1 = LocalDate.parse(entrada1, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato yyyy-MM-dd.");
            }
        }

        // Lê a segunda data
        while (data2 == null) {
            System.out.println("Digite a segunda data (formato yyyy-MM-dd):");
            String entrada2 = scanner.nextLine();
            try {
                data2 = LocalDate.parse(entrada2, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato yyyy-MM-dd.");
            }
        }

        // Calcula a diferença em dias
        int diferencaEmDias = Math.abs(calcularDiferencaEmDias(data1, data2));
        System.out.println("A diferença em dias entre as duas datas é: " + diferencaEmDias);

        scanner.close();
    }
}
