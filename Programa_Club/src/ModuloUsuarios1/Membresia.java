/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloUsuarios1;

import static ModuloUsuarios1.DatabaseConnection.actualizarMembresia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Membresia extends javax.swing.JFrame {

    /**
     * Creates new form Membresia
     */
    private int IDUsuario;
    public Membresia(int IDUsuario) {
        this.IDUsuario=IDUsuario;
        initComponents();
        cargarMembresias(cmbMembresia);
    }
    public void cargarMembresias(JComboBox<String> cmbMembresia) {
        DatabaseConnection objetoConexion = new DatabaseConnection();
        String consulta = "SELECT Nombre FROM Membresia;";
        
        try (Statement st = objetoConexion.getConnection().createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            cmbMembresia.removeAllItems();

            while (rs.next()) {
                String Nombre = rs.getString("Nombre");
                cmbMembresia.addItem(Nombre);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar membresias: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void actualizarInformacionMembresia(String nombreMembresia) {
    DatabaseConnection objetoConexion = new DatabaseConnection();
    String consulta = "SELECT Precio, Descuento FROM Membresia WHERE Nombre = ?";

    try (java.sql.Connection conn = objetoConexion.getConnection();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(consulta)) {
        
        pstmt.setString(1, nombreMembresia); // Parámetro para la consulta
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                double precio = rs.getDouble("Precio");
                int descuento = rs.getInt("Descuento");
                if (precio > 0.0){
                    txtTarjeta.setBackground(new java.awt.Color(255,255,255));
                    txtTarjeta.setEnabled(true);
                    lblTarjeta.setForeground(new java.awt.Color(229,232,236));
                } else {
                    txtTarjeta.setBackground(new java.awt.Color(31,50,69));
                    txtTarjeta.setEnabled(false);
                    txtTarjeta.setText("");
                    lblTarjeta.setForeground(new java.awt.Color(31, 50, 69));
                }
                lblMostrarPrecio.setText(String.format("$%.2f", precio));
                lblMostrarDescuento.setText(descuento + "%");
            } else {
                lblMostrarPrecio.setText("N/A");
                lblMostrarDescuento.setText("N/A");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener información: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public boolean esTarjetaValida(String numeroTarjeta) {
        // Eliminar espacios en blanco o caracteres no numéricos (si es necesario)
        numeroTarjeta = numeroTarjeta.replaceAll("\\s+", "");

        // Verificar que el número de tarjeta contenga solo dígitos
        if (!numeroTarjeta.matches("\\d+")) {
            return false;
        }

        int suma = 0;
        boolean alternar = false;

        // Recorrer los dígitos de derecha a izquierda
        for (int i = numeroTarjeta.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroTarjeta.charAt(i));

            if (alternar) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }

            suma += digito;
            alternar = !alternar;
        }

        // El número de tarjeta es válido si la suma es múltiplo de 10
        return suma % 10 == 0;
    }
    public static int obtenerIDMembresia(String membresia) {
        String consulta = "SELECT IDMembresia FROM Membresia WHERE Nombre = ?";
        int idMembresia = -1; // Valor predeterminado si no se encuentra

        try (java.sql.Connection conn = DatabaseConnection.getConnection();
             java.sql.PreparedStatement pstmt = conn.prepareStatement(consulta)) {

            pstmt.setString(1, membresia);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    idMembresia = rs.getInt("IDMembresia");
                }
            }
        } catch (Exception e) {
            System.err.println("Error al obtener el IDMembresia: " + e.getMessage());
        }

        return idMembresia;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblMembresia = new javax.swing.JLabel();
        cmbMembresia = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblMostrarPrecio = new javax.swing.JLabel();
        lblMostrarDescuento = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRenovar = new javax.swing.JButton();
        lblTarjeta = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

        lblTitulo.setBackground(new java.awt.Color(229, 232, 236));
        lblTitulo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 232, 236));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualizar Membresia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblMembresia.setBackground(new java.awt.Color(229, 232, 236));
        lblMembresia.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblMembresia.setForeground(new java.awt.Color(229, 232, 236));
        lblMembresia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembresia.setText("Membresia:");

        cmbMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMembresiaActionPerformed(evt);
            }
        });

        lblPrecio.setBackground(new java.awt.Color(229, 232, 236));
        lblPrecio.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(229, 232, 236));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Precio:");

        lblDescuento.setBackground(new java.awt.Color(229, 232, 236));
        lblDescuento.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(229, 232, 236));
        lblDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescuento.setText("Descuento entradas:");

        lblMostrarPrecio.setBackground(new java.awt.Color(229, 232, 236));
        lblMostrarPrecio.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblMostrarPrecio.setForeground(new java.awt.Color(229, 232, 236));
        lblMostrarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMostrarDescuento.setBackground(new java.awt.Color(229, 232, 236));
        lblMostrarDescuento.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblMostrarDescuento.setForeground(new java.awt.Color(229, 232, 236));
        lblMostrarDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnVolver.setText("Volver al menu");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRenovar.setText("Renovar");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });

        lblTarjeta.setBackground(new java.awt.Color(229, 232, 236));
        lblTarjeta.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblTarjeta.setForeground(new java.awt.Color(31, 50, 69));
        lblTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTarjeta.setText("Numero de la tarjeta:");

        txtTarjeta.setBackground(new java.awt.Color(31, 50, 69));
        txtTarjeta.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        txtTarjeta.setBorder(null);
        txtTarjeta.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMembresia)
                            .addComponent(lblPrecio)
                            .addComponent(lblDescuento)
                            .addComponent(lblTarjeta))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMostrarDescuento)
                            .addComponent(lblMostrarPrecio)
                            .addComponent(cmbMembresia, 0, 148, Short.MAX_VALUE)
                            .addComponent(txtTarjeta))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMembresia)
                    .addComponent(cmbMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(lblMostrarPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescuento)
                    .addComponent(lblMostrarDescuento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarjeta)
                    .addComponent(txtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMembresiaActionPerformed
        String seleccion = (String) cmbMembresia.getSelectedItem(); // Obtiene la selección actual
        if (seleccion != null && !seleccion.isEmpty()) {
            actualizarInformacionMembresia(seleccion); // Actualiza los valores en los labels
        }
    }//GEN-LAST:event_cmbMembresiaActionPerformed

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
        String membresia = (String) cmbMembresia.getSelectedItem();
        System.out.println(membresia);
        String numeroTarjeta = (String) txtTarjeta.getText();
        int IDMembresia=obtenerIDMembresia(membresia);
        if (membresia.equals("Gratuito")){
            try {
                actualizarMembresia(IDUsuario,IDMembresia);
                JOptionPane.showMessageDialog(this, "Membresia actualizada con exito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                System.out.println("Error al actualizar la membresia: " + ex.getMessage());
            }
        }else{
            if(esTarjetaValida(numeroTarjeta)){
                JOptionPane.showMessageDialog(this, "Pago realizado con exito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                try {
                    actualizarMembresia(IDUsuario,IDMembresia);
                } catch (SQLException ex) {
                    System.out.println("Error al actualizar la membresia: " + ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(this, "Tarjeta invalida ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu menu = new Menu(IDUsuario);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRenovar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblMembresia;
    private javax.swing.JLabel lblMostrarDescuento;
    private javax.swing.JLabel lblMostrarPrecio;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtTarjeta;
    // End of variables declaration//GEN-END:variables
}
