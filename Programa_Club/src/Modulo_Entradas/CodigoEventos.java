/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Entradas;

import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustín Salinas
 */
public class CodigoEventos {
    BDD.DBConexion conexion = new BDD.DBConexion();
    private int usuarioID;
    
    public CodigoEventos(int usuarioID){
        this.usuarioID = usuarioID;
    }
    
    public void cargarEventos(JTable tablaEventos){
        DefaultTableModel modelo = (DefaultTableModel) tablaEventos.getModel();
        try{
            String consulta = "SELECT E.idEvento,E.nombreEvento,C.Fecha,C.Hora " +
                                "FROM Evento E INNER JOIN Calendario C ON C.idCalendario=E.idCalendario " +
                                "WHERE C.Fecha >= CURDATE();";
            
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idEvento= rs.getInt("idEvento");
                String nombreEvento= rs.getString("nombreEvento");
                Date Fecha= rs.getDate("Fecha");
                Time Hora= rs.getTime("Hora");
                
                modelo.addRow(new Object[] {idEvento,nombreEvento,Fecha,Hora});
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conusltar eventos: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
    
    public void buscarEventos(JTable tablaEventos, JComboBox mes, String condicion){
        DefaultTableModel modelo = (DefaultTableModel) tablaEventos.getModel();
        
        try{
            String consulta = "SELECT E.idEvento,E.nombreEvento,C.Fecha,C.Hora " +
                                "FROM Evento E INNER JOIN Calendario C ON C.idCalendario=E.idCalendario " +
                                "WHERE C.Fecha >= CURDATE() AND C.Fecha LIKE CONCAT('%/%',?,'/%') AND (E.tipoEvento = ?)";
            
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, mes.getSelectedIndex());
            ps.setString(2, condicion);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idEvento= rs.getInt("idEvento");
                String nombreEvento= rs.getString("nombreEvento");
                Date Fecha= rs.getDate("Fecha");
                Time Hora= rs.getTime("Hora");
                
                modelo.addRow(new Object[] {idEvento,nombreEvento,Fecha,Hora});
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conusltar eventos: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
    
    public void seleccionarEvento(JTable tablaEventos,JTextField evento,JTextArea descripcion, JButton comprar){
        int index=tablaEventos.getSelectedRow();
        
        try{
            if(index>=0){
                
                String consulta = "SELECT E.nombreEvento, E.Descripcion, C.CompraID FROM Evento E " +
                "LEFT JOIN Compra C ON E.idEvento = C.IdEvento AND C.IDUsuario = ? WHERE E.idEvento = ?;";

                PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
                ps.setInt(1, (int)tablaEventos.getValueAt(index, 0));
                ps.setInt(2, usuarioID);
                ResultSet rs = ps.executeQuery();
                evento.setText(rs.getString("nombreEvento"));
                descripcion.setText(rs.getString("Descripcion"));
                if(rs.getInt("CompraID")==0){
                    comprar.setEnabled(false);
                }else{
                    comprar.setEnabled(true);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conusltar eventos: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
}
