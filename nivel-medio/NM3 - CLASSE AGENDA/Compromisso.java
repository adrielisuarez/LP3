import java.time.LocalDate;
import java.time.LocalTime;

public class Compromisso {
    private LocalDate data;
    private LocalTime hora;
    private String descricao;

    public Compromisso(LocalDate data, LocalTime hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Hora: " + hora + ", Descrição: " + descricao;
    }
}
