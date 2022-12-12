/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author koushalamshala
 */
public class Driver {
    
    int roomno;
    String cartype;
    String passenger;
    String requirements;
    String timeslot;
    String date;
    
    public Driver(){
        
    }
    
    public Driver(int roomno,String cartype,String passenger,String requirements,String timeslot, String date){
        this.roomno=roomno;
        this.cartype=cartype;
        this.date=date;
        this.timeslot=timeslot;
        this.passenger=passenger;
        this.requirements=requirements;
        
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passengers) {
        this.passenger = passenger;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String time) {
        this.timeslot = time;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
    
    
    
}
