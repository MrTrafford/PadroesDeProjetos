public class App {
    public static void main(String[] args) throws Exception {
        //código cliente
        System.out.println("Hello, World!");
        
        // O Cliente (Client): usa o sistema de forma totalmente transparente.
        // Instanciamos o adaptador passando o objeto incompatível (PagamentoPix) para ele.
        ProcessaPagamento pagamento = new PixAdapter(new PagamentoPix());
        
        // O cliente chama o método passando um double tranquilamente, sem se preocupar 
        // com a conversão para centavos, pois o adaptador resolve isso.
        pagamento.pagar(10.50);
    }
}