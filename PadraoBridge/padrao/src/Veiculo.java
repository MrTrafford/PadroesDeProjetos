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
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
