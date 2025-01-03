/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atividadeii;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class GastoCalorico extends javax.swing.JFrame {

    /**
     * Creates new form GastoCalorico
     */
    public GastoCalorico() {
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

        buttonGroupGastoCalorico = new javax.swing.ButtonGroup();
        Painel1 = new javax.swing.JPanel();
        CalculoGastoCalórico = new javax.swing.JLabel();
        bntSair = new javax.swing.JButton();
        Painel2 = new javax.swing.JPanel();
        radioButtonMulher = new javax.swing.JRadioButton();
        radioButtonHomem = new javax.swing.JRadioButton();
        txtPeso = new javax.swing.JLabel();
        txtAltura = new javax.swing.JLabel();
        txtIdade = new javax.swing.JLabel();
        txtNivelAtividade = new javax.swing.JLabel();
        textFieldPeso = new javax.swing.JTextField();
        textFieldIdade = new javax.swing.JTextField();
        textFieldAltura = new javax.swing.JTextField();
        comboBoxNivelAtividade = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        Painel3 = new javax.swing.JPanel();
        txtGastoCalorico = new javax.swing.JLabel();
        txtGastoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CalculoGastoCalórico.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CalculoGastoCalórico.setText("Cálculo de Gasto Calórico");

        bntSair.setFont(new java.awt.Font("Arial Black", 0, 8)); // NOI18N
        bntSair.setText("Sair");
        bntSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSairActionPerformed(evt);
            }
        });

        buttonGroupGastoCalorico.add(radioButtonMulher);
        radioButtonMulher.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        radioButtonMulher.setText("Mulher");
        radioButtonMulher.setContentAreaFilled(false);

        buttonGroupGastoCalorico.add(radioButtonHomem);
        radioButtonHomem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        radioButtonHomem.setText("Homem");

        txtPeso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtPeso.setText("Peso (kg):");

        txtAltura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtAltura.setText("Altura (cm):");

        txtIdade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtIdade.setText("Idade:");

        txtNivelAtividade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNivelAtividade.setText("Nivel de Atividade:");

        textFieldPeso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textFieldIdade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textFieldAltura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        comboBoxNivelAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção:", "Sedentário", "Leve ( exercício leve 1 a 3 dias/semana)", "Moderado (exercício moderado 3 a 5 dias/semana)", "Ativo (exercício pesado 5 a 6 dias/semana)", "Extremamente Ativo ( exercício pesado diário)" }));
        comboBoxNivelAtividade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalcular.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalcular)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeso)
                            .addComponent(radioButtonMulher)
                            .addComponent(txtAltura)
                            .addComponent(txtIdade)
                            .addComponent(txtNivelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonHomem)
                            .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxNivelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonMulher)
                    .addComponent(radioButtonHomem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso)
                    .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxNivelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelAtividade))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtGastoCalorico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtGastoCalorico.setText("Gasto Calórico:");

        txtGastoTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtGastoTotal.setText("Gasto Total:");

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGastoTotal)
                    .addComponent(txtGastoCalorico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtGastoCalorico)
                .addGap(18, 18, 18)
                .addComponent(txtGastoTotal)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(CalculoGastoCalórico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(CalculoGastoCalórico))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSairActionPerformed
        dispose();
    }//GEN-LAST:event_bntSairActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            
            if (radioButtonHomem.isSelected() || radioButtonMulher.isSelected()) {
                if (textFieldPeso.getText().isEmpty() || textFieldAltura.getText().isEmpty() || textFieldIdade.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                    return;
                }

                DecimalFormat df = new DecimalFormat("#.##");

                double peso = Double.parseDouble(textFieldPeso.getText());
                double altura = Double.parseDouble(textFieldAltura.getText());
                int idade = Integer.parseInt(textFieldIdade.getText());

                double calBasal = 0;

                if (radioButtonHomem.isSelected()) {
                    calBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
                } else if (radioButtonMulher.isSelected()) {
                    calBasal = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
                }

                txtGastoCalorico.setText("Gasto Calórico: " + df.format(calBasal) + " kcal");

            
                double calTotal = 0;
                String nivelAtividade = (String) comboBoxNivelAtividade.getSelectedItem();
                if (nivelAtividade != null) {
                    switch (nivelAtividade) {
                        case "Sedentário":
                            calTotal = calBasal * 1.2;
                            break;
                        case "Leve ( exercício leve 1 a 3 dias/semana)":
                            calTotal = calBasal * 1.375;
                            break;
                        case "Moderado (exercício moderado 3 a 5 dias/semana)":
                            calTotal = calBasal * 1.55;
                            break;
                        case "Ativo (exercício pesado 5 a 6 dias/semana)":
                            calTotal = calBasal * 1.725;
                            break;
                        case "Extremamente Ativo ( exercício pesado diário)":
                            calTotal = calBasal * 1.9;
                            break;
                    }

                    txtGastoTotal.setText("Gasto Total: " + df.format(calTotal) + " kcal");

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o sexo.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalculoGastoCalórico;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton bntSair;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroupGastoCalorico;
    private javax.swing.JComboBox<String> comboBoxNivelAtividade;
    private javax.swing.JRadioButton radioButtonHomem;
    private javax.swing.JRadioButton radioButtonMulher;
    private javax.swing.JTextField textFieldAltura;
    private javax.swing.JTextField textFieldIdade;
    private javax.swing.JTextField textFieldPeso;
    private javax.swing.JLabel txtAltura;
    private javax.swing.JLabel txtGastoCalorico;
    private javax.swing.JLabel txtGastoTotal;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtNivelAtividade;
    private javax.swing.JLabel txtPeso;
    // End of variables declaration//GEN-END:variables
}