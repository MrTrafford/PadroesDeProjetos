public class FactoryPagamento {
    public static Pagamento create(String tipo){
        if (tipo.equals("pix")) {
            return new Pix();
        }
        else if (tipo.equals("cartão")) {
            return new Cartao();
        }
        return null;
    }
}
