package Modulo_Ventas.Usuario;
import Modulo_Ventas.Pantalla_Ventas;
import Modulo_Ventas.Usuario.VerificarBotonMenuUsuario;
import ModuloUsuarios1.MainUsuario;
import programa_club.Main;

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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Comprar = new javax.swing.JButton();
        Btn_PedirReembolso = new javax.swing.JButton();
        Btn_CancelarReembolso = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Btn_Comprar.setText("Comprar producto");
        Btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ComprarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Comprar);
        Btn_Comprar.setBounds(124, 76, 129, 23);

        Btn_PedirReembolso.setText("Pedir Reembolso");
        Btn_PedirReembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PedirReembolsoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_PedirReembolso);
        Btn_PedirReembolso.setBounds(124, 128, 129, 23);

        Btn_CancelarReembolso.setText("Cancelar Reembolso");
        Btn_CancelarReembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarReembolsoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_CancelarReembolso);
        Btn_CancelarReembolso.setBounds(124, 183, 129, 23);

        Volver.setText("<--");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver);
        Volver.setBounds(10, 11, 62, 23);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 380, 240);

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("MENÚ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 380, 50);

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
        vCTU.setSize(1000, 500);
        vCTU.setLocationRelativeTo(null);
        vCTU.setVisible(true); 
    }//GEN-LAST:event_Btn_ComprarActionPerformed

    //Boton ingreso a pedir reembolso
    private void Btn_PedirReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PedirReembolsoActionPerformed
        Solicitud_Reembolso_Usuario vRU = new Solicitud_Reembolso_Usuario(usuarioID);
            this.setVisible(false);
            vRU.setSize(820, 460);
            vRU.setLocationRelativeTo(null);
            vRU.setVisible(true); 
    }//GEN-LAST:event_Btn_PedirReembolsoActionPerformed
 
    //Boton ingreso a cancelar reembolso
    private void Btn_CancelarReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarReembolsoActionPerformed
        Cancelar_Reembolso_Usuario vCU = new Cancelar_Reembolso_Usuario(usuarioID);
        this.setVisible(false);
        vCU.setSize(610, 440);
        vCU.setLocationRelativeTo(null);
        vCU.setVisible(true); 
    }//GEN-LAST:event_Btn_CancelarReembolsoActionPerformed

    //Boton a volver Ingreso de usuario
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
            
            MainUsuario vV= new MainUsuario(Integer.parseInt(usuarioID));
            this.setVisible(false);
            vV.setVisible(true);
            vV.setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
