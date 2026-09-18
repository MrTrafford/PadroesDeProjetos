// Arquivo: App.java
public class App {
    public static void main(String[] args) {
        // Instancia a classe antiga (fornecedor XML)
        FornecedorDadosXML fornecedorXML = new FornecedorDadosXML();
        System.out.println(fornecedorXML.baixarDadosXml("https://raw.githubusercontent.com/MrTrafford/PadroesDeProjetos/main/adapter/adapter2/xml/PETR4.xml"));
        
        // Passa a classe antiga para dentro do Adaptador
        ProvedorDadosJSON adaptador = new AdaptadorXMLParaJSON(fornecedorXML);
        
        // URL de exemplo
        String urlExemplo = "https://raw.githubusercontent.com/MrTrafford/PadroesDeProjetos/main/adapter/adapter2/xml/PETR4.xml";
        
        System.out.println("Solicitando dados para a URL: " + urlExemplo);
        System.out.println("O adaptador fará o download em XML e converterá para JSON...\n");
        
        // A aplicação agora só conversa com a interface ProvedorDadosJSON
        String dadosJson = adaptador.obterDadosJson(urlExemplo);
        
        if (dadosJson != null) {
            System.out.println("=== DADOS JSON PRONTOS PARA USO ===");
            System.out.println(dadosJson);
        } else {
            System.out.println("Não foi possível processar os dados.");
        }
    }
}