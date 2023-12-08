package com.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
        staff dt = context.getBean(doctor.class);
        staff n = context.getBean(nurse.class);
//        doctor doc = context.getBean(doctor.class);
        dt.assist();
        n.assist();
        // injecting string
//        System.out.println(doc.getQualification());

        // testing prototype scope
        nurse n1 = context.getBean(nurse.class);
        nurse n2 = context.getBean(nurse.class);
        n1.setQualification("Pharmacy");
        // both object showing different output, hence new object get created.
        System.out.println(n1.getQualification());
        System.out.println(n2.getQualification());

    }
}