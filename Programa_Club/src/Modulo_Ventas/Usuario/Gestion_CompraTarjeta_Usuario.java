/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_Ventas.Usuario;
import Modulo_Ventas.Usuario.Gestion_Compra_Usuario;

/**
 *
 * @author thiag
 */
public class Gestion_CompraTarjeta_Usuario extends javax.swing.JFrame {
    private String usuarioID; // Variable para almacenar el ID del usuario
    private String productoID;
    private String fecha; 
    private int cantidadSeleccionada;
    /**
     * Creates new form Gestion_CompraTarjeta_Usuario
     */
    public Gestion_CompraTarjeta_Usuario(String usuarioID, String productoID, String fecha, int cantidadSeleccionada) {
        this.usuarioID = usuarioID;
        this.productoID = productoID;
        this.fecha = fecha;
        this.cantidadSeleccionada = cantidadSeleccionada;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}