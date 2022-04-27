package com.sunglowsys.test;

import com.sunglowsys.configration.ApplicationConfiguration;
import com.sunglowsys.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Student student = context.getBean(Student.class);
        System.out.println();
        student.setFirstName("Gopal");
        student.setLastName("Kumar");
        student.setEmail("gopal01122@gmail.com");
        student.setMobile("8989898989");

        System.out.println("Student Name:"+student.getFirstName());
        System.out.println("Student Name:"+student.getLastName());
        System.out.println("Student Name:"+student.getEmail());
        System.out.println("Student Name:"+student.getMobile());
        System.out.println();

        student.newAddress();
    }
}
