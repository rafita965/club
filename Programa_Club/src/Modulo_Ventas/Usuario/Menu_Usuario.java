package Modulo_Ventas.Usuario;
import Modulo_Ventas.Pantalla_Ventas;
import Modulo_Ventas.Usuario.VerificarBotonMenuUsuario;

/**
 *
 * @author tm_galli
 */
//Gestionar menu de usuario
public class Menu_Usuario extends javax.swing.JFrame {
    //Declaracion de variables
    private String usuarioID;
    private final VerificarBotonMenuUsuario consultasBDD = new VerificarBotonMenuUsuario();
    //Constructor
    public Menu_Usuario(String usuarioID) {
        this.usuarioID = usuarioID;
        initComponents();
        verificarBotones();
        System.out.println("ID del usuario en Menu_Usuario: " + this.usuarioID);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Comprar = new javax.swing.JButton();
        Btn_PedirReembolso = new javax.swing.JButton();
        Btn_CancelarReembolso = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Comprar.setText("Comprar producto");
        Btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ComprarActionPerformed(evt);
            }
        });

        Btn_PedirReembolso.setText("Pedir Reembolso");
        Btn_PedirReembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PedirReembolsoActionPerformed(evt);
            }
        });

        Btn_CancelarReembolso.setText("Cancelar Reembolso");
        Btn_CancelarReembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarReembolsoActionPerformed(evt);
            }
        });

        Volver.setText("<--");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_PedirReembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CancelarReembolso))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Btn_Comprar)
                .addGap(26, 26, 26)
                .addComponent(Btn_PedirReembolso)
                .addGap(30, 30, 30)
                .addComponent(Btn_CancelarReembolso)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Verificar la existencia de Producto y Reembolso
    private void verificarBotones() {
        Btn_Comprar.setEnabled(consultasBDD.existeProducto());

        boolean hayProductos = consultasBDD.existePedidoUsuario(usuarioID);
        Btn_PedirReembolso.setEnabled(hayProductos);
        
        boolean hayReembolsos = consultasBDD.existeReembolsoUsuario(usuarioID);
        Btn_CancelarReembolso.setEnabled(hayReembolsos);
    }
    
    //Boton ingreso a compra de usuario
    private void Btn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ComprarActionPerformed
        Gestion_Compra_Usuario vCTU = new Gestion_Compra_Usuario(usuarioID);
        this.setVisible(false);
        vCTU.setSize(1000, 600);
        vCTU.setLocationRelativeTo(null);
        vCTU.setVisible(true); 
    }//GEN-LAST:event_Btn_ComprarActionPerformed

    //Boton ingreso a pedir reembolso
    private void Btn_PedirReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PedirReembolsoActionPerformed
        Solicitud_Reembolso_Usuario vRU = new Solicitud_Reembolso_Usuario(usuarioID);
            this.setVisible(false);
            vRU.setSize(1000, 600);
            vRU.setLocationRelativeTo(null);
            vRU.setVisible(true); 
    }//GEN-LAST:event_Btn_PedirReembolsoActionPerformed
 
    //Boton ingreso a cancelar reembolso
    private void Btn_CancelarReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarReembolsoActionPerformed
        Cancelar_Reembolso_Usuario vCU = new Cancelar_Reembolso_Usuario(usuarioID);
            this.setVisible(false);
            vCU.setSize(1000, 600);
            vCU.setLocationRelativeTo(null);
            vCU.setVisible(true); 
    }//GEN-LAST:event_Btn_CancelarReembolsoActionPerformed

    //Boton a volver Ingreso de usuario
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Ingreso_Usuario  vIU = new Ingreso_Usuario();
        this.setVisible(false);
        vIU.setSize(350,370);
        vIU.setLocationRelativeTo(null);
        vIU.setVisible(true); 
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CancelarReembolso;
    private javax.swing.JButton Btn_Comprar;
    private javax.swing.JButton Btn_PedirReembolso;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables
}
