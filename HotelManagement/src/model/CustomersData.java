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
public class CustomersData {
    public ArrayList<Customers> custdata;
    
    
    
    public ArrayList<Customers> getCustomersDatafromDB(){
        ArrayList<Customers> CustomersData1 = new ArrayList();
        try{
            Connection con = ConnectionProvider.getCon();
            String sql = " SELECT * FROM customers";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Customers c = new Customers();
                
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setMobileno(rs.getLong("mobileno"));
                c.setNationality(rs.getString("nationality"));
                c.setGender(rs.getString("mealtype"));
                c.setEmail(rs.getString("mealtype"));
                c.setIdproof(rs.getString("mealtype"));
                c.setAddress(rs.getString("mealtype"));
                c.setCheckin(rs.getString("mealtype"));
                c.setRoomno(rs.getInt("roomno"));
                c.setBedtype(rs.getString("bedtype"));
                c.setRoomtype(rs.getString("roomtype"));
                c.setPrice(rs.getInt("price"));
                c.setDaysstayed(rs.getInt("daysstayed"));
                c.setTotalamt(rs.getInt("totalamt"));
                c.setCheckout(rs.getString("checkout"));
                CustomersData1.add(c);
                }
            }catch(Exception e){
                    System.out.print(e.getMessage());
            }
            return CustomersData1;
    }

    public ArrayList<Customers> getCustomersdata() {
        return custdata;
    }

    public void setCustomersdata(ArrayList<Customers> custdata) {
        this.custdata = custdata;
    }
 
    public Customers addCustomers(){
        Customers newCustomers = new Customers();
        custdata.add(newCustomers);
        return newCustomers;
    }
    
    public void deleteCustomers(Customers cust){
        try{
            String name = cust.getName();
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeQuery(query);
            query = "DELETE FROM customers WHERE name = '"+name+"'";
            st.executeUpdate(query);
            custdata.remove(cust);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    
    public void createCustomersTable(Customers cust){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeUpdate(query);
            query = "INSERT INTO customers (id,name,mobileno,nationality,gender,email,idproof,address,checkin,roomno,bedType,roomType,price) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            st.executeUpdate(query);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        
    }
}
