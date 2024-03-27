package Exercicios;

public class Dispositivos {

	public class Main {
	    public static void main(String[] args) {
	        Televisao televisao = new Televisao();
	        Computador computador = new Computador();

	        televisao.ligar();
	        televisao.desligar();

	        computador.ligar();
	        computador.desligar();
	    }
	}
}
