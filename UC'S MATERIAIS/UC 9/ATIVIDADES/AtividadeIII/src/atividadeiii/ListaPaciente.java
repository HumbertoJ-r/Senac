
package atividadeiii;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaPaciente {
    
    public static ArrayList<Paciente> lista = new ArrayList<Paciente>();

    public static boolean adicionar(Paciente p) {

        //Exceções
        try {
            //Se tudo der certo
            //Validações
            if (p.getNomePaciente().isBlank() || p.getNomePaciente().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            } else if (p.getCpf().isBlank() || p.getCpf().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor digite o CPF do paciente!");
            } else if (p.getDataConsulta().isBlank() || p.getDataConsulta().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor insira a Data da Consulta.");
            } else if (p.getTelefone() <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor insira o telefone do cliente.");
            } else {
                p.setId(lista.size() + 1);
                lista.add(p);
                JOptionPane.showMessageDialog(null, "Consulta cadastrada com Sucesso!");
                return true;
            }
        } catch (Exception e) {
            //Se tudo der errado
            System.out.println("Ocorreu um erro ao adicionar a lista");
        }
        return false;
    }

    public static ArrayList<Paciente> listar() {
        return lista;
    }

    public static boolean excluir(int id) {
        try {
            if(id <=0 ){
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
