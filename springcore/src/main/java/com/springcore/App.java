package com.springcore;

import com.springcore.entity.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Employee employee = context.getBean("employee", Employee.class);
        Employee employee1 = context.getBean("employee", Employee.class);
//        employee.setName("Poorvi");
//        employee.setAge(23);
//        employee.setSalary(30000);
//        employee.setDepartmentName("ABC");

        System.out.println("Employee Details-> ");
        System.out.println("Name-> "+employee.getName());
        System.out.println("Age-> "+ employee.getAge());
        System.out.println("Salary-> "+employee.getSalary());
        System.out.println("Department-> "+employee.getDepartment().getdName()+"("+employee.getDepartment().getCreatedOn()+")");
        System.out.println("Task-> "+employee.getTaskList());
        System.out.println(employee);
        System.out.println(employee1);
    }
}
