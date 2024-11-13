package Modulo_Ventas.Usuario;
import Modulo_Ventas.Usuario.Reembolso_Usuario;
import Modulo_Ventas.Pantalla_Ventas;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AttributeSet;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
/**
 *
 * @author tm_galli
 */
//Gestionar solicitud de reembolso
public class Solicitud_Reembolso_Usuario extends javax.swing.JFrame {
    //Declaracion de variables
    private Reembolso_Usuario objetoReembolso = new Reembolso_Usuario();
    private String usuarioID; // Variable para almacenar el ID del usuario
    private String IDPedidoSeleccionado;
    private Reembolso_Usuario reembolsoUsuario;
    private boolean updating = false;
    //Constructor
    public Solicitud_Reembolso_Usuario(String usuarioID) {
        initComponents();
        this.usuarioID = usuarioID;
        reembolsoUsuario = new Reembolso_Usuario();
        reembolsoUsuario.MostrarProductos(TablaPedidos, usuarioID);
        datechooser_Fecha.setDate(new java.util.Date()); 
        datechooser_Fecha.setVisible(false);
        JTextField_ID.setVisible(false); 
        JTextField_Nombre.setEnabled(false);
        JTextField_Categoria.setEnabled(false);
        JTextField_Precio.setEnabled(false);
        JTextField_Cantidad.setEnabled(false); 
        habilitarBotonConfirmar();
       ((AbstractDocument) JTextField_Motivo.getDocument()).setDocumentFilter(new LetrasSoloLimitFilter(16));
        TablaPedidos.getSelectionModel().addListSelectionListener(e -> habilitarBotonConfirmar());
        JTextField_Motivo.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                habilitarBotonConfirmar();
            }

            public void removeUpdate(DocumentEvent e) {
                habilitarBotonConfirmar();
            }

            public void changedUpdate(DocumentEvent e) {
                habilitarBotonConfirmar();
            }
        });
        JTextField_Motivo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarMotivo(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarMotivo(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarMotivo(e);
            }
        });
    }
    // Clase para permitir solo letras y limitar la longitud a un máximo de caracteres
    private class LetrasSoloLimitFilter extends DocumentFilter {
        private final int maxLength;

        public LetrasSoloLimitFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (fb.getDocument().getLength() + string.length() <= maxLength && string.matches("[a-zA-ZáéíóúÁÉÍÓÚ]+")) {
                super.insertString(fb, offset, string, attr);
            } else {
                Toolkit.getDefaultToolkit().beep(); // Da una señal si se intenta ingresar caracteres no válidos
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (fb.getDocument().getLength() - length + text.length() <= maxLength && text.matches("[a-zA-ZáéíóúÁÉÍÓÚ]+")) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                Toolkit.getDefaultToolkit().beep(); // Da una señal si se intenta ingresar caracteres no válidos
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VolverPantalla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JTextField_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextField_Nombre = new javax.swing.JTextField();
        JTextField_Precio = new javax.swing.JTextField();
        JTextField_Motivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datechooser_Fecha = new com.toedter.calendar.JDateChooser();
        Btn_Confirmar = new javax.swing.JButton();
        JTextField_Categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTextField_Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("SOLICITUD DE REEMBOLSO");

        VolverPantalla.setText("<--");
        VolverPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverPantallaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Motivo");

        Btn_Confirmar.setText("Reembolsar");
        Btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfirmarActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria");

        jLabel6.setText("Cantidad");

        TablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPedidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Btn_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datechooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datechooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(Btn_Confirmar)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VolverPantalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método de validación para el campo Motivo
    public void validarMotivo(DocumentEvent e) {
        if (updating) return;  // Evitar recursividad si estamos actualizando el campo

        try {
            updating = true; // Iniciar la actualización
            String text = JTextField_Motivo.getText(); // Obtener el texto del campo

            // Validar si el texto contiene números
            if (text.matches(".*\\d.*")) { // Si contiene números
                // Si contiene números, limpiamos el campo o ponemos un mensaje de advertencia
                JTextField_Motivo.setText(""); // Ejemplo: Limpiar el texto
                JOptionPane.showMessageDialog(this, "El motivo no puede contener números.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            // También puedes agregar más validaciones si es necesario (por ejemplo, para textos vacíos).
        } finally {
            updating = false; // Restablecer el flag
        }
    }
    //Habilita boton confirmar
    private void habilitarBotonConfirmar() {
        boolean pedidoSeleccionado = TablaPedidos.getSelectedRow() != -1; // Verifica si hay una fila seleccionada
        boolean motivoEscrito = !JTextField_Motivo.getText().trim().isEmpty(); // Verifica si el campo de texto no está vacío
        Btn_Confirmar.setEnabled(pedidoSeleccionado && motivoEscrito);
    }
    //Boton confirmar
    private void Btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfirmarActionPerformed
        objetoReembolso.InsertarMotivo(JTextField_Motivo, datechooser_Fecha);
        JTextField_Nombre.setText(""); // Limpia el campo de texto
        JTextField_Precio.setText("");
        JTextField_Categoria.setText("");
        JTextField_Cantidad.setText("");  
        JTextField_Motivo.setText("");
        Btn_Confirmar.setEnabled(false);
        TablaPedidos.clearSelection();
        reembolsoUsuario.MostrarProductos(TablaPedidos, usuarioID);
    }//GEN-LAST:event_Btn_ConfirmarActionPerformed
    
    //Volver a la pantalla de usuario
    private void VolverPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverPantallaActionPerformed
        Menu_Usuario vMU = new Menu_Usuario(usuarioID);
        this.setVisible(false);
        vMU.setSize(380, 320);
        vMU.setLocationRelativeTo(null);
        vMU.setVisible(true);
    }//GEN-LAST:event_VolverPantallaActionPerformed
    
    //Seleccionar pedido
    private void TablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPedidosMouseClicked
        int filaSeleccionada = TablaPedidos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idPedido = Integer.parseInt(TablaPedidos.getValueAt(filaSeleccionada, 0).toString());
            System.out.println("IDPedido seleccionado: " + idPedido);

            objetoReembolso.setIDPedidoSeleccionado(idPedido);
            objetoReembolso.SeleccionarProducto(TablaPedidos, JTextField_ID, JTextField_Nombre, JTextField_Precio, JTextField_Categoria, JTextField_Cantidad);
        }
    }//GEN-LAST:event_TablaPedidosMouseClicked

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
            java.util.logging.Logger.getLogger(Solicitud_Reembolso_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Reembolso_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Reembolso_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Reembolso_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Confirmar;
    private javax.swing.JTextField JTextField_Cantidad;
    private javax.swing.JTextField JTextField_Categoria;
    private javax.swing.JTextField JTextField_ID;
    private javax.swing.JTextField JTextField_Motivo;
    private javax.swing.JTextField JTextField_Nombre;
    private javax.swing.JTextField JTextField_Precio;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JButton VolverPantalla;
    private com.toedter.calendar.JDateChooser datechooser_Fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
