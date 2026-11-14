public abstract class Sanduiche {
    
    //método template

    public void prepararSanduiche(){
        this.prepararPao();
        this.adicionarRecheio();
        this.finalizar();
    }

    //Etapa do template
    public void prepararPao(){
        System.out.println("Preparando pão");
    }

    //Etapa específica
    //Será implementada nas subclasses
    abstract  void adicionarRecheio();

    //Etapa do template
    public void finalizar(){
        System.out.println("Finalizando o sanduíche");
    }

}
