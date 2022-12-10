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
public class DriverJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DriverJFrame
     */
    Connection con;
    PreparedStatement ps;
    ResultSet rs
            ;
    public DriverJFrame() {
        initComponents();
          con = ConnectionProvider.getCon();
        populateTable();      
    }
      public void populateTable()
    {
        try{
            String sql = "SELECT * FROM driver";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            Drivertbl.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Drivertbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Updatebtn = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 118));
        setMaximumSize(new java.awt.Dimension(1100, 500));
        setMinimumSize(new java.awt.Dimension(1100, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Big Caslon", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lets Go ! Vroom  !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        Drivertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room No", "Car Type", "No of Passengers", "To", "Time Window", "Date", "Extra Requirements", "Status"
            }
        ));
        Drivertbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DrivertblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Drivertbl);
        if (Drivertbl.getColumnModel().getColumnCount() > 0) {
            Drivertbl.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 820, 310));

        jLabel2.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        Updatebtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        Updatebtn.setText("Confirm");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, -1));

        searchtxt.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        getContentPane().add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 100, -1));

        searchbtn.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        searchbtn.setText("Search");
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Picked", "Dropped" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cars.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DrivertblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrivertblMouseClicked
        // TODO add your handling code here:
        int r=Drivertbl.getSelectedRow();
        String click = (Drivertbl.getModel().getValueAt(r, 0).toString());
        String sql = "SELECT * FROM driver WHERE roomno='"+click+"'";
        try{
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String roomno = rs.getString(1);
                String car = rs.getString(2);
                String passengers = rs.getString(3);
                String location = rs.getString(4);
                String time = rs.getString(5);
                String date = rs.getString(6);
                String requirements = rs.getString(7);
                String status =rs.getString(8);
                
                searchtxt.setText(roomno);      
            }   
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }                                     
    }//GEN-LAST:event_DrivertblMouseClicked

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
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
    }//GEN-LAST:event_UpdatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(DriverJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Drivertbl;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables


}
