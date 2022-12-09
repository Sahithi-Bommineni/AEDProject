/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.ConnectionProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author sahithi
 */
public class CheckOutJFrame extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    
    /**
    /**
     * Creates new form CheckOutJFrame
     */
    public CheckOutJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        
    }
    
    int id=0;
    String Query;
    String roomType;
    String bedType;
    String roomNo;

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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 118));
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1266, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel2.setText("Room No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 59, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 52, 134, 30));

        jButton1.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "Mobile No", "Gender", "Nationality", "Email", "ID Proof", "Address", "CheckIn Date", "Room No", "Bed Type", "Room Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, 1280, 212));

        jLabel3.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel3.setText("Customer Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 122, -1, -1));

        jTextField2.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 150, 188, -1));

        jLabel4.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel4.setText("Check In Date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        jTextField3.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 170, -1));

        jLabel5.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel5.setText("Check Out Date :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jTextField4.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 30));

        jLabel6.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel6.setText("Customer Mobile No :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jTextField5.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 181, -1));

        jLabel7.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel7.setText("Price Per Day :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 140, 30));

        jLabel8.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel8.setText("No of Days Stayed :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 190, 30));

        jLabel9.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel9.setText("Total Amount to be Collected from Customer :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 400, -1));

        jTextField6.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 210, 30));

        jTextField7.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 260, 30));

        jTextField8.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 370, 30));

        jLabel10.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel10.setText("Email Id : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jTextField9.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 250, -1));

        jButton2.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 120, 40));

        jButton3.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 120, 40));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
            /**/
            /*ResultSet rs = Select.getData("SELECT * FROM customers WHERE checkout IS NULL");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();*/
         try{
            String sql = "SELECT * FROM customers WHERE checkout IS NULL";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }
            rs.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String roomno=jTextField1.getText();
        try{
            String sql = "SELECT * FROM customers WHERE roomno='"+roomNo+"' AND checkout IS NULL";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                jTextField1.setEditable(false);
                id=rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField2.setText(rs.getString(9));
                jTextField2.setText(rs.getString(3));
                jTextField2.setText(rs.getString(13));
                
                SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                jTextField4.setText(myFormat.format(cal.getTime()));
                String dateBeforeString = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString = myFormat.format(cal.getTime());
                java.util.Date dateAfter = myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noofdaysstayed = (int)(difference/(1000*60*60*24));
                if(noofdaysstayed==0){
                    noofdaysstayed = 1;
                    jTextField7.setText(String.valueOf(noofdaysstayed));
                    float price = Float.parseFloat(jTextField6.getText());
                    
                    jTextField8.setText(String.valueOf(noofdaysstayed));
                    jTextField9.setText(rs.getString(6));
                    roomType = rs.getString(12);
                    bedType = rs.getString(11);
                }else{
                    JOptionPane.showMessageDialog(null, "Room Number is not booked or Room Number Doesn't Exist");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CheckOutJFrame().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = jTextField2.getText();
        String mobileno = jTextField5.getText();
        String email  = jTextField9.getText();
        String checkout = jTextField4.getText();
        String noofdaysstayed = jTextField7.getText();
        String totalAmount = jTextField8.getText();
        roomNo = jTextField1.getText();
        
        Query = "UPDATE customers SET daysstayed='"+noofdaysstayed+"',totalamt='"+totalAmount+"',checkout ='"+checkout+"' WHERE id='"+id+"'";
        try {
            ps=con.prepareStatement(Query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Query = "UPDATE rooms SET status='Not Booked' WHERE roomno='"+roomNo+"'";
        try{
            ps=con.prepareStatement(Query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        String path="";    
        JFileChooser j =new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x= j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        //com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph1 =  new Paragraph("                                             Palm Tree Resorts                                   ");
            doc.add(paragraph1);
            Paragraph paragraph2 =  new Paragraph("*************************************************************************************************");
            doc.add(paragraph2);
            Paragraph paragraph3 =  new Paragraph("\tBill ID : "+id+"\nCustomer Details:\nName: "+name+"\tMobile Number: "+mobileno+"\nEmail: "+email+"\n");
            doc.add(paragraph3);
            Paragraph paragraph4 =  new Paragraph("\tRoom Details: \nRoom No: "+jTextField1.getText()+"\nRoom Type: "+roomType+"\nBed Type: "+bedType+"\n Price per day: "+jTextField6.getText()+"\n");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tbl = new PdfPTable(4);
            tbl.addCell("Check In Date: "+jTextField3.getText());
            tbl.addCell("Check Out Date: "+checkout);
            tbl.addCell("No of days Stayed: "+noofdaysstayed);
            tbl.addCell("Total Amount Paid: "+totalAmount);
            doc.add(tbl);
            doc.add(paragraph2);
            Paragraph paragraph5 =  new Paragraph("                                       Thank You, Please Visit Again.                               ");
            doc.add(paragraph5);
            
            
        }catch(Exception e){
            //Logger.getLogger(pdfGenerator.class.getName()).log(Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        /*int a = JOptionPane.showConfirmDialog(null, "Do you want to print bill","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try{
                if(new File(+id+".pdf").exists()){
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler" +id+".pdf");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOutJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}