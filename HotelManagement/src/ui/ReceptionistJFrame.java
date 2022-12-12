/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author sahithi
 */
public class ReceptionistJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistJFrame
     */
    public ReceptionistJFrame() {
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

        Checkinbtn = new javax.swing.JButton();
        checkoutbtn = new javax.swing.JButton();
        Invoicebtn = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Checkinbtn.setBackground(new java.awt.Color(0, 0, 0));
        Checkinbtn.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        Checkinbtn.setForeground(new java.awt.Color(255, 255, 255));
        Checkinbtn.setText("Customer Check-in");
        Checkinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Checkinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 50));

        checkoutbtn.setBackground(new java.awt.Color(0, 0, 0));
        checkoutbtn.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        checkoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutbtn.setText("Customer Check-out");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 50));

        Invoicebtn.setBackground(new java.awt.Color(0, 0, 0));
        Invoicebtn.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        Invoicebtn.setForeground(new java.awt.Color(255, 255, 255));
        Invoicebtn.setText("Customer Invoice");
        Invoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoicebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Invoicebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 50));

        LogoutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutButton.setFont(new java.awt.Font("Helvetica", 3, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/young-businesswoman-standing-show-card-receptionist-female-stands-reception-desk-cartoon-character_1150-43045.jpg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setVisible(false);
        new CustomerCheckInJFrame().setVisible(true);
    }//GEN-LAST:event_CheckinbtnActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setVisible(false);
        new CheckOutJFrame().setVisible(true);
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void InvoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoicebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setVisible(false);
        new CustomerDetailsBill().setVisible(true);
    }//GEN-LAST:event_InvoicebtnActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        StaffLoginJFrame Staffpanel = new StaffLoginJFrame();
        Staffpanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checkinbtn;
    private javax.swing.JButton Invoicebtn;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
