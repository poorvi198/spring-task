package org.springapp;

import org.springapp.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("employee", Employee.class);
        Employee employee1 = context.getBean("employee", Employee.class);
//        employee.setDepartment(employee.getDepartment());
//        employee1.setDepartment(employee1.getDepartment());

        System.out.println(employee);
        System.out.println(employee1);
    }
}
