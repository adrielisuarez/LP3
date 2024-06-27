import java.util.Random;

public class Carro extends Thread {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Carro " + nome + " se aproximando da interseção.");
            Intersecao intersecaoAtual = escolherIntersecaoInicial();
            Intersecao proximaIntersecao = escolherProximaIntersecao(intersecaoAtual);

            // Tentar entrar na próxima interseção
            if (tentarEntrarNaIntersecao(proximaIntersecao)) {
                moverParaIntersecao(proximaIntersecao);
            }

            try {
                Thread.sleep((long) (Math.random() * 2000 + 500)); // Simula tempo de viagem
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Intersecao escolherIntersecaoInicial() {
        Random random = new Random();
        return SimulacaoDeTrafego.intersecoes.get(random.nextInt(SimulacaoDeTrafego.intersecoes.size()));
    }

    private Intersecao escolherProximaIntersecao(Intersecao intersecaoAtual) {
        Random random = new Random();
        return intersecaoAtual.getIntersecoesVizinhas().get(random.nextInt(intersecaoAtual.getIntersecoesVizinhas().size()));
    }

    private boolean tentarEntrarNaIntersecao(Intersecao intersecao) {
        return intersecao.getSemaforo().getEstado().equals("verde");
    }

    private void moverParaIntersecao(Intersecao intersecao) {
        System.out.println("Carro " + nome + " entrou na interseção " + intersecao.getNome() + ".");
        try {
            Thread.sleep((long) (Math.random() * 1500 + 500)); // Simula tempo de travessia
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Carro " + nome + " atravessou a interseção " + intersecao.getNome() + ".");
        intersecao.liberarIntersecao(this);
    }
}
