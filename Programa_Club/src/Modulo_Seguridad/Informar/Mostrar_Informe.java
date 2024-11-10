/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Seguridad.Informar;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Modulo_Seguridad.Pantalla_Seguridad;

/**
 *
 * @author PC
 */
public class Mostrar_Informe extends javax.swing.JFrame {
    Crear_Informe_Codigo cIc = new Crear_Informe_Codigo();
    DefaultListModel modelo = new DefaultListModel();
    String opc;
    String consulta;
    /**
     * Creates new form Mostrar_Informe
     */
    //Muestra todos los informes en una lista
    public Mostrar_Informe() {
        initComponents();
        this.setResizable(false);
        modelo=cIc.mostrar(modelo);
        list_Informes.setModel(modelo);
        list_Informes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_Informes.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String itemSeleccionado = list_Informes.getSelectedValue();
                    String[] separado=itemSeleccionado.split("-");
                    //JOptionPane.showMessageDialog(null, "Seleccionaste: " + separado[1]);
                    int id=Integer.parseInt(separado[0]);
                    Esconder(id);
                    

                    
                }
            }
        });
    }
    //esconde la pantalla y abre el informe seleccionado
    public void Esconder (int id){
        this.setVisible(false);
        cIc.Mos_Informe(id);
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
        btn_crearInforme = new javax.swing.JButton();
        ComboBox_Ordenar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_Informes = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        btn_Volver1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        btn_crearInforme.setText("Crear informe");
        btn_crearInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearInformeActionPerformed(evt);
            }
        });

        ComboBox_Ordenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mas reciente", "Mas antiguo" }));
        ComboBox_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_OrdenarActionPerformed(evt);
            }
        });

        list_Informes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_Informes);

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        btn_Volver1.setBackground(new java.awt.Color(47, 94, 141));
        btn_Volver1.setText("<--");
        btn_Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(229, 232, 236));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 232, 236));
        jLabel1.setText("Informes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver1)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBox_Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBox_Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btn_crearInforme))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para entrar en la pantalla de crear informe
    private void btn_crearInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearInformeActionPerformed
        Crear_Informe cI=new Crear_Informe();
        this.setVisible(false);
        cI.setVisible(true);
        cI.setLocationRelativeTo(null);
        
        cI.setSize(500,430);
    }//GEN-LAST:event_btn_crearInformeActionPerformed
    
    //Combobox para elegir metodo de ordenamiento
    private void ComboBox_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_OrdenarActionPerformed
        opc=ComboBox_Ordenar.getSelectedItem().toString();
        if (opc=="Mas reciente"){
            consulta = "SELECT ID, Titulo FROM Informe ORDER BY Fecha DESC";
        }else{
            consulta = "SELECT ID, Titulo FROM Informe ORDER BY Fecha ASC";
        }
        cIc.mostrar_Ordenado(modelo, consulta);
    }//GEN-LAST:event_ComboBox_OrdenarActionPerformed
    
    //Boton para volver atras
    private void btn_Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver1ActionPerformed
        Pantalla_Seguridad pM = new Pantalla_Seguridad();
        this.setVisible(false);
        pM.setVisible(true);
        
        pM.setSize(700, 430);
        pM.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_Volver1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Ordenar;
    private javax.swing.JButton btn_Volver1;
    private javax.swing.JButton btn_crearInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_Informes;
    // End of variables declaration//GEN-END:variables
}
