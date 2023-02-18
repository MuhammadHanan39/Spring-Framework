package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String arg[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
        JdbcTemplate template=context.getBean("template",JdbcTemplate.class);
        Student table1=new Student();
        table1.insert(template,75,"Hello");
    }
}
