/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_deportistas;

import java.awt.Component;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Alta extends javax.swing.JFrame {

    /**
     * Creates new form Alta
     */
    public Alta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnVolverABM1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Alta");

        jLabel2.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Dar Jugador de alta desde cero:");

        btnVolverABM1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVolverABM1.setText("Volver");
        btnVolverABM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverABM1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Dar de alta");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Ver bajas");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Dar de alta a jugador dado de baja previamente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolverABM1)
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolverABM1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverABM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverABM1ActionPerformed
        ABM newframe = new ABM();

        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverABM1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Alta1 newframe = new Alta1();

        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
    String url = "jdbc:mysql://bbbx7cdcbcl53xxmjyxb-mysql.services.clever-cloud.com:21748/bbbx7cdcbcl53xxmjyxb";
    String user = "uwwqerjcglxxweor";
    String password = "vWobxeLnCiH11WTJg6N";

    // Consulta SQL para obtener los jugadores con situación 'Baja'
    String sql = "SELECT * FROM Jugadores WHERE situacion = 'Baja'";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement statement = connection.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        // Crear un modelo para la tabla
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Permitir la edición solo en la columna de botones
                return column == getColumnCount() - 1;
            }
        };

        // Obtener los metadatos de las columnas
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Agregar los nombres de las columnas al modelo
        for (int i = 1; i <= columnCount; i++) {
            tableModel.addColumn(metaData.getColumnName(i));
        }
        tableModel.addColumn("Acciones"); // Columna adicional para botones

        // Agregar los datos de las filas al modelo
        while (resultSet.next()) {
            Object[] rowData = new Object[columnCount + 1];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            rowData[columnCount] = "Dar de Alta"; // Placeholder para los botones
            tableModel.addRow(rowData);
        }

        // Crear el JTable
        JTable table = new JTable(tableModel);

        // Configurar el renderizador de botones
        table.getColumnModel().getColumn(columnCount).setCellRenderer((table1, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton("Dar de Alta");
            if (isSelected) {
                button.setBackground(table1.getSelectionBackground());
                button.setForeground(table1.getSelectionForeground());
            } else {
                button.setBackground(table1.getBackground());
                button.setForeground(table1.getForeground());
            }
            return button;
        });

        // Configurar el editor de botones
        table.getColumnModel().getColumn(columnCount).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            private final JButton button = new JButton("Dar de Alta");

            {
                button.addActionListener(e -> {
                    int row = table.getSelectedRow();
                    if (row != -1) {
                        try {
                            // Obtener el ID de la fila seleccionada
                            Object idValue = table.getValueAt(row, 0); // Suponiendo que la primera columna es el ID
                            String updateSql = "UPDATE Jugadores SET situacion = 'Alta' WHERE idJugador = ?";

                            try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                                updateStatement.setObject(1, idValue);
                                int rowsUpdated = updateStatement.executeUpdate();

                                if (rowsUpdated > 0) {
                                    JOptionPane.showMessageDialog(button, "Jugador dado de alta correctamente.");
                                    tableModel.removeRow(row); // Eliminar la fila de la tabla
                                } else {
                                    JOptionPane.showMessageDialog(button, "No se pudo actualizar la situación.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(button, "Error al actualizar la situación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }

            @Override
            public Component getTableCellEditorComponent(JTable table1, Object value, boolean isSelected, int row, int column) {
                return button;
            }
        });

        // Mostrar el JTable en un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(900, 400));

        // Mostrar los resultados en un JOptionPane
        JOptionPane.showMessageDialog(this, scrollPane, "Jugadores con situación 'Baja'", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al realizar la consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverABM1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}