/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author ddesktop
 */
public class PantallaEstadio extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    public PantallaEstadio() {
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

        contenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        addEstadio = new javax.swing.JButton();
        modEstadio = new javax.swing.JButton();
        addSector = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenido.setBackground(new java.awt.Color(0, 0, 0));
        contenido.setPreferredSize(new java.awt.Dimension(1042, 576));

        jPanel1.setBackground(new java.awt.Color(31, 50, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(1042, 576));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DE ESTADIO");

        body.setBackground(new java.awt.Color(182, 192, 199));

        addEstadio.setBackground(new java.awt.Color(31, 50, 67));
        addEstadio.setForeground(new java.awt.Color(254, 254, 254));
        addEstadio.setText("Agregar estadio");
        addEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEstadioActionPerformed(evt);
            }
        });

        modEstadio.setBackground(new java.awt.Color(31, 50, 67));
        modEstadio.setForeground(new java.awt.Color(254, 254, 254));
        modEstadio.setText("Modificar Estadio");
        modEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEstadioActionPerformed(evt);
            }
        });

        addSector.setBackground(new java.awt.Color(31, 50, 67));
        addSector.setForeground(new java.awt.Color(254, 254, 254));
        addSector.setText("Agregar sector");
        addSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(addEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(addEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSector, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(391, Short.MAX_VALUE))
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEstadioActionPerformed
        AgregarEstadio addEsta = new AgregarEstadio();
            addEsta.setSize(1042,576);
            addEsta.setLocation(0,0);
            this.setVisible(false);
            addEsta.setVisible(true);
            body.removeAll();  
    }//GEN-LAST:event_addEstadioActionPerformed

    private void addSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSectorActionPerformed
        SectorEstadio sector = new SectorEstadio();
            sector.setSize(1042,576);
            sector.setLocation(0,0);
            this.setVisible(false);
            sector.setVisible(true);
            body.removeAll();  
    }//GEN-LAST:event_addSectorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelPrincipal principal = new PanelPrincipal();
            principal.setSize(1042,576);
            principal.setLocation(0,0);
            this.setVisible(false);
            principal.setVisible(true);
            body.removeAll();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEstadioActionPerformed
        ModificarEstadio modi = new ModificarEstadio();
            modi.setSize(1042,576);
            modi.setLocation(0,0);
            this.setVisible(false);
            modi.setVisible(true);
            body.removeAll();
    }//GEN-LAST:event_modEstadioActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEstadio;
    private javax.swing.JButton addSector;
    private javax.swing.JPanel body;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modEstadio;
    // End of variables declaration//GEN-END:variables
}
