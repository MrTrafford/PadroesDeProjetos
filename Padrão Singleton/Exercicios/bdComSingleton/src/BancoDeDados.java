public class BancoDeDados {
    //Exemplo de classe com singleton

    private static BancoDeDados bd;
    //Instância estática de BancoDeDados

    private BancoDeDados(){

    }

    public static BancoDeDados instanciar(){
        //Método que vai garantir que somente uma instância da classe será criada
        if (bd==null){
            bd =new BancoDeDados();
        }
        return bd;

    }
    public void conectar(){
        System.out.println("Conectando  ao Mysql");
    }
}
