public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Veiculo c = new Carro("Fusca", new MotorCombustao(), "ABC-1234", 4);
        c.ligarMotor();
        c.acelerarMotor();
        c.desligarMotor();
        Veiculo o = new Onibus("Volare", new MotorEletrico(), "XYZ-5678", 30);
        o.ligarMotor();
        o.acelerarMotor();
        o.desligarMotor();

        Veiculo c1 = new Carro("Civic", new MotorEletrico(), "DEF-5678", 4);
        Veiculo c2 = new Carro("Corolla", new MotorCombustao(), "GHI-9012", 4);
        Veiculo o1 = new Onibus("Marcopolo", new MotorCombustao(), "JKL-3456", 50);
        Veiculo o2 = new Onibus("Neobus", new MotorEletrico(), "MNO-7890", 40);

    }
}
