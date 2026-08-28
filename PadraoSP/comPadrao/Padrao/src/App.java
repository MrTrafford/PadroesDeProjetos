public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pagamento p=Factory.criar("pix");
        System.out.println(p);
        p.realizarPagamento();
        Pagamento c=Factory.criar("cartão");
        System.out.println(c);
        c.realizarPagamento();
        
    }
}
