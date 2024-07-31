public class Construtor {

    public static String construirString(String[] palavras) {
        StringBuilder sb = new StringBuilder();

        // Adiciona cada palavra ao StringBuilder
        for (String palavra : palavras) {
            sb.append(palavra).append(" "); // Adiciona um espaço após cada palavra
        }

        // Remove o espaço final extra se a string não estiver vazia
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString(); // Converte o StringBuilder em uma String
    }

    public static void main(String[] args) {
        String[] palavras = { "Olá", "mundo", "de", "Java", "usando", "StringBuilder!" };

        String resultado = construirString(palavras);
        System.out.println("A string construída é: " + resultado);
    }
}
