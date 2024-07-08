
package guiexemplo;

import javax.swing.JOptionPane;


public class GUIExemplo {


    public static void main(String[] args) {
        
                /* USO DO JOPtionPane */
                /* OPÇÕES DO JOPtionPane 
                - showConfimDialog - apresenta uma pergunta de confirmação com sim/não/cancelar
                - showInputDialog - agaurda uma entrada de dados do usuário (input)
                - showMessageDialog - janela com mensagem para o usuário 
                - showOptionDialog - janela customizável utilizando os recursos do java 
                */

                //JOptionPane.showConfirmDialog( null, "Menasagem de confirmação");
                //JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Tela de confirmação", 0, 0);
                //JOptionPane.showInputDialog("Insira algo no campo abaixo!");
                //JOptionPane.showMessageDialog(null, "Esta é uma mensagem do sistema!!!", "Menssagem", 2);
                //String [] options = {"AAA", "BBB", "CCC", "DDD"};
                //JOptionPane.showOptionDialog(null, "Opções", "Menu de Opções", 0, 0, null, options, options[0]);
                int resposta = 0;
                do {
                String nome = JOptionPane.showInputDialog("Digite seu nome");
                if(nome.equalsIgnoreCase("Junior")){
                    JOptionPane.showMessageDialog(null, "Olá tutor " + nome + ".", "Boas-vindas", 1);
                } else if (nome.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Nome Invalido!", "Erro!", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Olá aluno " + nome + ".", "Boas-vindas", 1);
                }
                resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                }while (resposta == 0);
    }
    
}
