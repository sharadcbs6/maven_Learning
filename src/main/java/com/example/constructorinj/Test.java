package com.example.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
      ApplicationContext context=  new ClassPathXmlApplicationContext("com/example/constructorinj/consconfig.xml");
        Person obj=(Person)context.getBean("PersonBean");
        System.out.println(obj);
    }
}
