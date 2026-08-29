public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pagamento p=FactoryPix.criar();
        System.out.println(p);
        p.realizarPagamento();
        Pagamento c=FactoryCartao.criar();
        System.out.println(c);
        c.realizarPagamento();
        
    }
}
