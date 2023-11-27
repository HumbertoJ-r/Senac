
package supermercado;

/**
 *
 * @author venec
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Nome main foi alterado a inclusão de produto para eliminar linhas excessivas 
        ProdutoEntity produto = new ProdutoEntity(1, "Refrigerante", 10.90);
        validacaoProduto validador = new validacaoProduto();
        ProdutoController cp = new ProdutoController(validador);
        if (cp.salvarProduto(produto)){
            System.out.println("Produto salvo com sucesso");
        } else {
            System.out.println("Erro ao salvar produto");
        }
        
    }


}

