public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String tipoPagamento="Cartao";

        if (tipoPagamento.equals("pix")) {
            Pix p = new Pix();
            p.realizarPagamento();
        }
        if (tipoPagamento.equals("Cartao")) {
            Cartao o = new Cartao();
            o.realizarPagamento();
        }
        
    }
}
