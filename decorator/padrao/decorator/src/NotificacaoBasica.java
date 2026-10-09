public class NotificacaoBasica implements Notificacao {
    // A classe NotificacaoBasica é uma implementação concreta da interface Notificacao. 
    // Ela representa uma notificação básica que simplesmente imprime a mensagem no console.
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação: " + mensagem);
    }
}
