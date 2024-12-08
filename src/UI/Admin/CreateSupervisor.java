/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Model.Business.Business;
import Model.Role.SupervisorDirectory;
import javax.swing.JPanel;
import Model.Role.Supervisor;
import javax.swing.JOptionPane;


/**
 *
 * @author tawde
 */
public class CreateSupervisor extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Business business;
    private String supervisorId;
    private String name;
    private String password;

    /**
     * Creates new form CreateSupervisor
     */
    public CreateSupervisor(JPanel userProcessContainer, Business business, SupervisorDirectory supervisorDirectory) {
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

        jTextFieldSupervisorName = new javax.swing.JTextField();
        jTextFieldSupervisorID = new javax.swing.JTextField();
        lblSupervisorID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSupervisorName = new javax.swing.JLabel();
        btnCreateSupervisorSubmit = new javax.swing.JButton();
        lblSupervisorPassword = new javax.swing.JLabel();
        jTextFieldSupervisorPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(54, 116, 99));

        jTextFieldSupervisorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSupervisorNameActionPerformed(evt);
            }
        });

        jTextFieldSupervisorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSupervisorIDActionPerformed(evt);
            }
        });

        lblSupervisorID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupervisorID.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisorID.setText("Supervisor ID");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Supervisor");

        lblSupervisorName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupervisorName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisorName.setText("Supervisor Name");

        btnCreateSupervisorSubmit.setBackground(new java.awt.Color(181, 143, 120));
        btnCreateSupervisorSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreateSupervisorSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateSupervisorSubmit.setText("Submit");
        btnCreateSupervisorSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSupervisorSubmitActionPerformed(evt);
            }
        });

        lblSupervisorPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupervisorPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisorPassword.setText("Supervisor Password");

        jTextFieldSupervisorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSupervisorPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateSupervisorSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSupervisorPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSupervisorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupervisorName)
                            .addComponent(lblSupervisorID))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSupervisorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSupervisorID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupervisorID)
                    .addComponent(jTextFieldSupervisorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupervisorName)
                    .addComponent(jTextFieldSupervisorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupervisorPassword)
                    .addComponent(jTextFieldSupervisorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnCreateSupervisorSubmit)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSupervisorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSupervisorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSupervisorNameActionPerformed

    private void jTextFieldSupervisorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSupervisorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSupervisorIDActionPerformed

    private void btnCreateSupervisorSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSupervisorSubmitActionPerformed
        // TODO add your handling code here:
        try {
            supervisorId = jTextFieldSupervisorID.getText();
            name = jTextFieldSupervisorName.getText();
            password = jTextFieldSupervisorPassword.getText();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the Supervisor ID, Name, Password", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        SupervisorDirectory directory = new SupervisorDirectory();  // Create an instance
        directory.addSupervisor(supervisorId, name, password); // Add the supervisor
        
    }//GEN-LAST:event_btnCreateSupervisorSubmitActionPerformed

    private void jTextFieldSupervisorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSupervisorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSupervisorPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateSupervisorSubmit;
    private javax.swing.JTextField jTextFieldSupervisorID;
    private javax.swing.JTextField jTextFieldSupervisorName;
    private javax.swing.JTextField jTextFieldSupervisorPassword;
    private javax.swing.JLabel lblSupervisorID;
    private javax.swing.JLabel lblSupervisorName;
    private javax.swing.JLabel lblSupervisorPassword;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
