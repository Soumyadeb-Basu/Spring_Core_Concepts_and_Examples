package com.soumya.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String name;

    private List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    private Set<String> addresses;

    private Map<String,String> courses;
}
