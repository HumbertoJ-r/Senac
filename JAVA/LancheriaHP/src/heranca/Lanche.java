package heranca;

public class Lanche extends Produto {

    public Lanche(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Valor: " + getValor());        
    }
}
