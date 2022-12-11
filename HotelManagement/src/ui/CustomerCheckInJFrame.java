/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author koushalamshala
 */
public class CustomerCheckInJFrame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    
    /**
     * Creates new form CustomerCheckInJFrame
     */
    public CustomerCheckInJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        
        CheckIntxt.setEditable(false);
        Pricetxt.setEditable(false);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        CheckIntxt.setText(myFormat.format(cal.getTime()));
        
    }
    String bedtype;
    String roomtype;
    String roomno;
    String price;
    
    public void roomDetails(){
        jComboBox2.removeAllItems();
        Pricetxt.setText("");
        bedtype = (String)BedBox.getSelectedItem();
        roomtype=(String)TypeBox.getSelectedItem();
        try{
            //ResultSet rs=Select.getData("SELECT * FROM rooms WHERE bedtype='"+bedtype+"' AND roomtype='"+roomtype+"' AND status='Not Booked'");
            //String sql = "SELECT * FROM rooms WHERE bedtype='"+bedtype+"' AND roomtype='"+roomtype+"' AND status='Not Booked'";
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM rooms WHERE bedtype='"+bedtype+"' AND roomtype='"+roomtype+"' AND status='Not Booked'");
            while(rs.next())
            {
                jComboBox2.addItem(rs.getString(1));
                //jComboBox2.addItem(rs.getString(2));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerCheckInLbl = new javax.swing.JLabel();
        CustomerNameLbl = new javax.swing.JLabel();
        CustomerNametxt = new javax.swing.JTextField();
        PhLbl = new javax.swing.JLabel();
        Phtxt = new javax.swing.JTextField();
        NationalityLbl = new javax.swing.JLabel();
        Nationalitytxt = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        GenderBox = new javax.swing.JComboBox<>();
        EmailLbl = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        IDproofLbl = new javax.swing.JLabel();
        IDProoftxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Addresstxt = new javax.swing.JTextField();
        CheckInLbl = new javax.swing.JLabel();
        CheckIntxt = new javax.swing.JTextField();
        BedLbl = new javax.swing.JLabel();
        BedBox = new javax.swing.JComboBox<>();
        RoomTypeLbl = new javax.swing.JLabel();
        TypeBox = new javax.swing.JComboBox<>();
        RoomNoLbl = new javax.swing.JLabel();
        PriceLbl = new javax.swing.JLabel();
        Pricetxt = new javax.swing.JTextField();
        AlloteRoomBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblMN = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        lblNation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(1080, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerCheckInLbl.setFont(new java.awt.Font("Big Caslon", 1, 36)); // NOI18N
        CustomerCheckInLbl.setText("Customer CheckIn");
        getContentPane().add(CustomerCheckInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 30));

        CustomerNameLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        CustomerNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerNameLbl.setText("Name");
        CustomerNameLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CustomerNameLblKeyReleased(evt);
            }
        });
        getContentPane().add(CustomerNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 124, 23));

        CustomerNametxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        CustomerNametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CustomerNametxtKeyReleased(evt);
            }
        });
        getContentPane().add(CustomerNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 121, -1));

        PhLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        PhLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PhLbl.setText("Mobile Number");
        getContentPane().add(PhLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 124, 25));

        Phtxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        Phtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Phtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhtxtKeyReleased(evt);
            }
        });
        getContentPane().add(Phtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, -1));

        NationalityLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        NationalityLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NationalityLbl.setText("Nationality");
        getContentPane().add(NationalityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 124, 23));

        Nationalitytxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        Nationalitytxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nationalitytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NationalitytxtKeyReleased(evt);
            }
        });
        getContentPane().add(Nationalitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));

        GenderLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        GenderLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GenderLbl.setText("Gender");
        getContentPane().add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 124, 25));

        GenderBox.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 121, -1));

        EmailLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        EmailLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmailLbl.setText("Email");
        getContentPane().add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 124, 26));

        Emailtxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        Emailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailtxtKeyReleased(evt);
            }
        });
        getContentPane().add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 121, -1));

        IDproofLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        IDproofLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDproofLbl.setText("ID Proof");
        getContentPane().add(IDproofLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 124, 23));

        IDProoftxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        IDProoftxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(IDProoftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 170, -1));

        jLabel1.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Address");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 124, 25));

        Addresstxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        Addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, -1));

        CheckInLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        CheckInLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CheckInLbl.setText("Check In Date(Today)");
        getContentPane().add(CheckInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 25));

        CheckIntxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        CheckIntxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(CheckIntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 140, -1));

        BedLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        BedLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BedLbl.setText("Bed Type");
        getContentPane().add(BedLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 92, 23));

        BedBox.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        BedBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Twin", "Queen", "King" }));
        BedBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BedBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 118, -1));

        RoomTypeLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        RoomTypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RoomTypeLbl.setText("Room Type");
        getContentPane().add(RoomTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 110, 25));

        TypeBox.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC", " " }));
        TypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeBoxActionPerformed(evt);
            }
        });
        getContentPane().add(TypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 118, -1));

        RoomNoLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        RoomNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RoomNoLbl.setText("Room No");
        getContentPane().add(RoomNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 92, 20));

        PriceLbl.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        PriceLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PriceLbl.setText("Price");
        getContentPane().add(PriceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 92, -1));

        Pricetxt.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(Pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 118, -1));

        AlloteRoomBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        AlloteRoomBtn.setText("Allote Rooms");
        AlloteRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlloteRoomBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AlloteRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        ClearBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 107, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 120, -1));

        BackButton.setBackground(new java.awt.Color(200, 199, 175));
        BackButton.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        BackButton.setText("Log Out");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 120, 30));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));
        getContentPane().add(lblMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 70, 170, 20));
        getContentPane().add(lblE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 20));
        getContentPane().add(lblNation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 140, 20));

        jButton1.setBackground(new java.awt.Color(200, 199, 175));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(true);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 330, 50));

        jLabel3.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CheckIn.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckInJFrame().setVisible(true);
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void BedBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedBoxActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_BedBoxActionPerformed

    private void TypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeBoxActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_TypeBoxActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        roomno=(String)jComboBox2.getSelectedItem();
        try{
            //ResultSet rs=Select.getData("SELECT * FROM rooms WHERE bedtype='"+bedtype+"' AND roomtype='"+roomtype+"' AND status='Not Booked'");
            //String sql = "SELECT * FROM rooms WHERE roomno='"+roomno+"'";
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM rooms WHERE roomno='"+roomno+"'");
            while(rs.next()){
                Pricetxt.setText(rs.getString(5));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void AlloteRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlloteRoomBtnActionPerformed
        // TODO add your handling code here:
        int id=1;
        String name = CustomerNametxt.getText();
        String mobileno = Phtxt.getText();
        String nationality = Nationalitytxt.getText();
        String email = Emailtxt.getText();
        String address = Addresstxt.getText();
        String idproof = IDProoftxt.getText();
        String roomType = (String)TypeBox.getSelectedItem();
        String bedType = (String)BedBox.getSelectedItem();
        String roomNo = (String)jComboBox2.getSelectedItem();
        String gender = (String)GenderBox.getSelectedItem();
        String price = Pricetxt.getText();
        String checkIn = CheckIntxt.getText();
                
        if(name.equals("")|| nationality.equals("")|| email.equals("")||address.equals("")||idproof.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the details");
            CustomerNametxt.setText("");
            Phtxt.setText("");
            Nationalitytxt.setText("");
            Emailtxt.setText("");
            Addresstxt.setText("");
            IDProoftxt.setText("");
        }
        else
        {
          try{
              String query = "Select max(id) from checkin";
              ps=con.prepareStatement(query);
              rs = ps.executeQuery();
              while(rs.next())
              {
                  id=rs.getInt(1);
              }
              id=id+1;
              if(!price.equals("")){
                  query = "UPDATE rooms set status='Booked' WHERE roomno='"+roomNo+"'";
                  ps=con.prepareStatement(query);
                  ps.executeUpdate();
                  String sql = "INSERT INTO checkin (id,name,mobileno,nationality,gender,email,idproof,address,checkin,roomno,bedType,roomType,price) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  ps=con.prepareStatement(sql);
                  ps.setInt(1,id);
                  ps.setString(2, name);
                  ps.setString(3,mobileno);
                  ps.setString(4,nationality);
                  ps.setString(5, gender);
                  ps.setString(6,email);
                  ps.setString(7, idproof);
                  ps.setString(8, address);
                  ps.setString(9,checkIn);
                  ps.setString(10,roomNo);
                  ps.setString(11, bedType);
                  ps.setString(12, roomType);
                  ps.setString(13, price);
                  ps.execute();
                  
                  CustomerNametxt.setText("");
                  Phtxt.setText("");
                  Nationalitytxt.setText("");
                  Emailtxt.setText("");
                  Addresstxt.setText("");
                  IDProoftxt.setText("");
                  setVisible(false);
                  new CustomerCheckInJFrame().setVisible(true);
              }
             
              
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
        }
    }//GEN-LAST:event_AlloteRoomBtnActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ReceptionistJFrame().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CustomerNameLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerNameLblKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNameLblKeyReleased

    private void CustomerNametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerNametxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[a-zA-Z]{3,20}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(CustomerNametxt.getText());
        if(!match.matches()){
            lblName.setText("Name is incorrect");
        }
        else{
            lblName.setText("");
        }
    }//GEN-LAST:event_CustomerNametxtKeyReleased

    private void PhtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhtxtKeyReleased
        // TODO add your handling code here:
                String PATTERN="^[0-9]{10,10}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Phtxt.getText());
        if(!match.matches()){
            lblMN.setText("Phone Number is not valid");
        }
        else{
            lblMN.setText("");
        }
    }//GEN-LAST:event_PhtxtKeyReleased

    private void EmailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailtxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[a-zA-Z0-9]{4,30}[@][a-zA-Z]{2,10}[.][a-zA-Z]{1,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Emailtxt.getText());
        if(!match.matches()){
            lblE.setText("Email is incorrect");
        }
        else{
            lblE.setText("");
        }
    }//GEN-LAST:event_EmailtxtKeyReleased

    private void NationalitytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalitytxtKeyReleased
        // TODO add your handling code here:
                String PATTERN="^[a-zA-Z]{4,20}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Nationalitytxt.getText());
        if(!match.matches()){
            lblNation.setText("Nationality is incorrect");
        }
        else{
            lblNation.setText("");
        }
    }//GEN-LAST:event_NationalitytxtKeyReleased

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
            java.util.logging.Logger.getLogger(CustomerCheckInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckInJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JButton AlloteRoomBtn;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> BedBox;
    private javax.swing.JLabel BedLbl;
    private javax.swing.JLabel CheckInLbl;
    private javax.swing.JTextField CheckIntxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CustomerCheckInLbl;
    private javax.swing.JLabel CustomerNameLbl;
    private javax.swing.JTextField CustomerNametxt;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JTextField IDProoftxt;
    private javax.swing.JLabel IDproofLbl;
    private javax.swing.JLabel NationalityLbl;
    private javax.swing.JTextField Nationalitytxt;
    private javax.swing.JLabel PhLbl;
    private javax.swing.JTextField Phtxt;
    private javax.swing.JLabel PriceLbl;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JLabel RoomNoLbl;
    private javax.swing.JLabel RoomTypeLbl;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblMN;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNation;
    // End of variables declaration//GEN-END:variables
}
