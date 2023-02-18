package com.IOC_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String arg[]){
       ApplicationContext context= new ClassPathXmlApplicationContext("Student.xml");
       Employee E1=(Employee)context.getBean("E1");
       System.out.println(E1);
    }
}