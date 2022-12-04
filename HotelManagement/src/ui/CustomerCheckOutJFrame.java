/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author koushalamshala
 */
public class CustomerCheckOutJFrame extends javax.swing.JPanel {

    /**
     * Creates new form CustomerCheckOutJFrame
     */
    public CustomerCheckOutJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerCheckOutLbl = new javax.swing.JLabel();
        RoomNumberLbl = new javax.swing.JLabel();
        RoomNotxt = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CustomerNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CheckInDatetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CheckOutDatetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CustomerPhtxt = new javax.swing.JTextField();
        NoofdaysLbl = new javax.swing.JLabel();
        Noofdaystxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerCheckOutLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        CustomerCheckOutLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerCheckOutLbl.setText("Customer CheckOut");
        add(CustomerCheckOutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 19, 210, 36));

        RoomNumberLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        RoomNumberLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomNumberLbl.setText("Room Number");
        add(RoomNumberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 73, -1, 20));

        RoomNotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(RoomNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 73, 139, -1));

        SearchBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        SearchBtn.setText("Search");
        add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 73, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 144, 139, 26));

        CustomerNametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(CustomerNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 145, 137, 26));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check In Date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 189, 139, 26));

        CheckInDatetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(CheckInDatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 190, 137, 26));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Check Out Date (Today)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 232, -1, 30));

        CheckOutDatetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(CheckOutDatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 232, 137, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Customer Mobile Number ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 280, -1, 26));
        add(CustomerPhtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 280, 137, 28));

        NoofdaysLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        NoofdaysLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoofdaysLbl.setText("Number Of Days Stay");
        add(NoofdaysLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 225, 27));
        add(Noofdaystxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 237, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Amount to Collect from Customer");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 25));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 237, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 225, 23));
        add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 237, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Check Out");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, -1));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton2.setText("Clear");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check In Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 504, 1200, 331));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-out-sign-arrow-2.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 840));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CheckInDatetxt;
    private javax.swing.JTextField CheckOutDatetxt;
    private javax.swing.JLabel CustomerCheckOutLbl;
    private javax.swing.JTextField CustomerNametxt;
    private javax.swing.JTextField CustomerPhtxt;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JLabel NoofdaysLbl;
    private javax.swing.JTextField Noofdaystxt;
    private javax.swing.JTextField RoomNotxt;
    private javax.swing.JLabel RoomNumberLbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
