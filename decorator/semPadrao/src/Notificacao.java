public class Notificacao {
    public void enviarNoticacaoSMS(String mensagem) {
        System.out.println("Enviando notificação SMS: " + mensagem);
    }
    public void enviarNoticacaoEmail(String mensagem) {
        System.out.println("Enviando notificação por e-mail: " + mensagem);
    }
    public void enviarNoticacaoWhatsApp(String mensagem) {
        System.out.println("Enviando notificação WhatsApp: " + mensagem);
    }
}
