package org.springapp.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
//@Scope("prototype")
public class Employee {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Value("${salary}")
    private double salary;

    @Value("${tasks}")
    private List<String> taskList;

    private Department department;

    // constructor injection
    @Autowired
    public Employee(Department department)
    {
        System.out.println("Employee constructor called");
        System.out.println("dependency injected");
        this.department = department;
    }

    //getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("bean has been initialized");
    }

    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("bean has been destroyed");

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", taskList=" + taskList +
                ", department=" + department +
                '}';
    }
}
