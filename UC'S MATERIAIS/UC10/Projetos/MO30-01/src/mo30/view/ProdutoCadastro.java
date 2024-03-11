
package mo30.view;

import javax.swing.JOptionPane;
import mo30.model.Produto;
import mo30.model.ProdutoDAO;

/**
 *
 * @author humbe
 */
public class ProdutoCadastro extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoCadastro
     */
    public ProdutoCadastro() {
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

        AreaDeFeedback = new javax.swing.JPanel();
        Feedback = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NomeFeedback = new javax.swing.JLabel();
        EstadoFeedback = new javax.swing.JLabel();
        PrecoFeedback = new javax.swing.JLabel();
        QuantidadeFeedback = new javax.swing.JLabel();
        CategoriaFeedback = new javax.swing.JLabel();
        DataFeedback = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        NomeTexto = new javax.swing.JLabel();
        NomeCampo = new javax.swing.JTextField();
        EstadoTexto = new javax.swing.JLabel();
        EstadoNovo = new javax.swing.JRadioButton();
        EstadoUsado = new javax.swing.JRadioButton();
        PrecoTexto = new javax.swing.JLabel();
        PrecoCampo = new javax.swing.JTextField();
        QuantidadeTexto = new javax.swing.JLabel();
        QuantidadeCampo = new javax.swing.JTextField();
        CategoriaTexto = new javax.swing.JLabel();
        CategoriaComboBox = new javax.swing.JComboBox<>();
        SalvarBotao = new javax.swing.JButton();
        DataTexto = new javax.swing.JLabel();
        DataCampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AreaDeBoasVindas = new javax.swing.JPanel();
        TextoDeBoasVindas = new javax.swing.JLabel();
        TextoDeFeedback = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaDeFeedback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Feedback.setText("Obs.: Você será notificado aqui se o produto foi cadastrado com sucesso ou não.");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeFeedback.setText("Nome: ");

        EstadoFeedback.setText("Estado:");

        PrecoFeedback.setText("Preço:");

        QuantidadeFeedback.setText("Quantidade:");

        CategoriaFeedback.setText("Categoria:");

        DataFeedback.setText("Data de Compra: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrecoFeedback)
                    .addComponent(NomeFeedback)
                    .addComponent(EstadoFeedback))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriaFeedback)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(QuantidadeFeedback)
                        .addGap(64, 64, 64)
                        .addComponent(DataFeedback)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeFeedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoFeedback)
                    .addComponent(QuantidadeFeedback)
                    .addComponent(DataFeedback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoFeedback)
                    .addComponent(CategoriaFeedback))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout AreaDeFeedbackLayout = new javax.swing.GroupLayout(AreaDeFeedback);
        AreaDeFeedback.setLayout(AreaDeFeedbackLayout);
        AreaDeFeedbackLayout.setHorizontalGroup(
            AreaDeFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaDeFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Feedback)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        AreaDeFeedbackLayout.setVerticalGroup(
            AreaDeFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeFeedbackLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Feedback)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        NomeTexto.setText("Nome:");

        NomeCampo.setToolTipText("Preencha o campo com o nome do produto.");
        NomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCampoActionPerformed(evt);
            }
        });

        EstadoTexto.setText("Estado:");

        EstadoNovo.setText("Novo");
        EstadoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoNovoActionPerformed(evt);
            }
        });

        EstadoUsado.setText("Usado");

        PrecoTexto.setText("Preço (R$):");

        PrecoCampo.setToolTipText("Exemplo:");

        QuantidadeTexto.setText("Quantidade:");

        CategoriaTexto.setText("Categoria:");

        CategoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção:", "Placa Mãe", "Processador (CPU)", "Memória Ram", "Armazenamento (HD/SSD)", "Placa de Vídeo (GPU)", "Gabinetes", "Periféricos" }));

        SalvarBotao.setText("Salvar");
        SalvarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarBotaoActionPerformed(evt);
            }
        });

        DataTexto.setText("Data de Compra:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("Exemplo: Processador Intel i7");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Exemplo: 10.99");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Exemplo: 23");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Exemplo: 28/11/2023");

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(EstadoTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoUsado)
                        .addGap(18, 18, 18)
                        .addComponent(CategoriaTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeTexto)
                                    .addComponent(NomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormularioLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PrecoTexto)
                                            .addComponent(PrecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(QuantidadeCampo)
                                            .addGroup(FormularioLayout.createSequentialGroup()
                                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(QuantidadeTexto))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormularioLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(SalvarBotao)
                                        .addGap(103, 103, 103))))
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(285, 285, 285)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataTexto)
                            .addComponent(jLabel4)
                            .addComponent(DataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeTexto)
                    .addComponent(PrecoTexto)
                    .addComponent(QuantidadeTexto)
                    .addComponent(DataTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoTexto)
                    .addComponent(CategoriaTexto)
                    .addComponent(CategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoNovo)
                    .addComponent(EstadoUsado))
                .addGap(26, 26, 26)
                .addComponent(SalvarBotao)
                .addGap(18, 18, 18))
        );

        TextoDeBoasVindas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoDeBoasVindas.setText("Cadastro de Produtos");

        TextoDeFeedback.setText("Preencha os campos abaixo corretamente para cadastrar um produto:");

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
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(TextoDeFeedback)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaDeFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaDeFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCampoActionPerformed

    private void EstadoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoNovoActionPerformed

    private void SalvarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBotaoActionPerformed
        Produto p = new Produto();

        try {
            p.setNome(NomeCampo.getText());
            p.setPreco(Double.parseDouble(PrecoCampo.getText()));
            p.setQuantidade(Integer.parseInt(QuantidadeCampo.getText()));

            if(EstadoNovo.isSelected()) {
                p.setEstado("Novo");
            }else if(EstadoUsado.isSelected()) {
                p.setEstado("Usado");
            }else {
                p.setEstado("");
            }

            if(CategoriaComboBox.getSelectedItem().toString().equalsIgnoreCase("Selecione uma opção:")) {
                p.setCategoria("");
            }else {
                p.setCategoria(CategoriaComboBox.getSelectedItem().toString());
            }

            p.setVendido(false);

            p.setDataDaCompra(Produto.converterParaSQL(DataCampo.getText()));

            if(ProdutoDAO.cadastrar(p)) {
                Feedback.setText("Os dados do produto cadastrado são: ");
                NomeFeedback.setText("Nome: " + p.getNome());
                PrecoFeedback.setText("Preço: " + p.getPreco());
                QuantidadeFeedback.setText("Quantidade: " + p.getQuantidade());
                EstadoFeedback.setText("Estado: " + p.getEstado());
                CategoriaFeedback.setText("Categoria: " + p.getCategoria());
                DataCampo.setText("Data da Compra: " + p.getDataDaCompra());
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não pode ser cadastrado! Tente novamente!");
            System.out.println(ex);
        }
    }//GEN-LAST:event_SalvarBotaoActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JPanel AreaDeFeedback;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JComboBox<String> CategoriaComboBox;
    private javax.swing.JLabel CategoriaFeedback;
    private javax.swing.JLabel CategoriaTexto;
    private javax.swing.JTextField DataCampo;
    private javax.swing.JLabel DataFeedback;
    private javax.swing.JLabel DataTexto;
    private javax.swing.JLabel EstadoFeedback;
    private javax.swing.JRadioButton EstadoNovo;
    private javax.swing.JLabel EstadoTexto;
    private javax.swing.JRadioButton EstadoUsado;
    private javax.swing.JLabel Feedback;
    private javax.swing.JPanel Formulario;
    private javax.swing.JTextField NomeCampo;
    private javax.swing.JLabel NomeFeedback;
    private javax.swing.JLabel NomeTexto;
    private javax.swing.JTextField PrecoCampo;
    private javax.swing.JLabel PrecoFeedback;
    private javax.swing.JLabel PrecoTexto;
    private javax.swing.JTextField QuantidadeCampo;
    private javax.swing.JLabel QuantidadeFeedback;
    private javax.swing.JLabel QuantidadeTexto;
    private javax.swing.JButton SalvarBotao;
    private javax.swing.JLabel TextoDeBoasVindas;
    private javax.swing.JLabel TextoDeFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}