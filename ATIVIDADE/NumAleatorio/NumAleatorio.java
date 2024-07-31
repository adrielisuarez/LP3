import java.util.Random;

public class NumAleatorio {

    public static void main(String[] args) {
        // Cria uma instância da classe Random
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Exibe o número aleatório gerado
        System.out.println("Número aleatório gerado entre 1 e 100: " + numeroAleatorio);
    }
}
