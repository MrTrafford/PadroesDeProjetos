// O Adaptador (Adapter): implementa a interface que o sistema conhece (ProcessaPagamento).
public class PixAdapter implements ProcessaPagamento {

    // Encapsula a classe que possui a interface incompatível (Adaptee).
=======
    //Nossa classe adapter

    private final PagamentoPix pagamentoPix;

    // O construtor recebe a injeção da dependência da API externa.
    public PixAdapter(PagamentoPix pagamentoPix) {
        this.pagamentoPix = pagamentoPix;
    }

    @Override
    public void pagar(double valor) {
        // Lógica de adaptação: converte o valor de double (reais) para int (centavos).
        int valorEmCentavos = (int) (valor * 100);
        
        // Delega a execução para a API externa usando o formato que ela exige.
        pagamentoPix.transacao(valorEmCentavos);
    }

}