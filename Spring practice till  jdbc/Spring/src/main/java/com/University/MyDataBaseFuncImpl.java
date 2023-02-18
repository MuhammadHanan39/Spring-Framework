package com.University;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MyDataBaseFuncImpl implements MyDataBaseFunc{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query="insert into StudentDetail(studentId,studentName,deptName) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getDeptName());
        return r;
    }

    @Override
    public void change(Student student) {
        int id=student.getStudentId();
        String query="update studentdetail set studentName=?,deptName=? where studentId=?";
        int r=jdbcTemplate.update(query,student.getStudentName(),student.getDeptName(),student.getStudentId());
        System.out.println("No of rows effected : "+r);
    }

    @Override
    public void delete(int studentId) {
        String query="delete from Studentdetail where studentId=?";
        int r=jdbcTemplate.update(query,studentId);
        System.out.println("No of rows deleted : "+r);
    }

    @Override
    public Student selectOneObj(int studentId) {
        String query="select * from studentDetail where studentId=? ;";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        Student s=jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return s;
    }

    @Override
    public List<Student> selectAll() {
        RowMapper<Student> rowMapper=new RowMapperImpl();
        String query="select * from studentdetail ;";
        List<Student> students=jdbcTemplate.query(query,rowMapper);
        return students;
    }


}
