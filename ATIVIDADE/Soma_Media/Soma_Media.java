import java.util.List;

public class Soma_Media {

    public static void calcularSomaEMedia(List<Integer> listaDeNumeros) {
        if (listaDeNumeros == null || listaDeNumeros.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        int soma = 0;
        for (int numero : listaDeNumeros) {
            soma += numero;
        }

        double media = (double) soma / listaDeNumeros.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {
        // Exemplo de lista de números inteiros
        List<Integer> listaDeNumeros = List.of(10, 20, 30, 40, 50);

        // Calcula e exibe a soma e a média da lista de números
        calcularSomaEMedia(listaDeNumeros);
    }
}
