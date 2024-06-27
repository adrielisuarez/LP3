public class SistemaDeArquivos {
    private Diretorio raiz;

    public SistemaDeArquivos() {
        this.raiz = new Diretorio("Raiz");
    }

    public Diretorio getRaiz() {
        return raiz;
    }

    public void exibirEstrutura() {
        exibirEstruturaRecursivo(raiz, 0);
    }

    private void exibirEstruturaRecursivo(Diretorio dir, int nivel) {
        // Imprime a indentação conforme o nível do diretório
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }

        // Imprime o nome do diretório atual
        System.out.println(dir.getNome() + "/");

        // Imprime os arquivos dentro deste diretório
        for (Arquivo arquivo : dir.getArquivos()) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("  ");
            }
            System.out.println("- " + arquivo);
        }

        // Chama recursivamente para os subdiretórios
        for (Diretorio subdir : dir.getSubdiretorios()) {
            exibirEstruturaRecursivo(subdir, nivel + 1);
        }
    }

    public static void main(String[] args) {
        SistemaDeArquivos sistema = new SistemaDeArquivos();

        // Criando arquivos
        Arquivo arquivo1 = new Arquivo("texto1.txt", 1024); // 1 KB
        Arquivo arquivo2 = new Arquivo("imagem1.jpg", 2048); // 2 KB
        Arquivo arquivo3 = new Arquivo("documento1.pdf", 512); // 0.5 KB

        // Criando diretórios
        Diretorio documentos = new Diretorio("Documentos");
        Diretorio imagens = new Diretorio("Imagens");
        Diretorio usuarios = new Diretorio("Usuários");

        // Adicionando arquivos aos diretórios
        documentos.adicionarArquivo(arquivo1);
        imagens.adicionarArquivo(arquivo2);
        documentos.adicionarArquivo(arquivo3);

        // Adicionando diretórios à raiz
        sistema.getRaiz().adicionarDiretorio(documentos);
        sistema.getRaiz().adicionarDiretorio(imagens);
        sistema.getRaiz().adicionarDiretorio(usuarios);

        // Calculando e exibindo o tamanho total da raiz
        int tamanhoTotal = sistema.getRaiz().calcularTamanho();
        System.out.println("Tamanho total da raiz: " + tamanhoTotal + " bytes");

        // Exibindo a estrutura do sistema de arquivos
        System.out.println("\nEstrutura do Sistema de Arquivos:");
        sistema.exibirEstrutura();
    }
}
