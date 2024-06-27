import java.util.ArrayList;
import java.util.List;

public class Intersecao {
    private String nome;
    private Semaforo semaforo;
    private List<Intersecao> intersecoesVizinhas;

    public Intersecao(String nome) {
        this.nome = nome;
        this.semaforo = new Semaforo("Semaforo da " + nome);
        this.intersecoesVizinhas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public List<Intersecao> getIntersecoesVizinhas() {
        return intersecoesVizinhas;
    }

    public void adicionarVizinha(Intersecao intersecao) {
        intersecoesVizinhas.add(intersecao);
    }

    public synchronized void liberarIntersecao(Carro carro) {
        System.out.println("Carro " + carro.getNome() + " saiu da interseção " + nome + ".");
    }
}
