/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Entradas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author tm_galli
 */
public class CodigoNotificaciones {
    BDD.DBConexion conexion = new BDD.DBConexion();
    private int usuarioID;

        public CodigoNotificaciones(int usuarioID){
            this.usuarioID = usuarioID;
        }
    
    public void aceptarSolicitud(JTable tblNotificaciones,int index){
        try{
            String consulta = "CALL aceptarSolicitud(?,?,?);";
           
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, usuarioID);
            String enunciado = (String)tblNotificaciones.getValueAt(index, 2);
            ps.setString(2, enunciado.substring(4));
            System.out.println(enunciado.substring(4));
            ps.setInt(3, (Integer)tblNotificaciones.getValueAt(index, 0));
            ps.executeUpdate();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al aceptar solicitud: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
    
    public void cargarNotificaciones(JTable tablaNotificaciones){
        DefaultTableModel modelo = (DefaultTableModel) tablaNotificaciones.getModel();
        modelo.setRowCount(1);
        modelo.setValueAt(null, 0, 0);
        modelo.setValueAt(null, 0, 1);
        modelo.setValueAt(null, 0, 2);
       
        try{
            String consulta = "SELECT NotificacionID,Asunto,Enunciado FROM Notificacion WHERE IDUsuario=? OR IDUsuario=null;";
           
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, usuarioID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id= rs.getInt("NotificacionID");
                String asunto= rs.getString("Asunto");
                String enunciado= rs.getString("Enunciado");
               
                modelo.addRow(new Object[] {id,asunto,enunciado});
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al consultar notificaciones: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }

    public void filtrarNotificaciones(JTextField txtAsunto, JTable tablaNotificaciones){
            DefaultTableModel modelo = (DefaultTableModel) tablaNotificaciones.getModel();
            modelo.setRowCount(1);

            try{
                String consulta = "SELECT NotificacionID,Asunto,Enunciado FROM Notificacion WHERE (IDUsuario=? OR IDUsuario=null) AND Asunto LIKE ?;";

                PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
                ps.setInt(1, usuarioID);
                ps.setString(2, '%'+txtAsunto.getText()+'%');
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int id= rs.getInt("NotificacionID");
                    String asunto= rs.getString("Asunto");
                    String enunciado= rs.getString("Enunciado");

                    modelo.addRow(new Object[] {id,asunto,enunciado});
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al consultar notificaciones: "+e.toString());
            }finally{
                conexion.Desconectar();
            }
        }
}
