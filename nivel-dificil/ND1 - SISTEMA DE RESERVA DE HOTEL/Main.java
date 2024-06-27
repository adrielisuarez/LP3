/*Sistema de Reservas de Hotel Crie um sistema de reservas de hotel com classes
para Hotel, Quarto, Reserva e Cliente. Os clientes devem ser capazes de
fazer reservas, que ocupam um quarto por um certo período de tempo. Garanta que
os quartos não sejam reservados por mais de um cliente ao mesmo tempo.*/
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do hotel e quartos
        Hotel hotel = new Hotel("Hotel Exemplo");
        hotel.adicionarQuarto(new Quarto(101, 2));
        hotel.adicionarQuarto(new Quarto(102, 3));

        // Usuário insere informações do cliente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        // Usuário insere informações da reserva
        System.out.print("Digite o número do quarto desejado (101 ou 102): ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a data de início da reserva (formato AAAA-MM-DD): ");
        String dataInicioStr = scanner.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr);

        System.out.print("Digite a data de fim da reserva (formato AAAA-MM-DD): ");
        String dataFimStr = scanner.nextLine();
        LocalDate dataFim = LocalDate.parse(dataFimStr);

        // Realiza a reserva
        boolean reservaFeita = hotel.fazerReserva(cliente, numeroQuarto, dataInicio, dataFim);

        if (reservaFeita) {
            System.out.println("Reserva feita com sucesso para " + cliente.getNome());
        } else {
            System.out.println("Não foi possível fazer a reserva.");
        }

        // Listando todas as reservas
        System.out.println("\nLista de Reservas:");
        for (Reserva reserva : hotel.obterReservas()) {
            System.out.println(reserva);
        }

        scanner.close();
    }
}
