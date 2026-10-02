// Arquivo: FornecedorDadosXML.java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class FornecedorDadosXML {
    /**
     * Método responsável por conectar na internet e baixar o XML.
     */
    public String baixarDadosXml(String urlDesejada) {
        try {
            // 1. Cria o cliente HTTP (com um tempo limite de conexão opcional)
            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            // 2. Constrói a requisição HTTP GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlDesejada))
                    .GET()
                    .build();

            // 3. Envia a requisição e diz que queremos a resposta em formato de String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Verifica se a requisição foi bem sucedida (Código HTTP 200 OK)
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.err.println("Falha ao baixar. Código HTTP: " + response.statusCode());
                return null;
            }

        } catch (Exception e) {
            System.err.println("Ocorreu um erro de rede: " + e.getMessage());
            return null;
        }
    }
}
