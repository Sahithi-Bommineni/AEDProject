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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nikhithajarabana
 */
public class HouseKeepingJFrame extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form HouseKeepingJFrame
     */
    public HouseKeepingJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        populateTable();
    }
    
    public void populateTable()
    {
        try{
            String sql = "SELECT * FROM housekeeping";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            Housekeepingtbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Housekeepingtbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Housekeepingtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room No", "Room Cleaning", "Restroom Cleaning", "special instructions", "date", "Time slot", "Status"
            }
        ));
        Housekeepingtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HousekeepingtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Housekeepingtbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 710, 300));

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel2.setText("Status :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 170, 30));

        updatebtn.setBackground(new java.awt.Color(153, 204, 255));
        updatebtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 180, 30));

        searchbtn.setBackground(new java.awt.Color(153, 204, 255));
        searchbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, -1, -1));
        getContentPane().add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 140, -1));

        BackButton.setBackground(new java.awt.Color(153, 204, 255));
        BackButton.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Log Out");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 100, 30));

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Done", "Pending" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housekeeping-1-scaled (1).jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1200, 700));
        jLabel3.setMinimumSize(new java.awt.Dimension(1200, 700));
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        String roomno = searchtxt.getText();
        String status = (String)jComboBox1.getSelectedItem();
        String sql = "UPDATE housekeeping SET status = ? WHERE roomno = ?";
        try{
            if(status.equalsIgnoreCase("Select Status")){
                JOptionPane.showMessageDialog(null, "Please select status");
            }
            else{
                ps=con.prepareStatement(sql);
                ps.setString(1,status);
                ps.setString(2,roomno);
                ps.execute();
                
                jComboBox1.setSelectedItem("Select Status");
                new HouseKeepingJFrame().setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new StaffLoginJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void HousekeepingtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HousekeepingtblMouseClicked
        // TODO add your handling code here:
        int r = Housekeepingtbl.getSelectedRow();
        String click = (Housekeepingtbl.getModel().getValueAt(r, 0).toString());
        String sql = "SELECT * FROM housekeeping WHERE roomno ='"+click+"'";
        try{
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String roomno = rs.getString(1);
                String roomcleaning = rs.getString(2);
                String restroom = rs.getString(3);
                String splins = rs.getString(4);
                String date = rs.getString(5);
                String time = rs.getString(6);
                
                //searchtxt.isEditable(false);
                searchtxt.setText(roomno);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "e");
        }
    }//GEN-LAST:event_HousekeepingtblMouseClicked

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
            java.util.logging.Logger.getLogger(HouseKeepingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HouseKeepingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HouseKeepingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HouseKeepingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HouseKeepingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable Housekeepingtbl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
