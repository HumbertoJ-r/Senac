package heranca;

public class Bebida extends Produto {
  
    private int ml;
    
    public Bebida(String nome, double valor, int ml) {
        super(nome, valor);
        this.ml = ml;
    }
 
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Valor: " + getValor());
        System.out.println("Tamanho: "+ ml + "ml.");
    }
    
}
