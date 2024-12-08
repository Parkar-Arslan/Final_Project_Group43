/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.User;

import Model.Enterprise.Compliance.Complaint;
import Model.Enterprise.Compliance.ComplaintDirectory;
import javax.swing.JPanel;

/**
 *
 * @author tawde
 */
public class UserFileComplain extends javax.swing.JPanel {
    private ComplaintDirectory complaintDirectory;
    private JPanel userProcessContainer;

    /**
     * Creates new form UserFileComplain
     */
    public UserFileComplain(ComplaintDirectory complaintDirectory,JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.complaintDirectory=complaintDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFileComplainSubmit = new javax.swing.JButton();
        jTextFieldComplain = new javax.swing.JTextField();
        lblComplain = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldBillid = new javax.swing.JTextField();
        lblBillid = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 116, 99));

        btnFileComplainSubmit.setBackground(new java.awt.Color(181, 143, 120));
        btnFileComplainSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFileComplainSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnFileComplainSubmit.setText("Submit");
        btnFileComplainSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileComplainSubmitActionPerformed(evt);
            }
        });

        jTextFieldComplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplainActionPerformed(evt);
            }
        });

        lblComplain.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblComplain.setForeground(new java.awt.Color(255, 255, 255));
        lblComplain.setText("Complain");

        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });

        jTextFieldBillid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBillidActionPerformed(evt);
            }
        });

        lblBillid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBillid.setForeground(new java.awt.Color(255, 255, 255));
        lblBillid.setText("Bill ID");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("File Complain");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblComplain)
                                .addGap(68, 68, 68)
                                .addComponent(jTextFieldComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBillid)
                                    .addComponent(lblDate))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBillid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFileComplainSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBillid)
                    .addComponent(jTextFieldBillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComplain)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnFileComplainSubmit)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileComplainSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileComplainSubmitActionPerformed
        // TODO add your handling code here:
        String complaintId = jTextFieldBillid.getText(); 
        String date = jTextFieldDate.getText();
        String details = jTextFieldComplain.getText();
        
        if (complaintId.isEmpty() || details.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Complaint ID and details cannot be empty!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }
        Complaint newComplaint = complaintDirectory.fileComplaint(complaintId, details);
        
        javax.swing.JOptionPane.showMessageDialog(this, "Complaint filed successfully!\nComplaint ID: " + newComplaint.getComplaintId(), "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        // Clear the input fields after submission
        jTextFieldBillid.setText("");
        jTextFieldDate.setText("");
        jTextFieldComplain.setText("");
    }//GEN-LAST:event_btnFileComplainSubmitActionPerformed

    private void jTextFieldComplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComplainActionPerformed

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jTextFieldBillidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBillidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBillidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFileComplainSubmit;
    private javax.swing.JTextField jTextFieldBillid;
    private javax.swing.JTextField jTextFieldComplain;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JLabel lblBillid;
    private javax.swing.JLabel lblComplain;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
