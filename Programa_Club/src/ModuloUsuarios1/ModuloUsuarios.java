package ModuloUsuarios1;

public class ModuloUsuarios {
    private static int IDUsuario;
    private static int IDAdministrador;
    public void ModuloUsuarios(int IDUsuario, int IDAdministrador){
        this.IDUsuario=IDUsuario;
        this.IDAdministrador=IDAdministrador;
    }
    public static void main(String[] args) {
        
        // Crear una nueva instancia de la clase de interfaz gráfica (por ejemplo, Inicio)
        InicioSesion ventana;
        ventana = new InicioSesion(IDUsuario, IDAdministrador);
        ventana.setVisible(true); // Hacer visible la ventana
        
        // Probar la conexión después de que la ventana sea visible
        DatabaseConnection.testConnection(); // Asegúrate de que el método testConnection() es estático
    }
}
