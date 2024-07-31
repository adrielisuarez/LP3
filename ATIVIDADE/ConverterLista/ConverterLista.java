import java.util.ArrayList;
import java.util.List;

public class ConverterLista {

    public static List<Integer> converterParaInteiros(List<String> listaDeStrings) {
        List<Integer> listaDeInteiros = new ArrayList<>();
        
        // Itera sobre cada string na lista de strings
        for (String s : listaDeStrings) {
            try {
                // Converte a string para um inteiro e adiciona à lista de inteiros
                int numero = Integer.parseInt(s);
                listaDeInteiros.add(numero);
            } catch (NumberFormatException e) {
                // Trata o caso onde a string não pode ser convertida para um inteiro
                System.err.println("Não foi possível converter '" + s + "' para um número inteiro.");
            }
        }
        
        return listaDeInteiros;
    }

    public static void main(String[] args) {
        // Exemplo de lista de strings
        List<String> listaDeStrings = List.of("10", "20", "30", "40", "50");

        // Converte a lista de strings para uma lista de inteiros
        List<Integer> listaDeInteiros = converterParaInteiros(listaDeStrings);

        // Exibe a lista de inteiros
        System.out.println("Lista de inteiros: " + listaDeInteiros);
    }
}
