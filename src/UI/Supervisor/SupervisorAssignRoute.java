/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Supervisor;

import Model.Business.Business;
import Model.Enterprise.Logistic.Route;
import Model.Role.Supervisor;
import Model.Role.SupervisorDirectory;
import Model.Enterprise.Vehicle.Truck;
import UI.Dashboard.SupervisorDashboard;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tawde
 */
public class SupervisorAssignRoute extends javax.swing.JPanel {

    private Business business; // Access to the central business model
    private JPanel userProcessContainer;
    private Supervisor authenticatedSupervisor;
    private SupervisorDirectory supervisorDirectory;
    private SupervisorDashboard dashboard;
    /**
     * Creates new form SupervisorAssignRoute
     */
    public SupervisorAssignRoute(JPanel userProcessContainer, Business business, Supervisor authenticatedSupervisor, SupervisorDirectory supervisorDirectory) {
    this.userProcessContainer = userProcessContainer; // Fix: correctly assign the passed userProcessContainer
    this.business = business;
    this.authenticatedSupervisor = authenticatedSupervisor;
    this.supervisorDirectory = supervisorDirectory;
    initComponents();
    populateComboBoxes();
}
    
    private void populateComboBoxes() {
        
        comboTruck.removeAllItems();
        comboRoute.removeAllItems();
        for (Truck truck : business.getTruckDirectory().getTrucks()) {
            comboTruck.addItem(truck.getTruckId() + " - " + truck.getDescription());
        }
        for (Route route : business.getRouteDirectory().getRoutes()) {
            comboRoute.addItem(route.getRouteId() + " - From " + route.getStart() + " to " + route.getEnd());
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

        btnAssignRouteSet = new javax.swing.JButton();
        lblChooseTruck = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblRouteNo = new javax.swing.JLabel();
        comboRoute = new javax.swing.JComboBox<>();
        comboTruck = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 116, 99));

        btnAssignRouteSet.setBackground(new java.awt.Color(181, 143, 120));
        btnAssignRouteSet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAssignRouteSet.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignRouteSet.setText("Set");
        btnAssignRouteSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRouteSetActionPerformed(evt);
            }
        });

        lblChooseTruck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChooseTruck.setForeground(new java.awt.Color(255, 255, 255));
        lblChooseTruck.setText("Choose Truck");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Assign Route");

        lblRouteNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRouteNo.setForeground(new java.awt.Color(255, 255, 255));
        lblRouteNo.setText("Route No");

        comboRoute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboTruck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnback.setBackground(new java.awt.Color(181, 143, 120));
        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRouteNo)
                    .addComponent(lblChooseTruck))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTruck, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssignRouteSet, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
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
                        .addComponent(lblChooseTruck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRouteNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboTruck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addComponent(btnAssignRouteSet)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRouteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRouteSetActionPerformed
        // TODO add your handling code here:
        
        // Get selected items from combo boxes
        String selectedTruck = (String) comboTruck.getSelectedItem();
        String selectedRoute = (String) comboRoute.getSelectedItem();
        if (selectedTruck == null || selectedRoute == null) {
            JOptionPane.showMessageDialog(this, "Please select both a truck and a route.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String truckId = selectedTruck.split(" - ")[0];
        String routeId = selectedRoute.split(" - ")[0];

        Truck truck = business.getTruckDirectory().findTruckById(truckId);
        Route route = business.getRouteDirectory().findRouteById(routeId);
        
        if (truck != null && route != null) {
            truck.setAssignedRoute(route);
            JOptionPane.showMessageDialog(this, "Route " + routeId + " assigned to truck " + truckId, "Assignment Successful", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error in assigning route to truck.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignRouteSetActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRouteSet;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comboRoute;
    private javax.swing.JComboBox<String> comboTruck;
    private javax.swing.JLabel lblChooseTruck;
    private javax.swing.JLabel lblRouteNo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
