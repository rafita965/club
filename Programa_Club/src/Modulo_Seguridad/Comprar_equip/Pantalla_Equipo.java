package Modulo_Seguridad.Comprar_equip;

import Modulo_Seguridad.Conexion_Bdd_Seguridad;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP OMEN
 */
public class Pantalla_Equipo extends javax.swing.JFrame {
    //Crea una conexion con el codigo, con la bdd y crea las variables de bandera
    Com_equip_codigo CeC = new Com_equip_codigo();
    Conexion_Bdd_Seguridad conexion = new Conexion_Bdd_Seguridad();
    boolean bandera=true;
    int ID_Guardar;
    int Precio;
    String[] nombre_vec;

    public Pantalla_Equipo() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nom = new javax.swing.JLabel();
        Descri = new javax.swing.JLabel();
        Lin = new javax.swing.JLabel();
        Preci = new javax.swing.JLabel();
        cant = new javax.swing.JTextField();
        btn_comprar = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Volver2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        Nom.setForeground(new java.awt.Color(229, 232, 236));
        Nom.setText("Nombre");

        Descri.setForeground(new java.awt.Color(229, 232, 236));
        Descri.setText("Descripcion");

        Lin.setForeground(new java.awt.Color(229, 232, 236));
        Lin.setText("Link");

        Preci.setForeground(new java.awt.Color(229, 232, 236));
        Preci.setText("Precio");

        cant.setText("Cant. a comprar");
        cant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantFocusLost(evt);
            }
        });
        cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantActionPerformed(evt);
            }
        });

        btn_comprar.setText("Comprar");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/No_image.png"))); // NOI18N

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
        jLabel4.setText("Comprar equipamiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btn_Volver2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_comprar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Descri, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preci, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lin, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Descri)
                        .addGap(43, 43, 43)
                        .addComponent(Preci)
                        .addGap(63, 63, 63)
                        .addComponent(Lin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_comprar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantActionPerformed
        
    }//GEN-LAST:event_cantActionPerformed
    
    private void cantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantFocusGained
        //Si el usuario pone para escribir, se quita el texto de ejemplo y se activa la bandera
        if (bandera) {
                    cant.setText("");
                    bandera = false;
                }     
    }//GEN-LAST:event_cantFocusGained

    private void cantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantFocusLost
        //Si el usuario deja de escribir, se vuelve a poner el texto de ejemplo y se desactiva la bandera
        if(cant.getText().isEmpty()){
            cant.setText("Cant. a comprar");
            bandera = true;
        }
    }//GEN-LAST:event_cantFocusLost

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        //Se selecciona para comprar
        int canti = Integer.parseInt(cant.getText());
        
        if (canti>0){
        conexion.Insert_pedido_equipamiento(nombre_vec[1],canti,ID_Guardar,Precio);
        
        btn_Volver2ActionPerformed(evt);
        }
        else{
            JOptionPane.showMessageDialog(null,"Cantidad invalida, por favor no ingrese un numero negativo");
            cant.setText("Cant. a comprar");
            bandera = true;
        }
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void btn_Volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver2ActionPerformed
        //Botón para volver atras
        Com_equip cE = new Com_equip();
        cE.setVisible(true);
        this.setVisible(false);
        cE.setSize(495, 458);
        cE.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_Volver2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Equipo().setVisible(true);
            }
        });
    }
    
    public void agregar_equipo(int Id){
        ID_Guardar=Id;
        ArrayList<String> array=conexion.Select_Equipo_con_Imagen(Id);
        
        
        String[] str=array.toArray(new String[0]);
        if (str[5] != null){
        
        byte[] ByteImage=Base64.getDecoder().decode(str[5]);
        
         
            // Crear un ImageIcon desde los bytes de la imagen
            ImageIcon imageIcon = new ImageIcon(ByteImage);

            // Escalar la imagen para que se ajuste al JLabel (opcional)
            Image scaledImage = imageIcon.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            // Crear JLabel y colocar la imagen
            Imagen.setIcon(scaledIcon);
        } else {
            
        }
       
        
        String Nombre=array.get(1);
        Nom.setText(Nombre);
        
        nombre_vec=Nombre.split("=");
        
        String Descripcion=array.get(2);
        Descri.setText(Descripcion);
        
        String precio=(String) array.get(3);
        Preci.setText(precio);
        
        Precio=Integer.parseInt(precio);
        
        String Link=array.get(4);
        Lin.setText(Link);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descri;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Lin;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Preci;
    private javax.swing.JButton btn_Volver2;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JTextField cant;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
