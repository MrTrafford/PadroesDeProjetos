<<<<<<< HEAD
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
=======
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
>>>>>>> 4c67c7f1a67577b6060130d7cc60bfddf994b293
