package com.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public interface ProductDao {
    public int insert(JdbcTemplate template,int studentId, String studentName);
}
