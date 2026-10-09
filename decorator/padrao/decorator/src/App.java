<<<<<<< HEAD
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Nosso código cliente
        Notificacao notificacao = new NotificacaoBasica();
        notificacao.enviar("Mensagem de teste");
        notificacao = new Sms(notificacao);
        notificacao.enviar("Mensagem de teste");
        notificacao = new Email(notificacao);
        notificacao.enviar("Mensagem de teste");
    }
}
=======
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
>>>>>>> 4c67c7f1a67577b6060130d7cc60bfddf994b293
