/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author koushalamshala
 */
public class IndoorGames extends javax.swing.JFrame {

    /**
     * Creates new form IndoorGames
     */
    public IndoorGames() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TimeSlotLbl = new javax.swing.JLabel();
        RoomNoLbl = new javax.swing.JLabel();
        NoOfPeopleLbl = new javax.swing.JLabel();
        RoomNoCombo = new javax.swing.JComboBox<>();
        TimeSlotCombo = new javax.swing.JComboBox<>();
        NoOfPeopleCombo = new javax.swing.JComboBox<>();
        GymLbl = new javax.swing.JRadioButton();
        IndoorGames = new javax.swing.JRadioButton();
        GameLbl = new javax.swing.JLabel();
        GameCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Indoor Games");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 32, 133, 29));

        TimeSlotLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        TimeSlotLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeSlotLbl.setText("Time Slot");
        getContentPane().add(TimeSlotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 158, 116, 27));

        RoomNoLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        RoomNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomNoLbl.setText("Room No");
        getContentPane().add(RoomNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 113, 116, 27));

        NoOfPeopleLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        NoOfPeopleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfPeopleLbl.setText("No. Of People");
        getContentPane().add(NoOfPeopleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 203, 116, 27));

        RoomNoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210" }));
        getContentPane().add(RoomNoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 113, 142, 27));

        TimeSlotCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00AM -7:00AM", "7:00AM-8:00AM", "8:00AM-9:00AM", "9:00AM-10:00AM", "10:00AM-11:00AM", "11:00AM-12:00PM", "12:00PM-1:00PM", "1:00PM-2:00PM", "2:00PM-3:00PM", "3:00PM-4:00PM", "4:00PM-5:00PM", "5:00PM-6:00PM", "6:00PM-7:00PM", "7:00PM-8:00PM", "8:00PM-9:00PM", "9:00PM-10:00PM", "10:00PM-11:00PM" }));
        getContentPane().add(TimeSlotCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 160, -1, -1));

        NoOfPeopleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NoOfPeopleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 205, 142, -1));

        GymLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        GymLbl.setText("GYM");
        getContentPane().add(GymLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 248, 71, -1));

        IndoorGames.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        IndoorGames.setText("Indoor Games");
        getContentPane().add(IndoorGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 248, 142, -1));

        GameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        GameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameLbl.setText("Game");
        getContentPane().add(GameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 287, 142, 25));

        GameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billiards", "Table Tennis", "PlayStation", "Carrom", "Chess" }));
        getContentPane().add(GameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 288, 108, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Indoor games.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(IndoorGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndoorGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndoorGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndoorGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndoorGames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GameCombo;
    private javax.swing.JLabel GameLbl;
    private javax.swing.JRadioButton GymLbl;
    private javax.swing.JRadioButton IndoorGames;
    private javax.swing.JComboBox<String> NoOfPeopleCombo;
    private javax.swing.JLabel NoOfPeopleLbl;
    private javax.swing.JComboBox<String> RoomNoCombo;
    private javax.swing.JLabel RoomNoLbl;
    private javax.swing.JComboBox<String> TimeSlotCombo;
    private javax.swing.JLabel TimeSlotLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}