public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pedido p =new Pedido();
        Email e = new Email();
        Sms s = new Sms();
        p.fecharPedido(s);
    }
}
