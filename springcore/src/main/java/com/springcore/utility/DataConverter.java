package com.springcore.utility;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConverter implements FactoryBean<Date> {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DataConverter() {
        System.out.println("cons called");
    }

    @Override
    public Date getObject() throws Exception {
        String dateNFormat[] = data.split("\\|");
        String date = dateNFormat[0].trim();
        String format = dateNFormat[1].trim();
        Date formattedDate = new SimpleDateFormat(format).parse(date);
        return formattedDate;
    }

    @Override
    public Class<?> getObjectType() {
        return java.util.Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
