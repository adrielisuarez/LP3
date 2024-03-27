/*1) Crie uma lista de inteiros e adicione 5 números à lista. Em seguida, imprima todos os
números na lista.*/

package Exercicios;

import java.util.ArrayList;
import java.util.List;
public class Exercicio01 {
	public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Números na lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
