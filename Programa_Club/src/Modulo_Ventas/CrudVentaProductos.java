package Modulo_Ventas;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabrielv170
 */
//CRUD Venta de Productos
public class CrudVentaProductos {
        
    //Metodos TABLA PRODUCTOS EN VENTA=========================================================
    public void MostrarProductos(JTable paramTablaProductos) {
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
   
        String sql="";
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoría");
        modelo.addColumn("Descuento");
        modelo.addColumn("PrecioFinal");
        paramTablaProductos.setModel(modelo);
       
        sql="SELECT p.ProductoID, p.Nombre, p.Precio AS Precio, p.Stock, c.NombreCategoria, COALESCE(d.CantidadDescuento, 'Ningun') AS Descuento, COALESCE(dp.PrecioFinal, p.Precio) AS PrecioFinal FROM Productos p LEFT JOIN DescuentoProductos dp ON p.ProductoID = dp.ProductoID LEFT JOIN Descuento d ON dp.DescuentoID = d.DescuentoID AND CURDATE() BETWEEN d.Fecha_Inicio AND d.Fecha_Final LEFT JOIN Categorias c ON p.CategoriaID = c.CategoriaID WHERE p.Estado = 1;";

        try {
            Statement st;
            st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ProductoID");
                String nombres = rs.getString("Nombre");
                String stocks = rs.getString("Stock");
                String precios = rs.getString("Precio");
                String categoria = rs.getString("NombreCategoria");
                String descuento = rs.getString("Descuento");
                String precio2 = rs.getString("PrecioFinal");
                
                modelo.addRow(new Object[]{id,nombres,precios,stocks,categoria,descuento+" %",precio2});
            }
            paramTablaProductos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente los registros, error: " + e.getMessage());
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
    
    //Actualizar productos a venta
    public void PonerProductosVenta(JTextField paramID){
        ConexionBDD objetoConexion = new ConexionBDD();
        String consulta="UPDATE Productos SET Estado= 1 WHERE ProductoID = ?;";
        try{
            CallableStatement cs = (CallableStatement) objetoConexion.Conectar().prepareCall(consulta);
            cs.setString(1,paramID.getText());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se Puso el producto a la venta correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error, error: " + e.toString());
        }finally{
            objetoConexion.cerrarConexion();
            }        
    }
    
    //Eliminar Descuento de producto
    public void EliminarDescuentoProducto(JTextField id){
        ConexionBDD objetoConexion = new ConexionBDD();
        String consulta="UPDATE Productos SET Estado = 0 WHERE ProductoID = ?;";
        try{
            com.mysql.cj.jdbc.CallableStatement cs = (com.mysql.cj.jdbc.CallableStatement) objetoConexion.Conectar().prepareCall(consulta);
            cs.setInt(1,Integer.parseInt(id.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al eliminar, error: " + e.toString());
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
        
    //Metodos TABLA DE PRODUCTOS NO EN VENTA===================================================
    public void MostrarProductosNoDisponibles(JTable tablaProductos){
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql="";
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Precio");
        tablaProductos.setModel(modelo);

        sql="SELECT Productos.ProductoID,Productos.Nombre,Productos.Precio FROM Productos INNER JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID WHERE Productos.Estado = 0;";

        try {
            Statement st;
            st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("ProductoID");
                String nombres = rs.getString("Nombre");
                String precios = rs.getString("Precio");
                modelo.addRow(new Object[]{id,nombres,precios});
            }
        tablaProductos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente los registros, error: " + e.getMessage());
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
    
    //Seleccionar productos
    public void SeleccionarProductos(JTable tablaProductos, JTextField paramID, JTextField paramNombreProducto){
        int fila = tablaProductos.getSelectedRow();
            if (fila >= 0) {
                paramID.setText(tablaProductos.getValueAt(fila,0).toString());
                paramNombreProducto.setText(tablaProductos.getValueAt(fila,1).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no encontrada");
            }
    }
    
        //Funciones para la ventana PrecioEnvio
    public void MostrarPrecio(JTextField precioEnvioActual){
        ConexionBDD objetoConexion = new ConexionBDD();
        String sql="SELECT PrecioEnvio FROM Envio";
        try{
            Statement st;
            st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String precio = rs.getString("PrecioEnvio");
               
                precioEnvioActual.setText(precio);
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente el precio de envio actual: " + e.getMessage());
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
    
    public void IngresarPrecio(JTextField textField_PrecioNuevo) {
        ConexionBDD objetoConexion = new ConexionBDD();
        String sqlSelect = "SELECT EnvioID FROM Envio LIMIT 1";
        String sqlInsert = "INSERT INTO Envio (PrecioEnvio, Activo) VALUES (?, ?)";
        String sqlUpdate = "UPDATE Envio SET PrecioEnvio = ? WHERE EnvioID = ?";

        try {
            Statement st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);

            if (rs.next()) {
                int envioID = rs.getInt("EnvioID");
                PreparedStatement actualizar = objetoConexion.Conectar().prepareStatement(sqlUpdate);
                actualizar.setBigDecimal(1, new java.math.BigDecimal(textField_PrecioNuevo.getText()));
                actualizar.setInt(2, envioID);
                actualizar.executeUpdate();
                actualizar.close();
            } else {
                PreparedStatement insertar = objetoConexion.Conectar().prepareStatement(sqlInsert);
                insertar.setBigDecimal(1, new java.math.BigDecimal(textField_PrecioNuevo.getText()));
                insertar.setInt(2, 1); // Activo = 1
                insertar.executeUpdate();
                insertar.close();
            }
            
            JOptionPane.showMessageDialog(null, "Se colocó el precio correctamente");
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el precio de envío: " + e.getMessage());
        } finally {
            objetoConexion.cerrarConexion();
         }
    }
}
