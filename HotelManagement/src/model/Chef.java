/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author koushalamshala
 */
public class Chef {
    
    int roomno;
    String mealtype;
    String NoOfPeople;
    
    String status;
    
    public Chef(){
        
    }
    
    public Chef(int roomno,String mealtype, String location, String special_instructions, String status){
        this.roomno=roomno;
        this.mealtype=mealtype;
        this.NoOfPeople = NoOfPeople;
        this.status=status;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    public String getNoOfPeople() {
        return NoOfPeople;
    }

    public void setNoOfPeople(String NoOfPeople) {
        this.NoOfPeople = NoOfPeople;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
