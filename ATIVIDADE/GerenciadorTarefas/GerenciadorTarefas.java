import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {

    private static List<String> tarefas = new ArrayList<>();
    
    public static void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }
    
    public static void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(indice);
            System.out.println("Tarefa removida: " + tarefaRemovida);
        } else {
            System.out.println("Índice inválido. Nenhuma tarefa removida.");
        }
    }
    
    public static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }
        
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a quebra de linha deixada por nextInt
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String novaTarefa = scanner.nextLine();
                    adicionarTarefa(novaTarefa);
                    break;
                case 2:
                    listarTarefas();
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int indice = scanner.nextInt() - 1;
                    scanner.nextLine();  // Consome a quebra de linha deixada por nextInt
                    removerTarefa(indice);
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    System.out.println("Saindo do gerenciador de tarefas.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 4);
        
        scanner.close();
    }
}
