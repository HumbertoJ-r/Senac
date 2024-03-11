/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mo30.view;

/**
 *
 * @author humbe
 */
public class ProdutoListagem extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoListagem
     */
    public ProdutoListagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaDaTabela = new javax.swing.JPanel();
        ScrollDaTabela = new javax.swing.JScrollPane();
        TabelaDeProdutos = new javax.swing.JTable();
        BotaoNovoProduto = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoVender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PesquisaTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        AreaDeBoasVindas = new javax.swing.JPanel();
        TextoDeBoasVindas = new javax.swing.JLabel();
        TextoDeFeedback = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        AreaDaTabela1 = new javax.swing.JPanel();
        ScrollDaTabela1 = new javax.swing.JScrollPane();
        TabelaDeProdutos1 = new javax.swing.JTable();
        BotaoNovoProduto1 = new javax.swing.JButton();
        BotaoExcluir1 = new javax.swing.JButton();
        BotaoVender1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PesquisaTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        ScrollDaTabela.setViewportView(TabelaDeProdutos);

        BotaoNovoProduto.setText("+ Novo Produto");
        BotaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoProdutoActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoVender.setText("Vender");
        BotaoVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVenderActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por nome:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDaTabelaLayout = new javax.swing.GroupLayout(AreaDaTabela);
        AreaDaTabela.setLayout(AreaDaTabelaLayout);
        AreaDaTabelaLayout.setHorizontalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                        .addComponent(BotaoNovoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoVender))
                    .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        AreaDaTabelaLayout.setVerticalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoProduto)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoVender))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaDeBoasVindas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AreaDeBoasVindasKeyPressed(evt);
            }
        });

        TextoDeBoasVindas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoDeBoasVindas.setText("Lista de Produtos");

        TextoDeFeedback.setText("Abaixo, estão todos os produtos cadastrados:");

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDeBoasVindasLayout = new javax.swing.GroupLayout(AreaDeBoasVindas);
        AreaDeBoasVindas.setLayout(AreaDeBoasVindasLayout);
        AreaDeBoasVindasLayout.setHorizontalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                        .addComponent(TextoDeFeedback)
                        .addGap(0, 503, Short.MAX_VALUE))
                    .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                        .addComponent(TextoDeBoasVindas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSair)))
                .addContainerGap())
        );
        AreaDeBoasVindasLayout.setVerticalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoDeBoasVindas)
                    .addComponent(BotaoSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(TextoDeFeedback)
                .addContainerGap())
        );

        ScrollDaTabela1.setViewportView(TabelaDeProdutos1);

        BotaoNovoProduto1.setText("+ Novo Produto");
        BotaoNovoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoProduto1ActionPerformed(evt);
            }
        });

        BotaoExcluir1.setText("Excluir");
        BotaoExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluir1ActionPerformed(evt);
            }
        });

        BotaoVender1.setText("Vender");
        BotaoVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVender1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar por nome:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDaTabela1Layout = new javax.swing.GroupLayout(AreaDaTabela1);
        AreaDaTabela1.setLayout(AreaDaTabela1Layout);
        AreaDaTabela1Layout.setHorizontalGroup(
            AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabela1Layout.createSequentialGroup()
                .addGroup(AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaDaTabela1Layout.createSequentialGroup()
                        .addComponent(BotaoNovoProduto1)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir1)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoVender1))
                    .addGroup(AreaDaTabela1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AreaDaTabela1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(ScrollDaTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        AreaDaTabela1Layout.setVerticalGroup(
            AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabela1Layout.createSequentialGroup()
                .addGroup(AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PesquisaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollDaTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(AreaDaTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoProduto1)
                    .addComponent(BotaoExcluir1)
                    .addComponent(BotaoVender1))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Atualizar a lista de produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AreaDaTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaDaTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void AreaDeBoasVindasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreaDeBoasVindasKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_AreaDeBoasVindasKeyPressed

    private void BotaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoProdutoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoNovoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoProduto1ActionPerformed

    private void BotaoExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluir1ActionPerformed

    private void BotaoVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVender1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDaTabela;
    private javax.swing.JPanel AreaDaTabela1;
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoExcluir1;
    private javax.swing.JButton BotaoNovoProduto;
    private javax.swing.JButton BotaoNovoProduto1;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVender;
    private javax.swing.JButton BotaoVender1;
    private javax.swing.JTextField PesquisaTextField;
    private javax.swing.JTextField PesquisaTextField1;
    private javax.swing.JScrollPane ScrollDaTabela;
    private javax.swing.JScrollPane ScrollDaTabela1;
    private javax.swing.JTable TabelaDeProdutos;
    private javax.swing.JTable TabelaDeProdutos1;
    private javax.swing.JLabel TextoDeBoasVindas;
    private javax.swing.JLabel TextoDeFeedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
