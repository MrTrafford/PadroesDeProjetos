public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.setModelo("Fiat Uno");
        c1.setCammbio("Manual");
        c1.setQtdPortas(4);
        c1.setPlaca("QWERTY");

        c2.setModelo("Fusca");
        c2.setCammbio("Manual");
        c2.setQtdPortas(4);
        c2.setPlaca("UIOPAS");

        c3.setModelo("Ford Fiesta");
        c3.setCammbio("Manual");
        c3.setQtdPortas(4);
        c3.setPlaca("DFGHJK");

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

    }
}
