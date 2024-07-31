import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorInventario {

    private static Map<String, Integer> inventario = new HashMap<>();
    
    public static void adicionarProduto(String nome, int quantidade) {
        inventario.put(nome, inventario.getOrDefault(nome, 0) + quantidade);
        System.out.println("Produto adicionado: " + nome + " (Quantidade: " + quantidade + ")");
    }
    
    public static void removerProduto(String nome, int quantidade) {
        if (inventario.containsKey(nome)) {
            int quantidadeAtual = inventario.get(nome);
            if (quantidade >= quantidadeAtual) {
                inventario.remove(nome);
                System.out.println("Produto removido: " + nome);
            } else {
                inventario.put(nome, quantidadeAtual - quantidade);
                System.out.println("Quantidade reduzida: " + nome + " (Quantidade restante: " + (quantidadeAtual - quantidade) + ")");
            }
        } else {
            System.out.println("Produto não encontrado: " + nome);
        }
    }
    
    public static void buscarProduto(String nome) {
        if (inventario.containsKey(nome)) {
            int quantidade = inventario.get(nome);
            System.out.println("Produto encontrado: " + nome + " (Quantidade: " + quantidade + ")");
        } else {
            System.out.println("Produto não encontrado: " + nome);
        }
    }
    
    public static void listarProdutos() {
        if (inventario.isEmpty()) {
            System.out.println("Inventário vazio.");
            return;
        }
        
        System.out.println("Inventário de Produtos:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + " (Quantidade: " + entry.getValue() + ")");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("\nGerenciador de Inventário");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a quebra de linha deixada por nextInt
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite a quantidade a adicionar: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    scanner.nextLine();  // Consome a quebra de linha
                    adicionarProduto(nomeAdicionar, quantidadeAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeRemover = scanner.nextLine();
                    System.out.print("Digite a quantidade a remover: ");
                    int quantidadeRemover = scanner.nextInt();
                    scanner.nextLine();  // Consome a quebra de linha
                    removerProduto(nomeRemover, quantidadeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeBuscar = scanner.nextLine();
                    buscarProduto(nomeBuscar);
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo do gerenciador de inventário.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);
        
        scanner.close();
    }
}
