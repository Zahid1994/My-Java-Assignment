package com.company;

public class Main {

    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setHallName("Najrul Islam");
        r1.setRoomNo(315);
        r1.setStatus(false);
        r1.print();

        
        Room r2 = new Room("Fazlul Haque", 220);
        System.out.print(r2.getHallName()  + " " + r2.getRoomNo()+" " + r2.getStatus() +"/n");
        System.out.print(r2.getHallName());
        System.out.print(r2.getRoomNo());
        System.out.print(r2.getStatus());

        r2.print();

        Student s1 = new Student("Asraful Alam", "1305125", r2);
        System.out.print("Student No: " + s1.getStudentNo() + ", " + s1.getStudentName() + ", resides on " + s1.getRoom().getHallName() + " Hall, Room no, " + s1.getRoom().getRoomNo() + "/n");
        r2.setStatus(true);
        r2.print();

        Student s2=new Student();
        s2.setStudentName("Navid Akram");
        s2.setStudentNo("1305123");
        s2.setRoom(r1);
        r1.setStatus(true);
        s2.print();

    }
}

