/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas;

import javax.swing.JOptionPane;

/**
 *
 * @author gabrielv170
 */
//Gestionar Aplicar descuento
public class Pantalla_AplicarDescuento extends javax.swing.JFrame {
    //Constructor
    public Pantalla_AplicarDescuento() {
        initComponents();
        Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento();
        objetoDescuento.MostrarDescuentos(Tabla_Descuentos);
        objetoDescuento.MostrarDescuentosAplicados(Tabla_DescuentosAplicados);
        JTextField_IDDescuento.setEnabled(false);
        JTextField_IDProducto.setEnabled(false);
        JTextField_Producto.setEnabled(false);
        JTextField_Descuento.setEnabled(false);
        JTextField_NombreProductoAplicado.setEnabled(false);
        JTextField_IDDescuentoAplicado.setEnabled(false);
        JTextField_IDProductoAplicado.setEnabled(false);
        objetoDescuento.MostrarProductos(Tabla_Productos);
        Btn_Guardar.setEnabled(false); // Deshabilitar por defecto
        Tabla_Productos.getSelectionModel().addListSelectionListener(e -> verificarSelecciones());
        Tabla_DescuentosAplicados.getSelectionModel().addListSelectionListener(e -> {
            // Verificar que hay una selección y que el evento no sea parte de un ajuste
            if (!e.getValueIsAdjusting()) {
                int selectedRow = Tabla_DescuentosAplicados.getSelectedRow();
                if (selectedRow != -1) {
                    Btn_Eliminar.setEnabled(true); // Habilitar botón si hay una fila seleccionada
                } else {
                    Btn_Eliminar.setEnabled(false); // Deshabilitar botón si no hay selección
                }
            }
        });
    }
    //Clases internas
    private void verificarSelecciones() {
        boolean productoSeleccionado = Tabla_Productos.getSelectedRow() != -1;
        boolean descuentoSeleccionado = Tabla_Descuentos.getSelectedRow() != -1;

        // Habilita o deshabilita el botón según las selecciones
        Btn_Guardar.setEnabled(productoSeleccionado && descuentoSeleccionado);
        Btn_Eliminar.setEnabled(productoSeleccionado && descuentoSeleccionado);
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
        jLabel4 = new javax.swing.JLabel();
        JTextField_IDDescuento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTextField_Descuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextField_IDDescuentoAplicado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextField_IDProductoAplicado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTextField_NombreProductoAplicado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextField_IDProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextField_Producto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_DescuentosAplicados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Descuentos = new javax.swing.JTable();
        Btn_Guardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(47, 94, 141));

        jLabel4.setText("ID");

        jLabel5.setText("Descuento");

        JTextField_Descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_DescuentoActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Descuento");

