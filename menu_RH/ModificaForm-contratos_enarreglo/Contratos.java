package menu_RH;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Contratos extends javax.swing.JPanel {

    public Contratos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Volver_contra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        busqueda_barra = new javax.swing.JTextField();
        Busca_ok = new javax.swing.JButton();
        CheckBoxProme = new javax.swing.JCheckBox();
        CheckBoxProfe = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));

        Volver_contra.setFont(new java.awt.Font("Sitka Small", 0, 14)); 
        Volver_contra.setText("<-");
        Volver_contra.addActionListener(evt -> Volver_contraActionPerformed(evt));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); 
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Contratos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {2, 100000.0, "2 años", "Promesa"},
                {22, 2000000.0, "5 años", "Profesional"},
                {4, 60000.0, "1 año", "Promesa"},
                {8, 1000000.0, "4 años", "Profesional"},
                {1, 500000.0, "10 meses", "Promesa"},
                {11, 1500000.0, "6 meses", "Profesional"},
                {9, 4000000.0, "1 mes", "Profesional"}
            },
            new String [] {
                "ID jugador", "Sueldo", "Duracion ", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); 
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Filtros:");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); 
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Búsqueda:");

        Busca_ok.setText("Buscar");
        Busca_ok.addActionListener(evt -> Busca_okActionPerformed(evt));

        CheckBoxProme.setText("Promesa");
        CheckBoxProme.addActionListener(evt -> CheckBoxPromeActionPerformed(evt));

        CheckBoxProfe.setText("Profesional");
        CheckBoxProfe.addActionListener(evt -> CheckBoxProfeActionPerformed(evt));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor a menor ID", "Menor a mayor ID", "Mayor a menor Sueldo", "Menor a mayor Sueldo" }));
        jComboBox1.addActionListener(evt -> jComboBox1ActionPerformed(evt));

        // Código de diseño omitido para brevedad...

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void Volver_contraActionPerformed(java.awt.event.ActionEvent evt) {
        Menu newframe = new Menu();
        newframe.setVisible(true);
        this.setVisible(false); 
    }

    private void Busca_okActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    private void CheckBoxPromeActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    private void CheckBoxProfeActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    private void actualizarTabla() {
        DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
        List<Object[]> datosFiltrados = new ArrayList<>();

        String busquedaID = busqueda_barra.getText().trim();
        boolean buscarPromesa = CheckBoxProme.isSelected();
        boolean buscarProfesional = CheckBoxProfe.isSelected();
        String ordenSeleccionado = (String) jComboBox1.getSelectedItem();

        for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
            Integer id = (Integer) modeloOriginal.getValueAt(i, 0);
            String estado = (String) modeloOriginal.getValueAt(i, 3);

            boolean cumpleFiltroEstado = (!buscarPromesa && !buscarProfesional) || 
                                         (buscarPromesa && "Promesa".equals(estado)) || 
                                         (buscarProfesional && "Profesional".equals(estado));
            boolean cumpleBusquedaID = busquedaID.isEmpty() || id.toString().contains(busquedaID);

            if (cumpleFiltroEstado && cumpleBusquedaID) {
                datosFiltrados.add(new Object[]{
                    modeloOriginal.getValueAt(i, 0),
                    modeloOriginal.getValueAt(i, 1),
                    modeloOriginal.getValueAt(i, 2),
                    modeloOriginal.getValueAt(i, 3)
                });
            }
        }

        datosFiltrados.sort((row1, row2) -> {
            if (ordenSeleccionado.contains("ID")) {
                return ordenSeleccionado.contains("Mayor") ?
                    ((Integer) row2[0]).compareTo((Integer) row1[0]) :
                    ((Integer) row1[0]).compareTo((Integer) row2[0]);
            } else {
                return ordenSeleccionado.contains("Mayor") ?
                    ((Double) row2[1]).compareTo((Double) row1[1]) :
                    ((Double) row1[1]).compareTo((Double) row2[1]);
            }
        });

        DefaultTableModel modeloFiltrado = new DefaultTableModel(
            new String[]{"ID jugador", "Sueldo", "Duracion ", "Estado"}, 0
        );

        for (Object[] fila : datosFiltrados) {
            modeloFiltrado.addRow(fila);
        }

        jTable1.setModel(modeloFiltrado);
    }

    // Declaración de variables
    private javax.swing.JButton Busca_ok;
    private javax.swing.JCheckBox CheckBoxProfe;
    private javax.swing.JCheckBox CheckBoxProme;
    private javax.swing.JButton Volver_contra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField busqueda_barra;
}
