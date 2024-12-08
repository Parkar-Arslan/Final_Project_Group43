/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Driver;

import UI.*;
import Model.Role.Admin;
import Model.Role.AdminDirectory;
import Model.Business.Business;
import Model.Enterprise.Compliance.ComplaintDirectory;
import Model.Role.Driver;
import Model.Role.SupervisorDirectory;
import Model.Role.User;
import Model.Role.UserDirectory;
import UI.Dashboard.SupervisorDashboard;
import UI.Dashboard.UserDashboard;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tawde
 */
public class DriverLoginJPanel extends javax.swing.JPanel {

    Business business;
    private SupervisorDirectory supervisorDirectory;
    private ComplaintDirectory complaintDirectory;
    private UserDirectory userDirectory;
    JPanel userProcessContainer;
    
    /**
     * Creates new form UserLoginJPanel
     */
    public DriverLoginJPanel(JPanel userProcessContainer,Business business ,SupervisorDirectory supervisorDirectory,ComplaintDirectory complaintDirectory, UserDirectory userDirectory) {
        initComponents();
        this.business = business;
        this.userProcessContainer=userProcessContainer;
        this.supervisorDirectory = supervisorDirectory;
        this.complaintDirectory=complaintDirectory;
        supervisorDirectory = business.getSupervisorDirectory();
        this.userDirectory = userDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdriverpass = new javax.swing.JTextField();
        txtdriverid = new javax.swing.JTextField();
        lbldriverlogin = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lbldpass = new javax.swing.JLabel();
        btnUserSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 116, 99));

        txtdriverpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdriverpassActionPerformed(evt);
            }
        });

        txtdriverid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdriveridActionPerformed(evt);
            }
        });

        lbldriverlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldriverlogin.setForeground(new java.awt.Color(255, 255, 255));
        lbldriverlogin.setText("Driver id");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Driver Login");

        lbldpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldpass.setForeground(new java.awt.Color(255, 255, 255));
        lbldpass.setText("Password");

        btnUserSubmit.setBackground(new java.awt.Color(181, 143, 120));
        btnUserSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUserSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnUserSubmit.setText("Submit");
        btnUserSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldpass)
                    .addComponent(lbldriverlogin))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdriverid, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtdriverpass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUserSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldriverlogin)
                    .addComponent(txtdriverid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldpass)
                    .addComponent(txtdriverpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnUserSubmit)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdriverpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdriverpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdriverpassActionPerformed

    private void txtdriveridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdriveridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdriveridActionPerformed

    private void btnUserSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSubmitActionPerformed
        // TODO add your handling code here:
       String driverId = txtdriverid.getText().trim();
    String password = txtdriverpass.getText().trim();

    // Assuming there's a method in DriverDirectory to check driver credentials
    boolean isAuthenticated = business.getDriverDirectory().authenticateDriver(driverId, password);

    if (isAuthenticated) {
        // Assuming there's a method to fetch the authenticated driver
        Driver driver = business.getDriverDirectory().findDriverById(driverId);
        // Navigate to Driver Dashboard or appropriate panel
        DriverDashboard dashboard = new DriverDashboard(userProcessContainer, business, driver);
        userProcessContainer.add("DriverDashboard", dashboard);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Invalid ID or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUserSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserSubmit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbldpass;
    private javax.swing.JLabel lbldriverlogin;
    private javax.swing.JTextField txtdriverid;
    private javax.swing.JTextField txtdriverpass;
    // End of variables declaration//GEN-END:variables
}
