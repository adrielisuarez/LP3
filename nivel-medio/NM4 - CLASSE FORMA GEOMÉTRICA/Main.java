/*Interface FormaGeometrica Crie uma interface FormaGeometrica com métodos
para calcularArea() e calcularPerimetro(). Em seguida, crie classes
Quadrado, Circulo e Retangulo que implementam a interface
FormaGeometrica. Crie objetos dessas classes e teste os métodos.*/
public class Main {
    public static void main(String[] args) {
        // Criação de objetos das classes que implementam FormaGeometrica
        FormaGeometrica quadrado = new Quadrado(4.0);
        FormaGeometrica circulo = new Circulo(3.0);
        FormaGeometrica retangulo = new Retangulo(5.0, 2.0);

        // Testando os métodos calcularArea() e calcularPerimetro()
        System.out.println("Quadrado - Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Retângulo - Área: " + retangulo.calcularArea() + ", Perímetro: " + retangulo.calcularPerimetro());
    }
}
