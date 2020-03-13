package org.springapp;

import org.springapp.config.AppConfiguration;
import org.springapp.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee);
        context.close();
    }



}
