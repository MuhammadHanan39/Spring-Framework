package com.University;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String arg[]){
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);;
        MyDataBaseFunc ds=context.getBean("ds",MyDataBaseFuncImpl.class);
        Student s1 = context.getBean("s1", Student.class);
        s1.setStudentName("Hannan Shaikh");
        s1.setDeptName("Computer Systems");
        ds.change(s1);
    }
}
