/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_GestionDeFinanzas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tm_galli
 */
public class GestionDeImpuestos extends javax.swing.JFrame {
    Object[][] datosAcciones;
    String[] columnNames = {"Acción","Monto","Impuesto","Dinero perdido"};
    /**
     * Creates new form GestionDeImpuestos
     */
    public GestionDeImpuestos() {
        initComponents();
        MostrarTabla mostrarTablasFunc = new MostrarTabla();
        
        Object[] ImpuestosColums = new Object[]{"id_impuesto", "nombre", "porcentaje"};
        mostrarTablasFunc.MostrarTabla(ImpuestosTable, ImpuestosColums, "SELECT * FROM Impuestos;");
        
        Object[] SugerenciasColums = new Object[]{"Id", "Mensaje", "Id_Equipamiento", "Cant_Comprar", "Precio"};
        mostrarTablasFunc.MostrarTabla(SugerenciasTable, SugerenciasColums, "SELECT * FROM Pedido_Compra;");
        
        datosAcciones = ObtenerRiesgos();
        
        CargaAutomatica();
    }
    
    public void CargaAutomatica() {
        DefaultTableModel modelo = new DefaultTableModel(datosAcciones, columnNames);
        
        this.DineroPerdidoTable.setModel(modelo);
    }

    public Object[][] ObtenerRiesgos() {
        PlanificacionFinanciera ventanamain = new PlanificacionFinanciera();
        SugerenciasTable.setVisible(false);

        Object[][] SugerenciasTableArray = tableToArray(SugerenciasTable);
        Object[][] CobrosTableArray = tableToArray(ventanamain.CobrosTable);
        Object[][] PagosTableArray = tableToArray(ventanamain.PagosTable);
        Object[][] MovimientoTableArray = tableToArray(ventanamain.MovimientoTable);
        Object[][] CuentaTableArray = tableToArray(ventanamain.CuentaTable);
        Object[][] ImpuestosTableArray = tableToArray(ventanamain.ImpuestosTable);
        Object[][] InversionesTableArray = tableToArray(ventanamain.InversionesTable);

        List<Object[]> ErroresList = new ArrayList<>();

        for (Object[] columna : PagosTableArray) {
            ErroresList.add(new Object[]{"Pago", columna[1].toString(), 15, Double.parseDouble(columna[1].toString())*0.15});
        }
        for (Object[] columna : CobrosTableArray) {
            ErroresList.add(new Object[]{"Cobro", columna[1].toString(), 10, Double.parseDouble(columna[1].toString())*0.10});
        }
        for (Object[] columna : InversionesTableArray) {
            ErroresList.add(new Object[]{"Inversiones", columna[1].toString(), 10, Double.parseDouble(columna[1].toString())*0.25});
        }
        for (Object[] columna : SugerenciasTableArray) {
            ErroresList.add(new Object[]{"Compra de equipamiento", columna[4].toString(), 10, Double.parseDouble(columna[4].toString())*0.15});
        }

        double DineroPerd = 0;
        
        for (Object[] columna : ErroresList) {
            DineroPerd += Double.parseDouble(columna[3].toString());
        }
        
        LabelDinero.setText(String.valueOf(DineroPerd)+"$");
        
        // Convertir la lista a un array bidimensional
        Object[][] Errores = new Object[ErroresList.size()][];
        Errores = ErroresList.toArray(Errores);

        return Errores;
    }
    
    private Object[][] tableToArray(JTable table) {
        int rowCount = table.getRowCount();
        int columnCount = table.getColumnCount();

        // Crear un array bidimensional
        Object[][] dataArray = new Object[rowCount][columnCount];

        // Llenar el array con los valores de la tabla
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                dataArray[i][j] = table.getValueAt(i, j);
            }
        }

        return dataArray;
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DineroPerdidoTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();
        LabelDinero = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ImpuestosTable = new javax.swing.JTable();
        SalirButton = new javax.swing.JButton();
        asfasf = new javax.swing.JScrollPane();
        SugerenciasTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 140, 181));

        DineroPerdidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Accion", "Monto", "Impuesto", "Dinero perdido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DineroPerdidoTable);

        jLabel5.setBackground(new java.awt.Color(31, 50, 69));
        jLabel5.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 50, 69));
        jLabel5.setText("IMPUESTOS DE ACCIONES");
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 17));

        jLabelDinero.setBackground(new java.awt.Color(31, 50, 69));
        jLabelDinero.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabelDinero.setForeground(new java.awt.Color(31, 50, 69));
        jLabelDinero.setText("DINERO PERDIDO EN IMPUESTOS:");
        jLabelDinero.setPreferredSize(new java.awt.Dimension(180, 17));

        LabelDinero.setBackground(new java.awt.Color(31, 50, 69));
        LabelDinero.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        LabelDinero.setForeground(new java.awt.Color(31, 50, 69));
        LabelDinero.setText("Hasta ahora no se a perdido dinero en impuestos");
        LabelDinero.setPreferredSize(new java.awt.Dimension(180, 17));

        jLabel6.setBackground(new java.awt.Color(31, 50, 69));
        jLabel6.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 50, 69));
        jLabel6.setText("ACCIONES FINANCIERAS Y DINERO PERDIDO");
        jLabel6.setPreferredSize(new java.awt.Dimension(180, 17));

        ImpuestosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Riesgo", "Causa", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ImpuestosTable);

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        SugerenciasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Riesgo", "Causa", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        asfasf.setViewportView(SugerenciasTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(asfasf, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(asfasf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addGap(24, 24, 24))
        );

        jPanel6.setBackground(new java.awt.Color(31, 50, 69));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 246, 247));
        jLabel4.setText("GESTION DE IMPUESTOS");
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 17));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
        PlanificacionFinanciera GesFin= new PlanificacionFinanciera();
        GesFin.setVisible(true);
        this.setVisible(false);
        GesFin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeImpuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DineroPerdidoTable;
    private javax.swing.JTable ImpuestosTable;
    public javax.swing.JLabel LabelDinero;
    private javax.swing.JButton SalirButton;
    private javax.swing.JTable SugerenciasTable;
    private javax.swing.JScrollPane asfasf;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabelDinero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
