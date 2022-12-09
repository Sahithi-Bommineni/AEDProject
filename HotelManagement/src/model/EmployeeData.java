/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author koushalamshala
 */
public class EmployeeData {
    
    public ArrayList<Employee> empdata;
    
    
    
    public ArrayList<Employee> getEmpDatafromDB(){
        ArrayList<Employee> EmployeeData1 = new ArrayList();
        try{
            Connection con = ConnectionProvider.getCon();
            String sql = " SELECT * FROM employee";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Employee e = new Employee();
                e.setName(rs.getString("name"));
                e.setAge(rs.getInt("age"));
                e.setGender(rs.getString("gender"));
                e.setJob(rs.getString("job"));
                e.setAddress(rs.getString("address"));
                e.setSalary(rs.getInt("salary"));
                e.setUsername(rs.getString("username"));
                e.setPassword(rs.getString("password"));
                EmployeeData1.add(e);
                }
            }catch(Exception e){
                    System.out.print(e.getMessage());
            }
            return EmployeeData1;
    }

    public ArrayList<Employee> getEmpdata() {
        return empdata;
    }

    public void setEmpdata(ArrayList<Employee> empdata) {
        this.empdata = empdata;
    }
 
    public Employee addEmp(){
        Employee newEmp = new Employee();
        empdata.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmp(Employee emp){
        try{
            String username = emp.getUsername();
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeQuery(query);
            query = "DELETE FROM employee WHERE username = '"+username+"'";
            st.executeUpdate(query);
            empdata.remove(emp);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    
    public void createEmpTable(Employee emp){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "USE aed_hotel";
            st.executeUpdate(query);
            query = "INSERT INTO employee (name,age,gender,job,address,salary,username,password) VALUES (?,?,?,?,?,?,?,?))";
            st.executeUpdate(query);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        
    }
}