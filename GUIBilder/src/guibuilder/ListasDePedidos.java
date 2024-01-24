package guibuilder;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListasDePedidos {

    public static ArrayList<Pedido> lista = new ArrayList<Pedido>();

    public static boolean adicionar(Pedido p) {

        try {
            if (p.getNomeCliente().isBlank() || p.getNomeCliente().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o nome do cliente.");
            } else if (p.getAcompanhamento().isBlank() || p.getAcompanhamento().isBlank()){
                JOptionPane.showMessageDialog(null, "Por favor selicione uma das opções SIM ou NÃO.");
            } else if (p.getAdicional().isBlank() || p.getAdicional().isEmpty()){
                JOptionPane.showMessageDialog(null,"Campo adicional inválido");
            }  else if (p.getPreco() <=0){
                JOptionPane.showMessageDialog(null,"O campo preço não pode ser menor ou igual a zero!");
            } else if (p.getQuantidade() <=0 ){
                JOptionPane.showMessageDialog(null,"O campo quantidade não poder menor ou igual a zero!");
            } else {
                lista.add(p);
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastra o pedido na lista.");            
        }
        return false;
    }
    
    public static ArrayList<Pedido> listar(){
        return lista;
    }
}
