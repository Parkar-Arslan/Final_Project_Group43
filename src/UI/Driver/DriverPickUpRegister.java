/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Driver;

import Model.Business.Business;
import Model.Enterprise.Logistic.Route;
import Model.Enterprise.Vehicle.Truck;
import Model.Role.Driver;
import Model.Role.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arslan
 */
public class DriverPickUpRegister extends javax.swing.JPanel {

        
     private JPanel userProcessContainer;
    private Business business;
    private Driver driver;
    /**
     * Creates new form DriverPickUpRegister
     */
    public DriverPickUpRegister(JPanel userProcessContainer, Business business, Driver driver, DriverDashboard aThis) {
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.driver = driver;
        initComponents();
        populateComboBoxes();
    }
    
    private void populateComboBoxes() {
        comboRoute.removeAllItems();
        comboUser.removeAllItems();
        combostatus.removeAllItems();

        // Populate Routes
        for (Route route : business.getRouteDirectory().getRoutes()) {
            comboRoute.addItem(route.getRouteId() + " - " + route.getDescription());
        }

        // Populate Users
        for (User user : business.getUserDirectory().getUsers()) {
            comboUser.addItem(user.getId() + " - " + user.getName());
        }

        // Populate Statuses
        combostatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Completed", "Delayed" }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboRoute = new javax.swing.JComboBox<>();
        comboUser = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        btnAssignRouteSet = new javax.swing.JButton();
        lblChooseTrashid = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblRouteNo = new javax.swing.JLabel();
        combostatus = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();
        lblRouteNo1 = new javax.swing.JLabel();
        txttrashkg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(54, 116, 99));

        comboRoute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnback.setBackground(new java.awt.Color(181, 143, 120));
        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnAssignRouteSet.setBackground(new java.awt.Color(181, 143, 120));
        btnAssignRouteSet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAssignRouteSet.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignRouteSet.setText("Set");
        btnAssignRouteSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRouteSetActionPerformed(evt);
            }
        });

        lblChooseTrashid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChooseTrashid.setForeground(new java.awt.Color(255, 255, 255));
        lblChooseTrashid.setText("User");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Pickup Trash");

        lblRouteNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRouteNo.setForeground(new java.awt.Color(255, 255, 255));
        lblRouteNo.setText("Route No");

        combostatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblstatus.setText("Status");

        lblRouteNo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRouteNo1.setForeground(new java.awt.Color(255, 255, 255));
        lblRouteNo1.setText("Trash");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssignRouteSet, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRouteNo)
                    .addComponent(lblChooseTrashid)
                    .addComponent(lblstatus)
                    .addComponent(lblRouteNo1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combostatus, 0, 135, Short.MAX_VALUE)
                    .addComponent(comboRoute, 0, 135, Short.MAX_VALUE)
                    .addComponent(comboUser, 0, 135, Short.MAX_VALUE)
                    .addComponent(txttrashkg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnback))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChooseTrashid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRouteNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstatus)
                    .addComponent(combostatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRouteNo1)
                    .addComponent(txttrashkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnAssignRouteSet)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnbackActionPerformed

    private void btnAssignRouteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRouteSetActionPerformed
        // TODO add your handling code here:
        
         // Fetching selected values
    String selectedUser = (String) comboUser.getSelectedItem();
    String selectedRoute = (String) comboRoute.getSelectedItem();
    String selectedStatus = (String) combostatus.getSelectedItem();
    String trashKgText = txttrashkg.getText();

    if (selectedUser == null || selectedRoute == null || selectedStatus == null || trashKgText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int trashKg = Integer.parseInt(trashKgText);
        
        // Extract Route ID and User ID
        String routeId = selectedRoute.split(" - ")[0];
        String userId = selectedUser.split(" - ")[0];

        // Find route and user objects
        Route route = business.getRouteDirectory().findRouteById(routeId);
        Driver currentDriver = driver;

        if (route != null && currentDriver != null) {
            // Update route information
            route.setTrashCollected(route.getTrashCollected() + trashKg);
            route.setStatus(selectedStatus);

            // Update the driver's truck (if assigned)
            Truck truck = currentDriver.getAssignedTruck();
            if (truck != null) {
                truck.setTrashCollected(truck.getTrashCollected() + trashKg);
                truck.setStatus(selectedStatus);
            }

            JOptionPane.showMessageDialog(null, "Trash collected and updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Notify driver dashboard to refresh
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

            Component[] components = userProcessContainer.getComponents();
            for (Component component : components) {
                if (component instanceof DriverDashboard) {
                    ((DriverDashboard) component).populateTable(); // Refresh dashboard
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Route or Driver not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid trash amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAssignRouteSetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRouteSet;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comboRoute;
    private javax.swing.JComboBox<String> comboUser;
    private javax.swing.JComboBox<String> combostatus;
    private javax.swing.JLabel lblChooseTrashid;
    private javax.swing.JLabel lblRouteNo;
    private javax.swing.JLabel lblRouteNo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JTextField txttrashkg;
    // End of variables declaration//GEN-END:variables
}
