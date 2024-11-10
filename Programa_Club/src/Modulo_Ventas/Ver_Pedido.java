/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas;

/**
 *
 * @author thiag
 */
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.*;

//Ver Pedido
public class Ver_Pedido {
    //Declaracion de variables a usar
    private Date fecha;
    private int Cantidad;
    private int IDPedido;
    private int IDUsuario;
    private int NombreProducto;
    private int FormaEntrega;
    private int codigo;
    
    // Getters y setters
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public int getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(int NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getFormaEntrega() {
        return FormaEntrega;
    }

    public void setFormaEntrega(int FormaEntrega) {
        this.FormaEntrega = FormaEntrega;
    }
    //Metodos
    // Método para mostrar los reembolsos en la tabla
    public void MostrarPedidos(JTable paramTablaTotalPedidos) {
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaTotalPedidos.setRowSorter(OrdenarTabla);

        modelo.addColumn("IDUsuario");
        modelo.addColumn("PedidoID");
        modelo.addColumn("Fecha");
        modelo.addColumn("ProductoID");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("FormaEntrega");

        paramTablaTotalPedidos.setModel(modelo);
        
        String sql = "SELECT Pedido.PedidoID, Pedido.IDUsuario, Pedido.Fecha, "
            + "DetallePedido.ProductoID, DetallePedido.Cantidad, DetallePedido.FormaEntrega, "
            + "Productos.Nombre "
            + "FROM Pedido "
            + "JOIN DetallePedido ON Pedido.PedidoID = DetallePedido.PedidoID "
            + "JOIN Productos ON DetallePedido.ProductoID = Productos.ProductoID;";

        
        String[] datos = new String[7];

        try {
            Statement st = objetoConexion.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("PedidoID");
                datos[1] = rs.getString("IDUsuario");
                datos[2] = rs.getString("Fecha");
                datos[3] = rs.getString("ProductoID");
                datos[4] = rs.getString("Cantidad");
                datos[5] = rs.getString("FormaEntrega");
                datos[6] = rs.getString("Nombre");
                
                modelo.addRow(datos);
            }
            paramTablaTotalPedidos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente los registros, error:" + e.toString());
            System.out.println(e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    // Método para seleccionar el reembolso y obtener su ID
    public void SeleccionarPedido(JTable paramTablaReembolso, JTextField paramID) {
        try {
            int fila = paramTablaReembolso.getSelectedRow();
            if (fila >= 0) {
                paramID.setText(paramTablaReembolso.getValueAt(fila, 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error:" + e.toString());
        }
    }

    // Método para alternar el estado de reembolso
    public void EliminarPedido(JTextField paramID){
        //Declarar parametros
        setCodigo(Integer.parseInt(paramID.getText()));
        ConexionBDD objetoConexion= new ConexionBDD();
        //Consulta SQL
        String consulta="DELETE FROM Pedido WHERE PedidoID=?;";
        try{
            //Conectar BDD
            CallableStatement cs= objetoConexion.Conectar().prepareCall(consulta);
            //Adquirir parametros
            cs.setInt(1, getCodigo());
            //Ejecutar
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se eliminó correctamente el pedido"); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se eliminó correctamente el registro, error:"+ e.toString())  ;
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
}