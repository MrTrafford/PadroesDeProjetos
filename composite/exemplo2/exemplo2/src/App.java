public class App {
    public static void main(String[] args) throws Exception {
        Pasta raiz = new Pasta("raiz");
        Pasta p1 = new Pasta("p1");
        Pasta p2 = new Pasta("p2");
        //Adcionando pastas à estrutura de diretorios

        Arquivo a1 = new Arquivo("livro.pdf", 100);
        Arquivo a2 = new Arquivo("foto.jpg", 5);
        Arquivo a3 = new Arquivo("video.mp4", 20);
        //Criando objetos do tipo arquivo com nome e tamanho

        p1.adicionar(a1);
        p1.adicionar(a2);
        p2.adicionar(a3);
        //Adicionando arquivos às pastas

        raiz.adicionar(p1);
        raiz.adicionar(p2);
        //Adicionando pastas à raiz

        raiz.exibir("");
    }
}
