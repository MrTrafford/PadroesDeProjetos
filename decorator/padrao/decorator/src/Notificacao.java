public interface Notificacao {
    //no padrão de projeto Decorator, a interface componente define o contrato para os objetos que podem ter responsabilidades adicionais adicionadas a eles dinamicamente.
    //Nossa interface componente
    // Qualquer classe que implemente essa interface deve fornecer uma implementação para o método enviar, 
    // que aceita uma mensagem como parâmetro.
    void enviar(String mensagem);
}
