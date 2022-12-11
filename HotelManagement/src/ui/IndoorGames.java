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
import model.Games;

/**
 *
 * @author koushalamshala
 */
public class IndoorGames extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form IndoorGames
     */
    public IndoorGames() {
        initComponents();
        con = ConnectionProvider.getCon();
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
        BackButton = new javax.swing.JButton();
        Submitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jLabel1.setText("Indoor Games");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 32, 133, 29));

        TimeSlotLbl.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        TimeSlotLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeSlotLbl.setText("Time Slot");
        getContentPane().add(TimeSlotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 158, 116, 27));

        RoomNoLbl.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        RoomNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomNoLbl.setText("Room No");
        getContentPane().add(RoomNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 113, 116, 27));

        NoOfPeopleLbl.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        NoOfPeopleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfPeopleLbl.setText("No. Of People");
        getContentPane().add(NoOfPeopleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 203, 116, 27));

        RoomNoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210" }));
        getContentPane().add(RoomNoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 113, 142, 27));

        TimeSlotCombo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        TimeSlotCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00AM -7:00AM", "7:00AM-8:00AM", "8:00AM-9:00AM", "9:00AM-10:00AM", "10:00AM-11:00AM", "11:00AM-12:00PM", "12:00PM-1:00PM", "1:00PM-2:00PM", "2:00PM-3:00PM", "3:00PM-4:00PM", "4:00PM-5:00PM", "5:00PM-6:00PM", "6:00PM-7:00PM", "7:00PM-8:00PM", "8:00PM-9:00PM", "9:00PM-10:00PM", "10:00PM-11:00PM" }));
        getContentPane().add(TimeSlotCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 160, -1, -1));

        NoOfPeopleCombo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        NoOfPeopleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(NoOfPeopleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 205, 142, -1));

        buttonGroup1.add(GymLbl);
        GymLbl.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        GymLbl.setText("GYM");
        getContentPane().add(GymLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 248, 71, -1));

        buttonGroup1.add(IndoorGames);
        IndoorGames.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        IndoorGames.setText("Indoor Games");
        getContentPane().add(IndoorGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 248, 142, -1));

        GameLbl.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        GameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameLbl.setText("Game");
        getContentPane().add(GameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 142, 25));

        GameCombo.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        GameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billiards", "Table Tennis", "PlayStation", "Carrom", "Chess" }));
        getContentPane().add(GameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 108, -1));

        BackButton.setBackground(new java.awt.Color(0, 204, 204));
        BackButton.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 100, 30));

        Submitbtn.setBackground(new java.awt.Color(0, 204, 204));
        Submitbtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        Submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        Submitbtn.setText("Book");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Indoor games.jpeg"))); // NOI18N
        jLabel2.setText("S");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerServiceJFrame().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        String roomno = (String)RoomNoCombo.getSelectedItem();
        String game = (String)GameCombo.getSelectedItem();;
        String option = " ";
        if(IndoorGames.isSelected()){
            option = "Game";
            GameCombo.setEditable(true);
            if(GameCombo.equals("Select Game")){
                JOptionPane.showMessageDialog(null, "Please select game");
            }
            else{
                game=(String)GameCombo.getSelectedItem();
            }
        }
        else if(GymLbl.isSelected()){
            option = "Gym";
            GameCombo.setEditable(false);
        }
        String people = (String)NoOfPeopleCombo.getSelectedItem();
        String time = (String)TimeSlotCombo.getSelectedItem();
        if(TimeSlotCombo.equals("Select Time Slot")){
            JOptionPane.showMessageDialog(null, "Please select time slot");
        }
        else{
            Connection con = ConnectionProvider.getCon();
            Games g = new Games();
            g.setRoomno(roomno);
            g.setTime(time);
            g.setPeople(people);
            g.setOption(option);
            g.setGame(game);
            
            
            
            
            
            try{
                String sql = "INSERT INTO games(roomno,time,people,option,game) VALUES (?,?,?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setString(1,roomno);
                ps.setString(2, time);
                ps.setString(3, people);
                ps.setString(4, option);
                ps.setString(5, game);
                ps.execute();

                buttonGroup1.clearSelection();
                TimeSlotCombo.setSelectedItem("Select Time");
                NoOfPeopleCombo.setSelectedItem(1);
                GameCombo.setSelectedItem("Select Game");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_SubmitbtnActionPerformed

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
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> GameCombo;
    private javax.swing.JLabel GameLbl;
    private javax.swing.JRadioButton GymLbl;
    private javax.swing.JRadioButton IndoorGames;
    private javax.swing.JComboBox<String> NoOfPeopleCombo;
    private javax.swing.JLabel NoOfPeopleLbl;
    private javax.swing.JComboBox<String> RoomNoCombo;
    private javax.swing.JLabel RoomNoLbl;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JComboBox<String> TimeSlotCombo;
    private javax.swing.JLabel TimeSlotLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
