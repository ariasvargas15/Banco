/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bussines.Negocio;
import bussines.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bsav157
 */
public class Retiro extends javax.swing.JFrame {

    /**
     * Creates new form Retiro
     */
    Persona persona;
    Negocio negocio;
    public Retiro(Persona p) {
        initComponents();
        negocio = new Negocio();
        this.persona = p;
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        label3.setText(p.getNumeroCuenta());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        fieldMonto = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label1.setText("RETIRAR");

        label2.setText("Número de cuenta: ");

        label3.setText("###########");

        label4.setText("Monto a retirar: ");

        fieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMontoActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        jLabel1.setText("Lo sentimos, no cuenta con fondos suficientes");

        jLabel2.setText("¡Retiro satisfactorio!");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnRetirar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("");
        label2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMontoActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try{
            double monto = Double.parseDouble(fieldMonto.getText());
            if(!negocio.retirar(monto, persona.getCedula(), true)){
                jLabel1.setVisible(true);
            } else {
                jLabel2.setVisible(true);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_btnRetirarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sesion sesion = new Sesion(persona);
        this.setVisible(false);
        sesion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JTextField fieldMonto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
