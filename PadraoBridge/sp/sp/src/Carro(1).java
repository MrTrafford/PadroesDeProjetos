public class Carro extends Veiculo{
    private int numeroPortas;
    //Atributo específico da abstração Carro

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public Carro(Motor m_, String modelo_, String placa_, int numeroPortas_){
        this.numeroPortas = numeroPortas_;
        this.modelo = modelo_;
        this.placa = placa_;
        this.m = m_;
    }

}
