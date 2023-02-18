package com.University;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setStudentId(rs.getInt(1));
        student.setStudentName(rs.getString(2));
        student.setDeptName(rs.getString(3));
        return student;
    }
}
