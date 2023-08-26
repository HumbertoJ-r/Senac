
package agenciadeviagem;


public class PacoteDeViagem {
    Transporte transporte;
    Hospedagem hospedagem;
    private String destino;
    private int quantDeDias;
    
    public PacoteDeViagem (){
        
    }

    public PacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantDeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantDeDias = quantDeDias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
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
    
    public double calcularTotal (){
        double resultado = this.quantDeDias * this.hospedagem.getValorDiaria();
        return resultado;
    }
}
