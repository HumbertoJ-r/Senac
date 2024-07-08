package novabelo.model;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import novabelo.model.Cliente;


public class ListaCliente {

    public static ArrayList <Cliente> lista = new ArrayList <Cliente>();
    
    public static ArrayList <Cliente> listar () {
        return lista;
    }
    
    public static boolean adicionar(Cliente c) {

        //Exceções
        try {
            //Se tudo der certo
            //Validações
            if (c.getNome().isBlank() || c.getNome().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            } else if (c.getCpf().isBlank() || c.getCpf().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione ao menos um acompanhamento!");
            } else if (c.getEndereco().isBlank() || c.getEndereco().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo adicional inválido!");
            } else if (c.getDataNasc().isBlank() || c.getDataNasc().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha a data de nascimento corretamente!");
            } else if (c.getTelefone().isBlank() || c.getTelefone().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha o telefone corretamente!");
            } else {
                c.setId(lista.size() + 1);
                lista.add(c);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                return true;
            }
        } catch (Exception e) {
            //Se tudo der errado
            System.out.println("Ocorreu um erro ao adicionar a lista");
        }
        return false;
    }

    
    

    public static boolean excluir(int id) {
        try {
            if(id < 0){
                JOptionPane.showMessageDialog(null, "Selecione um item para excluir:");
            } else {
                lista.remove(id);
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        return false;
    }
}
