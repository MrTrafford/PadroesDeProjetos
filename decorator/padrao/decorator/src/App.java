public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Nosso código cliente
        Notificacao notificacao = new NotificacaoBasica();
        
        notificacao = new Sms(notificacao);
       
        notificacao = new Email(notificacao);
        notificacao.enviar("Mensagem de teste");
    }
}
