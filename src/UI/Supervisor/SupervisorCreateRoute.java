/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Supervisor;

import Model.Business.Business;
import Model.Enterprise.Logistic.RouteDirectory;
import Model.Role.Supervisor;
import Model.Role.SupervisorDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tawde
 */
public class SupervisorCreateRoute extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private Business business;
    private Supervisor authenticatedSupervisor;
    private SupervisorDirectory supervisorDirectory;
    /**
     * Creates new form SupervisorAssignDriver
     */
    public SupervisorCreateRoute(JPanel userProcessContainer, Business business, Supervisor authenticatedSupervisor, SupervisorDirectory supervisorDirectory) {
        
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.authenticatedSupervisor = authenticatedSupervisor;
        this.supervisorDirectory = supervisorDirectory;
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

        btnRouteset = new javax.swing.JButton();
        txtrouteend = new javax.swing.JTextField();
        lblDriverShift = new javax.swing.JLabel();
        txtroutestart = new javax.swing.JTextField();
        txtrouteid = new javax.swing.JTextField();
        lblChooseTruck = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDriver = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        txtdesc = new javax.swing.JTextField();
        lblDriverShift1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 116, 99));

        btnRouteset.setBackground(new java.awt.Color(181, 143, 120));
        btnRouteset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRouteset.setForeground(new java.awt.Color(255, 255, 255));
        btnRouteset.setText("Set");
        btnRouteset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoutesetActionPerformed(evt);
            }
        });

        txtrouteend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrouteendActionPerformed(evt);
            }
        });

        lblDriverShift.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDriverShift.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverShift.setText("End");

        txtroutestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroutestartActionPerformed(evt);
            }
        });

        txtrouteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrouteidActionPerformed(evt);
            }
        });

        lblChooseTruck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChooseTruck.setForeground(new java.awt.Color(255, 255, 255));
        lblChooseTruck.setText("Route id");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText(" Create Route");

        lblDriver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDriver.setForeground(new java.awt.Color(255, 255, 255));
        lblDriver.setText("Start");

        btnback.setBackground(new java.awt.Color(181, 143, 120));
        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });

        lblDriverShift1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDriverShift1.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverShift1.setText("Descrpt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRouteset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDriverShift1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDriverShift)
                            .addComponent(lblDriver)
                            .addComponent(lblChooseTruck))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrouteend, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtroutestart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrouteid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnback))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChooseTruck)
                            .addComponent(txtrouteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDriver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDriverShift))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtroutestart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtrouteend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDriverShift1))
                .addGap(76, 76, 76)
                .addComponent(btnRouteset)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRoutesetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoutesetActionPerformed
        // TODO add your handling code here:
        String routeId = txtrouteid.getText();
        String start = txtroutestart.getText();
        String end = txtrouteend.getText();
        String description = txtdesc.getText();

        if (routeId.isEmpty() || start.isEmpty() || end.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        RouteDirectory routeDirectory = business.getRouteDirectory();
        routeDirectory.addRoute(routeId, description, start, end);
        JOptionPane.showMessageDialog(null, "Route successfully created", "Success", JOptionPane.INFORMATION_MESSAGE);

        txtrouteid.setText("");
        txtroutestart.setText("");
        txtrouteend.setText("");
        txtdesc.setText("");
    }//GEN-LAST:event_btnRoutesetActionPerformed

    private void txtrouteendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrouteendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrouteendActionPerformed

    private void txtroutestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroutestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroutestartActionPerformed

    private void txtrouteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrouteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrouteidActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRouteset;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel lblChooseTruck;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JLabel lblDriverShift;
    private javax.swing.JLabel lblDriverShift1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtrouteend;
    private javax.swing.JTextField txtrouteid;
    private javax.swing.JTextField txtroutestart;
    // End of variables declaration//GEN-END:variables
}
