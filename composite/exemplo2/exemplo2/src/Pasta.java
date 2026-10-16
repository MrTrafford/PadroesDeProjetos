import java.util.LinkedList;

public class Pasta implements Componente {
    private String nome;
    private LinkedList<Componente> componentes;

    public Pasta(String nome) {
        this.nome = nome;
        this.componentes = new LinkedList<Componente>();
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }
    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getTamanho() {
        double tamanhoTotal = 0;
        for (int i = 0; i < componentes.size(); i++) {
            tamanhoTotal =tamanhoTotal + componentes.get(i).getTamanho();
            //Uso de recursividade para calcular o tamanho total da pasta
        }
        return tamanhoTotal;
    }

    @Override
    public void exibir(String indentacao) {
       System.out.println(indentacao + "Pasta: " + nome + " (Tamanho: " + getTamanho() + " MB)");
        for (int i = 0; i < componentes.size(); i++) {
            componentes.get(i).exibir(indentacao + "  ");
        }
         
    }

}
