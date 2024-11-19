package ModuloUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseConnection {
    // Detalles de la conexión
    private static final String URL = "jdbc:mysql://bbbx7cdcbcl53xxmjyxb-mysql.services.clever-cloud.com:21748/bbbx7cdcbcl53xxmjyxb";
    private static final String USER = "uwwqerjcglxxweor"; 
    private static final String PASSWORD = "vWobxeLnCiH11WTJg6N"; 

    // Método para establecer la conexión
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } 
        return connection;
    }

    // Método para verificar si un usuario ya existe en la base de datos
public static boolean usuarioCompletoExiste(String nombreUsuario, String email, int IDUsuario) {
    String sql = "SELECT * FROM Usuario WHERE (Nombre_usuario = ? OR Email = ?) AND (IDUsuario != ?)";
    try (Connection connection = getConnection(); 
         PreparedStatement pstmt = connection.prepareStatement(sql)) {
        pstmt.setString(1, nombreUsuario);
        pstmt.setString(2, email);
        pstmt.setInt(3, IDUsuario);
        try (ResultSet rs = pstmt.executeQuery()) {
            return rs.next();  // Retorna true si encuentra un registro con todos los campos coincidentes
        }
    } catch (SQLException e) {
        System.out.println("Error al verificar el usuario: " + e.getMessage());
    }
    return false;
}

public static void asignarMembresiaGratuita(int IDUsuario) throws SQLException {
    String sql = "INSERT INTO Socio (IDUsuario, IDMembresia) VALUES (?, (SELECT IDMembresia FROM Membresia WHERE Nombre = 'gratuito'))";
    
    try (Connection connection = getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setInt(1, IDUsuario);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Membresía gratuita asignada exitosamente.");
        } else {
            throw new SQLException("No se pudo asignar la membresía gratuita.");
        }
    } catch (SQLException e) {
        System.out.println("Error al asignar membresía gratuita: " + e.getMessage());
        throw e;
    }
}
public static void actualizarMembresia(int IDUsuario, int IDMembresia) throws SQLException {
    String sql = "UPDATE Socio SET IDMembresia = ? WHERE IDUsuario = ?";
    
    try (Connection connection = getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, IDMembresia);
        statement.setInt(2, IDUsuario);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Membresía actualizada exitosamente.");
        } else {
            throw new SQLException("Error al actualizar la membresia.");
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar la membresia: " + e.getMessage());
        throw e;
    }
}
    // Método para registrar un usuario en la base de datos
    public static int registrarUsuario(String usuario, String contrasena, String direccion, String email) throws SQLException {
    String sql = "INSERT INTO Usuario (Nombre_usuario, Contraseña, Direccion, Email) VALUES (?, ?, ?, ?)";
    try (Connection connection = getConnection();
         PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

        statement.setString(1, usuario);
        statement.setString(2, contrasena);
        statement.setString(3, direccion);
        statement.setString(4, email);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Retorna el IDUsuario recién creado
                }
            }
            throw new SQLException("No se pudo obtener el ID del usuario registrado.");
        } else {
            throw new SQLException("No se pudo registrar el usuario.");
        }
    } catch (SQLException e) {
        System.out.println("Error al registrar el usuario: " + e.getMessage());
        throw e;
    }
}
public static boolean solicitudExiste(int IDUsuario, String descripcion, String tipo) throws SQLException {
    String sql = "SELECT COUNT(*) FROM Solicitud WHERE IDUsuario = ? AND Tipo = ?";
    
    try (Connection connection = getConnection();
         PreparedStatement pstmt = connection.prepareStatement(sql)) {

        pstmt.setInt(1, IDUsuario);
        pstmt.setString(2, tipo);

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;  // Retorna true si ya existe la solicitud
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al verificar la solicitud: " + e.getMessage());
        throw e;
    }
    return false;
}

    public static void enviarSolicitud(int IDUsuario, String descripcion, String tipo) throws SQLException {
    // Verificar si ya existe una solicitud
    if (solicitudExiste(IDUsuario, descripcion, tipo)) {
        throw new SQLException("Ya existe una solicitud de " + tipo + " para " + descripcion + ".");
    }

    // Si no existe, proceder a insertar la solicitud
    String sql = "INSERT INTO Solicitud (IDUsuario, Descripcion, Tipo) VALUES (?, ?, ?)";
    
    try (Connection connection = getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setInt(1, IDUsuario);
        statement.setString(2, descripcion);
        statement.setString(3, tipo);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Solicitud enviada correctamente.");
        } else {
            throw new SQLException("No se pudo enviar la solicitud.");
        }
    } catch (SQLException e) {
        System.out.println("Error al enviar la solicitud: " + e.getMessage());
        throw e;
    }
}

    public static void ModificarDatos(String usuario, String contrasena, String direccion, String email, int IDUsuario) throws SQLException {
    String sql = "UPDATE Usuario SET Nombre_usuario = ?, Contraseña = ?, Direccion = ?, Email = ? WHERE IDUsuario = ?";
    try (Connection connection = getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setString(1, usuario);
        statement.setString(2, contrasena);
        statement.setString(3, direccion);
        statement.setString(4, email);
        statement.setInt(5, IDUsuario);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Usuario modificado exitosamente.");
        } else {
            throw new SQLException("No se pudo modificar el usuario. Usuario no encontrado.");
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar el usuario: " + e.getMessage());
        throw e;
    }
}

    // Método para probar la conexión a la base de datos
    public static void testConnection() {
        try (Connection conn = getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("La conexión está activa.");
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (SQLException e) {
            System.out.println("Error al probar la conexión: " + e.getMessage());
        }
    }
}