
package atividadei;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtividadeI {

    public static void main(String[] args) {

        JFrame telaPrincipal = new JFrame();

        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Digite o valor da venda: ");

        JTextField input = new JTextField(10);
        JButton botao = new JButton("Entrar");

        botao.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorVenda = (Double.parseDouble(input.getText()));
                if (valorVenda >= 500) {
                    String descontoStr = JOptionPane.showInputDialog(null, "Informe o percentual de desconto:", "Percentual de Desconto", 1);
                    double desconto = Double.parseDouble(descontoStr);
                    
                    double total = valorVenda - (valorVenda * desconto/100);
                    JOptionPane.showMessageDialog(null, "O valor da venda é R$ " + total + " com um desconto de " + desconto + "%.", "Valor da Venda", 1);
                } else {
                    JOptionPane.showConfirmDialog(null, "O valor da sua venda é R$ " + valorVenda + ".", "Valor da Venda", 1);
                }
            }
        });
        
        painel.add(texto);
        painel.add(input);
        painel.add(botao);
        telaPrincipal.add(painel);
        
        telaPrincipal.setVisible(true);
        telaPrincipal.setSize(800,600);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.pack();
    }

}
