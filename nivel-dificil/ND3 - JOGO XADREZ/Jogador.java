import java.util.Scanner;

public class Jogador {
    private String nome;
    private String cor; // "branco" ou "preto"

    public Jogador(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public boolean fazerMovimento(Tabuleiro tabuleiro) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador " + nome + " (" + cor + "), faça seu movimento (ex: a2 a3): ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(" ");

        if (partes.length != 2) {
            System.out.println("Entrada inválida. Use o formato 'de para' (ex: a2 a3).");
            return false;
        }

        String posicaoOrigem = partes[0];
        String posicaoDestino = partes[1];

        int colunaOrigem = posicaoOrigem.charAt(0) - 'a';
        int linhaOrigem = 8 - Character.getNumericValue(posicaoOrigem.charAt(1));
        int colunaDestino = posicaoDestino.charAt(0) - 'a';
        int linhaDestino = 8 - Character.getNumericValue(posicaoDestino.charAt(1));

        return tabuleiro.moverPeca(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
    }
}
