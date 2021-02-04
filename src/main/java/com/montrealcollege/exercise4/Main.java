package com.montrealcollege.exercise4;

import com.montrealcollege.exercise4.entities.Program;
import com.montrealcollege.exercise4.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        Program java = context.getBean("course", Program.class);
        Student stu1 = context.getBean("student1", Student.class);
        Student stu2 = context.getBean("student2", Student.class);
        Student stu3 = context.getBean("student3", Student.class);

        System.out.println("\nStudent name: " + stu1.getFirstName() + " " + stu1.getLastName());
        System.out.println("Enrolled in: " + stu1.getProgram().getName() + " (" + java.getDuration() + " months)");
        System.out.println("Starting on: " + stu1.getProgram().getStartDate());
        System.out.println("\nStudent name :" + stu2.getFirstName() + " " + stu2.getLastName());
        System.out.println("Enrolled in: " + stu2.getProgram().getName() + " (" + java.getDuration() + " months)");
        System.out.println("Starting on: " + stu2.getProgram().getStartDate());
        System.out.println("\nStudent name: " + stu3.getFirstName() + " " + stu3.getLastName());
        System.out.println("Enrolled in: " + stu3.getProgram().getName() + " (" + java.getDuration() + " months)");
        System.out.println("Starting on: " + stu3.getProgram().getStartDate());
    }
}
