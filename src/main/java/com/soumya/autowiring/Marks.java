package com.soumya.autowiring;

public class Marks {

    private String marks;

    public String getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marks='" + marks + '\'' +
                '}';
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
