public class Onibus extends Veiculo{
    private int numeroPassageiros;
    //Atributo específico da abstração Onibus

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public Onibus(Motor m_, String modelo_, String placa_, int numeroPassageiros_){
        this.numeroPassageiros = numeroPassageiros_;
        this.modelo = modelo_;
        this.placa = placa_;
        this.m = m_;
    }

}
