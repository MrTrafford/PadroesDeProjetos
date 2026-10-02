// A Interface Alvo (Target): define o contrato que o nosso sistema entende e utiliza.
public interface ProcessaPagamento {
    // O sistema espera passar o valor como double (ex: reais e centavos).
    void pagar(double valor);
}