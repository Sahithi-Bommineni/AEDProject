/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.swing.JOptionPane;

/**
 *
 * @author sahithi
 */
public class InsertUpdateDelete {
    public static void setData(String Query, String msg)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con = ConnectionProvider.getCon();
            st=con.createStatement();
            st.xecuteUpdate(Query);
            if(!msg.equals)
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
