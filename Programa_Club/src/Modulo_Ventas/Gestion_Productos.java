/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas;
import javax.swing.JOptionPane; // Para el uso de diálogos
import Modulo_Ventas.CrudProducto; // Ajusta el paquete según sea necesario
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.text.AbstractDocument;
import javax.swing.JTextField;

/**
 *
 * @author tm_galli
 */
//Gestionar Productos
public class Gestion_Productos extends javax.swing.JFrame {
    //Declaracion de variables
    private CrudProducto crudProducto;
    //Constructor
    public Gestion_Productos() {
        initComponents();
        crudProducto = new CrudProducto();
        crudProducto.cargarProductos(ComboBoxCategoria); // Cargar categorías
        crudProducto.MostrarProductos(TablaProductos); // Mostrar productos
        configurarFiltros();
        configurarValidadores();
        configurarBotones();
    }

    private void configurarFiltros() {
        JTextField_IDProducto.setEnabled(false);
        ((AbstractDocument) JTextField_nombreProducto.getDocument()).setDocumentFilter(new LimitDocumentFilter(30));
        ((AbstractDocument) JTextField_precioProducto.getDocument()).setDocumentFilter(new NumerosYDecimalesFilter(10));
        ((AbstractDocument) JTextField_StockProducto.getDocument()).setDocumentFilter(new NumerosSoloFilter(5));
    }

