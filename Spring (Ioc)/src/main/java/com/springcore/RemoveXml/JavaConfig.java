package com.springcore.RemoveXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Address getAddress(){
        return new Address();
    }
    @Bean("E1")
    public Employee getEmployee(){
        return new Employee("Hanan",getAddress(),"100000");
    }

}
