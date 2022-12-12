/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.File;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.sql.ResultSet;
import database.*;
import java.awt.Desktop;
import java.io.IOException;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 100));
        setPreferredSize(new java.awt.Dimension(1300, 577));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerDetailsBillLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        CustomerDetailsBillLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerDetailsBillLbl.setText("CUSTOMER DETAILS BILL");
        getContentPane().add(CustomerDetailsBillLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 180, 31));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 1018, 315));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLICK ON TABLE ROW TO OPEN BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 318, 27));

        ExitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ExitBtn.setText("Exit");
        getContentPane().add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 19, -1, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customerbilling Background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                File pdfFile = new File("/Users/sahithi/Desktop/aed project"+id+".pdf");
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}

		} else {
			System.out.println("File is not exists!");
		}

              /*//Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler" +"/Users/sahithi/Desktop/aedproject"+id+".pdf");
                Desktop desktop=Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.OPEN)){
                    desktop.open(new File("aed project"+id+".pdf"));
                }
                else{
                    System.out.println("Open is not supported");
                }*/
            }
            catch(IOException e)
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
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
