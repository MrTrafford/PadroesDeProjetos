public class Carro  extends Veiculo {

    //Abstração do padrão Bridge, representando um carro específico
    private int portas;
    public Carro(String modelo, Motor motor, String placa, int portas) {
        this.modelo = modelo;
        this.motor = motor;
        this.placa = placa;
        this.portas = portas;
    }
    public int getPortas() {
        return portas;
    }

}
