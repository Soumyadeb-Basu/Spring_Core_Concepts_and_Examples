package com.soumya.autowiring;

public class Engine {

    private long id;

    private String modelNo;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", modelNo='" + modelNo + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
}
