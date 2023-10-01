package classes;

import java.util.ArrayList;

public class Comanda {
    private ArrayList<Pedido> listaPedidos = new ArrayList();
    
    public void AdicionarNaLista(Pedido p) {
        this.listaPedidos.add(p);
    }
    
    public void ListarPedidos() {
        System.out.println("=======================================");
        System.out.println("Segue abaixo a lista de pedidos: ");
        for(int i=0; i < listaPedidos.size(); i++) {
            System.out.println("Item " + i + " : " + this.listaPedidos.get(i).getP().getNome());
            System.out.println("Total do pedido: " + this.listaPedidos.get(i).calcularTotal());
            System.out.println();
        }
    }
    
}
