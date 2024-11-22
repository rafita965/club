package Modulo_Ventas.Usuario;
import Modulo_Ventas.ConexionBDD;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

/**
 *
 * @author tm_galli
 */
//Gestionar reembolso
public class Reembolso_Usuario {
    //Declaracion de variables
    private Date fecha;
    private String Nombre_Producto;
    private String Motivo;
    private double Precio;
    private int CategoriaID;
    private int IDPedido;
    private int codigo;
    private String productoID;
    private int IDPedidoSeleccionado;
    
    //Getter y setter
    public int getIDPedidoSeleccionado() {
        return IDPedidoSeleccionado;
    }

    public void setIDPedidoSeleccionado(int IDPedidoSeleccionado) {
        this.IDPedidoSeleccionado = IDPedidoSeleccionado;
    }
 
    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
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
    
    //Metodos
    //Insertar
    public void InsertarMotivo(JTextField paramMotivo, JDateChooser paramFecha) {
        setMotivo(paramMotivo.getText());
        java.util.Date fecha = paramFecha.getDate();
        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
            return;
        }
        ConexionBDD objetoConexion = new ConexionBDD();
        String consulta = "INSERT INTO Reembolso_Pedido (IDPedido, FechaReembolso, Motivo, Estado) values (?, ?, ?, 0);";
        try {
            CallableStatement cs = objetoConexion.Conectar().prepareCall(consulta);
            System.out.println("IDPedidoSeleccionado a insertar: " + getIDPedidoSeleccionado());
            System.out.println(getIDPedidoSeleccionado());
            cs.setInt(1, getIDPedidoSeleccionado()); // Asegúrate de que sea un valor existente

            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            cs.setDate(2, fechaSQL);
            cs.setString(3, getMotivo());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Se confirmó el reembolso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se confirmó correctamente el reembolso, error: " + e.toString());
            System.out.println(e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
    // Método para mostrar los reembolsos en la tabla
    public void MostrarProductos(JTable paramTablaProductos, String usuarioID) {
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<>(modelo);
        paramTablaProductos.setRowSorter(ordenarTabla);

        modelo.addColumn("PedidoID"); 
        modelo.addColumn("ProductoID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("FechaPedido"); // Nueva columna para mostrar la fecha

        paramTablaProductos.setModel(modelo);

        String sql = "SELECT Pedido.PedidoID, Productos.ProductoID, Productos.Nombre, Productos.Precio, " +
                     "Categorias.NombreCategoria, DetallePedido.Cantidad, Pedido.Fecha " +
                     "FROM Pedido " +
                     "INNER JOIN DetallePedido ON Pedido.PedidoID = DetallePedido.PedidoID " +
                     "INNER JOIN Productos ON DetallePedido.ProductoID = Productos.ProductoID " +
                     "INNER JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID " +
                     "WHERE Pedido.IDUsuario = ? " +
                     "AND Pedido.PedidoID NOT IN (SELECT IDPedido FROM Reembolso_Pedido);";
        try (PreparedStatement ps = objetoConexion.Conectar().prepareStatement(sql)) {
            ps.setString(1, usuarioID); 
            ResultSet rs = ps.executeQuery();
            LocalDate fechaActual = LocalDate.now(); // Fecha actual del sistema

            while (rs.next()) {
                // Recuperar y procesar la fecha del pedido
                Date fechaPedidoSQL = rs.getDate("Fecha");
                LocalDate fechaPedido = fechaPedidoSQL.toLocalDate();

                // Calcular la diferencia en días
                long diferenciaDias = ChronoUnit.DAYS.between(fechaPedido, fechaActual);

                // Si la diferencia es mayor a 30 días, omitir el registro
                if (diferenciaDias > 30) {
                    continue;
                }

                // Agregar el registro a la tabla
                String[] datos = new String[7];
                datos[0] = rs.getString("PedidoID");       
                datos[1] = rs.getString("ProductoID");     
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Precio");
                datos[4] = rs.getString("NombreCategoria");
                datos[5] = rs.getString("Cantidad");
                datos[6] = rs.getString("Fecha"); // Mostrar la fecha en la tabla
                modelo.addRow(datos);
            }

            // Ocultar columna PedidoID si es necesario
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
    public void SeleccionarProducto(JTable paramTablaProductos, JTextField paramID, JTextField paramNombreProducto, JTextField paramPrecioProducto, JTextField paramCategoria, JTextField paramCantidad) {
        try {
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >= 0) {
                setIDPedidoSeleccionado(Integer.parseInt(paramTablaProductos.getValueAt(fila, 0).toString()));
                paramID.setText(paramTablaProductos.getValueAt(fila, 1).toString()); // ProductoID
                paramNombreProducto.setText(paramTablaProductos.getValueAt(fila, 2).toString());
                paramPrecioProducto.setText(paramTablaProductos.getValueAt(fila, 3).toString());
                paramCategoria.setText(paramTablaProductos.getValueAt(fila, 4).toString());
                paramCantidad.setText(paramTablaProductos.getValueAt(fila, 5).toString());
                productoID = paramTablaProductos.getValueAt(fila, 1).toString(); // ProductoID
            } else {
                JOptionPane.showMessageDialog(null, "Fila no encontrada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.getMessage());
        }
    }

    //Cancelar_Reembolso
    public void SeleccionarReembolso(JTable paramTablaProductos, JTextField paramID) {
        try {
            int fila = paramTablaProductos.getSelectedRow();

            if (fila >= 0) {
                setIDPedidoSeleccionado(Integer.parseInt(paramTablaProductos.getValueAt(fila, 0).toString())); // PedidoID
                paramID.setText(paramTablaProductos.getValueAt(fila, 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no encontrada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.getMessage());
        }
    }
    public void EliminarReembolso(JTextField paramID) {
        setCodigo(Integer.parseInt(paramID.getText()));
        ConexionBDD objetoConexion = new ConexionBDD();

        // Primero verificamos si el reembolso tiene el estado 1
        String consultaEstado = "SELECT Estado FROM Reembolso_Pedido WHERE IDPedido = ?";
        try {
            PreparedStatement psEstado = objetoConexion.Conectar().prepareStatement(consultaEstado);
            psEstado.setInt(1, getCodigo());
            ResultSet rsEstado = psEstado.executeQuery();

            if (rsEstado.next()) {
                int estado = rsEstado.getInt("Estado");

                if (estado == 1) {
                    // Si el estado es 1, se devuelve la cantidad al stock
                    devolverStockAlProducto(getCodigo());
                }

                // Ahora eliminamos el reembolso
                String consultaEliminar = "DELETE FROM Reembolso_Pedido WHERE IDPedido = ? AND Estado = 1";
                PreparedStatement psEliminar = objetoConexion.Conectar().prepareStatement(consultaEliminar);
                psEliminar.setInt(1, getCodigo());
                int filasAfectadas = psEliminar.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Se eliminó correctamente el reembolso");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un reembolso con el ID especificado o ya está en otro estado.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el reembolso con el ID especificado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se eliminó correctamente el registro, error: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    private void devolverStockAlProducto(int idReembolso) {
        ConexionBDD objetoConexion = new ConexionBDD();

        try {
            // Obtener los productos y las cantidades del reembolso
            String consultaDetalle = 
                "SELECT dp.ProductoID, dp.Cantidad " +
                "FROM DetallePedido dp " +
                "JOIN Reembolso_Pedido rp ON dp.PedidoID = rp.IDPedido " +
                "WHERE rp.IDReembolso = ?";

            PreparedStatement psDetalle = objetoConexion.Conectar().prepareStatement(consultaDetalle);
            psDetalle.setInt(1, idReembolso);
            ResultSet rsDetalle = psDetalle.executeQuery();

            while (rsDetalle.next()) {
                int productoID = rsDetalle.getInt("ProductoID");
                int cantidad = rsDetalle.getInt("Cantidad");

                // Actualizar el stock de los productos
                String actualizarStock = "UPDATE Productos SET Stock = Stock + ? WHERE ProductoID = ?";
                PreparedStatement psUpdate = objetoConexion.Conectar().prepareStatement(actualizarStock);
                psUpdate.setInt(1, cantidad);
                psUpdate.setInt(2, productoID);
                psUpdate.executeUpdate();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al devolver el stock: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    //Mostrar reembolsos del usuario
    public void MostrarReembolso(JTable paramTablaProductos, String usuarioID) {
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<>(modelo);
        paramTablaProductos.setRowSorter(ordenarTabla);
        modelo.addColumn("PedidoID");
        modelo.addColumn("ProductoID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        paramTablaProductos.setModel(modelo);
        String sql = "SELECT Pedido.PedidoID, Productos.ProductoID, Productos.Nombre, Productos.Precio, " +
                     "Categorias.NombreCategoria, DetallePedido.Cantidad, Reembolso_Pedido.FechaReembolso " +
                     "FROM Pedido " +
                     "INNER JOIN DetallePedido ON Pedido.PedidoID = DetallePedido.PedidoID " +
                     "INNER JOIN Productos ON DetallePedido.ProductoID = Productos.ProductoID " +
                     "INNER JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID " +
                     "INNER JOIN Reembolso_Pedido ON Pedido.PedidoID = Reembolso_Pedido.IDPedido " + 
                     "WHERE Pedido.IDUsuario = ? " +
                     "AND Reembolso_Pedido.Estado = 1;";
        try (PreparedStatement ps = objetoConexion.Conectar().prepareStatement(sql)) {
            ps.setString(1, usuarioID); 
            ResultSet rs = ps.executeQuery();
            LocalDate fechaActual = LocalDate.now(); // Fecha actual del sistema
            while (rs.next()) {
                // Recuperar y procesar la fecha del pedido
                Date fechaPedidoSQL = rs.getDate("FechaReembolso");
                LocalDate fechaReembolso = fechaPedidoSQL.toLocalDate();

                // Calcular la diferencia en días
                long diferenciaDias = ChronoUnit.DAYS.between(fechaReembolso, fechaActual);

                // Si la diferencia es mayor a 30 días, omitir el registro
                if (diferenciaDias > 30) {
                    continue;
                }

                String[] datos = new String[6];
                datos[0] = rs.getString("PedidoID");
                datos[1] = rs.getString("ProductoID");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Precio");
                datos[4] = rs.getString("NombreCategoria");
                datos[5] = rs.getString("Cantidad");
                modelo.addRow(datos);
            }
            paramTablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
            paramTablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
            paramTablaProductos.getColumnModel().getColumn(0).setWidth(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los registros, error: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
}
 
