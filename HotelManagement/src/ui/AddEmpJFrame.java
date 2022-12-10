/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeData;

/**
 *
 * @author sahithi
 */
public class AddEmpJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Employee emp;
    EmployeeData empdata;
    
    /**
     * Creates new form AddEmpJFrame
     */
    public AddEmpJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        //this.empdata = empdata;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NameLbl = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        AgeLbl = new javax.swing.JLabel();
        Agetxt = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        MaleBtn = new javax.swing.JRadioButton();
        FemaleBtn = new javax.swing.JRadioButton();
        OthersBtn = new javax.swing.JRadioButton();
        JobCombobox = new javax.swing.JComboBox<>();
        JobLbl = new javax.swing.JLabel();
        SalaryLbl = new javax.swing.JLabel();
        Salarytxt = new javax.swing.JTextField();
        AddressLbl = new javax.swing.JLabel();
        Addresstxt = new javax.swing.JTextField();
        UserNameLbl = new javax.swing.JLabel();
        UserNametxt = new javax.swing.JTextField();
        Passwordtxt = new javax.swing.JTextField();
        PasswordLbl = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        ViewEmpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblJ = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 50));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        NameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLbl.setText("Name");
        getContentPane().add(NameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 65, 27));

        Nametxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        Nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NametxtKeyReleased(evt);
            }
        });
        getContentPane().add(Nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 530, 30));

        AgeLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        AgeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgeLbl.setText("Age");
        getContentPane().add(AgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 65, 23));

        Agetxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        Agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Agetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AgetxtKeyReleased(evt);
            }
        });
        getContentPane().add(Agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 174, -1));

        GenderLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        GenderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenderLbl.setText("Gender");
        getContentPane().add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 65, 25));

        buttonGroup1.add(MaleBtn);
        MaleBtn.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        MaleBtn.setText("Male");
        getContentPane().add(MaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, -1));

        buttonGroup1.add(FemaleBtn);
        FemaleBtn.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        FemaleBtn.setText("Female");
        getContentPane().add(FemaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        buttonGroup1.add(OthersBtn);
        OthersBtn.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        OthersBtn.setText("Others");
        getContentPane().add(OthersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        JobCombobox.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        JobCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Receptionist", "HouseKeeping", "Driver", "Chef" }));
        getContentPane().add(JobCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 194, 180, 30));

        JobLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        JobLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JobLbl.setText("Job");
        getContentPane().add(JobLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 60, 27));

        SalaryLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        SalaryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalaryLbl.setText("Salary");
        getContentPane().add(SalaryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 65, 26));

        Salarytxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        Salarytxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 180, 26));

        AddressLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        AddressLbl.setText("Address");
        getContentPane().add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 25));

        Addresstxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        Addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 530, 24));

        UserNameLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        UserNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLbl.setText("Emp ID/Username");
        getContentPane().add(UserNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 26));

        UserNametxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        UserNametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(UserNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 174, 26));

        Passwordtxt.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        Passwordtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 180, 26));

        PasswordLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        PasswordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLbl.setText("Password");
        getContentPane().add(PasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 100, 25));

        SubmitBtn.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 130, -1));

        ViewEmpButton.setText("View Employees");
        ViewEmpButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEmpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewEmpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-staff-set-maids-cleaning-260nw-1012520026.jpg-2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        BackButton.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 320, 20));
        getContentPane().add(lblage, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 60, 20));
        getContentPane().add(lblJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 100, 20));
        getContentPane().add(lblSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 80, 20));
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 30));
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 180, 20));

        Jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whitebg.jpg"))); // NOI18N
        getContentPane().add(Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminJframe().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String name = Nametxt.getText();
        int age = Integer.parseInt(Agetxt.getText());
        String username = UserNametxt.getText();
        String password = Passwordtxt.getText();
        String address = Addresstxt.getText();
        String job = (String)JobCombobox.getSelectedItem();
        int salary = Integer.parseInt(Salarytxt.getText());
        String gender = " ";
  
                // If condition to check if jRadioButton2 is selected.
                if (MaleBtn.isSelected()) {
  
                    gender = "Male";
                }
  
                else if (FemaleBtn.isSelected()) {
  
                    gender = "Female";
                }
                else if (OthersBtn.isSelected()) {
  
                    gender = "Other";
                }
                   
        if(name.equals("")|| password.equals("")||username.equals("")|| address.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }
        else
        {
        Connection con = ConnectionProvider.getCon();
        
          try{
              //Employee e = empdata.addEmp();
              //empdata.createEmpTable();
              String sql = "INSERT INTO employee (name,age,gender,job,address,salary,username,password) VALUES (?,?,?,?,?,?,?,?)";
              ps=con.prepareStatement(sql);
              ps.setString(1, name);
              ps.setInt(2,age);
              ps.setString(3, gender);
              ps.setString(4,job);
              ps.setString(5, address);
              ps.setInt(6,salary);
              ps.setString(7,username);
              ps.setString(8, password);
              ps.execute();
              
              Nametxt.setText("");
              Agetxt.setText("");
              UserNametxt.setText("");
              Passwordtxt.setText("");
              Addresstxt.setText("");
              Salarytxt.setText("");
              buttonGroup1.clearSelection();
              
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,"Username already exists. Please try with new one.");
          }
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void ViewEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEmpButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewEmployeeJFrame().setVisible(true);
    }//GEN-LAST:event_ViewEmpButtonActionPerformed

    private void NametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NametxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Nametxt.getText());
        if(!match.matches()){
            lblName.setText("Name is incorrect");
        }
        else{
            lblName.setText("");
        }
    }//GEN-LAST:event_NametxtKeyReleased

    private void AgetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgetxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[0-9]{1,2}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Agetxt.getText());
        if(!match.matches()){
            lblage.setText("Age is incorrect");
        }
        else{
            lblage.setText("");
        }
    }//GEN-LAST:event_AgetxtKeyReleased

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
            java.util.logging.Logger.getLogger(AddEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmpJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JTextField Agetxt;
    private javax.swing.JButton BackButton;
    private javax.swing.JRadioButton FemaleBtn;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JComboBox<String> JobCombobox;
    private javax.swing.JLabel JobLbl;
    private javax.swing.JRadioButton MaleBtn;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JRadioButton OthersBtn;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JTextField Passwordtxt;
    private javax.swing.JLabel SalaryLbl;
    private javax.swing.JTextField Salarytxt;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel UserNameLbl;
    private javax.swing.JTextField UserNametxt;
    private javax.swing.JButton ViewEmpButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJ;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSal;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblage;
    // End of variables declaration//GEN-END:variables
}
