package guiexemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIExemplo2 {

    public static void main(String[] args) {

        JFrame telaPrincipal = new JFrame();

        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Digite seu nome: ");

        JTextField input = new JTextField(10);
        JButton botao = new JButton("Entrar");

        //Adicionar um ouvinte de ação ao botão
        botao.addActionListener(
                new ActionListenner() {
            private static class ActionListenner implements ActionListener {

        public ActionListenner() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = input.getText();
                if (nome.equalsIgnoreCase("Junior")) {
                    JOptionPane.showMessageDialog(null, "Olá Tutor " + nome + ".", "Boas-vindas!", 1);
                } else if (nome.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Nome inválido!", "Erro!", 0);
                } else {
                    JOptionPane.showConfirmDialog(null, "Olá, Aluno " + nome + ".", "Boas-vindas", 1);
                }
            }
        }
            }
        );}

    

}
