import java.util.Random;

public class Semaforo extends Thread {
    private String nome;
    private String estado;

    public Semaforo(String nome) {
        this.nome = nome;
        this.estado = "vermelho"; // Começa com vermelho
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Semáforo " + nome + " mudou para VERDE.");
            estado = "verde";
            try {
                Thread.sleep((long) (Math.random() * 10000 + 5000)); // Tempo verde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Semáforo " + nome + " mudou para VERMELHO.");
            estado = "vermelho";
            try {
                Thread.sleep((long) (Math.random() * 3000 + 1000)); // Tempo vermelho
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getEstado() {
        return estado;
    }
}
