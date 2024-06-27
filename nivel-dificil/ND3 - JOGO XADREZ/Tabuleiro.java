public class Tabuleiro {
    private Peca[][] tabuleiro;

    public Tabuleiro() {
        this.tabuleiro = new Peca[8][8];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        // Inicializa as peças no tabuleiro
        // Exemplo básico: apenas reis no momento
        tabuleiro[0][4] = new Rei("branco", 0, 4);
        tabuleiro[7][4] = new Rei("preto", 7, 4);
    }

    public boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        Peca pecaOrigem = tabuleiro[linhaOrigem][colunaOrigem];

        if (pecaOrigem == null) {
            System.out.println("Não há peça na posição de origem.");
            return false;
        }

        if (!pecaOrigem.podeMover(linhaDestino, colunaDestino)) {
            System.out.println("Movimento inválido para a peça " + pecaOrigem.getClass().getSimpleName());
            return false;
        }

        Peca pecaDestino = tabuleiro[linhaDestino][colunaDestino];

        if (pecaDestino != null && pecaDestino.getCor().equals(pecaOrigem.getCor())) {
            System.out.println("Não pode capturar sua própria peça.");
            return false;
        }

        // Realiza o movimento
        tabuleiro[linhaDestino][colunaDestino] = pecaOrigem;
        tabuleiro[linhaOrigem][colunaOrigem] = null;

        return true;
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(tabuleiro[i][j].toString() + " ");
                }
            }
            System.out.println();
        }
    }
}
