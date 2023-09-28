package agenciadeviagem;

public class Venda {

    private String nomeCliente;
    private String formaDePagamento;
    PacoteDeViagem pteDeViagem;
    

    public Venda() {

    }

    public Venda(String nomeCliente, String formaDePagamento, PacoteDeViagem pteDeViagem) {
        this.nomeCliente = nomeCliente;
        this.formaDePagamento = formaDePagamento;
        this.pteDeViagem = pteDeViagem;
        
    }

    public double valorReais() {
        return this.pteDeViagem.calcularTotalPacote() * 4.98;
    }

    public void mostrarInformacoesPte() {
        System.out.println("Valor do pacote em dolar : U$ " + this.pteDeViagem.calcularTotalPacote());
        System.out.println("Valor do pacote em reais: R$ " + (String.format("%.2f",this.valorReais())));
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
