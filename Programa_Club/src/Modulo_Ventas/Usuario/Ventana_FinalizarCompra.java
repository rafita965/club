/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas.Usuario;

import Modulo_Ventas.ConexionBDD;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabiv
 */
public class Ventana_FinalizarCompra extends javax.swing.JFrame {
    private String usuarioID; // Variable para almacenar el ID del usuario
    private String productoID;
    private String fecha; 
    private int cantidadSeleccionada;
    private String opcFormaEntrega;
    
    private String tipoTarjeta;
    private String nombreTitular;
    private String codigoSeguridad;
    private String numerinTarjeta;
    
    private String envioID = "-";
    
    private float totalPagar;
    private String precioTotal;
    public Ventana_FinalizarCompra(String userID, String productID, String dates, int cantSeleccionada,String opcionFormaEntrega, String tiTarjeta, String nTarjeta, String nomTitular, String codSeguridad){
        this.usuarioID = userID;
        this.productoID = productID;
        this.fecha = dates;
        this.cantidadSeleccionada = cantSeleccionada;
        this.opcFormaEntrega = opcionFormaEntrega;
        this.tipoTarjeta = tiTarjeta;
        this.nombreTitular= nomTitular;
        this.codigoSeguridad= codSeguridad;
        this.numerinTarjeta = nTarjeta;

        initComponents();
        
        textField_Producto.setEnabled(false);
        textField_Categoria.setEnabled(false);
        textField_PrecioOriginal.setEnabled(false);
        textField_Descuento.setEnabled(false);
        textField_PrecioFinal.setEnabled(false);
        textField_Cantidad.setEnabled(false);
        textField_FormaEntrega.setEnabled(false);
        textField_Direccion.setEnabled(false);
        textField_PrecioEnvio.setEnabled(false);
        textField_TotalPagar.setEnabled(false);
        
        MostrarTodo();    
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
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textField_Producto = new javax.swing.JTextField();
        textField_PrecioOriginal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textField_Descuento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textField_PrecioFinal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textField_Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textField_Categoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textField_FormaEntrega = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textField_Direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textField_PrecioEnvio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textField_TotalPagar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 94, 141));
        jPanel1.setForeground(new java.awt.Color(47, 94, 141));

        jButton2.setText("FINALIZAR COMPRA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("PRODUCTO");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("PRECIO ORIGINAL");

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("DESCUENTO");

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("PRECIO FINAL");

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("CANTIDAD");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("CATEGORIA");

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("FORMA DE ENTREGA");

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("DIRECCION");

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("PRECIO ENVIO");

        jLabel11.setText("-----------------------------------------------------------------------------------------------------");

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("TOTAL A PAGAR: ");

        jPanel2.setBackground(new java.awt.Color(31, 50, 69));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("DATOS DE COMPRA");

        jButton1.setText("<-----");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addComponent(textField_PrecioEnvio))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel9)
                    .addGap(10, 10, 10)
                    .addComponent(textField_Direccion))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addComponent(textField_FormaEntrega))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(textField_Cantidad))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(textField_PrecioFinal))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(textField_Descuento))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(textField_PrecioOriginal))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(textField_Categoria))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(textField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(textField_TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(textField_PrecioOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(textField_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(textField_PrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(textField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(textField_FormaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(textField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textField_PrecioEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(textField_TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTodo(){
        String preFin= "0";
        String envioPrice = "0";
        ConexionBDD objetoConexion = new ConexionBDD();
        //CONSULTA PARA Mostrar Datos del Producto Elejido===========================================================================
        String sql= "SELECT p.ProductoID, p.Nombre, p.Precio AS Precio, p.Stock, c.NombreCategoria, COALESCE(d.CantidadDescuento, 'Ningun') AS Descuento, COALESCE(dp.PrecioFinal, p.Precio) AS PrecioFinal FROM Productos p LEFT JOIN DescuentoProductos dp ON p.ProductoID = dp.ProductoID LEFT JOIN Descuento d ON dp.DescuentoID = d.DescuentoID AND CURDATE() BETWEEN d.Fecha_Inicio AND d.Fecha_Final LEFT JOIN Categorias c ON p.CategoriaID = c.CategoriaID WHERE p.ProductoID = ?;";
        //CONSULTA PARA MOSTRAR PRECIO DEL ENVIO=====================================================================================
        String sql2 = "SELECT EnvioID, PrecioEnvio FROM Envio WHERE Activo=1;"; 
        //CONSULTA PARA MOSTRAR LA DIRECCION DEL USUARIO=============================================================================
        String sql3 = "SELECT Direccion FROM Usuario WHERE IDUsuario=?;";
        //CONSULTA PARA MOSTRAR LA DIRECICON DEL CLUB================================================================================
        String sql4 = "SELECT Direccion FROM Estadio LIMIT 1;";
        try {
            CallableStatement st = (CallableStatement) objetoConexion.Conectar().prepareCall(sql);
            st.setString(1, productoID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                //MOSTRAR DATOS DEL PRODUCTO A COMPRAR================================
                String nomProduct = rs.getString("Nombre");
                String nomCategori = rs.getString("NombreCategoria");
                String preOriginal = rs.getString("Precio");
                String descuent = rs.getString("Descuento");
                preFin = rs.getString("PrecioFinal");
                
                if (nomProduct != null) {
                    textField_Producto.setText(nomProduct);
                    textField_Categoria.setText(nomCategori);
                    textField_PrecioOriginal.setText(preOriginal);
                    textField_Descuento.setText(descuent);
                    textField_PrecioFinal.setText(preFin);
                    
                    
                } else {
                    textField_Producto.setText("nombre no disponible.");
                }
            } else {
                textField_Producto.setText("producto no encontrado.");
            } 
            //MOSTRAR DATOS RESTANTES==============================================
            //Cantidad del producto----------------------------------------
            String auxCantSeleccionada = "" + cantidadSeleccionada;
            textField_Cantidad.setText(auxCantSeleccionada);
            //Forma de Entrega----------------------------------------------
            textField_FormaEntrega.setText(opcFormaEntrega);
            if(opcFormaEntrega.equals("Envío a Domicilio")){
                //Precio de envio----------------------------------------------
                CallableStatement st2 = (CallableStatement) objetoConexion.Conectar().prepareCall(sql2);
                ResultSet rs2 = st2.executeQuery();
                if(rs2.next()){
                    String precioEnvio = rs2.getString("PrecioEnvio");
                    String idEnvio = rs2.getString("EnvioID");
                    envioID = idEnvio;
                    
                    envioPrice = precioEnvio;
                    if(precioEnvio != null){
                        textField_PrecioEnvio.setText(precioEnvio);
                    }else{
                        textField_PrecioEnvio.setText("El precio de envio no está disponible.");
                    }
                }
                //Direccion----------------------------------------------------
                CallableStatement st3 = (CallableStatement) objetoConexion.Conectar().prepareCall(sql3);
                st3.setString(1, usuarioID);
                ResultSet rs3 = st3.executeQuery();
                if(rs3.next()){
                    String direccion = rs3.getString("Direccion");
                    if(direccion != null){
                        textField_Direccion.setText(direccion);
                    }else{
                        textField_Direccion.setText("La direccion no está disponible.");
                    }
                }
            }else if(opcFormaEntrega.equals("Retiro en el Club")){
                textField_PrecioEnvio.setText("-");
                envioPrice = "0"; 
                CallableStatement st4 = (CallableStatement) objetoConexion.Conectar().prepareCall(sql4);
                ResultSet rs4 = st4.executeQuery();
                if(rs4.next()){
                    String direccion = rs4.getString("Direccion");
                    if(direccion != null){
                        textField_Direccion.setText(direccion);
                    }else{
                        textField_Direccion.setText("La direccion no está disponible.");
                    }
                }
            }
            
            //Precio Total a Pagar--------------------------------------------------------------------------

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar todos los datos: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
        Funciones_Usuario funciones = new Funciones_Usuario();
        precioTotal = funciones.TotalPagar(cantidadSeleccionada,preFin, envioPrice);
        textField_TotalPagar.setText(precioTotal);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ventana_TarjetaUsuario vTU = new Ventana_TarjetaUsuario(usuarioID, productoID, fecha, cantidadSeleccionada, opcFormaEntrega);
        this.setVisible(false);
        vTU.setSize(450, 600);
        vTU.setLocationRelativeTo(null);
        vTU.setVisible(true); 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Funciones_Usuario funcion = new Funciones_Usuario();
        funcion.GuardarPedido(usuarioID, productoID, fecha, cantidadSeleccionada, opcFormaEntrega,envioID);
        
        Menu_Usuario vMU = new Menu_Usuario(usuarioID);
        this.setVisible(false);
        vMU.setSize(380, 320);
        vMU.setLocationRelativeTo(null);
        vMU.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField textField_Cantidad;
    private javax.swing.JTextField textField_Categoria;
    private javax.swing.JTextField textField_Descuento;
    private javax.swing.JTextField textField_Direccion;
    private javax.swing.JTextField textField_FormaEntrega;
    private javax.swing.JTextField textField_PrecioEnvio;
    private javax.swing.JTextField textField_PrecioFinal;
    private javax.swing.JTextField textField_PrecioOriginal;
    private javax.swing.JTextField textField_Producto;
    private javax.swing.JTextField textField_TotalPagar;
    // End of variables declaration//GEN-END:variables
}
