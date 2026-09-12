public class PixAdapter implements ProcessaPagamento {
    private final PagamentoPix pagamentoPix;

    public PixAdapter(PagamentoPix pagamentoPix) {
        this.pagamentoPix = pagamentoPix;
    }

    @Override
    public void pagar(double valor) {
        int valorEmCentavos = (int) (valor * 100);
        pagamentoPix.transaacao(valorEmCentavos);
    }

}
