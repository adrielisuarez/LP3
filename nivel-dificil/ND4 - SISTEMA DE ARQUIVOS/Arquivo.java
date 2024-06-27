public class Arquivo {
    private String nome;
    private int tamanho; // em bytes

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return nome + " (" + tamanho + " bytes)";
    }
}
