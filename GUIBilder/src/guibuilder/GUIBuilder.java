
package guibuilder;

public class GUIBuilder {

    public static void main(String[] args) {
        //MenuPrincipal mp = new MenuPrincipal ();
        //mp.setVisible(true);
        
        Pedido p = new Pedido();
        p.setNomeCliente("Teste");
        p.setAcompanhamento("Teste");
        p.setAdicional("Teste");
        p.setPreco(0);
        p.setQuantidade(0);
        ListasDePedidos.adicionar(p);
    }
    
}
