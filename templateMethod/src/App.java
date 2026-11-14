public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SanduicheFrango sf = new SanduicheFrango();
        SanduicheCarne sc = new SanduicheCarne();

        sf.prepararSanduiche();
        System.out.println("H-------------------------");
        sc.prepararSanduiche();
    }
}
