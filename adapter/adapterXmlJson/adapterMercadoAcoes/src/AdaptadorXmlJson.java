import org.json.JSONObject;
import org.json.XML;

public class AdaptadorXmlJson implements  ProvedorDadosJson{
    private FornecedorDadosXML fornecedorXml;

    public AdaptadorXmlJson(FornecedorDadosXML fornecedorXml){
            this.fornecedorXml = fornecedorXml;
    }
    @Override
    public String obterDadosJson(String urlDesejada) {
        // TODO Auto-generated method stub
        String dadosXml = fornecedorXml.baixarDadosXML(urlDesejada);

        if (dadosXml==null) {
            return null;
        }
        //Converte o XML recebido para JSON
        JSONObject json = XML.toJSONObject(dadosXml);

        return json.toString();
        
    }

}
