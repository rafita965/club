package ModuloUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private int IDUsuario; // Variable para almacenar el ID del usuario

    // Constructor que recibe el IDUsuario
    public Menu(int IDUsuario) { 
        this.IDUsuario = IDUsuario; // Inicializa el ID del usuario
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        JButton btnHistorial = new JButton("Ver Informe");
        JButton btnSolicitudesDisciplina = new JButton("Enviar solicitudes\n para disciplinas");
        JButton btnSolicitudesCargo = new JButton("Enviar solicitudes\n para cargo");
        JButton btnConfiguracion = new JButton("Configuracion");
        JButton btnCerrarSesion = new JButton("Cerrar Sesión"); // Botón de cerrar sesión
        
        // Acción para el botón de historial
        btnHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre el historial completo al hacer clic en el botón
                new Informe(IDUsuario).setVisible(true); // Pasa el ID al crear Informe
                dispose(); // Cierra la ventana del menú
            }
        });

        // Acción para el botón de cerrar sesión
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Regresar a la pantalla de inicio
                InicioSesion inicio = new InicioSesion(-1,-1); // Asegúrate de que Inicio esté bien definido
                inicio.setVisible(true);
                dispose(); // Cierra la ventana del menú
            }
        });
        
        // Acción para el botón de solicitudes de cargo
        btnSolicitudesCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pasa el IDUsuario al crear SolicitudesCargo
                new SolicitudesCargo(IDUsuario).setVisible(true);
                dispose(); // Cierra la ventana del menú
            }
        });
        
        btnSolicitudesDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pasa el IDUsuario al crear SolicitudesCargo
                new SolicitudesDisciplina(IDUsuario).setVisible(true);
                dispose(); // Cierra la ventana del menú
            }
        });
        btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pasa el IDUsuario al crear SolicitudesCargo
                new Configuracion(IDUsuario).setVisible(true);
                dispose(); // Cierra la ventana del menú
            }
        });
        // Añadir botones al panel
        panel.add(btnHistorial);
        panel.add(btnSolicitudesDisciplina);
        panel.add(btnSolicitudesCargo);
        panel.add(btnConfiguracion);
        panel.add(btnCerrarSesion); // Añadir el botón de cerrar sesión
        
        
        add(panel);
        
        setTitle("Menú Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Este main solo se usa para pruebas independientes, se espera que la instancia se cree desde Inicio
        int IDUsuario = 1; // Cambia esto para obtener el ID correcto
        java.awt.EventQueue.invokeLater(() -> {
            new Menu(IDUsuario).setVisible(true);
        });
    }
}
