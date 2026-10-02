import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class FornecedorDadosXML {
    //Nossa Classe Adaptee (Classe que vai ser adaptada)

    //Método para  conectar na Internet e baixar o XML
    public  String baixarDadosXML(String urlDesejada){
         try {
            //Criamos o cliente HTTP  com um tempo de limite de conexão
            HttpClient clienteHttp = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();

            //cria constrói uma requisição HTTP GET
            HttpRequest requisicao =  HttpRequest.newBuilder().uri(URI.create(urlDesejada)).GET().build();

            HttpResponse<String> response = clienteHttp.send(requisicao, HttpResponse.BodyHandlers.ofString());

            //Verificar se a requisição foi bem sucedida (Código HTTP 200 OK)
            if (response.statusCode()==200){
                return  response.body();
            }
            else{
                System.out.println("Falha ao baixar");
                return null;
            }
        }
        catch(Exception e){
            System.out.println("Ocorreu um err");
            return null;
        }
    }
}
