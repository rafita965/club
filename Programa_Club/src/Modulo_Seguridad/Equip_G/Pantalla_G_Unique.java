/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Seguridad.Equip_G;

import java.util.ArrayList;

/**
 *
 * @author HP OMEN
 */
public class Pantalla_G_Unique extends javax.swing.JFrame {
    
    Pantalla_G_Unique_Codigo pGuC=new Pantalla_G_Unique_Codigo();
    ArrayList<String> array_usado;
    ArrayList<String> array_sin_usar;
    String Nombre;
    int Id;
    public Pantalla_G_Unique() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Volver2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Eliminar3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Jnombre = new javax.swing.JLabel();
        Equipo3 = new javax.swing.JLabel();
        Equipo1 = new javax.swing.JLabel();
        Equipo2 = new javax.swing.JLabel();
        Combo3 = new javax.swing.JComboBox<>();
        Combo2 = new javax.swing.JComboBox<>();
        Eliminar1 = new javax.swing.JButton();
        Combo1 = new javax.swing.JComboBox<>();
        Eliminar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        btn_Volver2.setBackground(new java.awt.Color(47, 94, 141));
        btn_Volver2.setText("<--");
        btn_Volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(229, 232, 236));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 232, 236));
        jLabel4.setText("Equpar guardia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(jLabel4)
                .addContainerGap(606, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver2)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Eliminar3.setText("Colocar/Eliminar equipamiento3");
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
            }
        });

        jButton1.setText("Quitar todo el Equipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Jnombre.setForeground(new java.awt.Color(229, 232, 236));
        Jnombre.setText("jLabel2");

        Equipo3.setForeground(new java.awt.Color(229, 232, 236));
        Equipo3.setText("jLabel2");

        Equipo1.setForeground(new java.awt.Color(229, 232, 236));
        Equipo1.setText("jLabel2");

        Equipo2.setForeground(new java.awt.Color(229, 232, 236));
        Equipo2.setText("jLabel2");

        Combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ponga un nuevo equipo" }));
        Combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo3ActionPerformed(evt);
            }
        });

        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ponga un nuevo equipo" }));
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });

        Eliminar1.setText("Colocar/Eliminar equipamiento1");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });

        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ponga un nuevo equipo" }));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });

        Eliminar2.setText("Colocar/Eliminar equipamiento2");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Eliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eliminar1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Jnombre)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        //Cuando se selecciona algo del combobox, se guarda en un string [] para luego sacar la id y que sea insertado en la bdd como tambien que sea mostrado en el texto de al lado
        //Luego, se reactivan los botones 2 y 3 de Colocar/Eliminar
        
        Object itemSeleccionado = Combo1.getSelectedItem();
        String[] Elemento = (itemSeleccionado.toString()).split(" // ");
        
        pGuC.Insertar_equipo(Integer.parseInt(Elemento[0]),Id);
        
        Equipo1.setText(Elemento[0]+"//"+Elemento[1]);
        
        Eliminar2.setEnabled(true);
        Eliminar3.setEnabled(true);
 
        
        
        
    }//GEN-LAST:event_Combo1ActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        //Cuando se toca el boton, se activa el combobox 1 y se desactiva basicamente todo lo demas.
        //Si el guardia tiene un equipo en esa posicion, se le eliminara, si no, no pasa nada
        //Al combobox se le agrega toda la data de los equipos disponibles
        
        Combo1.setEnabled(true);
        Combo2.setEnabled(false);
        Combo3.setEnabled(false);
        Eliminar2.setEnabled(false);
        Eliminar3.setEnabled(false);
        if (Equipo1.getText()=="Sin Equipo"){
            
        }
        else{
        Equipo1.setText("Sin Equipo");
        String[] stri = array_usado.toArray(new String[0]);
        
        String valor1=stri[0];
        String[] valor2 = valor1.split("//");
        
        pGuC.Eliminar_datos(Integer.parseInt(valor2[1]));
        }
        array_sin_usar=pGuC.mostrar_equipo();
        for (String equipo:array_sin_usar){
            Combo1.addItem(equipo);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        //Cuando se toca el boton, se activa el combobox 2 y se desactiva basicamente todo lo demas.
        //Si el guardia tiene un equipo en esa posicion, se le eliminara, si no, no pasa nada
        //Al combobox se le agrega toda la data de los equipos disponibles
        
        Combo2.setEnabled(true);
        Combo1.setEnabled(false);
        Combo3.setEnabled(false);
        Eliminar1.setEnabled(false);
        Eliminar3.setEnabled(false);
        if (Equipo2.getText()=="Sin Equipo"){
            
        }
        else{
        Equipo2.setText("Sin Equipo");
        String[] stri = array_usado.toArray(new String[0]);
        
        String valor1=stri[1];
        String[] valor2 = valor1.split("//");
        
        pGuC.Eliminar_datos(Integer.parseInt(valor2[1]));
        }
                
        array_sin_usar=pGuC.mostrar_equipo();
        for (String equipo:array_sin_usar){
            Combo2.addItem(equipo);
        }
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
        //Cuando se toca el boton, se activa el combobox 3 y se desactiva basicamente todo lo demas.
        //Si el guardia tiene un equipo en esa posicion, se le eliminara, si no, no pasa nS
        //Al combobox se le agrega toda la data de los equipos disponibles
        
        Combo2.setEnabled(false);
        Combo1.setEnabled(false);
        Combo3.setEnabled(true);
        Eliminar1.setEnabled(false);
        Eliminar2.setEnabled(false);
        if (Equipo3.getText()=="Sin Equipo"){
            
        }
        else{
        Equipo3.setText("Sin Equipo");
        String[] stri = array_usado.toArray(new String[0]);
        
        String valor1=stri[2];
        String[] valor2 = valor1.split("//");
        
        pGuC.Eliminar_datos(Integer.parseInt(valor2[1]));
        }
               
        array_sin_usar=pGuC.mostrar_equipo();
        for (String equipo:array_sin_usar){
            Combo3.addItem(equipo);
        }
    }//GEN-LAST:event_Eliminar3ActionPerformed

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
        //Cuando se selecciona algo del combobox, se guarda en un string [] para luego sacar la id y que sea insertado en la bdd como tambien que sea mostrado en el texto de al lado
        //Luego, se reactivan los botones 1 y 3 de Colocar/Eliminar
        
        Object itemSeleccionado = Combo2.getSelectedItem();
        String[] Elemento = (itemSeleccionado.toString()).split(" // ");
        
        pGuC.Insertar_equipo(Integer.parseInt(Elemento[0]),Id);
        
        Equipo2.setText(Elemento[0]+"//"+Elemento[1]);
        
        Eliminar1.setEnabled(true);
        Eliminar3.setEnabled(true);
    }//GEN-LAST:event_Combo2ActionPerformed

    private void Combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo3ActionPerformed
        //Cuando se selecciona algo del combobox, se guarda en un string [] para luego sacar la id y que sea insertado en la bdd como tambien que sea mostrado en el texto de al lado
        //Luego, se reactivan los botones 1 y 2 de Colocar/Eliminar
        
        Object itemSeleccionado = Combo3.getSelectedItem();
        String[] Elemento = (itemSeleccionado.toString()).split(" // ");
        
        pGuC.Insertar_equipo(Integer.parseInt(Elemento[0]),Id);
        
        Equipo3.setText(Elemento[0]+"//"+Elemento[1]);
        
        Eliminar2.setEnabled(true);
        Eliminar1.setEnabled(true);
    }//GEN-LAST:event_Combo3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Este boton quita del guardia todo el equipo que lleve consigo.
        
        Equipo1.setText("Sin Equipo");
        Equipo2.setText("Sin Equipo");
        Equipo3.setText("Sin Equipo");
        Combo1.setEnabled(false);
        Combo2.setEnabled(false);
        Combo3.setEnabled(false);
        
        for (int i=0; i<2;i++){
            String[] stri = array_usado.toArray(new String[0]);

            String valor1=stri[i];
            String[] valor2 = valor1.split("//");

            pGuC.Eliminar_datos(Integer.parseInt(valor2[1]));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_Volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver2ActionPerformed
        //Este boton vuelve atras
        
        Pantalla_Guardias pG=new Pantalla_Guardias();
        pG.setVisible(true);
        pG.setLocationRelativeTo(null);
        this.setVisible(false);
        pG.setSize(820, 428);
    }//GEN-LAST:event_btn_Volver2ActionPerformed

    public void Cargar_Datos(int Id,String nombre){
        //Este metodo carga el equipo seleccionado a la bdd
        
        array_usado =pGuC.cargar_datos(Id);
        this.Id=Id;
        Jnombre.setText(nombre);
         
        String[] stri = array_usado.toArray(new String[0]);
        
        try{
            Equipo1.setText(stri[0]);
        }catch(Exception e){
            Equipo1.setText("Sin Equipo");
        }
        
        try{
            Equipo2.setText(stri[1]);
        }catch(Exception e){
            Equipo2.setText("Sin Equipo");
        }
        
        try{
            Equipo3.setText(stri[2]);
        }catch(Exception e){
            Equipo3.setText("Sin Equipo");
        }
        
        Combo1.setEnabled(false);
        Combo2.setEnabled(false);
        Combo3.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(Pantalla_G_Unique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_G_Unique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_G_Unique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_G_Unique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_G_Unique().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JComboBox<String> Combo3;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JButton Eliminar2;
    private javax.swing.JButton Eliminar3;
    private javax.swing.JLabel Equipo1;
    private javax.swing.JLabel Equipo2;
    private javax.swing.JLabel Equipo3;
    private javax.swing.JLabel Jnombre;
    private javax.swing.JButton btn_Volver2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
