/*Simulação de Tráfego Crie uma simulação de tráfego. Use classes para
representar Carros, Semaforos e Intersecoes. Carros devem se mover de uma
interseção para outra, mas devem parar se um semáforo estiver vermelho. Você
precisará usar multithreading para que vários carros e semáforos possam operar
simultaneamente.*/
import java.util.ArrayList;
import java.util.List;

public class SimulacaoDeTrafego {
    public static List<Intersecao> intersecoes;

    public static void main(String[] args) {
        // Criando interseções
        Intersecao intersecao1 = new Intersecao("A");
        Intersecao intersecao2 = new Intersecao("B");
        Intersecao intersecao3 = new Intersecao("C");

        // Conectando interseções vizinhas
        intersecao1.adicionarVizinha(intersecao2);
        intersecao2.adicionarVizinha(intersecao1);
        intersecao2.adicionarVizinha(intersecao3);
        intersecao3.adicionarVizinha(intersecao2);

        // Lista de interseções para carros escolherem
        intersecoes = new ArrayList<>();
        intersecoes.add(intersecao1);
        intersecoes.add(intersecao2);
        intersecoes.add(intersecao3);

        // Iniciando semáforos em threads separadas
        for (Intersecao intersecao : intersecoes) {
            Thread semaforoThread = new Thread(intersecao.getSemaforo());
            semaforoThread.start();
        }

        // Criando carros e iniciando em threads separadas
        Carro carro1 = new Carro("Carro 1");
        Carro carro2 = new Carro("Carro 2");

        carro1.start();
        carro2.start();
    }
}
