package ModuloUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class SolicitudesDisciplina extends javax.swing.JFrame {
    private int IDUsuario; // Variable para almacenar el ID del usuario

    // Constructor que recibe el IDUsuario
    public SolicitudesDisciplina(int IDUsuario) {
        this.IDUsuario = IDUsuario; // Almacena el ID en la variable interna
        initComponents();
        cargarDisciplinas(cmbDisciplinas);
    }

    // Método que se llama al hacer clic en el botón "Enviar"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String descripcion = (String) cmbDisciplinas.getSelectedItem();
        String tipo = "Disciplina";

        try {
            // Llama a enviarSolicitud con el IDUsuario correcto
            DatabaseConnection.enviarSolicitud(IDUsuario, descripcion, tipo);
            JOptionPane.showMessageDialog(this, "Envio exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al enviar solicitud: Usted tiene una solicitud para disciplina pendiente" , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para cargar cargos desde la base de datos en el JComboBox
    public void cargarDisciplinas(JComboBox<String> comboBoxDisciplinas) {
        DatabaseConnection objetoConexion = new DatabaseConnection();
        String consulta = "SELECT nombre FROM Disciplina;";
        Statement st;

        try {
            st = objetoConexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            comboBoxDisciplinas.removeAllItems();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                comboBoxDisciplinas.addItem(new String(nombre)); // Añade un nuevo objeto CategoriaItem
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar disciplinas: " + e.getMessage());
        }
    }

    // Método para volver al menú
    private void volverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // Crea una nueva instancia del menú y lo muestra
        new Menu(IDUsuario).setVisible(true);
        dispose(); // Cierra la ventana actual
    }

    // Código generado automáticamente por el editor para la interfaz
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDisciplinas = new javax.swing.JLabel();
        cmbDisciplinas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        JButton btnVolverMenu = new JButton("Volver al Menú"); // Botón para volver al menú

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(31, 50, 69));
        jPanel1.setBackground(new java.awt.Color(31,50,69));
        pnlTitulo.setBackground(new java.awt.Color(47,94,141));
        lblTitulo.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 232, 236));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Enviar Solicitud");
        lblDisciplinas.setForeground(new java.awt.Color(229,232,236));
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

        lblDisciplinas.setText("Seleccionar disciplina:");
        cmbDisciplinas.addActionListener(new java.awt.event.ActionListener() {
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

        btnVolverMenu.setText("Volver al Menú");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuActionPerformed(evt); // Acción para volver al menú
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisciplinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisciplinas)
                    .addComponent(cmbDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnVolverMenu) // Se agrega el botón para volver al menú
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
    private javax.swing.JComboBox<String> cmbDisciplinas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDisciplinas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration
}
