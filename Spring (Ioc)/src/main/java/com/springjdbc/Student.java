package com.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student implements ProductDao{
    private int studentId;
    private String studentName;

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

    @Override
    public int insert(JdbcTemplate template,int studentId,String studentName) {
        return template.update("insert into student(studentId,studentName) value("+studentId+","+studentName+");");
    }
}
