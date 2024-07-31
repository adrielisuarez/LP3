public class ContadorVogais {

    public static int contarVogais(String s) {
        // Converte a string para minúsculas para simplificar a comparação
        s = s.toLowerCase();
        int contador = 0;

        // Itera sobre cada caractere da string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Verifica se o caractere é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String[] stringsDeTeste = {
            "Java",
            "Conte as vogais"
        };

        for (String teste : stringsDeTeste) {
            System.out.println("'" + teste + "' tem " + contarVogais(teste) + " vogais.");
        }
    }
}
