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

        Volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Btn_Comprar = new javax.swing.JButton();
        Btn_PedirReembolso = new javax.swing.JButton();
        Btn_CancelarReembolso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Volver.setText("<--");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_CancelarReembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_PedirReembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Btn_CancelarReembolso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Btn_PedirReembolso))
                    .addComponent(Btn_Comprar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Volver)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        vCTU.setSize(1000, 500);
        vCTU.setLocationRelativeTo(null);
        vCTU.setVisible(true); 
    }//GEN-LAST:event_Btn_ComprarActionPerformed

    //Boton ingreso a pedir reembolso
    private void Btn_PedirReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PedirReembolsoActionPerformed
        Solicitud_Reembolso_Usuario vRU = new Solicitud_Reembolso_Usuario(usuarioID);
            this.setVisible(false);
            vRU.setSize(815, 430);
            vRU.setLocationRelativeTo(null);
            vRU.setVisible(true); 
    }//GEN-LAST:event_Btn_PedirReembolsoActionPerformed
 
    //Boton ingreso a cancelar reembolso
    private void Btn_CancelarReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarReembolsoActionPerformed
        Cancelar_Reembolso_Usuario vCU = new Cancelar_Reembolso_Usuario(usuarioID);
        this.setVisible(false);
        vCU.setSize(610, 450);
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
