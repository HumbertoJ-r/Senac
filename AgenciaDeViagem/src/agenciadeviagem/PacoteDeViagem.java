
package agenciadeviagem;


public class PacoteDeViagem {
    Transporte transporte;
    Hospedagem hosp;
    private String destino;
    private int quantDeDias;
    private double taxasAdicionais = 0.0;
    private double margemLucro = 0.0;
    
    public PacoteDeViagem (){
        
    }

    public PacoteDeViagem(Transporte transporte, Hospedagem hosp, String destino, int quantDeDias, double margemLucro, double taxasAdicionais) {
        this.transporte = transporte;
        this.hosp = hosp;
        this.destino = destino;
        this.quantDeDias = quantDeDias;
        this.margemLucro = margemLucro;
        this.taxasAdicionais = taxasAdicionais;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hosp;
    }

    public void setHospedagem(Hospedagem hosp) {
        this.hosp = hosp;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantDeDias() {
        return quantDeDias;
    }

    public void setQuantDeDias(int quantDeDias) {
        this.quantDeDias = quantDeDias;
    }

    public double getTaxasAdicionais() {
        return taxasAdicionais;
    }

    public void setTaxasAdicionais(double taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    
    
    public double calcularHospedagem (){
        double resultado = this.quantDeDias * this.hosp.getValorDiaria();
        return resultado;
    }
    
    public double calcularLucro (){
        return margemLucro * calcularHospedagem () / 100;
    }          
    
    public double calcularTotalPacote() {
        double totalHospedagem = calcularHospedagem();
        double totalPacote = totalHospedagem + calcularLucro() + taxasAdicionais + this.transporte.getValor();
        return totalPacote;
    }
    
        
}