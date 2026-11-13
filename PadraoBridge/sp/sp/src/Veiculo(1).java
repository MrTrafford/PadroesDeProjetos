public abstract class Veiculo {

    protected Motor m;
    //Atributo que faz a ponte entre a abstração e a implementação
    //Implementação do padrão Bridge
    protected String modelo;
    protected String placa;
    
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public Motor getMotor() {
        return m;
    }

    public void ligarMotor() {
        m.ligar();
    }
    public void desligarMotor() {
        m.desligar();
    }
    public void acelerarMotor() {
        m.acelerar();
    }



}
