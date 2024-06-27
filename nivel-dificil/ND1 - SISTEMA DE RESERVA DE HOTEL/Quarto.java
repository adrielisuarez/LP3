public class Quarto {
    private int numero;
    private int capacidade;

    public Quarto(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Quarto [Número=" + numero + ", Capacidade=" + capacidade + "]";
    }
}
