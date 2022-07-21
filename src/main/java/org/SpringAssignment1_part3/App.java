package org.SpringAssignment1_part3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        student stud = (student) context.getBean(student.class);
        System.out.println(stud);
    }
}
