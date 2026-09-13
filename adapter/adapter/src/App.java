public class App {
    public static void main(String[] args) throws Exception {
        //código cliente
        System.out.println("Hello, World!");
        ProcessaPagamento pagamento = new PixAdapter(new PagamentoPix());
        pagamento.pagar(10.50);
    }
}
