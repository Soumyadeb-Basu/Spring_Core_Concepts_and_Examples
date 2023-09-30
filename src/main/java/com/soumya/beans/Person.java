package com.soumya.beans;

public class Person {

    private int id;

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Person() {
    }

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private Address address;
}