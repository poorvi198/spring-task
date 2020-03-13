package org.springapp.entity;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
//@Scope("Prototype")
public class Department {

    @Value("${department}")
    private String dName;

    private Date createdOn;

    public Department() {
        System.out.println("Department constructor called");
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
