public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BancoDeDados bd1= new BancoDeDados();
        BancoDeDados bd2= new BancoDeDados();
        bd1.conectar();
        bd2.conectar();
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd2==bd1);
    }
}
