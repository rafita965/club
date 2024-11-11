package Modulo_Ventas;

import programa_club.Main;
import Modulo_Ventas.Gestion_Productos;
import Modulo_Ventas.Gestion_Categorias;
import Modulo_Ventas.Gestion_Descuento;
import Modulo_Ventas.Gestion_Reembolso;
import Modulo_Ventas.VerificarBotonMenu;
import Modulo_Ventas.Usuario.Ingreso_Usuario;
import Modulo_Ventas.Gestion_Pedidos;

//Gestionar menu
public class Pantalla_Ventas extends javax.swing.JFrame {
    //Declaracion de variables
    private final VerificarBotonMenu consultasBDD = new VerificarBotonMenu();
    //Constructor
    public Pantalla_Ventas() {
        initComponents();
        verificarBotones();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Gestionar_VentaProductos = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Btn_Gestionar_Productos = new javax.swing.JButton();
        Btn_Gestionar_Descuento = new javax.swing.JButton();
        Btn_Gestionar_Categoria = new javax.swing.JButton();
        Btn_Gestionar_Reembolso = new javax.swing.JButton();
        Btn_Gestionar_VistaUsuario = new javax.swing.JButton();
        Btn_Gestionar_Pedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("      Gestion de Ventas");

        Btn_Gestionar_VentaProductos.setText("Gestionar Venta de Productos");
        Btn_Gestionar_VentaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_VentaProductosActionPerformed(evt);
            }
        });

        Volver.setText("<--");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Btn_Gestionar_Productos.setText("Gestionar Productos");
        Btn_Gestionar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_ProductosActionPerformed(evt);
            }
        });

        Btn_Gestionar_Descuento.setText("Gestionar Descuentos");
        Btn_Gestionar_Descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_DescuentoActionPerformed(evt);
            }
        });

        Btn_Gestionar_Categoria.setText("Gestionar Categoria");
        Btn_Gestionar_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_CategoriaActionPerformed(evt);
            }
        });

        Btn_Gestionar_Reembolso.setText("Gestionar Reembolso");
        Btn_Gestionar_Reembolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_ReembolsoActionPerformed(evt);
            }
        });

        Btn_Gestionar_VistaUsuario.setText("Vista Usuario(Momentaneo)");
        Btn_Gestionar_VistaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_VistaUsuarioActionPerformed(evt);
            }
        });

        Btn_Gestionar_Pedidos.setText("Gestionar Pedidos");
        Btn_Gestionar_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestionar_PedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Gestionar_VentaProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_Descuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_Reembolso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_VistaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Gestionar_Pedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(Volver))
                .addGap(55, 55, 55)
                .addComponent(Btn_Gestionar_Categoria)
                .addGap(18, 18, 18)
                .addComponent(Btn_Gestionar_Productos)
                .addGap(18, 18, 18)
                .addComponent(Btn_Gestionar_Descuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Gestionar_VentaProductos)
                .addGap(18, 18, 18)
                .addComponent(Btn_Gestionar_Pedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Gestionar_Reembolso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Gestionar_VistaUsuario)
                .addContainerGap(84, Short.MAX_VALUE))
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
    
    //Verificar botones
    private void verificarBotones() {
        Btn_Gestionar_Categoria.setEnabled(true);
        Btn_Gestionar_Productos.setEnabled(consultasBDD.existeCategoria());
        boolean hayProductos = consultasBDD.existeProducto();
        Btn_Gestionar_Descuento.setEnabled(hayProductos);
        Btn_Gestionar_VentaProductos.setEnabled(hayProductos);        
        boolean hayPedidos = consultasBDD.existePedido();
        Btn_Gestionar_Pedidos.setEnabled(hayPedidos);
        boolean hayReembolsos = consultasBDD.existeReembolso();
        Btn_Gestionar_Reembolso.setEnabled(hayReembolsos);
    }
    
    //Boton gestionar
    private void Btn_Gestionar_VentaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_VentaProductosActionPerformed
        Gestion_VentaProductos vGVP = new Gestion_VentaProductos();
        this.setVisible(false);
        vGVP.setSize(1000,600);
        vGVP.setLocationRelativeTo(null);
        vGVP.setVisible(true);
    }//GEN-LAST:event_Btn_Gestionar_VentaProductosActionPerformed

    //Boton volver al menu principal
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Main vM = new Main();
        this.setVisible(false);
        vM.setSize(500,500);
        vM.setLocationRelativeTo(null);
        vM.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    //Boton ingresar al gestion de productos
    private void Btn_Gestionar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_ProductosActionPerformed
        // TODO add your handling code here:
        Gestion_Productos  vP = new Gestion_Productos();
        this.setVisible(false);
        vP.setSize(1300,600);
        vP.setLocationRelativeTo(null);
        vP.setVisible(true); 
    }//GEN-LAST:event_Btn_Gestionar_ProductosActionPerformed

    //Boton ingresar al gestion de descuentos
    private void Btn_Gestionar_DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_DescuentoActionPerformed
        Gestion_Descuento  vD = new Gestion_Descuento();
        this.setVisible(false);
        vD.setSize(1000,600);
        vD.setLocationRelativeTo(null);
        vD.setVisible(true); 
    }//GEN-LAST:event_Btn_Gestionar_DescuentoActionPerformed

    //Boton ingresar al gestion de categorias
    private void Btn_Gestionar_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_CategoriaActionPerformed
        // TODO add your handling code here:
        Gestion_Categorias  vC = new Gestion_Categorias();
        this.setVisible(false);
        vC.setSize(1300,700);
        vC.setLocationRelativeTo(null);
        vC.setVisible(true); 
    }//GEN-LAST:event_Btn_Gestionar_CategoriaActionPerformed

    //Boton de gestionar reembolsos
    private void Btn_Gestionar_ReembolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_ReembolsoActionPerformed
        Gestion_Reembolso  vR = new Gestion_Reembolso();
        this.setVisible(false);
        vR.setSize(1300,700);
        vR.setLocationRelativeTo(null);
        vR.setVisible(true);
    }//GEN-LAST:event_Btn_Gestionar_ReembolsoActionPerformed

    //Boton de ingreso a la vista usuario(MOMENTANEO)
    private void Btn_Gestionar_VistaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_VistaUsuarioActionPerformed
        Ingreso_Usuario  vIU = new Ingreso_Usuario();
        this.setVisible(false);
        vIU.setSize(350,370);
        vIU.setLocationRelativeTo(null);
        vIU.setVisible(true); 
    }//GEN-LAST:event_Btn_Gestionar_VistaUsuarioActionPerformed

    //Boton gestionar pedidos
    private void Btn_Gestionar_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestionar_PedidosActionPerformed
        Gestion_Pedidos  vP = new Gestion_Pedidos();
        this.setVisible(false);
        vP.setSize(1300,700);
        vP.setLocationRelativeTo(null);
        vP.setVisible(true);
    }//GEN-LAST:event_Btn_Gestionar_PedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Gestionar_Categoria;
    private javax.swing.JButton Btn_Gestionar_Descuento;
    private javax.swing.JButton Btn_Gestionar_Pedidos;
    private javax.swing.JButton Btn_Gestionar_Productos;
    private javax.swing.JButton Btn_Gestionar_Reembolso;
    private javax.swing.JButton Btn_Gestionar_VentaProductos;
    private javax.swing.JButton Btn_Gestionar_VistaUsuario;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
