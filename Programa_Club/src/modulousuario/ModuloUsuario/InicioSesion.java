package ModuloUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    private static int IDUsuario;
    private int IDAdministrador;
    public InicioSesion(int IDUsuario, int IDAdministrador) {
        this.IDUsuario=IDUsuario;
        this.IDAdministrador=IDAdministrador;
        initComponents();
        btniniciosesion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btniniciosesionActionPerformed(evt);
        }
    });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegistroActionPerformed(evt);
        }
    });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        passwordcontraseña = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        btniniciosesion = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

        lblTitulo.setBackground(new java.awt.Color(229, 232, 236));
        lblTitulo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 232, 236));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Bienvenido!");

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

        btnRegistro.setText("Registrarse");

        lblRegistro.setBackground(new java.awt.Color(229, 232, 236));
        lblRegistro.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(229, 232, 236));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("¿No tienes una cuenta? ¡Regístrate!");

        btniniciosesion.setText("Iniciar Sesion");

        lblAdmin.setBackground(new java.awt.Color(229, 232, 236));
        lblAdmin.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(229, 232, 236));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("¿Eres administrador? Inicia sesion");

        btnAdmin.setText("Iniciar como Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblContraseña)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordcontraseña)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAdmin)
                                            .addComponent(lblRegistro))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btniniciosesion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
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
                .addGap(30, 30, 30)
                .addComponent(btniniciosesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        InicioAdmin inicioadmin = new InicioAdmin(IDAdministrador);
        inicioadmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

private void btniniciosesionActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = txtusuario.getText();
        String constrasena = new String(passwordcontraseña.getPassword());

        // Intentar iniciar sesión
        try {
            Connection con = DatabaseConnection.getConnection();

            // Verificar si el usuario está registrado
            String queryUsuario = "SELECT * FROM Usuario WHERE Nombre_usuario = ?";
            PreparedStatement pstUsuario = con.prepareStatement(queryUsuario);
            pstUsuario.setString(1, usuario);
            ResultSet rsUsuario = pstUsuario.executeQuery();

            if (!rsUsuario.next()) {
                // Si el usuario no está registrado
                JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Verificar la contraseña
                String queryContrasena = "SELECT * FROM Usuario WHERE Nombre_usuario = ? AND Contraseña = ?";
                PreparedStatement pstContrasena = con.prepareStatement(queryContrasena);
                pstContrasena.setString(1, usuario);
                pstContrasena.setString(2, constrasena);
                ResultSet rsContrasena = pstContrasena.executeQuery();

                if (rsContrasena.next()) {
                    // Inicio de sesión exitoso
                    JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. Bienvenido!");
                    this.dispose(); // Cerrar la ventana actual

                    // Sacar IDUsuario a partir de Nombre_usuario
                    int IDUsuario = rsContrasena.getInt("IDUsuario"); // Asegúrate de que esto existe

                    // Abrir el menú principal, pasando el IDUsuario
                    new Menu(IDUsuario).setVisible(true); // Pasa el IDUsuario al constructor
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
    }
    
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {
        // Redirigir a la ventana de registro
        new RegistroUsuario(IDUsuario,IDAdministrador).setVisible(true);
        this.dispose(); // Cerrar la ventana actual
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btniniciosesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPasswordField passwordcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
