/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeralumnos.ventanas;

import ejeralumnos.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alber
 */
public class MostrarAlumnos extends javax.swing.JFrame {

    Principal prin;
    ResultSet rs;

    /**
     * Creates new form MostrarAlumnos
     */
    public MostrarAlumnos(Principal prin) {
        initComponents();
        this.prin = prin;
        DataBase con = new DataBase();
        boolean a = con.cargarDriver();
        boolean a2 = con.conectar("localhost", "3306", "alumnos", "alberto", "alberto");
        if (!a) {
            System.out.println("1");
        }
        if (!a2) {
            System.out.println("2");
        }
        try {
            rs = con.consultaSinParametros("SELECT * FROM alumno");
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                tm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(5), rs.getInt(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.LiberarResult(rs);
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el result set");
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "expediente", "nombre", "telefono", "direccion", "edad", "entornos", "programacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        prin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
