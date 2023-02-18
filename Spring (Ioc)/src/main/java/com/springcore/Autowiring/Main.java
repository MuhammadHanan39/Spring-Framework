package com.springcore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String arg[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring.xml");
        Employee E1=context.getBean("E1",Employee.class);
        System.out.println(E1);
    }
}
