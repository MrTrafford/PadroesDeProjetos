public class MotorCombustao implements Motor {
    //Implementação concreta 
    @Override
    public void ligar() {
        System.out.println("Motor a combustão ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Motor a combustão desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor a combustão acelerando.");
    }

}
