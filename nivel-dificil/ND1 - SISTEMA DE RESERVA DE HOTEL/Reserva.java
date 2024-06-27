import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean conflitoCom(Reserva outra) {
        return this.quarto.equals(outra.getQuarto()) && 
               (this.dataInicio.isBefore(outra.getDataFim()) && this.dataFim.isAfter(outra.getDataInicio()));
    }

    @Override
    public String toString() {
        return "Reserva [Cliente=" + cliente + ", Quarto=" + quarto + ", Data Início=" + dataInicio + ", Data Fim=" + dataFim + "]";
    }
}
