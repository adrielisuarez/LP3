/*Classe Calculadora Crie uma classe Calculadora com métodos para as quatro
operações básicas: somar(), subtrair(), multiplicar() e dividir(). Cada
método deve receber dois parâmetros e retornar o resultado da operação. Crie um
objeto da classe Calculadora e teste os métodos.*/
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Testando os métodos
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Soma: " + calculadora.somar(num1, num2));             // Deve imprimir 15.0
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));     // Deve imprimir 5.0
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2)); // Deve imprimir 50.0
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));         // Deve imprimir 2.0
    }
}
