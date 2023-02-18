package com.University;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean("s1")
    public Student bean(){
        Student student=new Student();
        student.setDeptName("Computer Systems");
        student.setStudentId(39);
        student.setStudentName("Hanna Shaikh");
        return student;
    }

    @Bean("data")
    public DataSource dataSource(){
        DriverManagerDataSource obj=new DriverManagerDataSource();
        obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
        obj.setUrl("jdbc:mysql://localhost:3306/Student");
        obj.setUsername("root");
        obj.setPassword("honey150");
        return obj;
    }

    @Bean("dataSource")
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean("ds")
    public MyDataBaseFunc ds(){
        MyDataBaseFuncImpl obj=new MyDataBaseFuncImpl();
        obj.setJdbcTemplate(jdbcTemplate());
        return obj;
    }

}
