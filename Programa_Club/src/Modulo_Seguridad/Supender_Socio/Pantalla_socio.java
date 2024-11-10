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
import javax.swing.JOptionPane;
/**
 *
 * @author HP OMEN
 */
public class Pantalla_socio extends javax.swing.JFrame {
    //Crea la conexion con la clase de codigo y crea un modelo de datos
    DefaultListModel modelo = new DefaultListModel();
    Conexion_Bdd_Seguridad conexion= new Conexion_Bdd_Seguridad();
    int id_usuario;
    boolean Bandera1=true;
    boolean Bandera2=true;
    public Pantalla_socio() {
        initComponents();
        this.setResizable(false);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        Contraseña_s2 = new javax.swing.JLabel();
        Razon_s = new javax.swing.JTextField();
        Tiempo_s = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        S_D = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Direccion_s = new javax.swing.JLabel();
        Idsoci = new javax.swing.JLabel();
        Nombre_s = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Volver1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        Email.setForeground(new java.awt.Color(229, 232, 236));
        Email.setText("5");

        Contraseña_s2.setForeground(new java.awt.Color(229, 232, 236));
        Contraseña_s2.setText("3");

        Razon_s.setText("Escriba la razon para su suspención");
        Razon_s.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Razon_sFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Razon_sFocusLost(evt);
            }
        });
        Razon_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Razon_sActionPerformed(evt);
            }
        });

        Tiempo_s.setText("Cant. de tiempo suspendido (Dias)");
        Tiempo_s.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tiempo_sFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Tiempo_sFocusLost(evt);
            }
        });
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/humano.png"))); // NOI18N

        Direccion_s.setForeground(new java.awt.Color(229, 232, 236));
        Direccion_s.setText("4");

        Idsoci.setForeground(new java.awt.Color(229, 232, 236));
        Idsoci.setText("1");

        Nombre_s.setForeground(new java.awt.Color(229, 232, 236));
        Nombre_s.setText("2");

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        btn_Volver1.setBackground(new java.awt.Color(47, 94, 141));
        btn_Volver1.setText("<--");
        btn_Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(229, 232, 236));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 232, 236));
        jLabel4.setText("Suspender socio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver1)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tiempo_s, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S_D)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Direccion_s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Idsoci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Contraseña_s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Nombre_s, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Razon_s, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addComponent(jLabel3)
                .addGap(47, 231, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tiempo_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_D))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void lomismoqueelbotonparaatras(){
        //Es lo mismo que el Boton para volver atras, solo que no es un boton y es para usar en codigo
        Suspender_socio_interface pM = new Suspender_socio_interface();
        pM.setVisible(true);
        this.setVisible(false);
        pM.setSize(500, 430);
        pM.setLocationRelativeTo(null);
    }
    private void Razon_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Razon_sActionPerformed
        
    }//GEN-LAST:event_Razon_sActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton para enviar datos, pregunta si el usuario puso tiempo o puso para de por vida. Luego envia los datos a la bdd
        if (Tiempo_s.isEnabled()){
            int tiempo= Integer.parseInt(Tiempo_s.getText());
            if (tiempo>0){
                String Razon= Razon_s.getText();
                LocalDate fechaActual = LocalDate.now();
                Date sqlDate = Date.valueOf(fechaActual);
                Boolean resul=conexion.Insert_socio_mal(id_usuario,Razon,tiempo,sqlDate);
                lomismoqueelbotonparaatras();
            }
            else{
                Tiempo_s.setText("Cant. de tiempo suspendido (Dias)");
                JOptionPane.showMessageDialog(null,"Cantidad invalida, por favor no ingrese un numero negativo");
                Bandera2 = true;
                
            }
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

    private void Razon_sFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Razon_sFocusGained
        if (Bandera1) {
            Razon_s.setText("");
            Bandera1 = false;
                } 
    }//GEN-LAST:event_Razon_sFocusGained

    private void Razon_sFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Razon_sFocusLost
        if(Razon_s.getText().isEmpty()){
            Razon_s.setText("Escriba la razon para su suspención");
            Bandera1 = true;
        }
    }//GEN-LAST:event_Razon_sFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void Tiempo_sFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tiempo_sFocusGained
        if (Bandera2) {
            Tiempo_s.setText("");
            Bandera2 = false;
                } 
    }//GEN-LAST:event_Tiempo_sFocusGained

    private void Tiempo_sFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tiempo_sFocusLost
        if(Tiempo_s.getText().isEmpty()){
            Tiempo_s.setText("Cant. de tiempo suspendido (Dias)");
            Bandera2 = true;
        }
    }//GEN-LAST:event_Tiempo_sFocusLost

    private void btn_Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver1ActionPerformed
        //Boton para volver atras
        Suspender_socio_interface pM = new Suspender_socio_interface();
        pM.setVisible(true);
        this.setVisible(false);
        pM.setSize(500, 430);
        pM.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_Volver1ActionPerformed

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
        //Agrega el socio a la tabla de suspendido
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
    private javax.swing.JButton btn_Volver1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
