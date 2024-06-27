import java.util.ArrayList;
import java.util.List;

public class Diretorio {
    private String nome;
    private List<Diretorio> subdiretorios;
    private List<Arquivo> arquivos;

    public Diretorio(String nome) {
        this.nome = nome;
        this.subdiretorios = new ArrayList<>();
        this.arquivos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDiretorio(Diretorio diretorio) {
        subdiretorios.add(diretorio);
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public int calcularTamanho() {
        int tamanhoTotal = 0;

        // Somando o tamanho de todos os arquivos neste diretório
        for (Arquivo arquivo : arquivos) {
            tamanhoTotal += arquivo.getTamanho();
        }

        // Somando o tamanho de todos os subdiretórios recursivamente
        for (Diretorio subdir : subdiretorios) {
            tamanhoTotal += subdir.calcularTamanho();
        }

        return tamanhoTotal;
    }

    public List<Diretorio> getSubdiretorios() {
        return subdiretorios;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    @Override
    public String toString() {
        return nome;
    }
}
