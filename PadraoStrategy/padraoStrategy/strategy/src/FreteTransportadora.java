public class FreteTransportadora extends Frete {
    //Classe Concrete Strategy
    public FreteTransportadora(String modalidade, Double pesoKg) {
        super(modalidade, pesoKg);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double CalcularFrete() {
        // TODO Auto-generated method stub
        return 12.0 + pesoKg * 3.0;
    }

}
