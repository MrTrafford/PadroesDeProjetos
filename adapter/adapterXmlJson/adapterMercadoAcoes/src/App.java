import java.net.http.HttpClient;
import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ProvedorDadosJson adaptador = new AdaptadorXmlJson(new  FornecedorDadosXML());

        String url ="https://raw.githubusercontent.com/MrTrafford/PadroesDeProjetos/main/adapter/adapter2/xml/PETR4.xml";
        System.out.println("Solicitando dados da url "+ url);
        System.out.println("O adaptador receberá os dados e converterá para JSON ");

        String dadosJson = adaptador.obterDadosJson(url);

        if(dadosJson==null){
            System.out.println("Não foi possível processar os dados");
        }
        else{
            System.out.println("Dados JSON prontos para uso");
            System.out.println(dadosJson);
        }
    }
}
