package com.soumya.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean, DisposableBean {

    private int id;

    private String model;

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialized using Interface...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed using Interface...");
    }
}
