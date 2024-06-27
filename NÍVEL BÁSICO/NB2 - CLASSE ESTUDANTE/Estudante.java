public class Estudante {
    // Atributos da classe Estudante
    private String nome;
    private int idade;
    private double nota;

    // Construtor para inicializar os atributos
    public Estudante(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // Método que verifica se o estudante foi aprovado
    public boolean aprovado() {
        return this.nota >= 7.0;
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
