public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Notificacao n = new Notificacao();
        n.enviarNoticacaoSMS("Mensagem de teste");
        n.enviarNoticacaoEmail("Mensagem de teste");
        n.enviarNoticacaoWhatsApp("Mensagem de teste");
      
    }
}
