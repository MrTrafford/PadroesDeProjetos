public class Carro {
    private String placa;
    private String cammbio;
    private int qtdPortas;
    private String modelo;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCammbio() {
        return cammbio;
    }
    public void setCammbio(String cammbio) {
        this.cammbio = cammbio;
    }
    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(){
        System.out.println("Placa "+getPlaca());
        System.out.println("câmbio "+getCammbio());
        System.out.println("portas "+getQtdPortas());
        System.out.println("modelo "+getModelo());
        System.out.println("---------------------------");
    }
}
