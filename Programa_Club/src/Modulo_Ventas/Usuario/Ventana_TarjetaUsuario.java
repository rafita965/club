package Modulo_Ventas.Usuario;
import Modulo_Ventas.Usuario.Gestion_Compra_Usuario;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;

/**
 *
 * @author gabiv
 */
//Gestionar tarjeta de usuario
public class Ventana_TarjetaUsuario extends javax.swing.JFrame {
    //Declaracion de variables
    private String usuarioID;
    private String productoID;
    private String fecha; 
    private int cantidadSeleccionada;
    private String opcFormaEntrega;
    private String tipoTarjeta;
    private String nombreTitular;
    private String codigoSeguridad;
    private String numerinTarjeta;
    private boolean condicion1 = false;
    private boolean condicion2 = false;
    //Constructor
    public Ventana_TarjetaUsuario(String usuarioID, String productoID, String fecha, int cantidadSeleccionada, String opcionFormaEntrega) {
        this.usuarioID = usuarioID;
        this.productoID = productoID;
        this.fecha = fecha;
        this.cantidadSeleccionada = cantidadSeleccionada;
        this.opcFormaEntrega = opcionFormaEntrega; 
        initComponents();
        Combo_TipoTarjeta.addItem("Debito");
        Combo_TipoTarjeta.addItem("Credito");
        Btn_Guardar.setEnabled(true);
        
        JTextField_NombreTitular.setDocument(new PlainDocument() {
            private static final int MAX_LENGTH = 40;

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= MAX_LENGTH && str.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]*")) {
                    super.insertString(offs, str, a);
                }
            }
        });

        JTextField_NumTarjeta.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str.matches("[0-9]*")) {
                    super.insertString(offs, str, a);
                    }
                }
            });
        JTextField_NumTarjeta.setDocument(new PlainDocument() {
            private static final int MAX_LENGTH = 16;

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= MAX_LENGTH && str.matches("[0-9]*")) {
                    super.insertString(offs, str, a);
                }
            }
        });
        /*esto sirve para llamar a la funcion de validacion cuando el usuario termino de escribir el numero
                de tarjeta*/
        JTextField_NumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                String inputText = JTextField_NumTarjeta.getText();
                if (inputText.length() == 16) {
                    Tarjeta_Usuario tarjetitaUsuario = new Tarjeta_Usuario();
                    if(tarjetitaUsuario.AnalizarEmpresa(JTextField_NumTarjeta)){
                        condicion1 = true;
                        }
                    }
                }
        });        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTextField_NumTarjeta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JTextField_NombreTitular = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JTextField_Mes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextField_Anio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JTextField_CodigoSeguridad = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Combo_TipoTarjeta = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));
        jPanel1.setLayout(null);

        jLabel2.setText("NUMERO DE TARJETA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTextField_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTextField_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 110, 406, 105);

        jLabel3.setText("APELLIDO Y NOMBRE DEL TITULAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextField_NombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTextField_NombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 230, 406, 106);

        jLabel4.setText("FECHA DE VENCIMIENTO");

        jLabel6.setText("/");

        jLabel7.setText("MES / AÑO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(JTextField_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextField_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 350, 194, 105);

        jLabel5.setText("CODIGO DE SEGURIDAD");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(JTextField_CodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTextField_CodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(230, 350, 194, 105);

        Btn_Guardar.setText("CONTINUAR");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Guardar);
        Btn_Guardar.setBounds(170, 470, 93, 23);

        jLabel8.setText("TIPO DE TARJETA");

        Combo_TipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combo_TipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(Combo_TipoTarjeta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(20, 50, 406, 42);

        jPanel7.setBackground(new java.awt.Color(31, 50, 69));

        Volver.setText("<-----");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("INGRESE DATOS DE TARJETA ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Volver)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 0, 450, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //Boton a volver forma de entrega
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Ventana_FormaEntrega ventanaFormaEntrega = new Ventana_FormaEntrega(usuarioID, productoID, fecha, cantidadSeleccionada);
        this.setVisible(false);
        ventanaFormaEntrega.setSize(450, 600);
        ventanaFormaEntrega.setLocationRelativeTo(null);
        ventanaFormaEntrega.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed
    
    //Boton guardar
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
    // Variables para las validaciones
    tipoTarjeta = (String) Combo_TipoTarjeta.getSelectedItem();
    numerinTarjeta = JTextField_NumTarjeta.getText();
    nombreTitular = JTextField_NombreTitular.getText();
    codigoSeguridad = JTextField_CodigoSeguridad.getText();
    String mes = JTextField_Mes.getText();
    String año = JTextField_Anio.getText();
    
    // Validación de todos los campos
    boolean validCodigoSeguridad = codigoSeguridad.matches("[0-9]{3}"); // 3 dígitos
    boolean validMes = mes.matches("^(0[1-9]|1[0-2])$"); // Mes entre 01 y 12
    boolean validAño = año.matches("^[0-9]{2}$") && Integer.parseInt(año) >= 24; // Año >= 24 (2024)
    boolean validNombreTitular = !nombreTitular.trim().isEmpty(); // Nombre titular no vacío
    boolean validNumTarjeta = numerinTarjeta.matches("[0-9]{16}"); // Número de tarjeta 16 dígitos
    
    // Mostrar un mensaje de error si alguna validación falla
     // Si todas las validaciones fallan
    if (!validCodigoSeguridad && !validMes && !validAño && !validNombreTitular && !validNumTarjeta) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.");
    } 
    // Mostrar un mensaje de error si alguna validación falla
    else if (!validCodigoSeguridad) {
        JOptionPane.showMessageDialog(null, "El código de seguridad debe tener exactamente 3 dígitos.");
    } else if (!validMes) {
        JOptionPane.showMessageDialog(null, "El mes debe estar entre 01 y 12.");
    } else if (!validAño) {
        JOptionPane.showMessageDialog(null, "El año debe ser 2024 o posterior.");
    } else if (!validNombreTitular) {
        JOptionPane.showMessageDialog(null, "El nombre del titular no puede estar vacío.");
    } else if (!validNumTarjeta) {
        JOptionPane.showMessageDialog(null, "El número de tarjeta debe tener exactamente 16 dígitos.");
    } else {
        // Si todas las validaciones son correctas, habilitar el botón y continuar con la siguiente ventana
        Ventana_FinalizarCompra ventanaFinCompra = new Ventana_FinalizarCompra(usuarioID, productoID, fecha, cantidadSeleccionada, opcFormaEntrega, tipoTarjeta, numerinTarjeta, nombreTitular, codigoSeguridad);
        this.setVisible(false);
        ventanaFinCompra.setSize(450, 650);
        ventanaFinCompra.setLocationRelativeTo(null);
        ventanaFinCompra.setVisible(true);
    }
                  

    }//GEN-LAST:event_Btn_GuardarActionPerformed
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
            java.util.logging.Logger.getLogger(Ventana_TarjetaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_TarjetaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_TarjetaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_TarjetaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fol
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JComboBox<String> Combo_TipoTarjeta;
    private javax.swing.JTextField JTextField_Anio;
    private javax.swing.JTextField JTextField_CodigoSeguridad;
    private javax.swing.JTextField JTextField_Mes;
    private javax.swing.JTextField JTextField_NombreTitular;
    private javax.swing.JTextField JTextField_NumTarjeta;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}