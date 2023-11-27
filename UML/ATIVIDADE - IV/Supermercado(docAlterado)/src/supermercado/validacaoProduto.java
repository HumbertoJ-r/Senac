
package supermercado;

public class validacaoProduto {
    
    public boolean validarProduto (ProdutoEntity produto){
        return !produto.getNome().isEmpty();
    }
    
}
