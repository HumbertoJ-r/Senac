
package supermercado;

/**
 *
 * @author venec
 */
public class ProdutoController {
    // Essa classe foi alterado para que ela efetuasse a função salvarProduto 
    private validacaoProduto validador;

    public ProdutoController(validacaoProduto validador) {
        this.validador = validador;
    }



    public boolean salvarProduto(ProdutoEntity produto) {
        if (validador.validarProduto(produto)) {
            enviarMensagem();
            return true;
        } else {
            return false;
        }
    }

    public void enviarMensagem() {
        // enviar mensagem 
    }

}