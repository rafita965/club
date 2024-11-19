
package gestiondeeventos;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JSpinner;
/**
 *
 * @author tm_galli
 */
public class CRUDEventos {
    
//SUBIR ESTADIO
    
public void subirEstadio(JTextField nombreField, JTextField direccionField, JTextField cantsectoresField) {
    // Instancia de la clase DatabaseConnection
    DatabaseConnection estadio = new DatabaseConnection();
    String consulta = "INSERT INTO Estadio(Nombre, Direccion, cantSectores) VALUES (?, ?, ?);";
    String verificarConsulta = "SELECT COUNT(*) AS total FROM Estadio;";
    
    try {
        // Verificar si ya existe un estadio en la base de datos
        CallableStatement verificarStmt = (CallableStatement) estadio.Conectar().prepareCall(verificarConsulta);
        ResultSet rs = verificarStmt.executeQuery();
        
        if (rs.next() && rs.getInt("total") > 0) {
            JOptionPane.showMessageDialog(null, "Ya existe un estadio registrado. Solo se permite ingresar un estadio.");
            nombreField.setText("");
            direccionField.setText("");
            cantsectoresField.setText("");
            return; // Cancelar la operación si ya existe un estadio
        }

        // Si no existe un estadio, proceder con la inserción
        CallableStatement cs = (CallableStatement) estadio.Conectar().prepareCall(consulta);
        cs.setString(1, nombreField.getText());
        cs.setString(2, direccionField.getText());
        cs.setInt(3, Integer.parseInt(cantsectoresField.getText()));
        cs.execute();

        JOptionPane.showMessageDialog(null, "Se guardó el estadio correctamente");
        nombreField.setText("");
        direccionField.setText("");
        cantsectoresField.setText("");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.toString());
    } finally {
        estadio.cerrarConexion();
    }
}

//SUBIR CALENDARIO

    public void guardarCalendario(JDateChooser fecha, JSpinner hora, JTextField descripcion, JTextField lugar) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consultaExistente = "SELECT COUNT(*) FROM Calendario WHERE Fecha = ?"; // Verifica si ya existe un evento en la misma fecha
        String consultaInsertar = "INSERT INTO Calendario(Fecha, Hora, Descripcion, Lugar) VALUES (?, ?, ?, ?);";

        try {
            // Obtener la fecha seleccionada en el JDateChooser
            Date fechas = fecha.getDate();
            if (fechas == null) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
                return;
            }

            java.sql.Date fechaSQL = new java.sql.Date(fechas.getTime());

            // Conexión para verificar si ya existe un evento en esa fecha
            PreparedStatement ps = estadio.Conectar().prepareStatement(consultaExistente);
            ps.setDate(1, fechaSQL);
            ResultSet rs = ps.executeQuery();
            rs.next();

            int count = rs.getInt(1);

            if (count > 0) {
                // Si ya existe un evento en esa fecha
                JOptionPane.showMessageDialog(null, "Ya existe un evento en esta fecha. No se puede agregar otro.");
                return; // No proceder con la inserción
            }

            // Si no existe un evento, se procede a guardar el nuevo evento
            CallableStatement cs = estadio.Conectar().prepareCall(consultaInsertar);

            // Obtener la hora desde el JSpinner y convertirla en formato adecuado
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String horaString = sdf.format(hora.getValue());

            // Asignación de valores a los parámetros
            cs.setDate(1, fechaSQL);
            cs.setString(2, horaString);
            cs.setString(3, descripcion.getText());
            cs.setString(4, lugar.getText());

            // Ejecutar la inserción
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardó el calendario correctamente");

            // Limpiar los campos después de guardar
            fecha.setDate(null);
            hora.setValue(new java.util.Date());
            descripcion.setText("");
            lugar.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.toString());
        } finally {
            // Cierre de recursos
            estadio.cerrarConexion();
        }
    }

