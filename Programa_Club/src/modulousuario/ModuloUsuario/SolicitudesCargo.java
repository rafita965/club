package ModuloUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SolicitudesCargo extends javax.swing.JFrame {
    private int IDUsuario; // Variable para almacenar el ID del usuario

    // Constructor que recibe el IDUsuario
    public SolicitudesCargo(int IDUsuario) {
        this.IDUsuario = IDUsuario; // Almacena el ID en la variable interna
        initComponents();
        cargarCargos(cmbCargos);
    }

    // Método que se llama al hacer clic en el botón "Enviar"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String descripcion = (String) cmbCargos.getSelectedItem();
        String tipo = "Cargo";

        if (descripcion == null || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un cargo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Llama a enviarSolicitud con el IDUsuario correcto
            DatabaseConnection.enviarSolicitud(IDUsuario, descripcion, tipo);
            JOptionPane.showMessageDialog(this, "Solicitud enviada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al enviar solicitud: Usted ya tiene una solicitud para cargo pendiente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para cargar cargos desde la base de datos en el JComboBox
    public void cargarCargos(JComboBox<String> comboBoxCargos) {
        DatabaseConnection objetoConexion = new DatabaseConnection();
        String consulta = "SELECT cargos FROM Cargo;";

        try (Statement st = objetoConexion.getConnection().createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            comboBoxCargos.removeAllItems();

            while (rs.next()) {
                String cargos = rs.getString("cargos");
                comboBoxCargos.addItem(cargos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar cargos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para regresar al menú
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        // Abre la ventana del menú con el IDUsuario
        new Menu(IDUsuario).setVisible(true);
        dispose(); // Cierra la ventana de solicitudes de cargo
    }

    // Código generado automáticamente por el editor para la interfaz
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCargos = new javax.swing.JLabel();
        cmbCargos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton(); // Nuevo botón para volver al menú

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(31, 50, 69));
        jPanel1.setBackground(new java.awt.Color(31,50,69));
        pnlTitulo.setBackground(new java.awt.Color(47,94,141));
        lblTitulo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 232, 236));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Enviar Solicitud");
        lblCargos.setForeground(new java.awt.Color(229,232,236));
        
        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblCargos.setText("Seleccionar cargo:");
        cmbCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargosActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver al Menú");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCargos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargos)
                    .addComponent(cmbCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnVolver) // Agregar el botón "Volver al Menú"
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }

    private void cmbCargosActionPerformed(java.awt.event.ActionEvent evt) {
        // Acción para cuando se selecciona un cargo, si es necesario
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> cmbCargos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCargos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JButton btnVolver; // Nuevo botón
    // End of variables declaration
}
