package com.company;


public class Room {
    private String hallName;
    private int roomNo;
    private boolean status; // room allotment status
    public Room(){
        //do noting
    }
    public Room(String hall, int no){
        hallName = hall;
        roomNo = no;
        status = false;
    }
    public String getHallName(){
        return hallName;
    }
    public void setHallName (String hall){
        hallName = hall;
    }
    public int getRoomNo(){
        return roomNo;
    }
    public void setRoomNo(int no){
        roomNo = no;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus (boolean state){
        status = state;
    }
    public void print(){
        if(getStatus()){
            System.out.print("Room No, " + getRoomNo() + " of " + getHallName()+ " Hall is currently alloted. \n");
        } else {
            System.out.print("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently available for allotment. \n");
        }
    }
}
