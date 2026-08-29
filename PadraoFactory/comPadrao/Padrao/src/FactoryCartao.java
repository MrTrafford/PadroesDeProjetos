public class FactoryCartao extends Factory{

    public static Pagamento criar() {
        // TODO Auto-generated method stub
        return new Cartao();
    }

}
