public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Veiculo c = new Carro("Fusca", new MotorEletrico(), "ABC-1234", 4);
        c.ligarMotor();
        c.acelerarMotor();
        c.desligarMotor();
        Veiculo o = new Onibus("Volare", new MotorCombustao(), "XYZ-5678", 30);
        o.ligarMotor();
        o.acelerarMotor();
        o.desligarMotor();

    }
}
