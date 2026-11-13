public class MotorCombustao  implements Motor{
    //Imlementação concreta da interface Motor
    private int cv;
    //Quantidade de cavalo vapor do motor
    

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Motor a combustão ligado");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("Motor a combustão desligado");

    }

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub
        System.out.println("Motor a combustão acelerand");
    }

    public MotorCombustao( int cv_){
        this.cv = cv_;

    }
    public int getCavaloVapor() {
        return cv;
    }
    
}
