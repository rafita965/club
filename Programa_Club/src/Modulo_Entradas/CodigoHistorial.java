// To change this license header, choose License Headers in Project Properties.
// To change this template file, choose Tools | Templates
// and open the template in the editor.

package Modulo_Entradas;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustín Salinas**/

public class CodigoHistorial {
    BDD.DBConexion conexion = new BDD.DBConexion();
    private int usuarioID;
    
    public CodigoHistorial(int usuarioID){
        this.usuarioID = usuarioID;
    }
    
    public void verHistorial(JTable tablaCompras,JLabel totalCompras){
        DefaultTableModel modelo = (DefaultTableModel) tablaCompras.getModel();
        modelo.setRowCount(0);
        
        try{
            int compras = 0;
            String consulta = "SELECT C.CompraID,C.Fecha,T.Tipo,E.nombreEvento,S.NombreSector,C.filaAsiento,C.Asiento,C.Coste " +
                                "FROM Compra C INNER JOIN Tarjeta T ON C.TarjetaID=T.TarjetaID " +
                                "INNER JOIN Evento E ON C.IdEvento=E.idEvento " +
                                "INNER JOIN Sector S ON C.IdSector=S.idSector WHERE C.IDUsuario=?;";
            
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            ps.setInt(1, usuarioID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int CompraID= rs.getInt("CompraID");
                Date Fecha= rs.getDate("Fecha");
                String Tipo= rs.getString("Tipo");
                String nombreEvento= rs.getString("nombreEvento");
                String NombreSector= rs.getString("NombreSector");
                int filaAsiento= rs.getInt("filaAsiento");
                int Asiento= rs.getInt("Asiento");
                double Coste= rs.getDouble("Coste");
                compras+=1;
                
                modelo.addRow(new Object[] {CompraID,Fecha,Tipo,nombreEvento,NombreSector,filaAsiento+1,Asiento+1,Coste});
            }
            totalCompras.setText(String.valueOf(compras));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al consultar compras: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
    }
            
    public void comprasFecha(JDateChooser desde,JDateChooser hasta,JTable tablaCompras,JLabel totalCompras){
        
        DefaultTableModel modelo = (DefaultTableModel) tablaCompras.getModel();
        modelo.setRowCount(0);
        
        try{
            int compras = 0;
            String consulta = "SELECT C.CompraID,C.Fecha,T.Tipo,E.nombreEvento,S.NombreSector,C.filaAsiento,C.Asiento,C.Coste " +
                                "FROM Compra C INNER JOIN Tarjeta T ON C.TarjetaID=T.TarjetaID " +
                                "INNER JOIN Evento E ON C.IdEvento=E.idEvento " +
                                "INNER JOIN Sector S ON C.IdSector=S.idSector WHERE C.IDUsuario=? AND C.Fecha BETWEEN ? AND ?;";
            PreparedStatement ps = conexion.Conectar().prepareStatement(consulta);
            java.util.Date fechaDesde = desde.getDate();
            java.util.Date fechaHasta = hasta.getDate();
            java.sql.Date desdeSQL = new java.sql.Date(fechaDesde.getTime());
            java.sql.Date hastaSQL = new java.sql.Date(fechaHasta.getTime());
            
            ps.setInt(1, usuarioID);
            ps.setDate(2,desdeSQL);
            ps.setDate(3,hastaSQL);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int CompraID= rs.getInt("CompraID");
                String Fecha= rs.getDate("Fecha").toString();
                String Tipo= rs.getString("Tipo");
                String nombreEvento= rs.getString("nombreEvento");
                String NombreSector= rs.getString("NombreSector");
                int filaAsiento= rs.getInt("filaAsiento");
                int Asiento= rs.getInt("Asiento");
                double Coste= rs.getDouble("Coste");
                compras+=1;
                
                modelo.addRow(new Object[] {CompraID,Fecha,Tipo,nombreEvento,NombreSector,filaAsiento+1,Asiento+1,Coste});
            }
            totalCompras.setText(String.valueOf(compras));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al consultar compras: "+e.toString());
        }finally{
            conexion.Desconectar();
        }
        
        for (int col = 0; col<tablaCompras.getColumnCount();col++){
            Class <?> columna = tablaCompras.getColumnClass(col);
            tablaCompras.setDefaultEditor(columna,null);
        }
    }
}
