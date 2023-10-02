package com.soumya.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class College {
    //Using @Value to inject the values
    @Value("24")
    private int id;

    @Value("MNCIT")
    private String name;
    //Using Spring Expression Language to inject Value from XML file
    @Value("#{courses}")
    private List<String> courses;

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
