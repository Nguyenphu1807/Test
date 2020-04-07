/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arr_2;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class TestStudent {
   public String StudentID;
   public String nameString;
   public String Address;
   public int phone;


    public TestStudent() {
    }

    public TestStudent(String Student_ID, String nameString, String Address, int phone) {
        this.StudentID = Student_ID;
        this.nameString = nameString;
        this.Address = Address;
        this.phone = phone;
    }

    public String getStudent_ID() {
        return StudentID;
    }

    public void setStudent_ID(String Student_ID) {
        this.StudentID = Student_ID;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
   
}

