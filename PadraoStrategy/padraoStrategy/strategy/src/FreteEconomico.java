public class FreteEconomico extends Frete {
    //Classe Concrete Strategy
    public FreteEconomico(String modalidade, Double pesoKg) {
        super(modalidade, pesoKg);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double CalcularFrete() {
        // TODO Auto-generated method stub
        return 8.0 + pesoKg * 2.5;
    }

}
