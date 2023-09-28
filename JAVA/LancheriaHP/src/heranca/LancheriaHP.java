package heranca;

public class LancheriaHP {

    public static void main(String[] args) {
        Produto[] arrayProdutos = new Produto[3];
        //Produto prod1 = new Produto();
        
        arrayProdutos[0] = new Lanche("Lanche 1", 10);
        arrayProdutos[0].mostrarDetalhes();
        
        arrayProdutos[1] = new Lanche("Lanche 2", 20);
        arrayProdutos[1].mostrarDetalhes();
        
        arrayProdutos[2] = new Bebida("Bebida 1", 30, 300);
        arrayProdutos[2].mostrarDetalhes();
        
    }
    
}
