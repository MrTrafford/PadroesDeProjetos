public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro c1 = new Carro();

        

        c1.setModelo("Fiat Uno");
        c1.setCammbio("Manual");
        c1.setQtdPortas(4);
        c1.setPlaca("QWERTY");
        Carro c2 = c1.clone();
        Carro c3 = c1.clone();
        

        System.out.println("");

        c2.setPlaca("ASDFGH");
        c2.setModelo("Ford  Fiesta");
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
       

    }
}
