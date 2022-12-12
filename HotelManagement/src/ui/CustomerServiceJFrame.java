/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author nikhithajarabana
 */
public class CustomerServiceJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form CustomerServiceJFrame
     */
    public CustomerServiceJFrame() {
        initComponents();
        
        con = ConnectionProvider.getCon();
        
        jTextField1.setEditable(false);
    }
    
    void getInfo(String roomno){
     jTextField1.setText(roomno);
     
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
        jLabel2 = new javax.swing.JLabel();
        HouseKeepingbtn = new javax.swing.JButton();
        Driverbtn = new javax.swing.JButton();
        Foodbtn = new javax.swing.JButton();
        GamesButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 118, 800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("We are at your service 24/7");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Please select the service you would like . ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        HouseKeepingbtn.setBackground(new java.awt.Color(153, 0, 153));
        HouseKeepingbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        HouseKeepingbtn.setForeground(new java.awt.Color(255, 255, 255));
        HouseKeepingbtn.setText("House Keeping");
        HouseKeepingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseKeepingbtnActionPerformed(evt);
            }
        });
        getContentPane().add(HouseKeepingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 170, 30));

        Driverbtn.setBackground(new java.awt.Color(153, 0, 153));
        Driverbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Driverbtn.setForeground(new java.awt.Color(255, 255, 255));
        Driverbtn.setText("Cab Service");
        Driverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Driverbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 170, 30));

        Foodbtn.setBackground(new java.awt.Color(153, 0, 153));
        Foodbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Foodbtn.setForeground(new java.awt.Color(255, 255, 255));
        Foodbtn.setText("Food");
        Foodbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Foodbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 170, 30));

        GamesButton.setBackground(new java.awt.Color(153, 0, 153));
        GamesButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        GamesButton.setForeground(new java.awt.Color(255, 255, 255));
        GamesButton.setText("Indoor Gym/Games");
        GamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GamesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 170, 30));

        BackButton.setBackground(new java.awt.Color(153, 0, 153));
        BackButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Log Out");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

        jTextField1.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 140, 50));

        jLabel4.setFont(new java.awt.Font("Big Caslon", 0, 36)); // NOI18N
        jLabel4.setText("Room No:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CustomerService_2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -150, 1370, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HouseKeepingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseKeepingbtnActionPerformed
        // TODO add your handling code here:
        String roomno = jTextField1.getText();
        
        try{
           String sql = "SELECT * FROM checkin WHERE roomno='"+roomno+"'";
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           if(rs.next())
                {
                    //String roomno=rs.getString(10);
                    String occupancy=rs.getString(14);
                    
                    HousekeepingserviceJFrame housekeeping = new HousekeepingserviceJFrame();
                    housekeeping.setVisible(true);
                    dispose();
                    housekeeping.getInfo(roomno);
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        
    }//GEN-LAST:event_HouseKeepingbtnActionPerformed

    private void GamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamesButtonActionPerformed
        // TODO add your handling code here:
        String roomno = jTextField1.getText();
        
        try{
           String sql = "SELECT * FROM checkin WHERE roomno='"+roomno+"'";
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           if(rs.next())
                {
                    //String roomno=rs.getString(10);
                    String occupancy=rs.getString(14);
                    
                    IndoorGames games = new IndoorGames();
                    games.setVisible(true);
                    dispose();
                    games.getInfo(roomno);
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_GamesButtonActionPerformed

    private void DriverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverbtnActionPerformed
        // TODO add your handling code here:
        String roomno = jTextField1.getText();
        
        try{
           String sql = "SELECT * FROM checkin WHERE roomno='"+roomno+"'";
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           if(rs.next())
                {
                    //String roomno=rs.getString(10);
                    String occupancy=rs.getString(14);
                    
                    dispose();
                    DriverServiceJFrame driver = new DriverServiceJFrame();
                    driver.setVisible(true);
                    driver.getInfo(roomno,occupancy);
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_DriverbtnActionPerformed

    private void FoodbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodbtnActionPerformed
        // TODO add your handling code here:
        String roomno = jTextField1.getText();
        
        try{
           String sql = "SELECT * FROM checkin WHERE roomno='"+roomno+"'";
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
                if(rs.next())
                {
                    //String roomno=rs.getString(10);
                    String occupancy=rs.getString(14);
                    
                    dispose();
                    FoodServiceJFrame food = new FoodServiceJFrame();
                    food.setVisible(true);
                    food.getInfo(roomno,occupancy);
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }        
    }//GEN-LAST:event_FoodbtnActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerServiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Driverbtn;
    private javax.swing.JButton Foodbtn;
    private javax.swing.JButton GamesButton;
    private javax.swing.JButton HouseKeepingbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
