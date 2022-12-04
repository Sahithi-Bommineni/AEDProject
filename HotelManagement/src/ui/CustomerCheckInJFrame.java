/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author koushalamshala
 */
public class CustomerCheckInJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckInJFrame
     */
    public CustomerCheckInJFrame() {
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
        RoomNotxt = new javax.swing.JTextField();
        PriceLbl = new javax.swing.JLabel();
        Pricetxt = new javax.swing.JTextField();
        AlloteRoomBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerCheckInLbl.setText("Customer CheckIn");
        getContentPane().add(CustomerCheckInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 21, -1, 30));

        CustomerNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerNameLbl.setText("Name");
        getContentPane().add(CustomerNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 86, 124, 23));

        CustomerNametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNametxtActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 86, 121, -1));

        PhLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhLbl.setText("Mobile Number");
        getContentPane().add(PhLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 127, 124, 25));

        Phtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Phtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 128, 121, -1));

        NationalityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NationalityLbl.setText("Nationality");
        getContentPane().add(NationalityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 170, 124, 23));

        Nationalitytxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Nationalitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 170, 121, -1));

        GenderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenderLbl.setText("Gender");
        getContentPane().add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 211, 124, 25));

        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 212, 121, -1));

        EmailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLbl.setText("Email");
        getContentPane().add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 255, 124, 26));

        Emailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });
        getContentPane().add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 257, 121, -1));

        IDproofLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDproofLbl.setText("ID Proof");
        getContentPane().add(IDproofLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 304, 124, 23));

        IDProoftxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(IDProoftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 304, 121, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 345, 124, 25));

        Addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 346, 121, -1));

        CheckInLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckInLbl.setText("Check In Date(Today)");
        getContentPane().add(CheckInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 388, -1, 25));

        CheckIntxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(CheckIntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 389, 121, -1));

        BedLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BedLbl.setText("Beds");
        getContentPane().add(BedLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 86, 92, 23));

        BedBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single ", "Double ", "Triple", " " }));
        getContentPane().add(BedBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 86, 118, -1));

        RoomTypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomTypeLbl.setText("Room Type");
        getContentPane().add(RoomTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 127, 92, 25));

        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC", " " }));
        getContentPane().add(TypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 128, 118, -1));

        RoomNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomNoLbl.setText("Room No");
        getContentPane().add(RoomNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 171, 92, 20));
        getContentPane().add(RoomNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 170, 118, -1));

        PriceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLbl.setText("Price");
        getContentPane().add(PriceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 215, 92, -1));
        getContentPane().add(Pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 212, 118, -1));

        AlloteRoomBtn.setText("Allote Rooms");
        getContentPane().add(AlloteRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        ClearBtn.setText("Clear");
        getContentPane().add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 107, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CheckIn.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNametxtActionPerformed

    private void EmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailtxtActionPerformed

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
    private javax.swing.JTextField RoomNotxt;
    private javax.swing.JLabel RoomTypeLbl;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
