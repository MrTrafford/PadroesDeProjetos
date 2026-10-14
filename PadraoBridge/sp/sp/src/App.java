public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

        Veiculo c = new Carro(new MotorEletrico(100), "BYD", "ABC-1234", 4);
        Veiculo o = new Onibus(new MotorEletrico(200), "Volvo", "DEF-5678", 40);
        Veiculo a = new Carro(new MotorCombustao(2), "Fiat", "GHI-9012", 4);

        c.ligarMotor();
        c.acelerarMotor();
        c.desligarMotor();
        o.ligarMotor(); 
        o.acelerarMotor();
        o.desligarMotor();
        a.ligarMotor();
    }
}
