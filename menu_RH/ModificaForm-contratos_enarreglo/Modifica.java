/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_RH;

/**
 *
 * @author tm_galli
 */
public class Modifica extends javax.swing.JFrame {

    /**
     * Creates new form Modifica
     */
    public Modifica() {
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

        jLabel8 = new javax.swing.JLabel();
        Nombre_m1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        VolverMod = new javax.swing.JButton();
        Label_m = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Apellido_m = new javax.swing.JTextField();
        Edad_m = new javax.swing.JTextField();
        Nombre_mod = new javax.swing.JTextField();
        BoxMod = new javax.swing.JComboBox<>();
        Docu_m1 = new javax.swing.JTextField();
        Apellido_m1 = new javax.swing.JTextField();
        BoxCargo = new javax.swing.JComboBox<>();
        Label_m1 = new javax.swing.JLabel();
        ID_m = new javax.swing.JTextField();
        EnviarM = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 246, 247));
        jLabel8.setText("Nacionalidad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        jLabel1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 246, 247));
        jLabel1.setText("Modifica");

        VolverMod.setText("<-");
        VolverMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverModActionPerformed(evt);
            }
        });

        Label_m.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        Label_m.setForeground(new java.awt.Color(245, 246, 247));
        Label_m.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 246, 247));
        jLabel3.setText("Tipo de Documento:");

        jLabel4.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 246, 247));
        jLabel4.setText("Nro de documento:");

        jLabel5.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 246, 247));
        jLabel5.setText("Edad:");

        A.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        A.setForeground(new java.awt.Color(245, 246, 247));
        A.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 246, 247));
        jLabel7.setText("Nacionalidad:");

        jLabel9.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 246, 247));
        jLabel9.setText("Cargo:");

        Edad_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edad_mActionPerformed(evt);
            }
        });

        Nombre_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_modActionPerformed(evt);
            }
        });

        BoxMod.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        BoxMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "Cedula" }));
        BoxMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxModActionPerformed(evt);
            }
        });

        Docu_m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Docu_m1ActionPerformed(evt);
            }
        });

        BoxCargo.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        BoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " ", " " }));
        BoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCargoActionPerformed(evt);
            }
        });

        Label_m1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        Label_m1.setForeground(new java.awt.Color(245, 246, 247));
        Label_m1.setText("ID:");

        ID_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_mActionPerformed(evt);
            }
        });

        EnviarM.setText("Enviar");
        EnviarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellido_m1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VolverMod)
                                .addGap(251, 251, 251)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label_m1)
                                .addGap(18, 18, 18)
                                .addComponent(ID_m, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label_m)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(Edad_m, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(225, 225, 225)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(BoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BoxMod, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(Apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(EnviarM)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(Docu_m1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VolverMod)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_m1)
                    .addComponent(ID_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m)
                            .addComponent(Nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Edad_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(Apellido_m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BoxMod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(BoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(EnviarM)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(Docu_m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverModActionPerformed

    private void Edad_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edad_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edad_mActionPerformed

    private void Nombre_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_modActionPerformed

    private void BoxModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxModActionPerformed

    private void Docu_m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Docu_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Docu_m1ActionPerformed

    private void BoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxCargoActionPerformed

    private void ID_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_mActionPerformed

    private void EnviarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarMActionPerformed

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
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JTextField Apellido_m;
    private javax.swing.JTextField Apellido_m1;
    private javax.swing.JComboBox<String> BoxCargo;
    private javax.swing.JComboBox<String> BoxMod;
    private javax.swing.JTextField Docu_m1;
    private javax.swing.JTextField Edad_m;
    private javax.swing.JButton EnviarM;
    private javax.swing.JTextField ID_m;
    private javax.swing.JLabel Label_m;
    private javax.swing.JLabel Label_m1;
    private javax.swing.JTextField Nombre_m1;
    private javax.swing.JTextField Nombre_mod;
    private javax.swing.JButton VolverMod;
    private javax.swing.JButton Volver_contratos;
    private javax.swing.JButton Volver_contratos1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}