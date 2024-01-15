package com.soumya.DependencyInjection_Setter;

public class Main {

    public static void main(String[] args) {

        D obj2= new D();
        C obj1= new C();

        obj2.setC(obj1);
        obj2.print();
    }
}
