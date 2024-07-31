import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CompararDatas {

    public static void compararDatas(LocalDate data1, LocalDate data2) {
        if (data1.isBefore(data2)) {
            System.out.println(data1 + " é antes de " + data2);
        } else if (data1.isAfter(data2)) {
            System.out.println(data1 + " é depois de " + data2);
        } else {
            System.out.println(data1 + " é igual a " + data2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate data1 = null;
        LocalDate data2 = null;

        // Lê a primeira data
        while (data1 == null) {
            System.out.println("Digite a primeira data (formato yyyy-MM-dd):");
            String entradaData1 = scanner.nextLine();
            try {
                data1 = LocalDate.parse(entradaData1, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato yyyy-MM-dd.");
            }
        }

        // Lê a segunda data
        while (data2 == null) {
            System.out.println("Digite a segunda data (formato yyyy-MM-dd):");
            String entradaData2 = scanner.nextLine();
            try {
                data2 = LocalDate.parse(entradaData2, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato yyyy-MM-dd.");
            }
        }

        // Compara as duas datas
        compararDatas(data1, data2);

        scanner.close();
    }
}