        JTextField_IDDescuentoAplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_IDDescuentoAplicadoActionPerformed(evt);
            }
        });

        jLabel9.setText("ID Producto");

        JTextField_IDProductoAplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_IDProductoAplicadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel6.setText("ID");

        jLabel7.setText("Producto");

        JTextField_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_ProductoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));

        Tabla_DescuentosAplicados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_DescuentosAplicados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_DescuentosAplicadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tabla_DescuentosAplicados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(47, 94, 141));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla_Productos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(47, 94, 141));

        Tabla_Descuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Descuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_DescuentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Descuentos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Btn_Guardar.setText("Aplicar Descuento al Producto");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(31, 50, 69));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("PRODUCTOS EXISTENTES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("DESCUENTOS EXISTENTES");

        btn_Volver.setText("<------");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("DESCUENTOS APLICADOS A PRODUCTOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(134, 134, 134))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        Btn_Eliminar.setText("Eliminar Descuento al Producto");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(JTextField_IDDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(JTextField_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(JTextField_IDDescuentoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(12, 12, 12)
                                .addComponent(JTextField_IDProductoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(JTextField_NombreProductoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(JTextField_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(JTextField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextField_IDDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_IDDescuentoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_IDProductoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_NombreProductoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //No se por que se puso esto================================================================================
    private void JTextField_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_ProductoActionPerformed
    
    //BOTON APLICAR DESCUENTO A PRODUCTO=======================================================================
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento();
        objetoDescuento.AplicacionDelDescuento(JTextField_IDDescuento,JTextField_IDProducto);
        objetoDescuento.MostrarProductos(Tabla_Productos);
        objetoDescuento.MostrarDescuentos(Tabla_Descuentos);
        objetoDescuento.MostrarDescuentosAplicados(Tabla_DescuentosAplicados);
        Tabla_Productos.clearSelection();
        Tabla_Descuentos.clearSelection();
        Tabla_DescuentosAplicados.clearSelection();
    }//GEN-LAST:event_Btn_GuardarActionPerformed
    //no se por que se puso esto===============================================================================
    private void JTextField_DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_DescuentoActionPerformed
        
    }//GEN-LAST:event_JTextField_DescuentoActionPerformed
    
    //BOTON PARA VOLVER A LA VENTANA DE GESTION DESCUENTO======================================================
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        Gestion_Descuento  vD = new Gestion_Descuento();
        this.setVisible(false);
        vD.setSize(855,570);
        vD.setLocationRelativeTo(null);
        vD.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed
    
    //Seleccionar descuento aplicado
    private void Tabla_DescuentosAplicadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DescuentosAplicadosMouseClicked
        Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento(); 
        objetoDescuento.Seleccionar_AplicarDescuento(Tabla_DescuentosAplicados, JTextField_IDDescuentoAplicado, JTextField_IDProductoAplicado, JTextField_NombreProductoAplicado);        
    }//GEN-LAST:event_Tabla_DescuentosAplicadosMouseClicked
    
    //Seleccionar descuento
    private void Tabla_DescuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DescuentosMouseClicked
        Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento(); 
        objetoDescuento.Seleccionar_Descuento(Tabla_Descuentos, JTextField_IDDescuento, JTextField_Descuento);
    }//GEN-LAST:event_Tabla_DescuentosMouseClicked

    //Seleccionar producto
    private void Tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProductosMouseClicked
        Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento(); 
        objetoDescuento.Seleccionar_Producto(Tabla_Productos, JTextField_IDProducto, JTextField_Producto);
    }//GEN-LAST:event_Tabla_ProductosMouseClicked

    //Boton eliminar
    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "¿Estás seguro de que deseas eliminar este descuento aplicado?",
        "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Modulo_Ventas.CrudDescuento objetoDescuento = new Modulo_Ventas.CrudDescuento();
                objetoDescuento.EliminarDescuentoAplicado(JTextField_IDDescuentoAplicado,JTextField_IDProductoAplicado);
                objetoDescuento.MostrarProductos(Tabla_Productos);
                objetoDescuento.MostrarDescuentos(Tabla_Descuentos);
                objetoDescuento.MostrarDescuentosAplicados(Tabla_DescuentosAplicados);
            } catch (Exception e) {
                System.err.println("Error al eliminar el descuento aplicado: " + e.getMessage());
            }
        } else {
            // Si el usuario selecciona "No", no se realiza ninguna acción.
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Acción cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
        Tabla_Productos.clearSelection();
        Tabla_Descuentos.clearSelection();
        Tabla_DescuentosAplicados.clearSelection();
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void JTextField_IDProductoAplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_IDProductoAplicadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_IDProductoAplicadoActionPerformed

    private void JTextField_IDDescuentoAplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_IDDescuentoAplicadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_IDDescuentoAplicadoActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_AplicarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AplicarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AplicarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AplicarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_AplicarDescuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JTextField JTextField_Descuento;
    private javax.swing.JTextField JTextField_IDDescuento;
    private javax.swing.JTextField JTextField_IDDescuentoAplicado;
    private javax.swing.JTextField JTextField_IDProducto;
    private javax.swing.JTextField JTextField_IDProductoAplicado;
    private javax.swing.JTextField JTextField_NombreProductoAplicado;
    private javax.swing.JTextField JTextField_Producto;
    private javax.swing.JTable Tabla_Descuentos;
    private javax.swing.JTable Tabla_DescuentosAplicados;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
