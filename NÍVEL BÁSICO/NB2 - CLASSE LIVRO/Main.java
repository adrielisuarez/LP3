/*Classe Livro Crie uma classe Livro com os atributos titulo, autor e
anoDePublicacao. Adicione um método imprimirDetalhes() que imprime
todos os detalhes do livro. Crie um objeto da classe Livro, atribua valores aos
atributos e chame o método imprimirDetalhes().*/

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Livro
        Livro livro = new Livro("1984", "George Orwell", 1949);

        // Chamando o método para imprimir os detalhes do livro
        livro.imprimirDetalhes();
    }
}
