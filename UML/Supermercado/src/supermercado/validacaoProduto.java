
package supermercado;

// essa classe foi criada para limpar a classe produtoController, fazendo uma unica função cada classe

public class validacaoProduto {
    
    public boolean validarProduto (ProdutoEntity produto){
        return !produto.getNome().isEmpty();
    }
    
}
