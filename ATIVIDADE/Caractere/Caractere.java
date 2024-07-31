public class Caractere {

    public static int encontrarPrimeiraOcorrencia(String s, char c) {
        // Itera sobre cada caractere da string
        for (int i = 0; i < s.length(); i++) {
            // Verifica se o caractere atual é igual ao caractere procurado
            if (s.charAt(i) == c) {
                return i; // Retorna a posição da primeira ocorrência
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }

    public static void main(String[] args) {
        String texto = "Exemplo de texto para encontrar um caractere.";
        char caractereProcurado = 't';

        int posicao = encontrarPrimeiraOcorrencia(texto, caractereProcurado);
        
        if (posicao != -1) {
            System.out.println("O caractere '" + caractereProcurado + "' foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O caractere '" + caractereProcurado + "' não foi encontrado na string.");
        }
    }
}
