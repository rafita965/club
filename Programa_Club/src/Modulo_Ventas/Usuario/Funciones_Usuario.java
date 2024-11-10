/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas.Usuario;
import Modulo_Ventas.ConexionBDD;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.*;
/**
 *
 * @author thiag
 */
//Funciones del proceso a la entrega de pedido
public class Funciones_Usuario {
    //Declaracion de variables
    private Date fecha;
    private String Nombre_Producto;
    private double Precio;
    private int CategoriaID;
    private int IDPedido;
    private int codigo;
    private String productoID;
    
    //Getter y setter
    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(int IDPedido) {
        this.IDPedido = IDPedido;
    }
    
    //Metodos de Gestion_Compra_Usuario
    // Método para mostrar los reembolsos en la tabla
    public void MostrarProductos(JTable paramTablaProductos) {
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<>(modelo);
        paramTablaProductos.setRowSorter(ordenarTabla);
        modelo.addColumn("ProductoID"); // Esta columna se va a ocultar
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        paramTablaProductos.setModel(modelo);
        String sql = "SELECT Productos.ProductoID, Productos.Nombre, Productos.Stock, Productos.Precio, " +
             "Categorias.NombreCategoria FROM Productos " +
             "INNER JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID " + // Añadir espacio aquí
             "WHERE Productos.Estado = 1";
        String[] datos = new String[5];
        try {
            Statement st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("ProductoID");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Stock");
                datos[3] = rs.getString("Precio");
                datos[4] = rs.getString("NombreCategoria");

                modelo.addRow(datos);
        }
        paramTablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        paramTablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        paramTablaProductos.getColumnModel().getColumn(0).setWidth(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente los registros, error: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
    
    //Seleccionar producto
    public void SeleccionarProducto(JTable paramTablaProductos, JTextField paramID, JTextField paramNombreProducto, JTextField paramPrecioProducto, JTextField paramCategoria) {
        try {
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >= 0) {
                paramID.setText(paramTablaProductos.getValueAt(fila, 0).toString()); 
                paramNombreProducto.setText(paramTablaProductos.getValueAt(fila, 1).toString()); 
                paramPrecioProducto.setText(paramTablaProductos.getValueAt(fila, 3).toString()); 
                paramCategoria.setText(paramTablaProductos.getValueAt(fila, 4).toString()); 
                productoID = paramTablaProductos.getValueAt(fila, 0).toString(); 
            } else {
                JOptionPane.showMessageDialog(null, "Fila no encontrada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.getMessage());
        }
    }
    
    //Obtener el valor de stock
    protected int obtenerStockProducto(int idProducto) {
        int stock = 0; 
        ConexionBDD objetoConexion = new ConexionBDD(); 
        String sql = "SELECT Stock FROM Productos WHERE ProductoID = ?";

        try {
            PreparedStatement pst = objetoConexion.Conectar().prepareStatement(sql);
            pst.setInt(1, idProducto); 
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                stock = rs.getInt("Stock");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el stock del producto: " + e.getMessage());
        } finally {
            objetoConexion.cerrarConexion(); 
        }
        return stock; 
    }
  
    //Metodos para la ventana Ventana_FormaEntrega==============================================
    public void MostrarDatos(String usuarioID, JTextField direccion_usuario, JTextField direccion_club, JTextField precioEnvio) {
        ConexionBDD objetoConexion = new ConexionBDD();
        String sql  = "SELECT Direccion FROM Usuario WHERE IDUsuario = ?";
        String sql2 = "SELECT Direccion FROM Estadio LIMIT 1;";
        String sql3 = "SELECT PrecioEnvio FROM Envio WHERE Activo=1";
        try {
            //Mostrar direccion del usuario
            CallableStatement st = (CallableStatement) objetoConexion.Conectar().prepareCall(sql);
            st.setString(1, usuarioID);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String direccionUser = rs.getString("Direccion");

                if (direccionUser != null) {
                    direccion_usuario.setText(direccionUser);
                } else {
                    direccion_usuario.setText("Dirección no disponible.");
                }
            } else {
                direccion_usuario.setText("Usuario no encontrado.");
            }
            //Mostrar direccion del club
            CallableStatement st2 = (CallableStatement) objetoConexion.Conectar().prepareCall(sql2);
            ResultSet rs2 = st2.executeQuery();
            if(rs2.next()){
                String direccionClub = rs2.getString("Direccion");
                if(direccionClub != null){
                    direccion_club.setText(direccionClub);
                }else{
                    direccion_usuario.setText("Dirección no disponible.");
                }
            }
            //Mostrar Precio del envio
            CallableStatement st3 = (CallableStatement) objetoConexion.Conectar().prepareCall(sql3);
            ResultSet rs3 = st3.executeQuery();
            if(rs3.next()){
                String precio = rs3.getString("PrecioEnvio");
                if(precio != null){
                    precioEnvio.setText(precio);
                }else{
                    precioEnvio.setText("El precio de envio no está disponible.");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar la dirección, error: " + e.toString());
            System.out.println("Error al mostrar la dirección, error: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
}



