public class Arquivo implements Componente {
    private String nome;
    private double tamanho;

    public Arquivo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "Arquivo: " + nome + " (Tamanho: " + tamanho + " MB)");
    }

}
