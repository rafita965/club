/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_club;
import Modulo_Entradas.Principal;
import Modulo_Ventas.Pantalla_Ventas;
import Modulo_Seguridad.Pantalla_Seguridad;
import Modulo_Seguridad.Abrir_Seguridad;
import Modulo_GestionDeFinanzas.PlanificacionFinanciera;
/**
 *
 * @author PC
 */
public class Main extends javax.swing.JFrame {

    static int IDadmin;
    
    public Main(int IDadmin) {
        initComponents();
        this.setLocationRelativeTo(null);
        Main.IDadmin=IDadmin;
        admin(IDadmin);
    }
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void admin(int IDadmin){
        btn_Seguridad.setEnabled(false);
            btn_Productos.setEnabled(false);
            btn_Entradas.setEnabled(false);
            jButton1.setEnabled(false);
            jButton4.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
        if(IDadmin==1){
            btn_Seguridad.setEnabled(true);
        }
        else if(IDadmin==2){
            jButton3.setEnabled(true);
        }
                else if(IDadmin==3){
            btn_Entradas.setEnabled(true);
        }
                else if(IDadmin==4){
            jButton1.setEnabled(true);
        }
                else if(IDadmin==5){
            jButton4.setEnabled(true);
        }
                else if(IDadmin==6){
            jButton5.setEnabled(true);
        }
                else if(IDadmin==7){
            jButton6.setEnabled(true);
        }
                else if(IDadmin==8){
            btn_Productos.setEnabled(true);
        }
                else if(IDadmin==9){
            jButton2.setEnabled(true);
        }
                else if(IDadmin==10){
                    btn_Seguridad.setEnabled(true);
                    btn_Productos.setEnabled(true);
                    btn_Entradas.setEnabled(true);
                    jButton1.setEnabled(true);
                    jButton4.setEnabled(true);
                    jButton2.setEnabled(true);
                    jButton3.setEnabled(true);
                    jButton5.setEnabled(true);
                    jButton6.setEnabled(true);
                }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Seguridad = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
        btn_Entradas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        btn_Seguridad.setBackground(new java.awt.Color(99, 140, 181));
        btn_Seguridad.setText("Gestionar Seguridad");
        btn_Seguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeguridadActionPerformed(evt);
            }
        });

        btn_Productos.setBackground(new java.awt.Color(99, 140, 181));
        btn_Productos.setText("Gestionar Productos");
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });

        btn_Entradas.setBackground(new java.awt.Color(99, 140, 181));
        btn_Entradas.setText("Gestionar Entradas");
        btn_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntradasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(99, 140, 181));
        jButton1.setText("Gestionar Finanzas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(99, 140, 181));
        jButton2.setText("Gestion de Eventos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(99, 140, 181));
        jButton3.setText("Gestion de Socios");

        jButton4.setBackground(new java.awt.Color(99, 140, 181));
        jButton4.setText("Gestión de Dirigencia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(99, 140, 181));
        jButton5.setText("Gestion de Deportistas");

        jButton6.setBackground(new java.awt.Color(99, 140, 181));
        jButton6.setText("Gestio de Recursos.H");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (1) (1) (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Seguridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Entradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Seguridad)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Productos)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Entradas)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeguridadActionPerformed
        Abrir_Seguridad Seguridad = new Abrir_Seguridad();
        Seguridad.Open_Security();
        this.setVisible(false);
    }//GEN-LAST:event_btn_SeguridadActionPerformed

    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        Pantalla_Ventas vV= new Pantalla_Ventas();
        this.setVisible(false);
        vV.setVisible(true);
        vV.setLocationRelativeTo(null);
        vV.setSize(400,440);
    }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntradasActionPerformed
        Principal wdw= new Principal();
        wdw.setVisible(true);
        this.setVisible(false);
        wdw.setLocationRelativeTo(null);
        wdw.setResizable(false);
        wdw.setSize(900,520);
    }//GEN-LAST:event_btn_EntradasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PlanificacionFinanciera wdw= new PlanificacionFinanciera();
        wdw.setVisible(true);
        this.setVisible(false);
        wdw.setLocationRelativeTo(null);
        wdw.setResizable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(IDadmin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entradas;
    private javax.swing.JButton btn_Productos;
    private javax.swing.JButton btn_Seguridad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
