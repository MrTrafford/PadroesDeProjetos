public class Whatsapp extends NotificacaoDecorator {
    // A classe Whatsapp é um decorador concreto que estende a funcionalidade da notificação básica. 
    // Ela adiciona a capacidade de enviar notificações via WhatsApp.
    public Whatsapp(Notificacao n) {
        super(n);
    }

    @Override
    public void enviar(String mensagem) {
        n.enviar(mensagem);
        System.out.println("Enviando WhatsApp: " + mensagem);
    }

}
