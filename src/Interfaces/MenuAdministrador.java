/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrador
 */
public class MenuAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form MenuAdministrador
     */
    public MenuAdministrador() {
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

        jButton1 = new javax.swing.JButton();

        jButton1.setText("Listado de licencias vigentes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoLicenciaVigente(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton1)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonListadoLicenciaVigente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoLicenciaVigente
        // TODO add your handling code here:
         VentanaPrincipal topFrame = (VentanaPrincipal) SwingUtilities.getWindowAncestor(this);
         ListadoLicenciaVigente panel = new ListadoLicenciaVigente();
         //panel.setImage("/Imagenes/fondoabs.jpg");
         topFrame.add(panel, BorderLayout.CENTER);
         this.setVisible(false);
         topFrame.remove(this);
         topFrame.setSize(500,500);
    }//GEN-LAST:event_botonListadoLicenciaVigente


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
