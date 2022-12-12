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
public class StaffLoginJFrame extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs=null;

    /**
     * Creates new form StaffLogin
     */
    public StaffLoginJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
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
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        rolecombobox = new javax.swing.JComboBox<>();
        LogInButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        jLabel1.setText("Username  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        jLabel2.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        jLabel3.setText("Select Role :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 30));
        getContentPane().add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 180, 30));
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 180, 30));

        rolecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Manager", "Receptionist", "Housekeeping", "Driver", "Chef" }));
        getContentPane().add(rolecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 180, 30));

        LogInButton.setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, 30));

        jLabel6.setFont(new java.awt.Font("AppleGothic", 0, 36)); // NOI18N
        jLabel6.setText("Staff Login");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        homeButton.setBackground(new java.awt.Color(204, 170, 199));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2022-11-30 at 8.57.36 PM.jpeg"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jLabel4.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        jLabel4.setText("Palm Tree Resorts");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whitebg.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
        String username = usernametxt.getText();
        String password = passwordtxt.getText();
        String job = rolecombobox.getSelectedItem().toString();
        if(username.equals("")|| password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        }
        else if(username.equals("admin")&& password.equals("admin") && job.equals("Admin") )
        {
            setVisible(false);
            new AdminJframe().setVisible(true);
            this.dispose();
        }
        else
        {
            
            //ResultSet rs = select.getData("select * from members where username='"+email+"'and password='"+password+"'");
            try{
                String sql = "SELECT * FROM employee WHERE username=? AND password=? AND job=?";
                ps=con.prepareStatement(sql);
                ps.setString(1, usernametxt.getText());
                ps.setString(2,passwordtxt.getText());
                ps.setString(3, (String)rolecombobox.getSelectedItem());
                rs=ps.executeQuery();
                if(rs.next())
                {
                    //String role = (String)rolecombobox.getSelectedItem();
                    /*if(username.equals("admin")&& password.equals("admin") && role.equals("Admin")){
                        setVisible(false);
                        new AdminJframe().setVisible(true);*/
                    String r = rs.getString("job");
                    String u = rs.getString("username");
                    if(job.equalsIgnoreCase("Manager")){
                        this.dispose();
                        new ManagerLoginJFrame().setVisible(true);
                    }
                    else if(job.equalsIgnoreCase("Housekeeping")){
                        this.dispose();
                        new HouseKeepingJFrame().setVisible(true);
                    }
                    else if(job.equalsIgnoreCase("Driver"))
                    {
                        this.dispose();
                        new DriverJFrame().setVisible(true);
                    }
                    else if(job.equalsIgnoreCase("Chef")){
                        this.dispose();
                        new ChefLoginJFrame().setVisible(true);
                    }
                    else if(job.equalsIgnoreCase("Coordinator")){
                        this.dispose();
                        new GymSupervisorLoginJFrame().setVisible(true);
                    }
                    else if(job.equalsIgnoreCase("Receptionist")){
                        this.dispose();
                        new ReceptionistJFrame().setVisible(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Credentials");
                    usernametxt.setText("");
                    passwordtxt.setText("");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        HomePage homepanel = new HomePage();
        homepanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StaffLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JComboBox<String> rolecombobox;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
