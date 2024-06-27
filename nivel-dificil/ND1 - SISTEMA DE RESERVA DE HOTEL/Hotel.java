import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public boolean fazerReserva(Cliente cliente, int numeroQuarto, LocalDate dataInicio, LocalDate dataFim) {
        Quarto quarto = encontrarQuarto(numeroQuarto);
        if (quarto == null) {
            System.out.println("Quarto não encontrado.");
            return false;
        }

        Reserva novaReserva = new Reserva(cliente, quarto, dataInicio, dataFim);
        for (Reserva reserva : reservas) {
            if (reserva.conflitoCom(novaReserva)) {
                System.out.println("Conflito de reservas para o quarto " + numeroQuarto);
                return false;
            }
        }

        reservas.add(novaReserva);
        System.out.println("Reserva feita com sucesso para " + cliente.getNome());
        return true;
    }

    private Quarto encontrarQuarto(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                return quarto;
            }
        }
        return null;
    }

    public List<Reserva> obterReservas() {
        return reservas;
    }
}
