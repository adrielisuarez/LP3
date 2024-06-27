/*Classe Polígono Crie uma classe abstrata Poligono com um método abstrato
area(). Em seguida, crie classes Retangulo, Circulo e Triangulo que
estendem a classe Poligono e implementam o método area(). Crie objetos
dessas classes e teste o método area().**/
public class Main {
    public static void main(String[] args) {
        // Criação dos objetos das classes
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        Circulo circulo = new Circulo(4.0);
        Triangulo triangulo = new Triangulo(6.0, 2.5);

        // Testando o método area()
        System.out.println("Área do Retângulo: " + retangulo.area());
        System.out.println("Área do Círculo: " + circulo.area());
        System.out.println("Área do Triângulo: " + triangulo.area());
    }
}

