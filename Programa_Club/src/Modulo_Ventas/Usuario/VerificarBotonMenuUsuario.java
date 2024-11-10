package Modulo_Ventas.Usuario;
import Modulo_Ventas.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    //Verificar existencia de pedidos de usuario
    public boolean existePedidoUsuario(String usuarioID) {
        String sql = "SELECT COUNT(*) FROM Pedido WHERE IDUsuario=?";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuarioID); 
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
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
        String sql = "SELECT COUNT(*) FROM Reembolso_Pedido rp " +
                     "JOIN Pedido p ON rp.IDPedido = p.PedidoID " +
                     "WHERE p.IDUsuario = ? AND rp.Estado=1";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuarioID); 
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
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