/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author thiag
 */
//Verificar botones del menu
public class VerificarBotonMenu {
    //Declaracion de variables a usar
    private final ConexionBDD conexionBDD = new ConexionBDD();
    
    //Metodos
    //Verificar existencia de categoria
    public boolean existeCategoria() {
        String sql = "SELECT COUNT(*) FROM Categorias";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true si hay al menos una categoría.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }

    //Verificar existencia de producto
    public boolean existeProducto() {
        String sql = "SELECT COUNT(*) FROM Productos";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true si hay al menos un producto.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }
    
    //Verificar existencia de pedidos
    public boolean existePedido() {
        String sql = "SELECT COUNT(*) FROM Pedido";
        try (Connection conn = conexionBDD.Conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
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
    
    //Verificar existencia de reembolsos
    public boolean existeReembolso() {
        String sql = "SELECT COUNT(*) FROM Reembolso_Pedido;";
        try (Connection conn = conexionBDD.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true si hay al menos un reembolso.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBDD.cerrarConexion();
        }
        return false;
    }
}
