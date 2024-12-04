/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Dashboard;

/**
 *
 * @author tawde
 */
public class UserDashboard extends javax.swing.JPanel {

    /**
     * Creates new form UserDashboard
     */
    public UserDashboard() {
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

        btnTotalTrash = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnCheckBill = new javax.swing.JButton();
        btnPayBill = new javax.swing.JButton();
        btnComplain = new javax.swing.JButton();
        btnAddRemove = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 116, 99));

        btnTotalTrash.setBackground(new java.awt.Color(181, 143, 120));
        btnTotalTrash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTotalTrash.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalTrash.setText("Total Trash");
        btnTotalTrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalTrashActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("User Dashboard");

        btnCheckBill.setBackground(new java.awt.Color(181, 143, 120));
        btnCheckBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCheckBill.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckBill.setText("Check Bill");
        btnCheckBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBillActionPerformed(evt);
            }
        });

        btnPayBill.setBackground(new java.awt.Color(181, 143, 120));
        btnPayBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPayBill.setForeground(new java.awt.Color(255, 255, 255));
        btnPayBill.setText("Pay Bill");
        btnPayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBillActionPerformed(evt);
            }
        });

        btnComplain.setBackground(new java.awt.Color(181, 143, 120));
        btnComplain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComplain.setForeground(new java.awt.Color(255, 255, 255));
        btnComplain.setText("Complain");
        btnComplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComplainActionPerformed(evt);
            }
        });

        btnAddRemove.setBackground(new java.awt.Color(181, 143, 120));
        btnAddRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRemove.setText("Add/Remove");
        btnAddRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnTotalTrash)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPayBill, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckBill, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRemove))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(67, 67, 67)
                .addComponent(btnCheckBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComplain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnTotalTrash)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalTrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalTrashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalTrashActionPerformed

    private void btnCheckBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckBillActionPerformed

    private void btnPayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBillActionPerformed

    }//GEN-LAST:event_btnPayBillActionPerformed

    private void btnComplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComplainActionPerformed

    private void btnAddRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRemove;
    private javax.swing.JButton btnCheckBill;
    private javax.swing.JButton btnComplain;
    private javax.swing.JButton btnPayBill;
    private javax.swing.JButton btnTotalTrash;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
