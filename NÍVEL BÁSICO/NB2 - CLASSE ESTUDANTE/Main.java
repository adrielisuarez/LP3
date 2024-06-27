/*Classe Estudante Crie uma classe Estudante com os atributos nome, idade e
nota. Adicione um método aprovado() que retorna verdadeiro se a nota for maior
ou igual a 7 é falso caso contrário. Crie um objeto da classe Estudante, atribui
valores aos atributos e chame o método aprovado() para verificar se o estudante
foi aprovado ou não.*/

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Estudante
        Estudante estudante = new Estudante("João", 20, 8.5);

        // Verificando se o estudante foi aprovado
        if (estudante.aprovado()) {
            System.out.println(estudante.getNome() + " foi aprovado.");
        } else {
            System.out.println(estudante.getNome() + " não foi aprovado.");
        }
    }
}
