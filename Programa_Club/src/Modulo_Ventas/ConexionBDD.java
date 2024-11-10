package Modulo_Ventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Conexion a BDD
public class ConexionBDD {
    private Connection miConexion = null;

    public Connection Conectar() {
        try {
            String url = "jdbc:mysql://bbbx7cdcbcl53xxmjyxb-mysql.services.clever-cloud.com:21748/bbbx7cdcbcl53xxmjyxb";
            String user = "uwwqerjcglxxweor"; // Nombre de usuario
            String password = "vWobxeLnCiH11WTJg6N"; // Contraseña

            // Intenta establecer la conexión
            miConexion = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto a la bdd");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "No se conectó correctamente a la BDD: " + e.toString());
            System.out.println("No se conectó correctamente a la BDD:" + e.toString());
        }
        return miConexion; // Retorna la conexión (puede ser nula si hubo un error)
    }

    public void cerrarConexion() {
        try {
            if (miConexion != null && !miConexion.isClosed()) {
                miConexion.close(); // Cierra la conexión
                //JOptionPane.showMessageDialog(null, "Conexión cerrada");
                System.out.println("Conexion Cerrada");
            }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión: " + e.toString());
            System.out.println("No se pudo cerrar la conexión: " + e.toString());
        }
    }

}
