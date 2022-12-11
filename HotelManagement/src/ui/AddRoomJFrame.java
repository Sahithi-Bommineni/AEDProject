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
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

import model.Room;

/**
 *
 * @author koushalamshala
 */
public class AddRoomJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     */
    /**
     * Creates new form AddRoomFrame
     */
    public AddRoomJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        populateTable();
    }
    
    public void populateTable()
    {
        try{
            String sql = "SELECT * FROM rooms";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            roomtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        BackButton = new javax.swing.JButton();
        RoomNoLbl = new javax.swing.JLabel();
        FloorLbl = new javax.swing.JLabel();
        RoomNotxt = new javax.swing.JTextField();
        Floortxt = new javax.swing.JTextField();
        RoomtypeLbl = new javax.swing.JLabel();
        roomtypecombobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bedtypecombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Pricetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomtable = new javax.swing.JTable();
        AddRoomBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        lblRoomNo = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        lblFloor = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, -1, -1));

        RoomNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RoomNoLbl.setText("Room No :");
        getContentPane().add(RoomNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 71, 101, 29));

        FloorLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FloorLbl.setText("Floor :");
        getContentPane().add(FloorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 131, 101, 28));

        RoomNotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RoomNotxtKeyReleased(evt);
            }
        });
        getContentPane().add(RoomNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 67, 99, 30));

        Floortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FloortxtKeyReleased(evt);
            }
        });
        getContentPane().add(Floortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 127, 99, 30));

        RoomtypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RoomtypeLbl.setText("Room Type:");
        getContentPane().add(RoomtypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 71, 82, 29));

        roomtypecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON AC" }));
        getContentPane().add(roomtypecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 74, 101, -1));

        jLabel2.setText("Bed Type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 71, 64, 29));

        bedtypecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Twin", "Queen", "King" }));
        getContentPane().add(bedtypecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 74, 90, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Price:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 137, 82, -1));

        Pricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PricetxtKeyReleased(evt);
            }
        });
        getContentPane().add(Pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 127, 101, 30));

        roomtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ROOM NO", "FLOOR", "ROOM TYPE", "BED TYPE", "PRICE", "OCCUPANCY", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, 643, 316));

        AddRoomBtn.setText("Add Rooms");
        AddRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 207, -1, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 268, 99, -1));
        getContentPane().add(lblRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 102, 100, 23));

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 328, 99, -1));
        getContentPane().add(lblFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 20));
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 175, 20));

        jLabel4.setText("Max Ocuupancy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 90, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rooms.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -50, -1, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminJframe().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomBtnActionPerformed
        // TODO add your handling code here:
        int roomno = Integer.parseInt(RoomNotxt.getText());
        int floor = Integer.parseInt(Floortxt.getText());
        String roomtype = (String)roomtypecombobox.getSelectedItem();
        String bedtype = (String)bedtypecombobox.getSelectedItem();
        int price = Integer.parseInt(Pricetxt.getText());
        int occupancy = Integer.parseInt(jTextField1.getText());
        //String status = statustxt.getText();
        
        if(RoomNotxt.equals("")|| Floortxt.equals("")||Pricetxt.equals("")||jTextField1.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }
        else
        {
            Connection con = ConnectionProvider.getCon();
            Room r = new Room();
            r.setRoomno(roomno);
            r.setFloor(floor);
            r.setRoomtype(roomtype);
            r.setBedtype(bedtype);
            r.setPrice(price);
            r.setOccupancy(occupancy);
            
          try{
              String sql = "INSERT INTO rooms (roomno,floor,roomtype,bedtype,price,occupancy,status) VALUES (?,?,?,?,?,?,'Not Booked')";
              ps=con.prepareStatement(sql);
              ps.setInt(1, roomno);
              ps.setInt(2,floor);
              ps.setString(3, roomtype);
              ps.setString(4,bedtype);
              ps.setInt(5, price);
              ps.setInt(6,occupancy);
              //ps.setString(6,status);
              ps.execute();
              
              RoomNotxt.setText("");
              Floortxt.setText("");
              Pricetxt.setText("");
              jTextField1.setText("");
              setVisible(false);
              new AddRoomJFrame().setVisible(true);
              
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
        }
    }//GEN-LAST:event_AddRoomBtnActionPerformed

    private void roomtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomtableMouseClicked
        // TODO add your handling code here:
        int r=roomtable.getSelectedRow();
        String click = (roomtable.getModel().getValueAt(r, 0).toString());
        String sql = "SELECT * FROM rooms WHERE roomno='"+click+"'";
        try{
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            if(rs.next()){
            String roomno = rs.getString(1);
            String floor = rs.getString(2);
            String roomtype = rs.getString(3);
            String bedtype = rs.getString(4);
            String price = rs.getString(5);
            String occupancy = rs.getString(6);
            String status = rs.getString(7);
            
            RoomNotxt.setText(roomno);
            Floortxt.setText(floor);
            Pricetxt.setText(price);
            jTextField1.setText(occupancy);
            
            }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_roomtableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        String roomno = RoomNotxt.getText();
        String floor = Floortxt.getText();
        String roomtype = (String)roomtypecombobox.getSelectedItem();
        String bedtype = (String)bedtypecombobox.getSelectedItem();
        String price = Pricetxt.getText();
        String occupancy = jTextField1.getText();
        
        String sql="UPDATE rooms SET floor=?,roomtype=?,bedtype=?,price=?,ocupancy=? WHERE roomno=?";
        try{
            if(roomno.equals("")|| floor.equals("")||price.equals("")||occupancy.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill all the details");
            }
            else
            {
              ps=con.prepareStatement(sql);
              ps.setString(6, roomno);
              ps.setString(1,floor);
              ps.setString(2, roomtype);
              ps.setString(3,bedtype);
              ps.setString(4,price);
              ps.setString(5, occupancy);
              ps.execute();
              
              RoomNotxt.setText("");
              Floortxt.setText("");
              Pricetxt.setText("");
              jTextField1.setText("");
              setVisible(false);
              new AddRoomJFrame().setVisible(true);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        String roomno=RoomNotxt.getText();
        String sql = "DELETE FROM rooms WHERE roomno='"+roomno+"'";
        try{
            ps=con.prepareCall(sql);
            int i = JOptionPane.showConfirmDialog(null, "Are you sure, you want to delete?","Deletion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(i==JOptionPane.YES_OPTION){
                ps.execute();
                JOptionPane.showMessageDialog(null,"Deleted Successfully.");
                RoomNotxt.setText("");
                Floortxt.setText("");
                Pricetxt.setText("");
                jTextField1.setText("");
                setVisible(false);
                new AddRoomJFrame().setVisible(true);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void RoomNotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RoomNotxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[0-9]{3,3}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(RoomNotxt.getText());
        if(!match.matches()){
            lblRoomNo.setText("Room No is incorrect");
        }
        else{
            lblRoomNo.setText("");
        }
    }//GEN-LAST:event_RoomNotxtKeyReleased

    private void FloortxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FloortxtKeyReleased
        // TODO add your handling code here:
            String PATTERN="^[0-9]{1,2}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Floortxt.getText());
        if(!match.matches()){
            lblFloor.setText("Floor is incorrect");
        }
        else{
            lblFloor.setText("");
        }
    }//GEN-LAST:event_FloortxtKeyReleased

    private void PricetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PricetxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{3,4}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Pricetxt.getText());
        if(!match.matches()){
            lblPrice.setText("Price is incorrect");
        }
        else{
            lblPrice.setText("");
        }

    }//GEN-LAST:event_PricetxtKeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
              String PATTERN="^[0-5]{1,1}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField1.getText());
        if(!match.matches()){
            jLabel5.setText("Occupancy is incorrect");
        }
        else{
            jLabel5.setText("");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        String PATTERN="^[0-5]{1,1}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField1.getText());
        if(!match.matches()){
            jLabel5.setText("");
        }
        else{
            jLabel5.setText("");
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoomJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoomBtn;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel FloorLbl;
    private javax.swing.JTextField Floortxt;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JLabel RoomNoLbl;
    private javax.swing.JTextField RoomNotxt;
    private javax.swing.JLabel RoomtypeLbl;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox<String> bedtypecombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFloor;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JTable roomtable;
    private javax.swing.JComboBox<String> roomtypecombobox;
    // End of variables declaration//GEN-END:variables
}
