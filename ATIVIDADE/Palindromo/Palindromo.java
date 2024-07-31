public class Palindromo {

    public static boolean isPalindrome(String s) {
        // Remove espaços, pontuação e converte para minúsculas
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Verifica se a string é igual ao seu reverso
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "A man, a plan, a canal, Panama",
            "racecar",
            "hello",
            "Was it a car or a cat I saw?"
        };

        for (String test : testStrings) {
            System.out.println("'" + test + "' é palíndromo? " + isPalindrome(test));
        }
    }
}
