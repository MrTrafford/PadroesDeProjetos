public class Email extends NotificacaoDecorator {
    // A classe Email é um decorador concreto que estende a funcionalidade da notificação básica. 
    // Ela adiciona a capacidade de enviar notificações via Email.
    public Email(Notificacao n) {
        super(n);
    }

    @Override
    public void enviar(String mensagem) {
        n.enviar(mensagem);
        System.out.println("Enviando Email: " + mensagem);
    }

}
