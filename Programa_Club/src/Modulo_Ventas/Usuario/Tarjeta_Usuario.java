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
import java.text.SimpleDateFormat;
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

    public boolean GuardarDatosTarjeta(String usuarioID, JTextField JTextField_NumTarjeta, JTextField JTextField_NombreTitular,JTextField JTextField_Mes, JTextField JTextField_Anio, JTextField JTextField_CodigoSeguridad,JComboBox Combo_TipoTarjeta) {
         ConexionBDD objetoConexion = new ConexionBDD();
         String sql = "INSERT INTO Tarjeta (IDUsuario, NumeroTarjeta, CodigoSeguridad, Vencimiento, Tipo,Titular) VALUES (?, ?, ?, ?, ?,?)";

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
             ps.setString(6,nombreTitular);

             int resultado = ps.executeUpdate();

             if (resultado > 0) {
                 JOptionPane.showMessageDialog(null, "Datos de la tarjeta guardados correctamente.");
                 return true;
             } else {
                 JOptionPane.showMessageDialog(null, "No se pudo guardar los datos de la tarjeta.");
                 return false;
             }

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Error: Verifica que el número de tarjeta y el código de seguridad sean numéricos. " + e.getMessage());
             return false;
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al guardar los datos de la tarjeta: " + e.getMessage());
             return false;
         } finally {
             objetoConexion.cerrarConexion();
         }
     }
    
    public void MostrarTarjetas(String usuarioID, JTable tablaTarjetas){
        ConexionBDD objetoConexion = new ConexionBDD();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql="";
        modelo.addColumn("ID");
        modelo.addColumn("Tipo");
        modelo.addColumn("Numero");
        modelo.addColumn("Titular");
         
        tablaTarjetas.setModel(modelo);
        
        sql="SELECT TarjetaID,Tipo,NumeroTarjeta,Titular FROM Tarjeta WHERE IDUsuario = ?";
        
        try{
            PreparedStatement ps = objetoConexion.Conectar().prepareStatement(sql);
            ps.setString(1, usuarioID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("TarjetaID");
                String tipo = rs.getString("Tipo");
                String numero = rs.getString("NumeroTarjeta");
                String titular = rs.getString("Titular");
                
                modelo.addRow(new Object[]{id,tipo,numero,titular});
            }
            tablaTarjetas.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al mostrar usuarios, error: " + e.toString());
        }finally{
            objetoConexion.cerrarConexion();
        }
        
    
    }
    
    public void SeleccionarTarjetas(JTable tablaTarjetas,JComboBox<String> combo_TipoTarjeta, JTextField numTarjeta, JTextField nombreTitular, JTextField mes, JTextField anio, JTextField codigoSeguridad){
        int fila = tablaTarjetas.getSelectedRow();
        if (fila >= 0) {
            String id = tablaTarjetas.getValueAt(fila,0).toString();
            ConexionBDD objetoConexion = new ConexionBDD();
            try{
                String consulta = "SELECT Tipo, NumeroTarjeta, Titular, Vencimiento, CodigoSeguridad FROM Tarjeta WHERE TarjetaID = ?";
                PreparedStatement ps = objetoConexion.Conectar().prepareStatement(consulta);
                ps.setString(1,id);
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String tipo = rs.getString("Tipo");
                    combo_TipoTarjeta.setSelectedItem(tipo);
                   
                    numTarjeta.setText("" + rs.getLong("NumeroTarjeta"));
                  
                    nombreTitular.setText(rs.getString("Titular"));
                    codigoSeguridad.setText("" + rs.getInt("CodigoSeguridad"));
                    
                    java.sql.Date fechaSQL = rs.getDate("Vencimiento");
                    if (fechaSQL != null) {
                        
                        SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
                        SimpleDateFormat formatoAnio = new SimpleDateFormat("yy");

                        java.util.Date fechaUtil = new java.util.Date(fechaSQL.getTime()); 
                        mes.setText(formatoMes.format(fechaUtil));  
                        anio.setText(formatoAnio.format(fechaUtil)); 
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al seleccionar la tarjeta" + e.toString());
            }finally {
                objetoConexion.cerrarConexion();
            }
            
        }
    }

    public Boolean VerificarExistencia(String usuarioID, JTextField numeroTarjeta){
        ConexionBDD objetoConexion = new ConexionBDD();
        String consulta = "SELECT * FROM Tarjeta WHERE IDUsuario = ? and NumeroTarjeta = ?";
        try{
            CallableStatement cs = objetoConexion.Conectar().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(usuarioID));
            cs.setLong(2, Long.parseLong(numeroTarjeta.getText()));
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error al verificar la existencia de la tarjeta: " + e.toString());
            return null;
        }finally{
            objetoConexion.cerrarConexion();
        }
    }
}


