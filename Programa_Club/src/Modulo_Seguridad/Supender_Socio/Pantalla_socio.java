/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Seguridad.Supender_Socio;
import Modulo_Seguridad.Supender_Socio.Suspender_socio_interface;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Modulo_Seguridad.Conexion_Bdd_Seguridad;
import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author HP OMEN
 */
public class Pantalla_socio extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    Conexion_Bdd_Seguridad conexion= new Conexion_Bdd_Seguridad();
    int id_usuario;
    public Pantalla_socio() {
        initComponents();
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel label_socio = new javax.swing.JLabel();
        Direccion_s = new javax.swing.JLabel();
        Idsoci = new javax.swing.JLabel();
        Nombre_s = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Contraseña_s2 = new javax.swing.JLabel();
        Razon_s = new javax.swing.JTextField();
        Tiempo_s = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        S_D = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Volver.setText("<--");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/humano.png"))); // NOI18N

        Direccion_s.setText("4");

        Idsoci.setText("1");

        Nombre_s.setText("2");

        Email.setText("5");

        Contraseña_s2.setText("3");

        Razon_s.setText("Escriba la razon para su suspención");
        Razon_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Razon_sActionPerformed(evt);
            }
        });

        Tiempo_s.setText("Cant. de tiempo suspendido (Dias)");
        Tiempo_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo_sActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        S_D.setText("Suspender Definitivamente");
        S_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tiempo_s, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(S_D)))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Direccion_s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Idsoci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Contraseña_s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nombre_s, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Razon_s, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)))
                        .addComponent(jLabel3)
                        .addGap(150, 150, 150)
                        .addComponent(label_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Idsoci, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Nombre_s, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(Contraseña_s2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Direccion_s, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Razon_s, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tiempo_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_D))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        Suspender_socio_interface pM = new Suspender_socio_interface();
        pM.setVisible(true);
        this.setVisible(false);
        pM.setSize(1530,900);
        pM.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_VolverActionPerformed
    private void lomismoqueelbotonparaatras(){
        Suspender_socio_interface pM = new Suspender_socio_interface();
        pM.setVisible(true);
        this.setVisible(false);
        pM.setSize(1530,900);
        pM.setLocationRelativeTo(null);
    }
    private void Razon_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Razon_sActionPerformed
        
    }//GEN-LAST:event_Razon_sActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        if (Tiempo_s.isEnabled()){
            String Razon= Razon_s.getText();
            int tiempo= Integer.parseInt(Tiempo_s.getText());
            LocalDate fechaActual = LocalDate.now();
            Date sqlDate = Date.valueOf(fechaActual);
            Boolean resul=conexion.Insert_socio_mal(id_usuario,Razon,tiempo,sqlDate);
            lomismoqueelbotonparaatras();
        }
        else{
            String Razon= Razon_s.getText();
            int tiempo= 0;
            LocalDate fechaActual = LocalDate.now();
            Date sqlDate = Date.valueOf(fechaActual);
            Boolean resul=conexion.Insert_socio_mal(id_usuario,Razon,tiempo,sqlDate);
            lomismoqueelbotonparaatras();
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tiempo_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo_sActionPerformed

    private void S_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_DActionPerformed
        Tiempo_s.setEnabled(false);
    }//GEN-LAST:event_S_DActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_socio().setVisible(true);
            }
        });
    }
    
    public void agregar_socio(int id){
        modelo.removeAllElements();
        ArrayList array=conexion.Select_unique_socio(id);
        
        String Id=(String) array.get(0);
        id_usuario=id;
        Idsoci.setText(Id);
        
        String nombre=(String) array.get(1);
        Nombre_s.setText(nombre);
        
        String contraseña=(String) array.get(2);
        Contraseña_s2.setText(contraseña);
        
        String direccion=(String) array.get(3);
        Direccion_s.setText(direccion);
        
        String email=(String) array.get(4);
        Email.setText(email);
        
        
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña_s2;
    private javax.swing.JLabel Direccion_s;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Idsoci;
    private javax.swing.JLabel Nombre_s;
    private javax.swing.JTextField Razon_s;
    private javax.swing.JButton S_D;
    private javax.swing.JTextField Tiempo_s;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
