package com.soumya.DependencyInjection_Constructor;

public class Main {

    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B(obj1);

        obj2.print();

    }
}
