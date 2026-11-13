public class MotorEletrico implements Motor {
    private int capacidadeBateria;
    
    //Imlementação concreta da interface Motor
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Motor elétrico ligado");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("Motor elétrico desligado");

    }

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub
        System.out.println("Motor elétrico acelerando");
    }

    public MotorEletrico(int capacidadeBateria_){
        this.capacidadeBateria = capacidadeBateria_;
    }
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }
}
