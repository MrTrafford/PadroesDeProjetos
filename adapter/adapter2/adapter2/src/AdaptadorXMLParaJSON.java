import org.json.JSONObject;
import org.json.XML;

public class AdaptadorXMLParaJSON implements ProvedorDadosJSON{

    // A classe existente que retorna XML (O Adaptee)
    private FornecedorDadosXML fornecedorXML;

    public AdaptadorXMLParaJSON(FornecedorDadosXML fornecedorXML) {
        this.fornecedorXML = fornecedorXML;
    }

    @Override
    public String obterDadosJson(String urlDesejada) {
        // 1. Obtém os dados em XML usando a classe original
        String dadosXml = fornecedorXML.baixarDadosXml(urlDesejada); //
        System.out.println("Resposta do servidor:\n" + dadosXml); // Adicione isto
        if (dadosXml == null) {
            return null;
        }

        try {
            // 2. Converte o XML recebido para JSON
            JSONObject jsonObject = XML.toJSONObject(dadosXml);
            
            // 3. Retorna a String formatada (identação de 4 espaços)
            return jsonObject.toString(4); 
        } catch (Exception e) {
            System.err.println("Erro ao converter XML para JSON: " + e.getMessage());
            return null;
        }
    }


}
    
