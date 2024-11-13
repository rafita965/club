/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas.Usuario;
import Modulo_Ventas.Usuario.Ingreso_Usuario;
import Modulo_Ventas.Pantalla_Ventas;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modulo_Ventas.ConexionBDD;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
/**
 *
 * @author thiag
 */
//Gestionar compra de usuario
public class Gestion_Compra_Usuario extends javax.swing.JFrame {
    //Declaracion de variables
    private String usuarioID; 
    private String productoID;
    private int cantidadSeleccionada;
    private static final Logger logger = Logger.getLogger(Gestion_Compra_Usuario.class.getName());
    //Constructor
    public Gestion_Compra_Usuario(String usuarioID) {
        this.usuarioID = usuarioID;
        initComponents();
        datechooser_Fecha.setDate(new java.util.Date()); 
        datechooser_Fecha.setVisible(false); 
        Btn_ID.setVisible(false); 
        Btn_Nombre.setEnabled(false);
        Btn_Categoria.setEnabled(false);
        Btn_Precio.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Funciones_Usuario compra_usuario = new Funciones_Usuario(); // Inicializar compra_usuario
        compra_usuario.MostrarProductos(TablaProductos); // Mostrar productos   
        TablaProductos.getSelectionModel().addListSelectionListener(e -> activarBotonGuardar());
        JTextField_Cantidad.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                activarBotonGuardar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                activarBotonGuardar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                activarBotonGuardar();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VolverPantalla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Btn_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Categoria = new javax.swing.JTextField();
        Btn_ID = new javax.swing.JTextField();
        datechooser_Fecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Btn_Precio = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTextField_Cantidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        VolverPantalla.setText("<--");
        VolverPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverPantallaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Categoria");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Precio");

        Btn_Guardar.setText("Comprar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Cantidad");

        JTextField_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTextField_Cantidad)
                            .addComponent(Btn_Precio)
                            .addComponent(Btn_Nombre)
                            .addComponent(datechooser_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Categoria))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(Btn_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datechooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Guardar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(47, 94, 141));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText(" PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(VolverPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382)
                .addComponent(jLabel5)
                .addGap(417, 417, 417))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverPantalla)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Activar boton de Guardar
    private void activarBotonGuardar() {
        int filaSeleccionada = TablaProductos.getSelectedRow();  
        if (filaSeleccionada != -1) {
            String productoSeleccionado = (String) TablaProductos.getValueAt(filaSeleccionada, 0);  // Supongamos que el producto está en la primera columna
            String cantidadText = JTextField_Cantidad.getText();
            // Verificar si el producto está seleccionado y si la cantidad es válida
            if (productoSeleccionado != null && !productoSeleccionado.isEmpty() && !cantidadText.isEmpty()) {
                try {
                    int cantidad = Integer.parseInt(cantidadText);
                    if (cantidad > 0) {
                        Btn_Guardar.setEnabled(true);  
                    } else {
                        Btn_Guardar.setEnabled(false); 
                    }
                } catch (NumberFormatException ex) {
                    Btn_Guardar.setEnabled(false);  
                }
            } else {
                Btn_Guardar.setEnabled(false);  
            }
        } else {
            Btn_Guardar.setEnabled(false);  
        }
    }
    //Boton volver al menu de usuario
    private void VolverPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverPantallaActionPerformed
        Menu_Usuario vMU = new Menu_Usuario(usuarioID);
        this.setVisible(false);
        vMU.setSize(380, 320);
        vMU.setLocationRelativeTo(null);
        vMU.setVisible(true); 
    }//GEN-LAST:event_VolverPantallaActionPerformed
    
    //Seleccionar producto
    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
    int filaSeleccionada = TablaProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtiene el ProductoID de la fila seleccionada
            productoID = TablaProductos.getValueAt(filaSeleccionada, 0).toString();
            
            // Establece la fecha actual
            datechooser_Fecha.setDate(new java.util.Date());
            // Llama a SeleccionarProducto y pasa los JTextField
            Funciones_Usuario objetoUsuario = new Funciones_Usuario();
            objetoUsuario.SeleccionarProducto(TablaProductos, Btn_ID, Btn_Nombre, Btn_Precio, Btn_Categoria);
        }
    }//GEN-LAST:event_TablaProductosMouseClicked
    
    //Boton de guardar
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (productoID != null && !productoID.isEmpty()) {
            String cantidadTexto = JTextField_Cantidad.getText();
            int cantidadSeleccionada = 0; 

            try {
                cantidadSeleccionada = Integer.parseInt(cantidadTexto);
                if (cantidadSeleccionada <= 0) {
                    JOptionPane.showMessageDialog(this, "Por favor, selecciona una cantidad válida antes de continuar.");
                    return;
                }
                Funciones_Usuario compraUsuario = new Funciones_Usuario();
                int idProducto = Integer.parseInt(productoID);
                int stockDisponible = compraUsuario.obtenerStockProducto(idProducto);
                if (cantidadSeleccionada > stockDisponible) {
                    JOptionPane.showMessageDialog(this, "No hay suficiente stock disponible. Stock actual: " + stockDisponible, "Error", JOptionPane.ERROR_MESSAGE);
                    return; 
                }
                if (datechooser_Fecha.getDate() != null) {
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                    String fechaString = formatoFecha.format(datechooser_Fecha.getDate());
                    Ventana_FormaEntrega ventanaCompra = new Ventana_FormaEntrega(usuarioID, productoID, fechaString, cantidadSeleccionada);
                    ventanaCompra.setSize(450, 600);
                    ventanaCompra.setLocationRelativeTo(null);
                    ventanaCompra.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha para la compra.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para comprar.");
        }
        TablaProductos.clearSelection();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void JTextField_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CantidadActionPerformed
        String cantidadTexto = JTextField_Cantidad.getText(); 
        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (productoID != null && !productoID.isEmpty()) {
                Funciones_Usuario compraUsuario = new Funciones_Usuario();
                int idProducto = Integer.parseInt(productoID);
                int stockDisponible = compraUsuario.obtenerStockProducto(idProducto);
                if (cantidad > stockDisponible) {
                    JOptionPane.showMessageDialog(this, "No hay suficiente stock disponible. Stock actual: " + stockDisponible, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    cantidadSeleccionada = cantidad; 
                    JOptionPane.showMessageDialog(this, "Cantidad seleccionada: " + cantidadSeleccionada);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para verificar el stock.", "Error", JOptionPane.ERROR_MESSAGE);            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTextField_CantidadActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_Compra_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Compra_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Compra_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Compra_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Btn_Categoria;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JTextField Btn_ID;
    private javax.swing.JTextField Btn_Nombre;
    private javax.swing.JTextField Btn_Precio;
    private javax.swing.JTextField JTextField_Cantidad;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton VolverPantalla;
    private com.toedter.calendar.JDateChooser datechooser_Fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
