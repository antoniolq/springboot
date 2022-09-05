package org.example.test;

import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //传统方式
//        Student student = new Student();
//        System.out.println(student);

        //IOC方式
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = (Student) applicationContext.getBean("student2");
        System.out.println(student1);
    }
}
