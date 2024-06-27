public class Rei extends Peca {
    public Rei(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean podeMover(int linhaDestino, int colunaDestino) {
        int linhaAtual = this.getLinha();
        int colunaAtual = this.getColuna();

        // Lógica básica para movimento do rei
        if (Math.abs(linhaDestino - linhaAtual) <= 1 && Math.abs(colunaDestino - colunaAtual) <= 1) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "R" + (getCor().equals("branco") ? "b" : "p");
    }
}
