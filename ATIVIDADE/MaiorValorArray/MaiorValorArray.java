public class MaiorValorArray {

    public static int encontrarMaiorValor(int[] array) {
        // Verifica se o array está vazio
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }

        // Inicializa o maior valor com o primeiro elemento do array
        int maiorValor = array[0];

        // Itera sobre o array para encontrar o maior valor
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }
        }

        return maiorValor;
    }

    public static void main(String[] args) {
        int[] array = { 3, 7, 2, 8, 5, 10, 1 };

        int maiorValor = encontrarMaiorValor(array);
        System.out.println("O maior valor no array é: " + maiorValor);
    }
}
