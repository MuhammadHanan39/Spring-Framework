package com.springcore.RemoveXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String arg[]){
        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee E1=context.getBean("E1",Employee.class);
        System.out.println(E1);
    }
}
