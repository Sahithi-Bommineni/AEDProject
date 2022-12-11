/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author koushalamshala
 */
public class CheckIn {
    int id;
    String name;
    String mobileno;
    String nationality;
    String gender;
    String email;
    String idproof;
    String address;
    String checkin;
    String roomno;
    String bedType;
    String roomType;
    int price;
    String daysstayed;
    int totalamt;
    
    public CheckIn(int id,String name,String mobileno,String nationality,String gender,String email,String idproof,String address,String checkin,String roomno,String bedType,String roomType,int price,String daysstayed,int totalamt)
    {
        this.id=id;
        this.name=name;
        this.mobileno=mobileno;
        this.nationality=nationality;
        this.gender=gender;
        this.email=email;
        this.idproof=idproof;
        this.address=address;
        this.checkin=checkin;
        this.bedType=bedType;
        this.roomType=roomType;
        this.roomno=roomno;
        this.price=price;
        this.daysstayed=daysstayed;
        this.totalamt=totalamt;
    }
    
    public CheckIn(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdproof() {
        return idproof;
    }

    public void setIdproof(String idproof) {
        this.idproof = idproof;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDaysstayed() {
        return daysstayed;
    }

    public void setDaysstayed(String daysstayed) {
        this.daysstayed = daysstayed;
    }

    public int getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(int totalamt) {
        this.totalamt = totalamt;
    }
    
    
}
