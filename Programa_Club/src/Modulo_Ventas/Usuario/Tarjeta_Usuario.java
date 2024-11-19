/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas.Usuario;
import Modulo_Ventas.ConexionBDD;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JComboBox;
/**
 *
 * @author gabrielv170
 */
//Verificacion de tarjeta de usuario
public class Tarjeta_Usuario {
    //Metodos
    //Verificar de que empresa es la tarjeta
    
    
    public boolean AnalizarEmpresa(JTextField numeroTarjeta) {
        String tarjeta = numeroTarjeta.getText();

        if (tarjeta.length() == 16) {
            if (AnalizarValidez(tarjeta)) {
                if (tarjeta.startsWith("4")) {
                    JOptionPane.showMessageDialog(null, "La tarjeta es válida y es de Visa.");
                    return true;
                }
                else if (tarjeta.startsWith("51") || tarjeta.startsWith("52") || tarjeta.startsWith("53") || 
                         tarjeta.startsWith("54") || tarjeta.startsWith("55") || 
                         (Integer.parseInt(tarjeta.substring(0, 4)) >= 2221 && Integer.parseInt(tarjeta.substring(0, 4)) <= 2720)) {
                    JOptionPane.showMessageDialog(null, "La tarjeta es válida y es de MasterCard.");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "La tarjeta es válida, pero no es ni Visa ni MasterCard.");
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La tarjeta no es válida.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tarjeta debe tener entre 16 dígitos.");
            return false;
        }
    }

    //Verificar los digitos
    public boolean AnalizarValidez(String tarjeta) {
        int suma = 0;
        boolean esSegundoDigito = false;
        for (int i = tarjeta.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(tarjeta.charAt(i));

            if (esSegundoDigito) {
                digito *= 2;  
                if (digito > 9) {
                    digito -= 9;  
                }
            }

            suma += digito;
            esSegundoDigito = !esSegundoDigito; 
        }
        return suma % 10 == 0;
    }

    public void GuardarDatosTarjeta(String usuarioID, JTextField JTextField_NumTarjeta, JTextField JTextField_NombreTitular,JTextField JTextField_Mes, JTextField JTextField_Anio, JTextField JTextField_CodigoSeguridad,JComboBox Combo_TipoTarjeta) {
         ConexionBDD objetoConexion = new ConexionBDD();
         String sql = "INSERT INTO Tarjeta (IDUsuario, NumeroTarjeta, CodigoSeguridad, Vencimiento, Tipo) VALUES (?, ?, ?, ?, ?)";

         try {

             String numeroTarjetaTexto = JTextField_NumTarjeta.getText().trim();
             String nombreTitular = JTextField_NombreTitular.getText().trim();
             String mes = JTextField_Mes.getText().trim();
             String anio = JTextField_Anio.getText().trim();
             String codigoSeguridadTexto = JTextField_CodigoSeguridad.getText().trim();
             String tipoTarjeta = Combo_TipoTarjeta.getSelectedItem().toString();

             long numeroTarjeta = Long.parseLong(numeroTarjetaTexto); 
             int codigoSeguridad = Integer.parseInt(codigoSeguridadTexto); 
             String fechaVencimiento = "20" + anio + "-" + mes + "-01"; 

             PreparedStatement ps = objetoConexion.Conectar().prepareStatement(sql);
             ps.setInt(1, Integer.parseInt(usuarioID));   
             ps.setLong(2, numeroTarjeta);              
             ps.setInt(3, codigoSeguridad);              
             ps.setDate(4, java.sql.Date.valueOf(fechaVencimiento)); 
             ps.setString(5, tipoTarjeta);             

             int resultado = ps.executeUpdate();

             if (resultado > 0) {
                 JOptionPane.showMessageDialog(null, "Datos de la tarjeta guardados correctamente.");
             } else {
                 JOptionPane.showMessageDialog(null, "No se pudo guardar los datos de la tarjeta.");
             }

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Error: Verifica que el número de tarjeta y el código de seguridad sean numéricos. " + e.getMessage());
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al guardar los datos de la tarjeta: " + e.getMessage());
         } finally {
             objetoConexion.cerrarConexion();
         }
     }
}


