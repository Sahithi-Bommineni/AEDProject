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
    String guestcount;
    String foodtype;
    
    String status;
    
    public Chef(){
        
    }
    
    public Chef(int roomno,String mealtype,String foodtype,String guestcount, String status){
        this.roomno=roomno;
        this.mealtype=mealtype;
        this.foodtype=foodtype;
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

    public String getGuestcount() {
        return guestcount;
    }

    public void setGuestcount(String NoOfPeople) {
        this.guestcount = guestcount;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }
    
}
