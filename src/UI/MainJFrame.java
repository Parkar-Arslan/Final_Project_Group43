/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Business.Business;
import Model.Driver.DriverDirectory;
import Model.Supervisor.SupervisorDirectory;
import Model.Truck.TruckDirectory;
import UI.Dashboard.SupervisorDashboard;
import UI.Supervisor.SupervisorAssignDriver;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author arslanparkar
 */
public class MainJFrame extends javax.swing.JFrame {
    Business business;
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    DriverDirectory driverDirectory; 
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        business = new Business();
        truckDirectory = business.getTruckDirectory();
        supervisorDirectory = business.getSupervisorDirectory();
        driverDirectory = new DriverDirectory(); 
        //driverDirectory = DriverDirectory.getInstance();
        initializeTruckData();
        initializeDriverData(); 
        initializeSupervisorData();
        
        
        
    }
    
    private void initializeTruckData() {
        truckDirectory.addTruck("TR001", "Garbage Truck Small", 1000);
        truckDirectory.addTruck("TR002", "Garbage Truck Medium", 2000);
        truckDirectory.addTruck("TR003", "Garbage Truck Large", 3000);
    }
    
    private void initializeSupervisorData() {
        supervisorDirectory.addSupervisor("s1", "s1","s1");
        supervisorDirectory.addSupervisor("SV002", "Bob Smith","sup2");
        // Add more supervisors as needed
    }

    private void initializeDriverData() {
        driverDirectory.addDriver("DR001", "John Doe", "L1234567890");
        driverDirectory.addDriver("DR002", "Jane Smith", "L0987654321");
        // Add more drivers as needed
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdminClick = new javax.swing.JButton();
        btnUserClick = new javax.swing.JButton();
        btnSupervisorClick = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 116, 99));

        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        controlPanel.setBackground(new java.awt.Color(54, 116, 99));

        btnAdminClick.setBackground(new java.awt.Color(181, 143, 120));
        btnAdminClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdminClick.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminClick.setText("Admin Login");
        btnAdminClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminClickActionPerformed(evt);
            }
        });

        btnUserClick.setBackground(new java.awt.Color(181, 143, 120));
        btnUserClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUserClick.setForeground(new java.awt.Color(255, 255, 255));
        btnUserClick.setText("Click Here");
        btnUserClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserClickActionPerformed(evt);
            }
        });

        btnSupervisorClick.setBackground(new java.awt.Color(181, 143, 120));
        btnSupervisorClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSupervisorClick.setForeground(new java.awt.Color(255, 255, 255));
        btnSupervisorClick.setText("Supervisor");
        btnSupervisorClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupervisorClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupervisorClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnAdminClick)
                .addGap(18, 18, 18)
                .addComponent(btnSupervisorClick)
                .addGap(18, 18, 18)
                .addComponent(btnUserClick)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setBackground(new java.awt.Color(54, 116, 99));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminClickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminClickActionPerformed

    private void btnUserClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserClickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserClickActionPerformed

    private void btnSupervisorClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupervisorClickActionPerformed
       
            
        SupervisorLoginJPanel SL = new SupervisorLoginJPanel(userProcessContainer,business ,supervisorDirectory);
        userProcessContainer.add("SupervisorLoginJPanel", SL);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupervisorClickActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminClick;
    private javax.swing.JButton btnSupervisorClick;
    private javax.swing.JButton btnUserClick;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
