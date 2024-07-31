public class Hipotenusa {

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        // Calcula o quadrado dos catetos e a soma
        double somaQuadrados = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        // Retorna a raiz quadrada da soma dos quadrados
        return Math.sqrt(somaQuadrados);
    }

    public static void main(String[] args) {
        double cateto1 = 3.0; // Comprimento do primeiro cateto
        double cateto2 = 4.0; // Comprimento do segundo cateto

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        System.out.println("A hipotenusa do triângulo retângulo é: " + hipotenusa);
    }
}
