package Modulo_Ventas.Usuario;
import Modulo_Ventas.ConexionBDD;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.sql.*;

/**
 *
 * @author thiag
 */
//Verificar botones del menu de usuario
public class VerificarBotonMenuUsuario {
    //Declaracion de variables
    private final ConexionBDD conexionBDD = new ConexionBDD();
    //Metodos
    //Verificar existencia de productos de usuario
    public boolean existeProducto() {
        String sql = "SELECT COUNT(*) FROM Productos WHERE Estado=1";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            if (rs.next()) {
                return rs.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }
    public boolean existePedidoUsuario(String usuarioID) {
        String sql = "SELECT Fecha FROM Pedido WHERE IDUsuario = ? " +
                 "AND Pedido.PedidoID NOT IN (SELECT IDPedido FROM Reembolso_Pedido) " +
                 "ORDER BY Fecha DESC LIMIT 1";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuarioID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Obtener la fecha de la base de datos
                    Date fechaPedido = rs.getDate("Fecha");
                    LocalDate fechaPedidoLocal = fechaPedido.toLocalDate();
                   
                    // Obtener la fecha actual del sistema
                    LocalDate fechaActual = LocalDate.now();
                    // Calcular la diferencia en días
                    long diferenciaDias = ChronoUnit.DAYS.between(fechaPedidoLocal, fechaActual);

                    // Verificar si la diferencia es menor a 30 días
                    return diferenciaDias < 30;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }
    //Verificar existencia de reembolso de usuario
    public boolean existeReembolsoUsuario(String usuarioID) {
        String sql = "SELECT FechaReembolso FROM Reembolso_Pedido rp " +
                     "JOIN Pedido p ON rp.IDPedido = p.PedidoID " +
                     "WHERE p.IDUsuario = ? AND rp.Estado=1 "+ 
                     "ORDER BY FechaReembolso DESC LIMIT 1";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuarioID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Obtener la fecha de la base de datos
                    Date fechaReembolso = rs.getDate("FechaReembolso");
                    LocalDate fechaReembolsoLocal = fechaReembolso.toLocalDate();
                   
                    // Obtener la fecha actual del sistema
                    LocalDate fechaActual = LocalDate.now();
                    // Calcular la diferencia en días
                    long diferenciaDias = ChronoUnit.DAYS.between(fechaReembolsoLocal, fechaActual);

                    // Verificar si la diferencia es menor a 30 días
                    return diferenciaDias < 30;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }
}