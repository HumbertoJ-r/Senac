package classes;

public class Pedido {

    // Atributos são privados
    private int quantidade;
    private Produto p;

    // Construtores
    public Pedido() {

    }

    public Pedido(Produto p, int quantidade) {
        this.p = p;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public double calcularTotal() {
        double total = this.quantidade * this.p.getValor();
        return total;
    }
    
}
