/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.sql.*;
import javax.swing.JOptionPane;
import database.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author sahithi
 */
public class LoginJFrame extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form LoginJFrame1
     */
    public LoginJFrame() {
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
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        JoinButton = new javax.swing.JButton();
        ForgotPasswordButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Palm Tree Resorts!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jLabel3.setText("Login Here !");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        usernametxt.setBackground(new java.awt.Color(51, 51, 51));
        usernametxt.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        usernametxt.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt.setBorder(null);
        usernametxt.setMinimumSize(new java.awt.Dimension(60, 20));
        usernametxt.setPreferredSize(new java.awt.Dimension(60, 23));
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        getContentPane().add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 30));

        passwordtxt.setBackground(new java.awt.Color(51, 51, 51));
        passwordtxt.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordtxt.setBorder(null);
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 180, 30));

        LoginButton.setBackground(new java.awt.Color(51, 51, 51));
        LoginButton.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 70, 20));

        JoinButton.setBackground(new java.awt.Color(51, 51, 51));
        JoinButton.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        JoinButton.setForeground(new java.awt.Color(255, 255, 255));
        JoinButton.setText("Join");
        JoinButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JoinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 90, 20));

        ForgotPasswordButton.setBackground(new java.awt.Color(51, 51, 51));
        ForgotPasswordButton.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        ForgotPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        ForgotPasswordButton.setText("Forgot Password ?");
        ForgotPasswordButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ForgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ForgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 160, 20));

        homeButton.setBackground(new java.awt.Color(204, 170, 199));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2022-11-30 at 8.57.36 PM.jpeg"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel2.setFont(new java.awt.Font("Ayuthaya", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No Account? Feel free to Join....");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 260, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginpage.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ForgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasswordButtonActionPerformed
        // TODO add your handling code here:
       ForgotPasswordJFrame fppanel = new ForgotPasswordJFrame();
       fppanel.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_ForgotPasswordButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        HomePage homepanel = new HomePage();
        homepanel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String email = usernametxt.getText();
        String password = passwordtxt.getText();
        if(email.equals("")|| password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        }
        else if(email.equals("staff")&& password.equals("staff") )
        {
            StaffLoginJFrame staffpanel = new StaffLoginJFrame();
            staffpanel.setVisible(true);
            this.dispose();
        }
        else
        {
            
            //ResultSet rs = select.getData("select * from members where username='"+email+"'and password='"+password+"'");
            try{
                String sql = "SELECT * FROM customerlogin WHERE email=? AND password=?";
                ps=con.prepareStatement(sql);
                ps.setString(1, usernametxt.getText());
                ps.setString(2,passwordtxt.getText());
                //ps.setString(WIDTH, sql);
                rs=ps.executeQuery();
                if(rs.next())
                {
                    String username=rs.getString(3);
                    String fname=rs.getString(1);
                    String lname=rs.getString(2);
                    String name = fname+" "+lname;
                    
                    this.dispose();
                    CustomerRoomBookingJFrame crbpanel = new CustomerRoomBookingJFrame();
                    crbpanel.setVisible(true);
                    
                    crbpanel.getInfo(username,name);
                    /*check=1;
                    if(rs.getString(8).equals(true))
                    {
                    setVisible(false);
                    new ManagerLoginJFrame().setVisible(true);
                    }*/
                    //JOptionPane.showMessageDialog(null, "Login Successful");
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
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void JoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinButtonActionPerformed
        // TODO add your handling code here:
        JoinJFrame joinpanel = new JoinJFrame();
        joinpanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_JoinButtonActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgotPasswordButton;
    private javax.swing.JButton JoinButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
