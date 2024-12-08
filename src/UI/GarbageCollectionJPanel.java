/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author tawde
 */
public class GarbageCollectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GarbageCollectionJPanel
     */
    public GarbageCollectionJPanel() {
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

        btnAdminClick = new javax.swing.JButton();
        btnUserClick = new javax.swing.JButton();
        lblUserLogin = new javax.swing.JLabel();
        btnSupervisorClick = new javax.swing.JButton();
        lblAdminLogin = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSupervisorLogin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 116, 99));

        btnAdminClick.setBackground(new java.awt.Color(181, 143, 120));
        btnAdminClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdminClick.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminClick.setText("Click Here");
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

        lblUserLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblUserLogin.setText("User Login");

        btnSupervisorClick.setBackground(new java.awt.Color(181, 143, 120));
        btnSupervisorClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSupervisorClick.setForeground(new java.awt.Color(255, 255, 255));
        btnSupervisorClick.setText("Click Here");
        btnSupervisorClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupervisorClickActionPerformed(evt);
            }
        });

        lblAdminLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminLogin.setText("Admin Login");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Garbage Collection & Tracking");

        lblSupervisorLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupervisorLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisorLogin.setText("Supervisor Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminLogin)
                    .addComponent(lblSupervisorLogin)
                    .addComponent(lblUserLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupervisorClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserClick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminClick)
                    .addComponent(lblAdminLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupervisorClick)
                    .addComponent(lblSupervisorLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserClick)
                    .addComponent(lblUserLogin))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminClickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminClickActionPerformed

    private void btnUserClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserClickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserClickActionPerformed

    private void btnSupervisorClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupervisorClickActionPerformed

    }//GEN-LAST:event_btnSupervisorClickActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminClick;
    private javax.swing.JButton btnSupervisorClick;
    private javax.swing.JButton btnUserClick;
    private javax.swing.JLabel lblAdminLogin;
    private javax.swing.JLabel lblSupervisorLogin;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserLogin;
    // End of variables declaration//GEN-END:variables
}