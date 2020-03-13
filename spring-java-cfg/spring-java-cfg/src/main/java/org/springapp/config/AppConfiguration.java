package org.springapp.config;

import org.springapp.entity.Department;
import org.springapp.entity.Employee;
import org.springapp.utility.DataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Configuration
@PropertySource("data.properties")
public class AppConfiguration {

    @Value("${departmentDate}")
    private String data;
    @Bean
    public Department department(@Autowired DataConverter dataConverter) throws Exception {
        Department department = new Department();
        department.setCreatedOn(dataConverter.getObject());
        return department;
    }

    @Bean
    public Employee employee(@Autowired Department department){
        Employee employee = new Employee(department);
        return employee;
    }

    @Bean
    public DataConverter dataConverter(){
        DataConverter dataConverter = new DataConverter();
        dataConverter.setData(data);
        return dataConverter;
    }
}
