/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Model.Business.Business;
import Model.Role.TruckDirectory;
import javax.swing.JPanel;
import Model.Role.Truck;
import javax.swing.JOptionPane;

/**
 *
 * @author tawde
 */
public class CreateTruck extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Business business;
    private String truckId;
    private String description;
    private int capacity;
    /**
     * Creates new form CreateTruck
     */
    public CreateTruck(JPanel userProcessContainer, Business business, TruckDirectory truckDirectory) {
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

        jTextFieldTruckModel = new javax.swing.JTextField();
        jTextFieldTruckID = new javax.swing.JTextField();
        lblTruckID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTruckModel = new javax.swing.JLabel();
        btnCreateTruckSubmit = new javax.swing.JButton();
        jTextFieldLicenseCapacity = new javax.swing.JTextField();
        lblTruckCapacity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 116, 99));

        jTextFieldTruckModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTruckModelActionPerformed(evt);
            }
        });

        jTextFieldTruckID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTruckIDActionPerformed(evt);
            }
        });

        lblTruckID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTruckID.setForeground(new java.awt.Color(255, 255, 255));
        lblTruckID.setText("Truck ID");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Truck");

        lblTruckModel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTruckModel.setForeground(new java.awt.Color(255, 255, 255));
        lblTruckModel.setText("Truck Model");

        btnCreateTruckSubmit.setBackground(new java.awt.Color(181, 143, 120));
        btnCreateTruckSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreateTruckSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateTruckSubmit.setText("Submit");
        btnCreateTruckSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTruckSubmitActionPerformed(evt);
            }
        });

        jTextFieldLicenseCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLicenseCapacityActionPerformed(evt);
            }
        });

        lblTruckCapacity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTruckCapacity.setForeground(new java.awt.Color(255, 255, 255));
        lblTruckCapacity.setText("Truck Capacity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTruckCapacity)
                    .addComponent(lblTruckModel)
                    .addComponent(lblTruckID))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLicenseCapacity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTruckModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTruckID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateTruckSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(lblTruckID)
                            .addComponent(jTextFieldTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTruckModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTruckCapacity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTruckModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLicenseCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(btnCreateTruckSubmit)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTruckModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTruckModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTruckModelActionPerformed

    private void jTextFieldTruckIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTruckIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTruckIDActionPerformed

    private void btnCreateTruckSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTruckSubmitActionPerformed
        // TODO add your handling code here:
        try {
            // Get text from input fields
            String truckId = jTextFieldTruckID.getText();
            String description = jTextFieldTruckModel.getText();
            String capacityStr = jTextFieldLicenseCapacity.getText(); // Get capacity as a string

            // Parse capacity to an integer
            int capacity = Integer.parseInt(capacityStr);

            // Proceed with further processing (e.g., creating a truck object)
            // Example:
            // Truck truck = new Truck(truckId, model, capacity);
            // Add truck to your list or database

      

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Capacity must be a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the ID, model, and capacity fields.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
        TruckDirectory directory = new TruckDirectory();  // Create an instance
        directory.addTruck(truckId, description, capacity); // Add the supervisor
    }//GEN-LAST:event_btnCreateTruckSubmitActionPerformed

    private void jTextFieldLicenseCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLicenseCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLicenseCapacityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTruckSubmit;
    private javax.swing.JTextField jTextFieldLicenseCapacity;
    private javax.swing.JTextField jTextFieldTruckID;
    private javax.swing.JTextField jTextFieldTruckModel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTruckCapacity;
    private javax.swing.JLabel lblTruckID;
    private javax.swing.JLabel lblTruckModel;
    // End of variables declaration//GEN-END:variables
}
