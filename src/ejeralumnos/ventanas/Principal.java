/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeralumnos.ventanas;

/**
 *
 * @author alber
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        bMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bAlta = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bNotas = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 3));

        bMostrar.setText("Mostrar alumnos");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bMostrar);

        jLabel1.setText("          Ventana Principal");
        getContentPane().add(jLabel1);

        bAlta.setText("Alta alumno");
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        getContentPane().add(bAlta);

        bModificar.setText("Modificar alumno");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        getContentPane().add(bModificar);

        bNotas.setText("Mostrar notas de un alumno");
        getContentPane().add(bNotas);

        bBaja.setText("Baja alumno");
        bBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaActionPerformed(evt);
            }
        });
        getContentPane().add(bBaja);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
         MostrarAlumnos v = new MostrarAlumnos(this);
         v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bMostrarActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
        AltaAlumno v = new AltaAlumno(this);
         v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bAltaActionPerformed

    private void bBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaActionPerformed
        BajaAlumno v = new BajaAlumno(this);
         v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bBajaActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        ModificarAlumno v = new ModificarAlumno(this);
         v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Principal prin = new Principal();
       prin.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bMostrar;
    private javax.swing.JButton bNotas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
