package Exercicios;
import java.util.ArrayList;
public class Compras {
	 public static void main(String[] args) {
	        ArrayList<String> listaDeCompras = new ArrayList<>();

	        listaDeCompras.add("Maçãs");
	        listaDeCompras.add("Bananas");
	        listaDeCompras.add("Pão");
	        listaDeCompras.add("Leite");

	        System.out.println("Lista de Compras:");
	        for (String item : listaDeCompras) {
	            System.out.println(item);
	        }
	        String itemRemovido = "Pão";
	        listaDeCompras.remove(itemRemovido);
	        System.out.println("\nItem removido: " + itemRemovido);

	        System.out.println("\nLista de Compras após remoção:");
	        for (String item : listaDeCompras) {
	            System.out.println(item);
	        }
	    }
}
