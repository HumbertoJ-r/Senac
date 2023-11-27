
package supermercado;

/**
 *
 * @author venec
 */
public class ProdutoController {
  
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