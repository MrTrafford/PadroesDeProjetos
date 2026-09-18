// Arquivo: AdaptadorXMLParaJSON.java
import org.json.JSONObject;
import org.json.XML;

public class AdaptadorXMLParaJSON implements ProvedorDadosJSON {
    
    private FornecedorDadosXML fornecedorXML;

    // Recebe a instância da classe antiga via construtor
    public AdaptadorXMLParaJSON(FornecedorDadosXML fornecedorXML) {
        this.fornecedorXML = fornecedorXML;
    }

    @Override
    public String obterDadosJson(String urlDesejada) {
        // Usa a classe antiga para buscar o XML
        String dadosXml = fornecedorXML.baixarDadosXml(urlDesejada);

        if (dadosXml == null) {
            return null;
        }

        try {
            // Converte a string XML em um objeto JSON
            JSONObject jsonObject = XML.toJSONObject(dadosXml);
            
            // Retorna o JSON como String (o número 4 é para indentar bonitinho com 4 espaços)
            return jsonObject.toString(4); 
        } catch (Exception e) {
            System.err.println("Erro ao converter XML para JSON: " + e.getMessage());
            return null;
        }
    }
}