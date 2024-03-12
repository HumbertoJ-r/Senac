
package novabelo;

public class PrimeiraHabilitacao {
    private int preco;
    private String categoria; 

    public PrimeiraHabilitacao() {
    }

    public PrimeiraHabilitacao(int preco, String categoria) {
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    
       

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        if (preco == 1400) {
            return "A";
        } else if (preco == 1500) {
            return "B";
        } else {
            return "Categoria inválida";
        }
    }

    
}    
    
    

