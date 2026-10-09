public abstract class Veiculo {
    String modelo;
    Motor motor;
    String placa;

    public Veiculo(String modelo, Motor motor, String placa) {
        this.modelo = modelo;
        this.motor = motor;
        this.placa = placa;
    }
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
