package com.soumya.beans;

public class Address {

    private long pin;

    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", name='" + name + '\'' +
                '}';
    }

    public Address(long pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public Address() {
    }

    private String name;


}
