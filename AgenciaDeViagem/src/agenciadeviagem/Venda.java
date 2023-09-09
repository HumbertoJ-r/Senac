
package agenciadeviagem;

public class Venda {
    
    private String nomeCliente;
    private String formaDePagamento;
    PacoteDeViagem pteDeViagem;
    private double dolar = 4.98;

    public Venda(){
        
    }
    
    public Venda(String nomeCliente, String formaDePagamento, PacoteDeViagem pteDeViagem) {
        this.nomeCliente = nomeCliente;
        this.formaDePagamento = formaDePagamento;
        this.pteDeViagem = pteDeViagem;
    }
    
    public double calcularConversao (){
        double real = this.pteDeViagem.calcularTotalPacote / dolar;
        return real;
    }
    
    public double TotalPacote (){
        System.out.println("Pacote valor em DOLAR: U$ " + this.pteDeViagem.calcularTotalPacote + "Pacote valor em REAL: R$ " + this.calcularConversao());
        return 0;
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
