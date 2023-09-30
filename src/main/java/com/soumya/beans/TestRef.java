package com.soumya.beans;

public class TestRef {

    private int id;

    private Test obj;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TestRef{" +
                "id=" + id +
                ", obj=" + obj +
                '}';
    }


    public void setId(int id) {
        this.id = id;
    }

    public Test getObj() {
        return obj;
    }

    public void setObj(Test obj) {
        this.obj = obj;
    }


}
