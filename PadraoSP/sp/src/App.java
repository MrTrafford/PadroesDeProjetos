public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pagamento p=FactoryPagamento.create("pix");
        p.pagar();
        System.out.println(p);
    }
}
