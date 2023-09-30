package com.soumya.beanLifecycle;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("Initialized Bean product.");
    }
    public void destroy() {
        System.out.println("Destroyed Bean product.");
    }

    private String name;
}
