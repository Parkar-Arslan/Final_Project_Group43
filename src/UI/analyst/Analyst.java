/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.analyst;

import Model.Business.Business;
import Model.Enterprise.Compliance.ComplaintDirectory;
import Model.Role.SupervisorDirectory;
import Model.Role.UserDirectory;
import UI.SupervisorLoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author arslanparkar
 */
public class Analyst extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Business business;
    private SupervisorDirectory supervisorDirectory;
    private ComplaintDirectory complaintDirectory;
    private UserDirectory userDirectory;
    /**
     * Creates new form Analyst
     */
    public Analyst(JPanel userProcessContainer, Business business, SupervisorDirectory supervisorDirectory, ComplaintDirectory complaintDirectory, UserDirectory userDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.supervisorDirectory = supervisorDirectory;
        this.complaintDirectory = complaintDirectory;
        this.userDirectory = userDirectory;
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

        lblTitle = new javax.swing.JLabel();
        Seetrash = new javax.swing.JButton();
        btnroutes = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 116, 99));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Analyst");

        Seetrash.setBackground(new java.awt.Color(181, 143, 120));
        Seetrash.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Seetrash.setForeground(new java.awt.Color(255, 255, 255));
        Seetrash.setText("See trash collection");
        Seetrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeetrashActionPerformed(evt);
            }
        });

        btnroutes.setBackground(new java.awt.Color(181, 143, 120));
        btnroutes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnroutes.setForeground(new java.awt.Color(255, 255, 255));
        btnroutes.setText("Routes");
        btnroutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroutesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Seetrash, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnroutes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seetrash)
                    .addComponent(btnroutes))
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SeetrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeetrashActionPerformed
        // TODO add your handling code here:
        Trash b = new Trash(userProcessContainer,business);
        userProcessContainer.add("Trash", b);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_SeetrashActionPerformed

    private void btnroutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroutesActionPerformed
        // TODO add your handling code here:
        Routes r = new Routes(userProcessContainer,business);
        userProcessContainer.add("Route", r);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnroutesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Seetrash;
    private javax.swing.JButton btnroutes;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
