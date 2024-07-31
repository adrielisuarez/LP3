public class InserirString {

    public static String inserirString(String original, String paraInserir, int posicao) {
        // Cria um StringBuilder a partir da string original
        StringBuilder sb = new StringBuilder(original);

        // Verifica se a posição está dentro dos limites da string
        if (posicao < 0 || posicao > sb.length()) {
            throw new IllegalArgumentException("A posição está fora dos limites da string.");
        }

        // Insere a string na posição especificada
        sb.insert(posicao, paraInserir);

        return sb.toString(); // Converte o StringBuilder em uma String
    }

    public static void main(String[] args) {
        String original = "Olá mundo!";
        String paraInserir = " belíssimo";
        int posicao = 4; // Posição onde a nova string será inserida

        String resultado = inserirString(original, paraInserir, posicao);
        System.out.println("Resultado: " + resultado);
    }
}
