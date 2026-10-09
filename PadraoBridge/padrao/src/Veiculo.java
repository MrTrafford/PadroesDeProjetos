public abstract class Veiculo {
    //Abstração do padrão Bridge, representando um veículo genérico
    private String modelo;
    private Motor motor;
    private String placa;
    public void ligarMotor() {
        motor.ligar();
    }
    public void desligarMotor() {
        motor.desligar();
    }
    public void acelerarMotor() {
        motor.acelerar();
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public String getPlaca() {
        return placa;
    }
}
