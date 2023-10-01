package com.soumya.autowiring;

public class Car {

    private long id;

    private Engine engine;

    private License license;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine=" + engine +
                ", license=" + license +
                '}';
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
