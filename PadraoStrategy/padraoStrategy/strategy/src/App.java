public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double peso = 3.0;
        CalculadoraFrete cf = new  CalculadoraFrete(new FreteEconomico("Correios", peso));
        System.out.println("O valor do frete econômico é "+cf.calcular()+" reais");
        cf.setF(new FreteExpresso("Aéreo", peso));
        System.out.println("O valor do frete econômico é "+cf.calcular()+" reais");
        cf.setF(new  FreteTransportadora("Caminhão", peso));
        System.out.println("O valor do frete econômico é "+cf.calcular()+" reais");
    }
}
