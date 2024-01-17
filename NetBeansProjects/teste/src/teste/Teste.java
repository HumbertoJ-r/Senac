package teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teste {

    public static void main(String[] args) {

        JFrame telaPrincipal = new JFrame();

        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Digite o valor da venda: ");

        JTextField input = new JTextField(10);
        JButton botao = new JButton("Entrar");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valorVenda = Double.parseDouble(input.getText());

                    if (valorVenda >= 500) {
                        String descontoStr = JOptionPane.showInputDialog(null, "Informe o percentual de desconto:");
                        double desconto = Double.parseDouble(descontoStr);

                        double valorComDesconto = valorVenda - (valorVenda * desconto / 100);

                        JOptionPane.showMessageDialog(null, "O valor da venda com desconto é R$ " + valorComDesconto, "Valor da Venda", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor da sua venda é R$ " + valorVenda, "Valor da Venda", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        painel.add(texto);
        painel.add(input);
        painel.add(botao);
        telaPrincipal.add(painel);

        telaPrincipal.setVisible(true);
        telaPrincipal.setSize(400, 150);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setLocationRelativeTo(null);
    }
}
