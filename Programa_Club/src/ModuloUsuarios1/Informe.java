package ModuloUsuarios1;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Informe extends javax.swing.JFrame {

    private int IDUsuario; // Almacena el ID del usuario
    
    public Informe() {
    }

    public Informe(int IDUsuario) {
        this.IDUsuario = IDUsuario; // Inicializa el ID del usuario
        initComponents();
        cargarDatosUsuario(); // Cargar datos del usuario al iniciar
    }

    private void cargarDatosUsuario() {
        // Consulta SQL para obtener la contraseña, dirección, email, disciplina y membresía
        String sql = "SELECT U.Nombre_usuario, U.Direccion, U.Email, U.Contraseña, D.Nombre AS Disciplina, M.Nombre AS Membresia " +
                     "FROM Usuario U " +
                     "LEFT JOIN Socio S ON U.IDUsuario = S.IDUsuario " +
                     "LEFT JOIN Membresia M ON S.IDMembresia = M.IDMembresia " +
                     "LEFT JOIN Deportista DP ON U.IDUsuario = DP.IDUsuario " +
                     "LEFT JOIN Disciplina D ON DP.IDDisciplina = D.IDDisciplina " +
                     "WHERE U.IDUsuario = ?"; 

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
             
            pstmt.setInt(1, IDUsuario);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Asignar los valores recuperados a los labels
                lblnombre.setText(rs.getString("Nombre_usuario"));
                lbldireccion.setText(rs.getString("Direccion"));
                lblmail.setText(rs.getString("Email"));
                lblcontraseña.setText(rs.getString("Contraseña")); // Muestra la contraseña
                lbldisciplina.setText(rs.getString("Disciplina"));
                lblmembresia.setText(rs.getString("Membresia"));
                
                //asignar colores correctos
                
                jPanel1.setBackground(new java.awt.Color(31,50,69));
                getContentPane().setBackground(new java.awt.Color(31, 50, 69));
                jPanel2.setBackground(new java.awt.Color(47,94,141));
                lblnombre.setForeground(new java.awt.Color(229,232,236));
                lbldireccion.setForeground(new java.awt.Color(229,232,236));
                lblmail.setForeground(new java.awt.Color(229,232,236));
                lblcontraseña.setForeground(new java.awt.Color(229,232,236));
                lbldisciplina.setForeground(new java.awt.Color(229,232,236));
                lblmembresia.setForeground(new java.awt.Color(229,232,236));
                jLabel1.setForeground(new java.awt.Color(229,232,236));
                jLabel2.setForeground(new java.awt.Color(229,232,236));
                jLabel3.setForeground(new java.awt.Color(229,232,236));
                jLabel4.setForeground(new java.awt.Color(229,232,236));
                jLabel5.setForeground(new java.awt.Color(229,232,236));
                jLabel6.setForeground(new java.awt.Color(229,232,236));
                jLabel7.setForeground(new java.awt.Color(229,232,236));
                jLabel9.setForeground(new java.awt.Color(229,232,236));
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblsaludo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbldisciplina = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblmembresia = new javax.swing.JLabel();
        JButton btnVolverMenu = new JButton("Volver al Menú"); // Botón para volver al menú

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        lblsaludo.setBackground(new java.awt.Color(255, 255, 255));
        lblsaludo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblsaludo.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo.setText("Hola!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblsaludo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsaludo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos personales:");

        jLabel2.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel2.setText("Usuario:");

        lblnombre.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblnombre.setText("...");

        jLabel4.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel4.setText("Contraseña:");

        lblcontraseña.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblcontraseña.setText("...");

        jLabel6.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel6.setText("Dirección:");

        lbldireccion.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lbldireccion.setText("...");

        jLabel3.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel3.setText("Mail:");

        lblmail.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblmail.setText("...");

        jLabel7.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel7.setText("Disciplina:");

        lbldisciplina.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lbldisciplina.setText("...");

        jLabel9.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel9.setText("Membresía:");

        lblmembresia.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        lblmembresia.setText("...");

        // Acción para el botón de volver al menú
        btnVolverMenu.addActionListener(e -> {
            new Menu(IDUsuario).setVisible(true); // Vuelve al menú
            dispose(); // Cierra la ventana del informe
        });

        // Añadir el botón al panel
        jPanel1.add(btnVolverMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcontraseña))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldireccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldisciplina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmembresia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverMenu) // Añadir botón de volver aquí
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblnombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblcontraseña))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbldireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbldisciplina))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblmembresia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverMenu) // Posición del botón de volver
                .addContainerGap(25, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldisciplina;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblmembresia;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsaludo;
    // End of variables declaration//GEN-END:variables
}
