import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;

public class JsonParaLinkedList {

    // Modelo de objeto correspondente aos itens do JSON
    public static class Produto {
        private int id;
        private String nome;

        @Override
        public String toString() {
            return "Produto{id=" + id + ", nome='" + nome + "'}";
        }
    }

    public static void main(String[] args) throws Exception {
        String url = "https://api.exemplo.com/produtos.json";

        // 1. Faz a requisição HTTP GET para obter o conteúdo do arquivo
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 2. Define o tipo de coleção exato (LinkedList<Produto>)
        Gson gson = new Gson();
        Type tipoLinkedList = new TypeToken<LinkedList<Produto>>(){}.getType();

        // 3. Converte a String JSON diretamente para LinkedList
        LinkedList<Produto> listaProdutos = gson.fromJson(response.body(), tipoLinkedList);

        // Uso da LinkedList
        listaProdutos.forEach(System.out::println);
    }
}