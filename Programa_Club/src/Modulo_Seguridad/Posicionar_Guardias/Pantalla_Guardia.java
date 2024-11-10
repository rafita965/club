/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Seguridad.Posicionar_Guardias;

import Modulo_Seguridad.Conexion_Bdd_Seguridad;
import java.util.ArrayList;

/**
 *
 * @author tm_galli
 */
public class Pantalla_Guardia extends javax.swing.JFrame {
    Conexion_Bdd_Seguridad conexion= new Conexion_Bdd_Seguridad();
    Posicionar_Guardias_Codigo vZc = new Posicionar_Guardias_Codigo();
    String id_zona;
    int id_guardia;
    int ID_ZONA;
    

    /**
     * Creates new form Pantalla_Guardia
     */
    public Pantalla_Guardia() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nombre_zona = new javax.swing.JLabel();
        lbl_id_zona = new javax.swing.JLabel();
        lbl_nombre_guardia = new javax.swing.JLabel();
        lbl_id_guardia = new javax.swing.JLabel();
        lbl_cargo = new javax.swing.JLabel();
        btn_desasignar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_Volver3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        lbl_nombre_zona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nombre_zona.setForeground(new java.awt.Color(229, 232, 236));
        lbl_nombre_zona.setText("jLabel1");

        lbl_id_zona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_id_zona.setForeground(new java.awt.Color(229, 232, 236));
        lbl_id_zona.setText("jLabel1");

        lbl_nombre_guardia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nombre_guardia.setForeground(new java.awt.Color(229, 232, 236));
        lbl_nombre_guardia.setText("jLabel1");

        lbl_id_guardia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_id_guardia.setForeground(new java.awt.Color(229, 232, 236));
        lbl_id_guardia.setText("jLabel1");

        lbl_cargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cargo.setForeground(new java.awt.Color(229, 232, 236));
        lbl_cargo.setText("jLabel1");

        btn_desasignar.setText("Desasignar guardia");
        btn_desasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desasignarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(31, 50, 69));
        jPanel5.setForeground(new java.awt.Color(31, 50, 69));

        btn_Volver3.setBackground(new java.awt.Color(47, 94, 141));
        btn_Volver3.setText("<--");
        btn_Volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 232, 236));
        jLabel4.setText("Guardia asignado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel4)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre_zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(lbl_id_guardia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nombre_guardia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_id_zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_desasignar)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbl_nombre_zona)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_id_zona)
                        .addGap(33, 33, 33)
                        .addComponent(lbl_nombre_guardia)
                        .addGap(33, 33, 33)
                        .addComponent(lbl_id_guardia)
                        .addGap(33, 33, 33)
                        .addComponent(lbl_cargo))
                    .addComponent(btn_desasignar))
                .addContainerGap(32, Short.MAX_VALUE))
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
    
    //Boton para desasignar al guardia seleccionado
    private void btn_desasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desasignarActionPerformed
        conexion.Delete_Z_Guardias(id_guardia);
        Ver_Zonas_Guardia vZg = new Ver_Zonas_Guardia();
        this.setVisible(false);
        vZg.setVisible(true);
        
        vZg.setSize(500,430);
        vZg.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_desasignarActionPerformed
    
    //Boton para volver para atras
    private void btn_Volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver3ActionPerformed
        this.setVisible(false);
        vZc.Pantalla_Zona_Guardias(ID_ZONA);
        
        
    }//GEN-LAST:event_btn_Volver3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Guardia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Guardia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Guardia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Guardia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Guardia().setVisible(true);
            }
        });
    }
    
    //Muestra informacion de la zona y el guardia 
    public void mostrarZona(String id_Zona, String Nombre, int id_Guardia, int Id_Zona){
        ID_ZONA=Id_Zona;
        id_zona=id_Zona;
        id_guardia=id_Guardia;
        lbl_id_zona.setText("Zona ID="+id_Zona);
        lbl_nombre_zona.setText(Nombre);
        
        ArrayList array=conexion.Select_unique_Guardia(id_Guardia);
        String Id=(String) array.get(0);
        String Nombre_g=(String) array.get(1);
        String Cargo=(String) array.get(2);
        if (Cargo=="1"){
            Cargo="Guardia de seguridad";
        }else{
            Cargo="Policia";
        }
        
        lbl_nombre_guardia.setText(Nombre_g);
        lbl_id_guardia.setText(Id);
        lbl_cargo.setText(Cargo);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver3;
    private javax.swing.JButton btn_desasignar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_id_guardia;
    private javax.swing.JLabel lbl_id_zona;
    private javax.swing.JLabel lbl_nombre_guardia;
    private javax.swing.JLabel lbl_nombre_zona;
    // End of variables declaration//GEN-END:variables
}