    private void configurarValidadores() {
        DocumentListener validador = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { validarCampos(); }
            public void removeUpdate(DocumentEvent e) { validarCampos(); }
            public void changedUpdate(DocumentEvent e) { validarCampos(); }
        };
        JTextField_nombreProducto.getDocument().addDocumentListener(validador);
        JTextField_precioProducto.getDocument().addDocumentListener(validador);
        JTextField_StockProducto.getDocument().addDocumentListener(validador);
        validarCampos(); // Validación inicial
    }

    private void configurarBotones() {
        Btn_Guardar.setEnabled(false);
        Btn_Mod.setEnabled(false);
        Btn_Eliminar.setEnabled(false);
    }

    private void validarCampos() {
        String nombre = JTextField_nombreProducto.getText().trim();
        String precio = JTextField_precioProducto.getText().trim();
        String stock = JTextField_StockProducto.getText().trim();

        boolean habilitar = !nombre.isEmpty() && esNumerico(precio) && esNumerico(stock);
        Btn_Guardar.setEnabled(habilitar);
    }

    private boolean esNumerico(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Filtros para validación de entrada
    public class LimitDocumentFilter extends DocumentFilter {
        private int limit;
        public LimitDocumentFilter(int limit) { this.limit = limit; }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);
            if (newText.length() <= limit) super.replace(fb, offset, length, text, attrs);
        }
    }

    public class NumerosYDecimalesFilter extends DocumentFilter {
        private int maxLength;

        public NumerosYDecimalesFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);

            // Validar que el texto sea un número válido y no exceda la longitud máxima
            if (newText.matches("\\d*\\.?\\d{0,2}") && newText.length() <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    public class NumerosSoloFilter extends DocumentFilter {
        private int maxLength;

        public NumerosSoloFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);

            // Validar que el texto sea un número y no exceda la longitud máxima
            if (newText.matches("\\d*") && newText.length() <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Mod = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        JTextField_IDProducto = new javax.swing.JTextField();
        JTextField_nombreProducto = new javax.swing.JTextField();
        JTextField_precioProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTextField_StockProducto = new javax.swing.JTextField();
        ComboBoxCategoria = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(870, 410));
        setResizable(false);
        setSize(new java.awt.Dimension(870, 410));

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));
        jPanel1.setMaximumSize(new java.awt.Dimension(213, 368));

        Btn_Guardar.setText("Agregar producto");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Mod.setText("Modificar producto");
        Btn_Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModActionPerformed(evt);
            }
        });

        Btn_Eliminar.setText("Eliminar producto");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        JTextField_IDProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextField_IDProductoMouseClicked(evt);
            }
        });
        JTextField_IDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_IDProductoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("ID");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Stock");

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Precio");

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Btn_Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextField_nombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(JTextField_IDProducto)))
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextField_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextField_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(JTextField_StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTextField_precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Mod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Eliminar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

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
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(31, 50, 69));

        Volver.setText("<--");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Gestión de Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(jLabel6)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Boton Eliminar
    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "¿Estás seguro de que deseas eliminar este producto?",
        "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                CrudProducto objetoProducto = new CrudProducto();
                objetoProducto.EliminarProducto(JTextField_IDProducto);
                objetoProducto.MostrarProductos(TablaProductos); // Actualizar la tabla
                objetoProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto, JTextField_precioProducto, JTextField_StockProducto, ComboBoxCategoria);
            } catch (Exception e) {
                System.err.println("Error al eliminar el producto: " + e.getMessage());
            }
        } else {
            // Si el usuario selecciona "No", no se realiza ninguna acción.
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Acción cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
        TablaProductos.clearSelection();
    }//GEN-LAST:event_Btn_EliminarActionPerformed
    
    //Boton Modificar
    private void Btn_ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModActionPerformed
        String nombreOriginal = crudProducto.obtenerNombreOriginal(JTextField_IDProducto.getText());
        String precioOriginal = crudProducto.obtenerPrecioOriginal(JTextField_IDProducto.getText());
        String stockOriginal = crudProducto.obtenerStockOriginal(JTextField_IDProducto.getText());

        if (nombreOriginal.equals(JTextField_nombreProducto.getText()) &&
            precioOriginal.equals(JTextField_precioProducto.getText()) &&
            stockOriginal.equals(JTextField_StockProducto.getText())) {
            JOptionPane.showMessageDialog(null, "No se detectaron cambios en el producto.");
            crudProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto,JTextField_precioProducto, JTextField_StockProducto,  ComboBoxCategoria);

        } else {
            crudProducto.ModificarProducto(JTextField_IDProducto, JTextField_nombreProducto, JTextField_precioProducto, JTextField_StockProducto, ComboBoxCategoria);
            crudProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto,JTextField_precioProducto, JTextField_StockProducto,  ComboBoxCategoria);
            actualizarVista();
        }
        TablaProductos.clearSelection();
    }//GEN-LAST:event_Btn_ModActionPerformed
    
    //Boton Guardar
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
    // Obtener el ID de la categoría desde el ComboBox
    int idCategoria = ComboBoxCategoria.getSelectedIndex()+1; // O usar otro método si es necesario
    System.out.print(idCategoria);
    if (JTextField_nombreProducto.getText().isEmpty() || JTextField_precioProducto.getText().isEmpty() || JTextField_StockProducto.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Completar los datos faltantes.");
    } else if (crudProducto.existeProductoConNombreYCategoria(JTextField_nombreProducto.getText(), idCategoria)) {
        JOptionPane.showMessageDialog(null, "El producto con este nombre y categoría ya existe.");
        crudProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto, JTextField_precioProducto, JTextField_StockProducto, ComboBoxCategoria);
    } else {
        crudProducto.InsertarProducto(JTextField_nombreProducto, JTextField_StockProducto, JTextField_precioProducto, ComboBoxCategoria);
        actualizarVista();
        crudProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto, JTextField_precioProducto, JTextField_StockProducto, ComboBoxCategoria);
    }
    TablaProductos.clearSelection();

    }//GEN-LAST:event_Btn_GuardarActionPerformed
    
    //Boton Volver
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Pantalla_Ventas vV= new Pantalla_Ventas();
        this.setVisible(false);
        vV.setVisible(true);
        vV.setLocationRelativeTo(null);
        //vV.setSize(400,440);
    }//GEN-LAST:event_VolverActionPerformed
    
    private void JTextField_IDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_IDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_IDProductoActionPerformed

    private void JTextField_IDProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextField_IDProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_IDProductoMouseClicked
    
    //Seleccionar producto
    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
       crudProducto.SeleccionarProducto(TablaProductos, JTextField_IDProducto, JTextField_nombreProducto, JTextField_StockProducto, JTextField_precioProducto, ComboBoxCategoria);
        habilitarBotones();
    }//GEN-LAST:event_TablaProductosMouseClicked
    
    private void actualizarVista() {
        crudProducto.MostrarProductos(TablaProductos);
        crudProducto.LimpiarCampos(JTextField_IDProducto, JTextField_nombreProducto, JTextField_precioProducto, JTextField_StockProducto, ComboBoxCategoria);
        deshabilitarBotones();
    }
    
    private void deshabilitarBotones() {
        Btn_Mod.setEnabled(false);
        Btn_Eliminar.setEnabled(false);
    }
    
    private void habilitarBotones() {
        Btn_Mod.setEnabled(true);
        Btn_Eliminar.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(Gestion_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Mod;
    private javax.swing.JComboBox ComboBoxCategoria;
    private javax.swing.JTextField JTextField_IDProducto;
    private javax.swing.JTextField JTextField_StockProducto;
    private javax.swing.JTextField JTextField_nombreProducto;
    private javax.swing.JTextField JTextField_precioProducto;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
