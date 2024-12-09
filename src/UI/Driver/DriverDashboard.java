/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Driver;

import Model.Business.Business;
import Model.Enterprise.Vehicle.Truck;
import Model.Role.Driver;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arslanparkar
 */
public class DriverDashboard extends javax.swing.JPanel {
    
     private Business business;
    private Driver driver;
    private JPanel userProcessContainer;

    /**
     * Creates new form DriverDashboard
     */
    public DriverDashboard(JPanel userProcessContainer, Business business, Driver driver) {
         this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.driver = driver;

        initComponents();

        // Ensure driver is assigned a truck before populating table
        if (driver != null && driver.getAssignedTruck() != null) {
            populateTable();
        } else {
            JOptionPane.showMessageDialog(this, "No truck is assigned to this driver.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
    
    
    public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) jTableSupreport.getModel();
    model.setRowCount(0); // Clear existing data

    Truck truck = driver.getAssignedTruck();
    if (truck != null) {
        Object[] row = new Object[4];
        row[0] = truck.getTruckId();
        row[1] = truck.getAssignedRoute() != null ? truck.getAssignedRoute().getRouteId() : "Not assigned";
        row[2] = truck.getTrashCollected() + " kg"; // Display collected trash
        row[3] = truck.getStatus(); // Display current truck status
        model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        btnCollectTrash = new javax.swing.JButton();
        btnTrashComplain = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSupreport = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 116, 99));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Driver Dashboard");

        btnCollectTrash.setBackground(new java.awt.Color(181, 143, 120));
        btnCollectTrash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCollectTrash.setForeground(new java.awt.Color(255, 255, 255));
        btnCollectTrash.setText("Collect trash");
        btnCollectTrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectTrashActionPerformed(evt);
            }
        });

        btnTrashComplain.setBackground(new java.awt.Color(181, 143, 120));
        btnTrashComplain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTrashComplain.setForeground(new java.awt.Color(255, 255, 255));
        btnTrashComplain.setText("Complain");
        btnTrashComplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrashComplainActionPerformed(evt);
            }
        });

        jTableSupreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Truck", "Route", "Trash", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTableSupreport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTrashComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCollectTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCollectTrash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrashComplain)
                        .addContainerGap(266, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectTrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectTrashActionPerformed
        // TODO add your handling code here:
        DriverPickUpRegister pt = new DriverPickUpRegister(userProcessContainer, business, driver,this);
        userProcessContainer.add("DriverDashboard", pt);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCollectTrashActionPerformed

    private void btnTrashComplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrashComplainActionPerformed
       
    }//GEN-LAST:event_btnTrashComplainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectTrash;
    private javax.swing.JButton btnTrashComplain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSupreport;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
