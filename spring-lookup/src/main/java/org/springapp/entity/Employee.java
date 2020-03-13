package org.springapp.entity;

import java.util.List;

public abstract class Employee {

    private String name;
    private int age;
    private double salary;
    private List<String> taskList;
    private Department department;


    public abstract Department getDepartment() ;

    public void setDepartment(Department department) {
        this.department = getDepartment();
    }

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



    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
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
