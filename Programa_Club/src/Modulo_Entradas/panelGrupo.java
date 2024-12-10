/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Entradas;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Agustín Salinas
 */
public class panelGrupo extends javax.swing.JPanel {
    CodigoGrupo cod;
    private int usuarioID;
    /**
     * Creates new form panelGrupo
     */
    public panelGrupo(int usuarioID) {
        initComponents();
        this.usuarioID=usuarioID;
        this.cod = new CodigoGrupo(usuarioID);
        cod.cargarMiembros(pnlMiembros,btnSalir,btnSolicitud);
    }
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlMiembros = new javax.swing.JPanel();
        btnSalir = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        btnSolicitud = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(229, 232, 236));
        setMinimumSize(new java.awt.Dimension(700, 0));

        jPanel3.setBackground(new java.awt.Color(31, 50, 69));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 232, 236));
        jLabel2.setText("VENTANA GRUPO ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMiembros.setBackground(new java.awt.Color(99, 140, 181));
        pnlMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("Miembros"));
        pnlMiembros.setMaximumSize(new java.awt.Dimension(220, 241));
        pnlMiembros.setMinimumSize(new java.awt.Dimension(220, 241));

        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalir.setText("Salir del grupo");
        btnSalir.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalir.setColorHover(new java.awt.Color(255, 0, 51));
        btnSalir.setColorNormal(new java.awt.Color(99, 140, 181));
        btnSalir.setColorPressed(new java.awt.Color(255, 0, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMiembrosLayout = new javax.swing.GroupLayout(pnlMiembros);
        pnlMiembros.setLayout(pnlMiembrosLayout);
        pnlMiembrosLayout.setHorizontalGroup(
            pnlMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMiembrosLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMiembrosLayout.setVerticalGroup(
            pnlMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiembrosLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSolicitud.setBackground(new java.awt.Color(182, 192, 199));
        btnSolicitud.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        btnSolicitud.setForeground(new java.awt.Color(64, 40, 63));
        btnSolicitud.setText("Enviar solicitud");
        btnSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Agregar usuario");

        jLabel5.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese nombre del usuario:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSolicitud)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSolicitud)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudActionPerformed
        cod.enviarSolicitud(txtNombre);
    }//GEN-LAST:event_btnSolicitudActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        if (btnSalir.isEnabled()) {
        cod.salirGrupo();
        new CambiaPanel((JPanel)this.getParent(), new panelGrupo(usuarioID));}
    }//GEN-LAST:event_btnSalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnSalir;
    private javax.swing.JButton btnSolicitud;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlMiembros;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
