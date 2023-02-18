package com.University;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface MyDataBaseFunc {

    public int insert(Student student);

    public void change(Student student);

    public void delete(int studentId);

    public Student selectOneObj(int studentId);

    public List<Student> selectAll();
}
