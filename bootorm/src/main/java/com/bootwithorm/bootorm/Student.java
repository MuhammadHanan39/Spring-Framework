package com.bootwithorm.bootorm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Database Class that is Mapped using Hibernate Properties

@Entity
public class Student {
    
    @Id
    private int studentId; //Primary Key of the database
    private String studentName;
    private String studentAddress;
    private String deptName;

    //getter for private fields
    public int getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String getStudentAddress(){
        return this.studentAddress;
    }

    public String getDeptName(){
        return this.deptName;
    }

    //Setters for private Fields

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }

    public void setDeptName(String deptName){
        this.deptName=deptName;
    }


    //Parameterized Constructor
    public Student(int studentId, String studentName, String studentAddress, String deptName){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.deptName=deptName;
    }

    //Default Constructor
    public Student(){

    }

    // toString method for details of the Object
    @Override
    public String toString(){
        return "{studentId = { " + this.studentId + "}" + 
        "studentName = { " + this.studentName + "}" + 
        "studentAddress = { " + this.studentAddress + "}" + 
        "deptName = { " + this.deptName + "}";
    }
}
