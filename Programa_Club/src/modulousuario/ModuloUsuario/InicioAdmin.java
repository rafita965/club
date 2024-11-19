package ModuloUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioAdmin extends javax.swing.JFrame {
    private static int IDAdministrador;
    public InicioAdmin(int IDAdministrador) {
        this.IDAdministrador=IDAdministrador;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        passwordcontraseña = new javax.swing.JPasswordField();
        btnvolver = new javax.swing.JButton();
        btniniciosesion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

        lblTitulo.setBackground(new java.awt.Color(229, 232, 236));
        lblTitulo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 232, 236));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblContraseña.setBackground(new java.awt.Color(229, 232, 236));
        lblContraseña.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(229, 232, 236));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("Contraseña:");

        lblUsuario1.setBackground(new java.awt.Color(229, 232, 236));
        lblUsuario1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(229, 232, 236));
        lblUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario1.setText("Usuario:");

        txtusuario.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        btniniciosesion1.setText("Iniciar Sesion");
        btniniciosesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciosesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblContraseña)
                            .addGap(18, 18, 18)
                            .addComponent(passwordcontraseña))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btniniciosesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario1)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(passwordcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvolver)
                    .addComponent(btniniciosesion1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciosesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciosesion1ActionPerformed
        String usuario = txtusuario.getText();
        String constrasena = new String(passwordcontraseña.getPassword());

        // Intentar iniciar sesión
        try {
            Connection con = DatabaseConnection.getConnection();

            // Verificar si el usuario está registrado
            String queryUsuario = "SELECT * FROM Administrador WHERE Nombre_Administrador = ?";
            PreparedStatement pstUsuario = con.prepareStatement(queryUsuario);
            pstUsuario.setString(1, usuario);
            ResultSet rsUsuario = pstUsuario.executeQuery();

            if (!rsUsuario.next()) {
                // Si el usuario no está registrado
                JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Verificar la contraseña
                String queryContrasena = "SELECT * FROM Administrador WHERE Nombre_Administrador = ? AND Contraseña = ?";
                PreparedStatement pstContrasena = con.prepareStatement(queryContrasena);
                pstContrasena.setString(1, usuario);
                pstContrasena.setString(2, constrasena);
                ResultSet rsContrasena = pstContrasena.executeQuery();

                if (rsContrasena.next()) {
                    // Inicio de sesión exitoso
                    JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. Bienvenido!");
                    this.dispose(); // Cerrar la ventana actual

                    // Sacar IDUsuario a partir de Nombre_usuario
                    int IDAdministrador = rsContrasena.getInt("IDAdministrador"); // Asegúrate de que esto existe

                    // Abrir el menú principal, pasando el IDUsuario
                    new MenuAdmin(IDAdministrador).setVisible(true); // Pasa el IDUsuario al constructor
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Cerrar conexiones
            rsUsuario.close();
            pstUsuario.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btniniciosesion1ActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        InicioSesion inicio = new InicioSesion(-1,-1);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciosesion1;
    private javax.swing.JButton btnvolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPasswordField passwordcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
