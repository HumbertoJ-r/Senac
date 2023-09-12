
package agenciadeviagem;

public class Venda {
    
    private String nomeCliente;
    private String formaDePagamento;
    PacoteDeViagem pteDeViagem;
    double dolar = 4.98;

    public Venda(){
        
    }
    
    public Venda(String nomeCliente, String formaDePagamento, PacoteDeViagem pteDeViagem, double dolar) {
        this.nomeCliente = nomeCliente;
        this.formaDePagamento = formaDePagamento;
        this.pteDeViagem = pteDeViagem;
        this.dolar = dolar;
    }
    
    public double valorReais (double dolar){
        return this.pteDeViagem.calcularTotalPacote() * dolar;
    }
    
    public void mostrarInformacoesPte(){
        System.out.println("Valor do pacote em dolar : " + this.pteDeViagem.calcularTotalPacote());
        System.out.println("Valor do pacote em reais: ");
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public PacoteDeViagem getPteDeViagem() {
        return pteDeViagem;
    }

    public void setPteDeViagem(PacoteDeViagem pteDeViagem) {
        this.pteDeViagem = pteDeViagem;
    }
    
}
