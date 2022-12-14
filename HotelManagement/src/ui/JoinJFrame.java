/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
//import database.ConnectionProvider;

import database.ConnectionProvider;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author sahithi
 */
public class JoinJFrame extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form JoinJFrame
     */
    public JoinJFrame() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FirstNametxt = new javax.swing.JTextField();
        LastNametxt = new javax.swing.JTextField();
        Emailtxt = new javax.swing.JTextField();
        Answertxt = new javax.swing.JTextField();
        Passwordtxt = new javax.swing.JPasswordField();
        CPasswordtxt = new javax.swing.JPasswordField();
        sqcombobox = new javax.swing.JComboBox<>();
        JoinButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFN = new javax.swing.JLabel();
        lblLN = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 118, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jLabel2.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 70, 30));

        jLabel4.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel6.setText("Security Question");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2022-11-30 at 8.57.36 PM.jpeg"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 140));

        jLabel8.setFont(new java.awt.Font("Bangla MN", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Become a Member");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 260, 50));

        FirstNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FirstNametxtKeyReleased(evt);
            }
        });
        getContentPane().add(FirstNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 260, 30));

        LastNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LastNametxtKeyReleased(evt);
            }
        });
        getContentPane().add(LastNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 260, 30));

        Emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailtxtKeyReleased(evt);
            }
        });
        getContentPane().add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 260, 30));
        getContentPane().add(Answertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 260, 30));
        getContentPane().add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 260, 30));
        getContentPane().add(CPasswordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 260, 30));

        sqcombobox.setFont(new java.awt.Font("AppleGothic", 0, 12)); // NOI18N
        sqcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's your first pets name?", "What's your favourite city?", "What's your mothers maidens name?", "What's your native place?" }));
        getContentPane().add(sqcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 260, 30));

        JoinButton.setBackground(new java.awt.Color(204, 204, 204));
        JoinButton.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        JoinButton.setText("Join");
        JoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JoinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 100, 30));

        jLabel9.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Its free to join!");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel signup.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));
        getContentPane().add(lblFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 210, 20));
        getContentPane().add(lblLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 180, 30));
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 267, 160, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whitebg.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        HomePage homepanel = new HomePage();
        homepanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    public boolean checkEmail(String email){
        boolean checkUser = false;
        String query = "SELECT * FROM customerlogin WHERE email =?";
        
        try{
            ps = ConnectionProvider.getCon().prepareStatement(query);
            ps.setString(1,email);
            rs=ps.executeQuery();
            if(rs.next()){
                checkUser = true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return checkUser;
    }
    private void JoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinButtonActionPerformed
        // TODO add your handling code here:
        String firstname = FirstNametxt.getText();
        String lastname = LastNametxt.getText();
        String email = Emailtxt.getText();
        String password = Passwordtxt.getText();
        String cpassword = CPasswordtxt.getText();
        String securityques = (String)sqcombobox.getSelectedItem();
        String answer = Answertxt.getText();
        
        if(firstname.equals("")|| lastname.equals("") || email.equals("")|| password.equals("")||cpassword.equals("")|| answer.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }
        else if(checkEmail(email)){
            JOptionPane.showMessageDialog(null, "This Email Id already exists");
        }
        else if(!password.equals(cpassword)){
            JOptionPane.showMessageDialog(null, "Password doesn't match");
            CPasswordtxt.setText("");
        }
        else
        {
          try{
              String sql = "INSERT INTO customerlogin (firstname,lastname,email,password,securityques,answer) VALUES (?,?,?,?,?,?)";
              ps=con.prepareStatement(sql);
              ps.setString(1, firstname);
              ps.setString(2,lastname);
              ps.setString(3, email);
              ps.setString(4,password);
              //ps.setString(5, cpassword);
              ps.setString(5,securityques);
              ps.setString(6,answer);
              ps.execute();
              //Statement st=con.createStatement();
              //st.executeUpdate(sql);
              FirstNametxt.setText("");
              LastNametxt.setText("");
              Emailtxt.setText("");
              Passwordtxt.setText("");
              CPasswordtxt.setText("");
              Answertxt.setText("");
              
              JOptionPane.showMessageDialog(null, "Thanks for joining.");
              
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
        }
    }//GEN-LAST:event_JoinButtonActionPerformed

    private void FirstNametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNametxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(FirstNametxt.getText());
        if(!match.matches()){
            lblFN.setText("First Name is incorrect");
        }
        else{
            lblFN.setText("");
        }
    }//GEN-LAST:event_FirstNametxtKeyReleased

    private void LastNametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNametxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(LastNametxt.getText());
        if(!match.matches()){
            lblLN.setText("Last Name is incorrect");
        }
        else{
            lblLN.setText("");
        }
    }//GEN-LAST:event_LastNametxtKeyReleased

    private void EmailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailtxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{4,30}[@][a-zA-Z]{2,10}[.][a-zA-Z]{1,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Emailtxt.getText());
        if(!match.matches()){
            lblEmail.setText("Email is incorrect");
        }
        else{
            lblEmail.setText("");
        }

    }//GEN-LAST:event_EmailtxtKeyReleased

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
            java.util.logging.Logger.getLogger(JoinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answertxt;
    private javax.swing.JPasswordField CPasswordtxt;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JTextField FirstNametxt;
    private javax.swing.JButton JoinButton;
    private javax.swing.JTextField LastNametxt;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFN;
    private javax.swing.JLabel lblLN;
    private javax.swing.JComboBox<String> sqcombobox;
    // End of variables declaration//GEN-END:variables
}
