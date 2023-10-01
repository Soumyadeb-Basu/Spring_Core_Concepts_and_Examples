package com.soumya.beanLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Mobile {

    private long id;

    private String model;

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    public Mobile(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Mobile() {
    }

    @PostConstruct
    public void start() {
        System.out.println("Start PostConstruct..");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Start PreDestroy..");
    }


}
