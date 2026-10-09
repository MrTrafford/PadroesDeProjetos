public class Sms extends NotificacaoDecorator {
    // A classe Sms é um decorador concreto que estende a funcionalidade da notificação básica. 
    // Ela adiciona a capacidade de enviar notificações via SMS.
    public Sms(Notificacao n) {
        super(n);
    }

    @Override
    public void enviar(String mensagem) {
        n.enviar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }

}
