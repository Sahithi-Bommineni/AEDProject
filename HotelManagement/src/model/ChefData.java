/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author koushalamshala
 */
public class ChefData {
    public ArrayList<Chef> chefdata;
    
    
    
    public ArrayList<Chef> getChefDatafromDB(){
        ArrayList<Chef> ChefData1 = new ArrayList();
        try{
            Connection con = ConnectionProvider.getCon();
            String sql = " SELECT * FROM chef";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Chef c = new Chef();
                c.setRoomno(rs.getInt("roomno"));
                c.setMealtype(rs.getString("mealtype"));
                c.setLocation(rs.getString("location"));
                c.setSpecial_instructions(rs.getString("special_instructions"));
                c.setStatus(rs.getString("status"));
                ChefData1.add(c);
                }
            }catch(Exception e){
                    System.out.print(e.getMessage());
            }
            return ChefData1;
    }

    public ArrayList<Chef> getChefdata() {
        return chefdata;
    }

    public void setChefdata(ArrayList<Chef> chefdata) {
        this.chefdata = chefdata;
    }
 
    public Chef addChef(){
        Chef newChef = new Chef();
        chefdata.add(newChef);
        return newChef;
    }
    
    public void deleteChef(Chef chef){
        try{
            int roomno = chef.getRoomno();
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeQuery(query);
            query = "DELETE FROM chef WHERE username = '"+roomno+"'";
            st.executeUpdate(query);
            chefdata.remove(chef);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    
    public void createChefTable(Chef chef){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeUpdate(query);
            query = "INSERT INTO chef (roomno,mealtype,location,special_instructions,status) VALUES (?,?,?,?,?))";
            st.executeUpdate(query);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        
    }
    
}
