/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Driver;

/**
 *
 * @author nikhithajarabana
 */
public class DriverServiceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DriverServiceJFrame
     */
    
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        
    public DriverServiceJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        DateTxt.setText(myFormat.format(cal.getTime()));
    }
    
    void getInfo(String roomno,String occupancy){
     RoomNtxt.setText(roomno);
     NoOfPassTxt.setText(occupancy);
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
        RoomNtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        NoOfPassTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ExtraReqTxt = new javax.swing.JTextField();
        Submitbtn = new javax.swing.JButton();
        lblRoom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DateTxt = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblPassengers = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        setMinimumSize(new java.awt.Dimension(1100, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Big Caslon", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Let's go! Vroom !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        RoomNtxt.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        RoomNtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RoomNtxtKeyReleased(evt);
            }
        });
        getContentPane().add(RoomNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "Sedan", "Hatchback", "Mini Van", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 150, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No of Passengers :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        NoOfPassTxt.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        NoOfPassTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NoOfPassTxtKeyReleased(evt);
            }
        });
        getContentPane().add(NoOfPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time Window :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Extra Requirements :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        ExtraReqTxt.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        getContentPane().add(ExtraReqTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 280, 30));

        Submitbtn.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        Submitbtn.setText("Submit");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 30));
        getContentPane().add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 110, 20));

        jLabel9.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 90, -1));

        DateTxt.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        getContentPane().add(DateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 140, 30));

        BackButton.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 30));

        jComboBox2.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "1 hour", "2 hours", "4 hours", "12 hours", "24 hours", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 220, 30));

        lblPassengers.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPassengers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/taxi.jpg"))); // NOI18N
        jLabel7.setText("From");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -100, 1260, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        int roomno = Integer.parseInt(RoomNtxt.getText());
        String cartype = (String)jComboBox1.getSelectedItem();
        int passenger = Integer.parseInt(NoOfPassTxt.getText());
        
        String time = (String)jComboBox2.getSelectedItem();
        String date = DateTxt.getText();
        String requirements = ExtraReqTxt.getText();
     
        if(RoomNtxt.equals("")|| jComboBox1.equals("")||NoOfPassTxt.equals("")|| time.equals("")||DateTxt.equals("")||ExtraReqTxt.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the details");
            RoomNtxt.setText("");
            NoOfPassTxt.setText("");
            
            jComboBox1.setSelectedItem("Select Car");
            jComboBox2.setSelectedItem("Select Time");
            DateTxt.setText("");
            ExtraReqTxt.setText("");
           
        }
        else
        {
          Connection con = ConnectionProvider.getCon();
          Driver d = new Driver();
          d.setRoomno(roomno);
          d.setCartype(cartype);
          d.setDate(date);
          d.setTime(time);
          
          d.setPassengers(passenger);
          d.setRequirements(requirements);
          try{
              String sql = "INSERT INTO Driver (roomno,cartype,passenger,time,date,requirements) VALUES (?,?,?,?,?,?,?)";
              ps=con.prepareStatement(sql);
              ps.setInt(1, roomno);
              ps.setString(2, cartype);
              ps.setInt(3,passenger);
              
              ps.setString(5, time);
              ps.setString(6, date);
              ps.setString(7, requirements);
              ps.execute();
              
              RoomNtxt.setText("");
              NoOfPassTxt.setText("");
              
              jComboBox1.setSelectedItem("Select Car");
              jComboBox2.setSelectedItem("Select Time");
              DateTxt.setText("");
              ExtraReqTxt.setText("");
              
              
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
        
    }                        
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void RoomNtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RoomNtxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[0-9]{3,3}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(RoomNtxt.getText());
        if(!match.matches()){
            lblRoom.setText("Room No is incorrect");
        }
        else{
            lblRoom.setText("");
        }        
    }//GEN-LAST:event_RoomNtxtKeyReleased

    private void NoOfPassTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoOfPassTxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[0-9]{1,2}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(NoOfPassTxt.getText());
        if(!match.matches()){
            lblPassengers.setText("Please give numbers only");
        }
        else{
            lblPassengers.setText("");
        }        
    }//GEN-LAST:event_NoOfPassTxtKeyReleased

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerServiceJFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(DriverServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverServiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JTextField ExtraReqTxt;
    private javax.swing.JTextField NoOfPassTxt;
    private javax.swing.JTextField RoomNtxt;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPassengers;
    private javax.swing.JLabel lblRoom;
    // End of variables declaration//GEN-END:variables
}