//MODIFICA ESTADIO

    public void llenarEstadiosComboBox(JComboBox<String> estadioComboBox) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "SELECT Nombre FROM Estadio";

        try {
            // Conexión a la base de datos
            PreparedStatement ps = estadio.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            // Limpiar el ComboBox para evitar duplicados
            estadioComboBox.removeAllItems();

            // Rellenar el ComboBox con los nombres de los estadios
            while (rs.next()) {
                estadioComboBox.addItem(rs.getString("Nombre"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar estadios: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }

    public void modificarEstadio(String nombreOriginal, JTextField nombreField, JTextField direccionField, JTextField cantsectoresField) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "UPDATE Estadio SET Nombre = ?, Direccion = ?, cantSectores = ? WHERE Nombre = ?;";

        try {
            CallableStatement cs = estadio.Conectar().prepareCall(consulta);

            // Asignar los nuevos valores a los parámetros de la consulta
            cs.setString(1, nombreField.getText());
            cs.setString(2, direccionField.getText());
            cs.setInt(3, Integer.parseInt(cantsectoresField.getText()));
            cs.setString(4, nombreOriginal); // Usamos el nombre original para identificar el estadio

            cs.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estadio actualizado correctamente");
            nombreField.setText("");
            direccionField.setText("");
            cantsectoresField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al actualizar el estadio: " + e.toString());
        } finally {
            estadio.cerrarConexion();
        }
    }


//CALENDARIO
    public void llenarCalendarioComboBox(JComboBox<String> calendarioComboBox) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "SELECT idCalendario FROM Calendario";

        try {
            // Conexión a la base de datos
            PreparedStatement ps = estadio.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            // Limpiar el ComboBox para evitar duplicados
            calendarioComboBox.removeAllItems();

            // Rellenar el ComboBox con los nombres de los estadios
            while (rs.next()) {
                calendarioComboBox.addItem(rs.getString("idCalendario"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Calendario: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }
    

    public void subireVENTO(JDateChooser fecha, JSpinner hora, JTextField descField, JTextField nombrevento, JComboBox<String> tipojComboBox3) {
        DatabaseConnection estadio = new DatabaseConnection();

        // Consultas
        String consultaNombreEstadio = "SELECT Nombre FROM Estadio LIMIT 1;";
        String consultaExisteFecha = "SELECT COUNT(*) FROM Calendario WHERE Fecha = ?;";
        String consultaCalendario = "INSERT INTO Calendario(Fecha, Hora, Descripcion, Lugar) VALUES (?, ?, ?, ?);";
        String consultaEvento = "INSERT INTO Evento(idEstadio, idCalendario, nombreEvento, tipoEvento, Descripcion) VALUES (?, ?, ?, ?, ?);";

        try {
            Connection conexion = estadio.Conectar();

            // Paso 1: Verificar si ya existe un evento en la misma fecha
            PreparedStatement psVerificarFecha = conexion.prepareStatement(consultaExisteFecha);
            Date fechas = fecha.getDate();
            if (fechas == null) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
                return;
            }

            java.sql.Date fechaSQL = new java.sql.Date(fechas.getTime());
            psVerificarFecha.setDate(1, fechaSQL);
            ResultSet rsFecha = psVerificarFecha.executeQuery();
            rsFecha.next();
            int eventosEnFecha = rsFecha.getInt(1);

            if (eventosEnFecha > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un evento en esta fecha. No se puede agregar otro.");
                return;
            }

            // Paso 2: Obtener el nombre del estadio
            PreparedStatement psEstadio = conexion.prepareStatement(consultaNombreEstadio);
            ResultSet rsEstadio = psEstadio.executeQuery();

            String lugarEstadio = "Estadio"; // Valor por defecto
            if (rsEstadio.next()) {
                lugarEstadio = rsEstadio.getString("Nombre");
            }

            // Paso 3: Insertar en la tabla Calendario
            PreparedStatement psCalendario = conexion.prepareStatement(consultaCalendario, Statement.RETURN_GENERATED_KEYS);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String horaString = sdf.format(hora.getValue());

            psCalendario.setDate(1, fechaSQL);
            psCalendario.setString(2, horaString);
            psCalendario.setString(3, descField.getText());
            psCalendario.setString(4, lugarEstadio);
            psCalendario.executeUpdate();

            // Obtener el idCalendario generado
            ResultSet rsCalendario = psCalendario.getGeneratedKeys();
            if (!rsCalendario.next()) {
                throw new SQLException("No se pudo obtener el ID del calendario.");
            }
            int idCalendario = rsCalendario.getInt(1);

            // Paso 4: Insertar en la tabla Evento
            PreparedStatement psEvento = conexion.prepareStatement(consultaEvento);

            psEvento.setInt(1, 1); // idEstadio
            psEvento.setInt(2, idCalendario); // idCalendario generado
            psEvento.setString(3, nombrevento.getText());
            psEvento.setString(4, (String) tipojComboBox3.getSelectedItem());
            psEvento.setString(5, descField.getText());
            psEvento.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se guardó el evento correctamente");

            // Limpiar los campos después de guardar
            fecha.setDate(null);
            hora.setValue(new java.util.Date());
            descField.setText("");
            nombrevento.setText("");
            tipojComboBox3.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.toString());
        } finally {
            estadio.cerrarConexion();
        }
    }

    public void llenartablacalendario(JTable calendarioTable) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "SELECT * FROM Calendario";

        try {
            // Conexión a la base de datos
            PreparedStatement ps = estadio.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            // Crear un DefaultTableModel
            DefaultTableModel model = new DefaultTableModel();

            // Obtener metadatos para agregar nombres de columnas dinámicamente
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rs.getMetaData().getColumnName(i));
            }

            // Poblar el DefaultTableModel con los datos de cada fila
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            // Asignar el modelo al JTable
            calendarioTable.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Calendario: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }
    
    public void agregarSector(JTextField nombreSectorField, JTextField cantFilasField, JTextField cantColumnasField) {
        DatabaseConnection estadio = new DatabaseConnection();

        try {
            // Obtener la cantidad máxima de sectores para el estadio con id = 1
            String consultaCantidadSectores = "SELECT cantSectores FROM Estadio WHERE idEstadio = 1";
            PreparedStatement psCantidadSectores = estadio.Conectar().prepareStatement(consultaCantidadSectores);
            ResultSet rsCantidadSectores = psCantidadSectores.executeQuery();

            if (rsCantidadSectores.next()) {
                int cantidadMaximaSectores = rsCantidadSectores.getInt("cantSectores");

                // Contar los sectores actuales para el estadio con id = 1 en la tabla 'sectores'
                String consultaSectoresActuales = "SELECT COUNT(*) AS totalSectores FROM Sector WHERE idEstadio = 1";
                PreparedStatement psSectoresActuales = estadio.Conectar().prepareStatement(consultaSectoresActuales);
                ResultSet rsSectoresActuales = psSectoresActuales.executeQuery();

                if (rsSectoresActuales.next()) {
                    int sectoresActuales = rsSectoresActuales.getInt("totalSectores");

                    if (sectoresActuales < cantidadMaximaSectores) {
                        // Insertar el nuevo sector con idEstadio = 1
                        String consultaInsertar = "INSERT INTO Sector (idEstadio, nombreSector, Fila, Columna) VALUES (1, ?, ?, ?)";
                        PreparedStatement psInsertar = estadio.Conectar().prepareStatement(consultaInsertar);
                        psInsertar.setString(1, nombreSectorField.getText());
                        psInsertar.setInt(2, Integer.parseInt(cantFilasField.getText()));
                        psInsertar.setInt(3, Integer.parseInt(cantColumnasField.getText()));

                        psInsertar.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Sector agregado correctamente.");

                        // Limpiar los campos de entrada
                        nombreSectorField.setText("");
                        cantFilasField.setText("");
                        cantColumnasField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más sectores. Ya alcanzaste el límite.");
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar sector: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }
    
    //PRECIO SECTOR
public void precioSector(JComboBox<String> EventoComboBox, JComboBox<String> SectorComboBox, JTextField precioField) {
    DatabaseConnection estadio = new DatabaseConnection();
    String consulta = "INSERT INTO PrecioSectorEvento(idEvento, idSector, Precio) VALUES (?, ?, ?);";

    try {
        CallableStatement cs = estadio.Conectar().prepareCall(consulta);

        // Validar y obtener el idEvento
        String eventoSeleccionado = (String) EventoComboBox.getSelectedItem();
        if (eventoSeleccionado == null || !eventoSeleccionado.contains("_")) {
            JOptionPane.showMessageDialog(null, "Seleccione un evento válido.");
            return;
        }
        String[] eventoParts = eventoSeleccionado.split("_");
        int idEvento = Integer.parseInt(eventoParts[1]);
        cs.setInt(1, idEvento);

        // Validar y obtener el idSector
        String sectorSeleccionado = (String) SectorComboBox.getSelectedItem();
        if (sectorSeleccionado == null || !sectorSeleccionado.contains("_")) {
            JOptionPane.showMessageDialog(null, "Seleccione un sector válido.");
            return;
        }
        String[] sectorParts = sectorSeleccionado.split("_");
        int idSector = Integer.parseInt(sectorParts[1]);
        cs.setInt(2, idSector);

        // Validar y obtener el precio
        int precio;
        try {
            precio = Integer.parseInt(precioField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio válido.");
            return;
        }
        cs.setInt(3, precio);

        // Ejecutar consulta
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Precio ingresado correctamente");

        // Limpiar campo de precio
        precioField.setText("");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al ingresar el precio: " + e.toString());
    } finally {
        estadio.cerrarConexion();
    }
}

    public void Precio_EventoComboBox(JComboBox<String> EventoComboBox) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "SELECT idEvento, nombreEvento FROM Evento";

        try {
            PreparedStatement ps = estadio.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            EventoComboBox.removeAllItems(); // Limpiar el ComboBox

            while (rs.next()) {
                // Formatear como "NombreEvento_idEvento"
                String eventoDisplay = rs.getString("nombreEvento") + "_" + rs.getInt("idEvento");
                EventoComboBox.addItem(eventoDisplay);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar eventos: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }

    public void Precio_SectorComboBox(JComboBox<String> SectorComboBox) {
        DatabaseConnection estadio = new DatabaseConnection();
        String consulta = "SELECT idSector, NombreSector FROM Sector";

        try {
            PreparedStatement ps = estadio.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            SectorComboBox.removeAllItems(); // Limpiar el ComboBox

            while (rs.next()) {
                // Formatear como "NombreSector_idSector"
                String sectorDisplay = rs.getString("NombreSector") + "_" + rs.getInt("idSector");
                SectorComboBox.addItem(sectorDisplay);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar sectores: " + e.getMessage());
        } finally {
            estadio.cerrarConexion();
        }
    }
}