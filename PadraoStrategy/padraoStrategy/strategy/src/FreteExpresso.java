public class FreteExpresso extends Frete {
    //Classe Concrete Strategy
    public FreteExpresso(String modalidade, Double pesoKg) {
        super(modalidade, pesoKg);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double CalcularFrete() {
        // TODO Auto-generated method stub
        return 15.0 + pesoKg * 4.0;
    }

}
