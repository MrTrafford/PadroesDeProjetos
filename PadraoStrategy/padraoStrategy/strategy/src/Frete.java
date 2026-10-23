public abstract class Frete {

    //Classe abstrata que difine o método em comum a ser implementado pelas Estratégias Concretas.
    protected String modalidade;
    protected Double pesoKg;

    public Frete(String modalidade, Double pesoKg) {
        this.modalidade = modalidade;
        this.pesoKg = pesoKg;
    }

    public abstract Double CalcularFrete();

}
