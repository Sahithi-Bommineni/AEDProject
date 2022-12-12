/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author nikhithajarabana
 */
public class ManagerLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagerLoginJFrame
     */
    public ManagerLoginJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        HouseKeepingbtn = new javax.swing.JButton();
        Driverbtn = new javax.swing.JButton();
        Restaurantbtn = new javax.swing.JButton();
        Gymbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        EmpDirbtn1 = new javax.swing.JButton();
        Roomsbtn2 = new javax.swing.JButton();
        Bookingsbtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Big Caslon", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Hello Manager !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 250, 40));

        HouseKeepingbtn.setBackground(new java.awt.Color(255, 255, 204));
        HouseKeepingbtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        HouseKeepingbtn.setText("Housekeeping");
        HouseKeepingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseKeepingbtnActionPerformed(evt);
            }
        });
        getContentPane().add(HouseKeepingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 270, 50));

        Driverbtn.setBackground(new java.awt.Color(255, 255, 204));
        Driverbtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Driverbtn.setText("Cab ");
        Driverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Driverbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 270, 50));

        Restaurantbtn.setBackground(new java.awt.Color(255, 255, 204));
        Restaurantbtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Restaurantbtn.setText("Restaurant");
        Restaurantbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Restaurantbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 270, 50));

        Gymbtn.setBackground(new java.awt.Color(255, 255, 204));
        Gymbtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Gymbtn.setText("Games/Gym");
        Gymbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GymbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Gymbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 270, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Palm Tree");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resorts");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2022-11-30 at 8.57.36 PM.jpeg"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 80));

        BackButton.setBackground(new java.awt.Color(255, 255, 204));
        BackButton.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        BackButton.setText("Log Out");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 80, 20));

        EmpDirbtn1.setBackground(new java.awt.Color(255, 255, 204));
        EmpDirbtn1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        EmpDirbtn1.setText("Employee Directory ");
        EmpDirbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDirbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(EmpDirbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, 50));

        Roomsbtn2.setBackground(new java.awt.Color(255, 255, 204));
        Roomsbtn2.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Roomsbtn2.setText("List of Rooms");
        Roomsbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roomsbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(Roomsbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 270, 50));

        Bookingsbtn1.setBackground(new java.awt.Color(255, 255, 204));
        Bookingsbtn1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Bookingsbtn1.setText("Bookings ");
        Bookingsbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bookingsbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bookingsbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 270, 50));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hotel Manager.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HouseKeepingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseKeepingbtnActionPerformed
        // TODO add your handling code here:
        ViewHousekeeping HouseKeepingpanel = new ViewHousekeeping();
        HouseKeepingpanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_HouseKeepingbtnActionPerformed

    private void DriverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverbtnActionPerformed
        // TODO add your handling code here:
        ViewDriver Driverpanel = new ViewDriver();
        Driverpanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_DriverbtnActionPerformed

    private void RestaurantbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantbtnActionPerformed
        // TODO add your handling code here:
        ViewChef chefpanel = new ViewChef();
        chefpanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_RestaurantbtnActionPerformed

    private void GymbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GymbtnActionPerformed
        // TODO add your handling code here:
        ViewGame gamepanel = new ViewGame();
        gamepanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_GymbtnActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        HomePage homepanel = new HomePage();
        homepanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setVisible(false);
        new StaffLoginJFrame().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void EmpDirbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDirbtn1ActionPerformed
        // TODO add your handling code here:
       ViewEmployeeJFrame emppanel = new ViewEmployeeJFrame();
        emppanel.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_EmpDirbtn1ActionPerformed

    private void Roomsbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roomsbtn2ActionPerformed
        // TODO add your handling code here:
        ViewRoom viewroompanel = new ViewRoom();
        viewroompanel.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Roomsbtn2ActionPerformed

    private void Bookingsbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bookingsbtn1ActionPerformed
        // TODO add your handling code here:
             CustomerDetailsBill bookingspanel = new CustomerDetailsBill();
        bookingspanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_Bookingsbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Bookingsbtn1;
    private javax.swing.JButton Driverbtn;
    private javax.swing.JButton EmpDirbtn1;
    private javax.swing.JButton Gymbtn;
    private javax.swing.JButton HouseKeepingbtn;
    private javax.swing.JButton Restaurantbtn;
    private javax.swing.JButton Roomsbtn2;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
