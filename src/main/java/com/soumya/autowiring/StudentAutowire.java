package com.soumya.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentAutowire {

    private int rollNo;

    @Autowired
    private Marks marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    public StudentAutowire(int rollNo, Marks marks, Grade grade) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.grade = grade;
        System.out.println("Constructor with parameters");
    }

    public StudentAutowire() {
        System.out.println("Default constructor");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Grade getGrade() {
        return grade;
    }

    @Autowired
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    private Grade grade;


}
