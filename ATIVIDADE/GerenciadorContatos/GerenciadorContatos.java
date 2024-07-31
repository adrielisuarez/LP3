import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorContatos {

    private static Map<String, String> contatos = new HashMap<>();
    
    public static void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato adicionado: " + nome + " (Telefone: " + telefone + ")");
    }
    
    public static void buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            String telefone = contatos.get(nome);
            System.out.println("Contato encontrado: " + nome + " (Telefone: " + telefone + ")");
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }
    
    public static void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato registrado.");
            return;
        }
        
        System.out.println("Lista de Contatos:");
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " (Telefone: " + entry.getValue() + ")");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("\nGerenciador de Contatos");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a quebra de linha deixada por nextInt
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefoneAdicionar = scanner.nextLine();
                    adicionarContato(nomeAdicionar, telefoneAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato: ");
                    String nomeBuscar = scanner.nextLine();
                    buscarContato(nomeBuscar);
                    break;
                case 3:
                    listarContatos();
                    break;
                case 4:
                    System.out.println("Saindo do gerenciador de contatos.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 4);
        
        scanner.close();
    }
}
