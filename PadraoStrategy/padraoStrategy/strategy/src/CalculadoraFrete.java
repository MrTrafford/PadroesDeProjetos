public class CalculadoraFrete {
    private Frete f;
    public Frete getF() {
        return f;
    }

    public void setF(Frete f) {
        this.f = f;
    }

    public CalculadoraFrete(Frete f) {
        this.f = f;
    }
    
    public Double calcular(){
        return f.CalcularFrete();
    }
}
