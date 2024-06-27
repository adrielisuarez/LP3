public abstract class Peca {
    private String cor;
    private int linha;
    private int coluna;

    public Peca(String cor, int linha, int coluna) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
    }

    public String getCor() {
        return cor;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public abstract boolean podeMover(int linhaDestino, int colunaDestino);
}
