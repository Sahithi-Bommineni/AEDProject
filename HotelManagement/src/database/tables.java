/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sahithi
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(50),email varchar(100),password varchar(50),securityQuestion varchar(200), answer varchar(30),address varchar(200),status varchar(20))");
            st.executeUpdate("create table login(username varchar(50),password varchar(50)");
            JOptionPane.showMessageDialog(null,"Table created successfully" );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try
            {
               con.close();
               st.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
}
