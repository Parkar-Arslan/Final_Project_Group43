/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Enterprise.bill.Bill;
import Model.Enterprise.bill.BillDirectory;

import Model.Business.Business;
import Model.Enterprise.Compliance.ComplaintDirectory;
import Model.Role.DriverDirectory;
import Model.Role.SupervisorDirectory;
import Model.Enterprise.Vehicle.TruckDirectory;
import UI.Dashboard.SupervisorDashboard;
import UI.Supervisor.SupervisorCreateRoute;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Model.Role.UserDirectory; // Adjust this based on your actual package structure
import Model.Role.UserDirectory;
import Model.Role.User; // Adjust the package as per your structure
import UI.Driver.DriverLoginJPanel;



/**
 *
 * @author arslanparkar
 */
public class MainJFrame extends javax.swing.JFrame {
    Business business;
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    DriverDirectory driverDirectory; 
    UserDirectory userDirectory;
    ComplaintDirectory complaintDirectory;
    private BillDirectory billDirectory;
    

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        business = new Business();
        truckDirectory = business.getTruckDirectory();
        supervisorDirectory = business.getSupervisorDirectory();
        driverDirectory = new DriverDirectory();
        driverDirectory = DriverDirectory.getInstance();
        complaintDirectory = new ComplaintDirectory();
        userDirectory = business.getUserDirectory();
        billDirectory = new BillDirectory();
        
        if (userDirectory == null) {
        userDirectory = new UserDirectory();
        business.setUserDirectory(userDirectory);
    }
        
        initializeTruckData();
        initializeDriverData(); 
        initializeSupervisorData();
        initializeUserData();  
        initializeBillData();
    }
    
    private void initializeUserData() {
        userDirectory.createUser("U001", "Arjun Kapoor", "arjun.kapoor@example.com", "arjun123");
        userDirectory.createUser("U002", "Priya Sharma", "priya.sharma@example.com", "priya123");
        userDirectory.createUser("U003", "Ravi Verma", "ravi.verma@example.com", "ravi123");
        userDirectory.createUser("U004", "Meena Joshi", "meena.joshi@example.com", "meena123");
        userDirectory.createUser("U005", "Vikram Singh", "vikram.singh@example.com", "vikram123");
        userDirectory.createUser("U006", "Anjali Nair", "anjali.nair@example.com", "anjali123");
        userDirectory.createUser("U007", "Karan Gupta", "karan.gupta@example.com", "karan123");
        userDirectory.createUser("U008", "Sneha Patel", "sneha.patel@example.com", "sneha123");
        userDirectory.createUser("U009", "Rohit Mehta", "rohit.mehta@example.com", "rohit123");
        userDirectory.createUser("U010", "Sana Khan", "sana.khan@example.com", "sana123");
      
        
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
        driverDirectory.addDriver("DR001", "John Doe", "L1234567890","d1");
        driverDirectory.addDriver("DR002", "Jane Smith", "L0987654321","d2");
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
        btnUserLogin = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnSupervisorClick1 = new javax.swing.JButton();
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

        btnUserLogin.setBackground(new java.awt.Color(181, 143, 120));
        btnUserLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnUserLogin.setText("User Login");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        btnDriver.setBackground(new java.awt.Color(181, 143, 120));
        btnDriver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDriver.setForeground(new java.awt.Color(255, 255, 255));
        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        btnSupervisorClick1.setBackground(new java.awt.Color(181, 143, 120));
        btnSupervisorClick1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSupervisorClick1.setForeground(new java.awt.Color(255, 255, 255));
        btnSupervisorClick1.setText("Supervisor");
        btnSupervisorClick1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupervisorClick1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupervisorClick1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnAdminClick)
                .addGap(18, 18, 18)
                .addComponent(btnSupervisorClick1)
                .addGap(18, 18, 18)
                .addComponent(btnUserLogin)
                .addGap(18, 18, 18)
                .addComponent(btnDriver)
                .addContainerGap(302, Short.MAX_VALUE))
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
        AdminLoginJPanel AL = new AdminLoginJPanel(userProcessContainer,business ,supervisorDirectory,complaintDirectory,userDirectory);
        userProcessContainer.add("SupervisorLoginJPanel", AL);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        

    }//GEN-LAST:event_btnAdminClickActionPerformed

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        // TODO add your handling code here:
        UserLoginJPanel UL = new UserLoginJPanel(userProcessContainer,business , supervisorDirectory, complaintDirectory, business.getUserDirectory());
        userProcessContainer.add("SupervisorLoginJPanel", UL);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
       
        DriverLoginJPanel Dl = new DriverLoginJPanel(userProcessContainer,business ,supervisorDirectory,complaintDirectory, userDirectory);
        userProcessContainer.add("DriverLoginJPanel", Dl);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnSupervisorClick1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupervisorClick1ActionPerformed
        // TODO add your handling code here:
        SupervisorLoginJPanel SL = new SupervisorLoginJPanel(userProcessContainer,business ,supervisorDirectory,complaintDirectory, userDirectory);
        userProcessContainer.add("SupervisorLoginJPanel", SL);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupervisorClick1ActionPerformed

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
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnSupervisorClick1;
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    private void initializeBillData() {
        createBillsForUser("U001", 3);
        createBillsForUser("U002", 2);
        createBillsForUser("U003", 4);
        createBillsForUser("U004", 1);
        createBillsForUser("U005", 3);
    }
    private void createBillsForUser(String userId, int numberOfBills) {
        for (int i = 1; i <= numberOfBills; i++) {
            Bill bill = new Bill();
            bill.setBillId(userId + "-B" + i);
            bill.setAmount(100 + Math.random() * 900); // Random amount between 100 and 1000
            bill.setIsPaid(false);
            bill.setDueDate("2024-12-31"); // Set a fixed due date for simplicity
            billDirectory.addBill(userId, bill);
        }
    }

    
}
