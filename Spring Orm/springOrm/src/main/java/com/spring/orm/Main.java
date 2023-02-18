package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String arg[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        DatabaseDao obj=context.getBean("qObj",DatabaseDao.class);
        Student s=new Student(31,"Hanan Shaikh","ComputerSystems");
        Integer i=obj.insert(s);
        System.out.println("done"+i);
    }
}
