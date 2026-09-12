public class PagamentoPix  {
    
    //Nossa classe Adaptee
    // API externa que não podemos alterar e exige centavos
    public void transaacao(int valor) {
        System.out.println("Pagamento via Pix no valor de: " + valor+"centavos");
    }

}
