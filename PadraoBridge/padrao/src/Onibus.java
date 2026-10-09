public class Onibus  extends Veiculo {

    //Abstração do padrão Bridge, representando um Onibus específico
    private int qtdPassageiros;
    public Onibus(String modelo, Motor motor, String placa, int qtdPassageiros) {
        this.modelo = modelo;
        this.motor = motor;
        this.placa = placa;
        this.qtdPassageiros = qtdPassageiros;   
        
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
   
}
