/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sahithi
 */
public class ConnectionProvider {
    Connection con = null;
    public static Connection getCon()
    {
        try
        {
            String user="root";
            String pass="sahithi123";
            String sqlconn="jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sqlconn,user,pass);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
        /*try{
            JSONParser parser = new JSONParser();
            Object obj = new JSONParser().parse(new FileReader("./src/database/dbConfig.json"));
            JSONObject jObj = (JSONObject) obj;
            JSONObject jObj2 = (JSONObject) jObj.get("sqlConnection");
            System.out.print(jObj2.toJSONString());
            String url = jObj2.get("url").toString();
            String username = jObj2.get("username").toString();
            String password = jObj2.get("password").toString();
            System.out.print("2");
            System.out.println(url+","+username+","+password);
            
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.print("Connection Successful");
            
            Statement st = con.createStatement();
            String query = "USE hotel_aed";
            st.executeUpdate(query);
            
            return con;
        }catch(IOException | SQLException | ParseException e){
            System.out.print(e.getMessage());
            return null;
        }*/
    }
}
