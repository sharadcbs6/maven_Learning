package com.example.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test{
    public static void main(String[] args){
    ApplicationContext context= new ClassPathXmlApplicationContext("com/example/reference/refconfig.xml");
   A a=(A) context.getBean("Aref");
      System.out.println(a.getX());
      System.out.println(a.getObj().getY());
      System.out.println(a);
    }
}