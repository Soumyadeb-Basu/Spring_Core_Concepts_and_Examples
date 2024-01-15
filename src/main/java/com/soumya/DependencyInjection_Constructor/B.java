package com.soumya.DependencyInjection_Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

//@Scope("prototype")
public class B {

    public A obj;

    @Autowired
    public B(A obj) {
        this.obj=obj;
    }

    public void print() {
        obj.print();
        System.out.println("This is class B");
    }

}
