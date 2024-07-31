public class RemoveVogais {

    public static String removerVogais(String s) {
        StringBuilder sb = new StringBuilder();
        // Converta a string para minúsculas para simplificar a comparação
        s = s.toLowerCase();

        // Itera sobre cada caractere da string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Verifica se o caractere não é uma vogal
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c); // Adiciona o caractere não-vogal ao StringBuilder
            }
        }

        return sb.toString(); // Converte o StringBuilder em uma String
    }

    public static void main(String[] args) {
        String texto = "Exemplo de texto para remover vogais";

        String resultado = removerVogais(texto);
        System.out.println("Texto sem vogais: " + resultado);
    }
}
