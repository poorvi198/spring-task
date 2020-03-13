package org.springapp;

import org.springapp.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

        Employee employee1 = context.getBean("employee", Employee.class);
        System.out.println(employee1);

//        System.out.println(employee.getDepartment());
//        System.out.println(employee1.getDepartment());
        context.close();
    }
}
