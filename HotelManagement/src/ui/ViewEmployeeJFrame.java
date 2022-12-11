/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sahithi
 */
public class ViewEmployeeJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form ViewEmployeeJFrame
     */
    public ViewEmployeeJFrame() {
        initComponents();
        con = ConnectionProvider.getCon();
        populateTable();
        
    }
    
    public void populateTable()
    {
        try{
            String sql = "SELECT * FROM employee";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            emptable.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        UpdateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        SearchComponent = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        DeleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(845, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emptable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Job", "Address", "Salary", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emptable);
        if (emptable.getColumnModel().getColumnCount() > 0) {
            emptable.getColumnModel().getColumn(1).setResizable(false);
            emptable.getColumnModel().getColumn(2).setResizable(false);
            emptable.getColumnModel().getColumn(3).setResizable(false);
            emptable.getColumnModel().getColumn(6).setResizable(false);
            emptable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 839, 273));

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 85, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 375, -1, -1));

        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 404, -1, -1));

        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 375, -1, -1));

        jLabel6.setText("Job");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 404, -1, -1));

        jLabel7.setText("Salary");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 433, -1, -1));

        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 433, -1, -1));

        jLabel10.setText("Username");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 465, -1, -1));

        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 465, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 372, 181, -1));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 430, 183, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 462, 183, -1));
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 401, 181, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 430, 181, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 462, 181, -1));

        SearchComponent.setForeground(new java.awt.Color(204, 204, 204));
        SearchComponent.setText("Search....");
        SearchComponent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchComponentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchComponentFocusLost(evt);
            }
        });
        SearchComponent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchComponentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchComponentKeyReleased(evt);
            }
        });
        jPanel1.add(SearchComponent, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 160, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 373, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 373, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Other");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 373, -1, -1));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 81, -1));

        jLabel1.setFont(new java.awt.Font("Gurmukhi MN", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 268, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Receptionist", "HouseKeeping", "Driver", "Chef" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 401, -1, -1));

        BackButton.setText("Back");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptableMouseClicked
        // TODO add your handling code here:
        int r=emptable.getSelectedRow();
        String click = (emptable.getModel().getValueAt(r, 0).toString());
        String sql = "SELECT * FROM employee WHERE name='"+click+"'";
        try{
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String name = rs.getString(1);
                String age = rs.getString(2);
                String gender = rs.getString(3);
                String job = rs.getString(4);
                String address = rs.getString(5);
                String salary = rs.getString(6);
                String username = rs.getString(7);
                String password = rs.getString(8);
                txtName.setEditable(false);
                txtUsername.setEditable(false);

        if ("Male".equals(gender)) {

            jRadioButton1.setSelected(true);
        }

        else if ("Female".equals(gender)) {

            jRadioButton2.setSelected(true);
        }
        else if ("Other".equals(gender)) {

            jRadioButton3.setSelected(true);
        }
        txtName.setText(name);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtSalary.setText(salary);
        txtUsername.setText(username);
        //String job = (String)jComboBox1.getSelectedItem();
        txtPassword.setText(password);
                     
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_emptableMouseClicked

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        String name=txtName.getText();
        String age=txtAge.getText();
        String gender = "";
            // If condition to check if jRadioButton2 is selected.
            if (jRadioButton1.isSelected()) {

                gender = "Male";
            }

            else if (jRadioButton2.isSelected()) {

                gender = "Female";
            }
            else if (jRadioButton3.isSelected()) {

                gender = "Other";
            }
        String address=txtAddress.getText();
        String salary=txtSalary.getText();
        String username=txtUsername.getText();
        String password = txtPassword.getText();
        String job = (String)jComboBox1.getSelectedItem();
        
        String sql="UPDATE employee SET age=?,job=?,address=?,salary=?,password=? WHERE name=?";
        try{
            //ps=con.prepareStatement(sql);
            
            if(name.equals("")|| age.equals("") || gender.equals("")|| salary.equals("")||username.equals("")|| address.equals("")||password.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill all the details");
                //txtName.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtSalary.setText("");
                //txtUsername.setText("");
                //String job = (String)jComboBox1.getSelectedItem();
                txtPassword.setText("");
                //buttonGroup1.clearSelection();
            }
            else
            {
              ps=con.prepareStatement(sql);
              ps.setString(6, name);
              ps.setString(1,age);
              //ps.setString(3, gender);
              ps.setString(2,job);
              ps.setString(3, address);
              ps.setString(4,salary);
              //ps.setString(5,username);
              ps.setString(5, password);
              ps.execute();
        
              txtName.setText("");
              txtAge.setText("");
              txtAddress.setText("");
              txtSalary.setText("");
              txtUsername.setText("");
        //String job = (String)jComboBox1.getSelectedItem();
              txtPassword.setText("");
              buttonGroup1.clearSelection();
              setVisible(false);
              new ViewEmployeeJFrame().setVisible(true);
              
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void SearchComponentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchComponentFocusGained
        // TODO add your handling code here:
        if(SearchComponent.getText().equals("Search...."))
        {
            SearchComponent.setText("");
            SearchComponent.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_SearchComponentFocusGained

    private void SearchComponentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchComponentFocusLost
        // TODO add your handling code here:
        if(SearchComponent.getText().equals(""))
        {
            SearchComponent.setText("Search....");
            SearchComponent.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_SearchComponentFocusLost

    private void SearchComponentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchComponentKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        emptable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchComponent.getText().trim()));
    }//GEN-LAST:event_SearchComponentKeyPressed

    private void SearchComponentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchComponentKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        emptable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchComponent.getText().trim()));
    }//GEN-LAST:event_SearchComponentKeyReleased

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String sql = "DELETE FROM employee WHERE name='"+name+"'";
        try{
            if(emptable.getSelectedRowCount()==1){
                int r=emptable.getSelectedRow();
                ps=con.prepareCall(sql);
                int i = JOptionPane.showConfirmDialog(null, "Are you sure, you want to delete?","Deletion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(i==JOptionPane.YES_OPTION){
                ps.execute();
                JOptionPane.showMessageDialog(null,"Deleted Successfully.");
                txtName.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtSalary.setText("");
                txtUsername.setText("");
        //String job = (String)jComboBox1.getSelectedItem();
                txtPassword.setText("");
                buttonGroup1.clearSelection();
                setVisible(false);
                new ViewEmployeeJFrame().setVisible(true);
                }   
            }
            else if(emptable.getSelectedRowCount()==0){
                    JOptionPane.showMessageDialog(null, "Please select a row to delete");
                }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminJframe().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField SearchComponent;
    private javax.swing.JButton UpdateButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable emptable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
