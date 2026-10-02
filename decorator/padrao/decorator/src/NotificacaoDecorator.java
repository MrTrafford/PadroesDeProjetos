public abstract class NotificacaoDecorator implements Notificacao {
   
    private Notificacao n;

    public NotificacaoDecorator(Notificacao n) {
        this.n = n;
    }

    @Override
    public void enviar(String mensagem) {
        n.enviar(mensagem);
    }

}
