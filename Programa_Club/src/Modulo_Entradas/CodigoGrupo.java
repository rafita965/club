/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Entradas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import rsbuttom.RSButtonMetro;

/**
 *
 * @author Agustín Salinas
 */
public class CodigoGrupo {
    BDD.DBConexion conexion = new BDD.DBConexion();
    private int usuarioID;
    
    public CodigoGrupo(int usuarioID){
        this.usuarioID=usuarioID;
    }
    
    public void salirGrupo(){
        try{
            String consulta2 = "UPDATE Grupo G JOIN (SELECT MAX(GrupoID) + 1 AS NuevoGrupoID FROM Grupo) AS Grupo_aux " +
                    "ON 1 = 1 SET G.GrupoID = Grupo_aux.NuevoGrupoID WHERE G.IDUsuario = ?;";

            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta2);
            ps.setInt(1, usuarioID);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saliste del grupo");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al salir del grupo: " + e.toString());
        } finally {
            conexion.Desconectar();
        }
    }
    
    public void cargarMiembros(JPanel panel, RSButtonMetro btnSalir, JButton btnSolicitud){
        try{
            int ejeY =30;
            String consulta = "SELECT U.IDUsuario, U.Nombre_usuario FROM Grupo G INNER JOIN Usuario U ON G.IDUsuario=U.IDUsuario " +
                "WHERE GrupoID=(SELECT GrupoID FROM Grupo WHERE IDUsuario=?);";
            
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, usuarioID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String nombreUsuario= rs.getString("Nombre_usuario");
                int Id= rs.getInt("IDUsuario");
                
                JRadioButton box = new JRadioButton(nombreUsuario);
                box.setBounds(15,ejeY,170,23);
                if(Id==usuarioID){
                    box.setText(nombreUsuario+"(Tú)");
                }else{
                    box.setText(nombreUsuario);
                }
                box.setSelected(true);
                    
                panel.add(box); 
                ejeY+=23;
            }
            if(ejeY<=53){
                btnSalir.setEnabled(false);
            }else if(ejeY>130){
                btnSolicitud.setEnabled(false);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conusltar grupo: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
    
    public void enviarSolicitud(JTextField receptor){
        try{
            String consulta = "CALL enviarSolicitud(?,?);";

            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, usuarioID);
            ps.setString(2, receptor.getText().trim());
            ps.executeUpdate();
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar solicitud: " + e.toString());
        } finally {
            conexion.Desconectar();
        }
    }
}
