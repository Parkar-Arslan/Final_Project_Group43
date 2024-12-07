/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Model.Business.Business;
import Model.Driver.DriverDirectory;
import javax.swing.JPanel;

/**
 *
 * @author tawde
 */
public class CreateDriver extends javax.swing.JPanel {

    /**
     * Creates new form CreateDriver
     */
    public CreateDriver(JPanel userProcessContainer, Business business, DriverDirectory driverDirectory) {
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

        jTextFieldDriverName = new javax.swing.JTextField();
        jTextFieldDriverID = new javax.swing.JTextField();
        lblDriverID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDriverName = new javax.swing.JLabel();
        btnCreateDriverSubmit = new javax.swing.JButton();
        jTextFieldLicenseNumber = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 116, 99));

        jTextFieldDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDriverNameActionPerformed(evt);
            }
        });

        jTextFieldDriverID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDriverIDActionPerformed(evt);
            }
        });

        lblDriverID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDriverID.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverID.setText("Driver ID");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Driver");

        lblDriverName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDriverName.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverName.setText("Driver Name");

        btnCreateDriverSubmit.setBackground(new java.awt.Color(181, 143, 120));
        btnCreateDriverSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreateDriverSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateDriverSubmit.setText("Submit");
        btnCreateDriverSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDriverSubmitActionPerformed(evt);
            }
        });

        jTextFieldLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLicenseNumberActionPerformed(evt);
            }
        });

        lblLicenseNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLicenseNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblLicenseNumber.setText("License Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLicenseNumber)
                    .addComponent(lblDriverName)
                    .addComponent(lblDriverID))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDriverName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDriverID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateDriverSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriverID)
                            .addComponent(jTextFieldDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDriverName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLicenseNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(btnCreateDriverSubmit)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDriverNameActionPerformed

    private void jTextFieldDriverIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDriverIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDriverIDActionPerformed

    private void btnCreateDriverSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDriverSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateDriverSubmitActionPerformed

    private void jTextFieldLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLicenseNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDriverSubmit;
    private javax.swing.JTextField jTextFieldDriverID;
    private javax.swing.JTextField jTextFieldDriverName;
    private javax.swing.JTextField jTextFieldLicenseNumber;
    private javax.swing.JLabel lblDriverID;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}