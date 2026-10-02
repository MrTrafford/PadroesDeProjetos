public abstract class NotificacaoDecorator implements Notificacao {
   
    protected  Notificacao n;

    public NotificacaoDecorator(Notificacao n) {
        this.n = n;
    }

    @Override
    public void enviar(String mensagem) {
        n.enviar(mensagem);
    }

}
