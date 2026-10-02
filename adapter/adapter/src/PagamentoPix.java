public class PagamentoPix  {
    
    // Nossa classe Adaptee (O Sistema Adaptado).
    // Representa uma API externa ou sistema legado que não podemos ou não devemos alterar.
    // O requisito restrito desta API é que o valor deve ser recebido em centavos (int).
    public void transacao(int valor) { // Mantido com a grafia original do projeto
        System.out.println("Pagamento via Pix no valor de: " + valor+"centavos");
    }

}