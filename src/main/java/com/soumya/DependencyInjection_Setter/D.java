package com.soumya.DependencyInjection_Setter;

import org.springframework.beans.factory.annotation.Autowired;

public class D {

    public C obj;

    //@Autowired
    public void setC(C obj) {
        this.obj=obj;
    }

    public void print() {
        obj.print();
        System.out.println("This is class D");
    }
}
