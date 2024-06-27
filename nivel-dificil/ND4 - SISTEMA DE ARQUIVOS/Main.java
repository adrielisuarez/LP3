/*Sistema de Arquivos Crie uma representação simplificada de um sistema de
arquivos. Use classes para representar Arquivos, Diretorios e um
SistemaDeArquivos. Arquivos devem ter um tamanho. Diretorios podem
conter Arquivos e outros Diretorios. O SistemaDeArquivos deve ser capaz
de calcular o tamanho total de um Diretorio, incluindo todos os Arquivos e
Diretorios que ele contém.*/
public class Main {
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
