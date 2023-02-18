package com.spring.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdetail")
public class Student {
    @Id
    @Column
    private int studentId;
    @Column
    private String studentName;
    @Column
    private String deptName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Student(int studentId, String studentName, String deptName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.deptName = deptName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
