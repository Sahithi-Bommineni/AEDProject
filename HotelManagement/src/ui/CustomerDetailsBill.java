/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.ResultSet;
import database.*;
import java.sql.PreparedStatement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author koushalamshala
 */
public class CustomerDetailsBill extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form CustomerDetailsBill
     */
    public CustomerDetailsBill() {
        initComponents();
        con = ConnectionProvider.getCon();
        populateTable();
        
        /*SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        SearchCheckOuttxt.setText(myFormat.format(cal.getTime()));*/
        }
    
    public void populateTable()
    {
        try{
            String sql = "SELECT * FROM checkin";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        CustomerDetailsBillLbl = new javax.swing.JLabel();
        SearchCheckOutLbl = new javax.swing.JLabel();
        SearchCheckOuttxt = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustomerDetailsBillLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        CustomerDetailsBillLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerDetailsBillLbl.setText("CUSTOMER DETAILS BILL");

        SearchCheckOutLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        SearchCheckOutLbl.setText("Search By Check Out Date");

        SearchBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        SearchBtn.setText("Search");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "IDProof", "Address", "Check IN Date", "Room Number", "Bed", "Room Type", "Price Per Day", "Number Of Days of Stay", "Total Amount", "Check Out Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLICK ON TABLE ROW TO OPEN BILL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CustomerDetailsBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 721, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SearchCheckOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchCheckOuttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchBtn)
                                .addGap(164, 164, 164))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CustomerDetailsBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBtn)
                    .addComponent(SearchCheckOuttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCheckOutLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String click=model.getValueAt(index,0).toString();
        String sql = "SELECT * FROM checkin WHERE id='"+click+"'";
        try{
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String mobileno = rs.getString(3);
                String gender = rs.getString(5);
                String nationality = rs.getString(4);
                String email = rs.getString(6);
                String idproof = rs.getString(7);
                String address = rs.getString(8);
                String checkin = rs.getString(9);
                String roomno =rs.getString(10);
                String bedType = rs.getString(11);
                String roomType = rs.getString(12);
                String price = rs.getString(13);
                String daysstayed = rs.getString(14);
                String totalamt = rs.getString(15);
                String checkout = rs.getString(16);

            try
            {
                if((new File("Users/sahithi/Desktop/aedproject0.pdf")).exists())
                {
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHeader "+"/Users/sahithi/Desktop/aedproject0.pdf");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"File is not exist");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerDetailsBillLbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel SearchCheckOutLbl;
    private javax.swing.JTextField SearchCheckOuttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
