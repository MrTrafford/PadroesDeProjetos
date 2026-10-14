import java.util.LinkedList;

public class Caixa implements Component{
    private double  valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private LinkedList <Component>listaComponentes;
    
    @Override
    public double calcular() {
        double valorTotal=getValor();
        for (int i = 0; i < listaComponentes.size(); i++) {
            valorTotal = valorTotal+listaComponentes.get(i).calcular();
        }
        return valorTotal;

    }
    public void adicionar( Component c){
        listaComponentes.add(c);
    }

    
}
