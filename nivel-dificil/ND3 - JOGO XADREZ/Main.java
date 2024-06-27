/*Jogo de Xadrez Implemente um jogo de xadrez. Crie classes para o Tabuleiro,
as Pecas e os Jogadores. Cada tipo de peça (Rei, Rainha, Bispo, Cavalo, Torre e
Peão) deve ser uma subclasse da classe Peca. As peças devem saber como elas
podem se mover no tabuleiro. Os jogadores devem ser capazes de fazer
movimentos, que são então validados e executados pelo tabuleiro.*/
public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new Jogador("Alice", "branco");
        Jogador jogador2 = new Jogador("Bob", "preto");

        tabuleiro.imprimirTabuleiro();

        while (true) {
            if (jogador1.fazerMovimento(tabuleiro)) {
                tabuleiro.imprimirTabuleiro();
            }
            if (jogador2.fazerMovimento(tabuleiro)) {
                tabuleiro.imprimirTabuleiro();
            }
        }
    }
}
