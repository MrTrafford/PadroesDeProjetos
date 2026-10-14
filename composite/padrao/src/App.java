public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Caixa c1= new Caixa();
        Caixa c2= new Caixa();

        Produto p1 = new  Produto("Camisa",50);
        Produto p2 = new  Produto("Calça",10);
        Produto p3 = new  Produto("Álbum de figurinha",30);
        Produto p4 = new  Produto("Pacote de figurinha",7);

        c1.adicionar(p1);
        c1.adicionar(p2);
        c2.adicionar(p3);
        c2.adicionar(p4);
        c2.adicionar(c1);

        System.out.println("O preço total da entrega foi "+c2.getValor()+" reais");
    
    }
}
