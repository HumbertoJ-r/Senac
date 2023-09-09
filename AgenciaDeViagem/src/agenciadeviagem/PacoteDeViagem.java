
package agenciadeviagem;


public class PacoteDeViagem {
    Transporte transporte;
    Hospedagem hospedagem;
    private String destino;
    private int quantDeDias;
    double calcularTotalPacote;
    
    
    public PacoteDeViagem (){
        
    }

    public PacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantDeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantDeDias = quantDeDias;
    }
    
    public void setQuantDeDias(int quantDeDias) {
        this.quantDeDias = quantDeDias;
    }
    
    public double calcularTotalHospedagem  (){
        double resultado = this.quantDeDias * this.hospedagem.getValorDiaria();
        return resultado;
    }
    
    // Método para calcular o valor do lucro com base na margem informada (porcentagem) e valor informado
    public double calcularLucro (double margemLucro, double valorInformado){
        double lucro = valorInformado * (1 + margemLucro /100);
        return lucro;
    }
    
        
    // Método para calcular o total do pacote
    public double calcularTotalPacote(double margemLucro, double taxasAdicionais) {
        double totalHospedagem = calcularTotalHospedagem();
        double lucro = calcularLucro(margemLucro, totalHospedagem + this.transporte.getValor());
        return this.transporte.getValor() + totalHospedagem + lucro + taxasAdicionais;
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
}
