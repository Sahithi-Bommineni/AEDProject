/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author nikhithajarabana
 */
public class AddRoomJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddRoomJFrame
     */
    public AddRoomJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roomnoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FloorTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RoomTypeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PriceTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BedsTxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("More Rooms More Space ! ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Room No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        getContentPane().add(roomnoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 90, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Floor :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));
        getContentPane().add(FloorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 90, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Room Type :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));
        getContentPane().add(RoomTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 90, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Price :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));
        getContentPane().add(PriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 90, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("No of Beds :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, -1));
        getContentPane().add(BedsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 90, -1));

        savebtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        savebtn.setText("Save");
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        Updatebtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Updatebtn.setText("Update");
        getContentPane().add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        deletebtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deletebtn.setText("Remove");
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rooms.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1200, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTextField BedsTxt;
    private javax.swing.JTextField FloorTxt;
    private javax.swing.JTextField PriceTxt;
    private javax.swing.JTextField RoomTypeTxt;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField roomnoTxt;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
