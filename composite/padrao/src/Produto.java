public class Produto implements Component {
    private double valor;
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return getValor();
    }
    public Produto (String nome_, double valor_){
        this.valor=valor_;
        this.nome=nome_;
    }

}
