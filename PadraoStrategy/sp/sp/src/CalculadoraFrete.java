public class CalculadoraFrete {
    private String modalidade;
    private Double pesoKg;
    public CalculadoraFrete(String modalidade, Double peso) {
        this.modalidade = modalidade;
        this.pesoKg = peso;
    }
    public Double calcularFrete(){
    if (modalidade.equals("ECONOMICO")) {
            return 8.0 + pesoKg * 2.5;
        }

        if (modalidade.equals("EXPRESSO")) {
            return 15.0 + pesoKg * 4.0;
        }

        if (modalidade.equals("TRANSPORTADORA")) {
            return 12.0 + pesoKg * 3.0;
        }

        else{
            System.out.println("Modalidade inválida");
        
        }
        return null;
        
    }
    
}
