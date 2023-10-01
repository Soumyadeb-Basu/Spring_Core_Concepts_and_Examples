package com.soumya.autowiring;

public class Grade {

    private String grade;

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade='" + grade + '\'' +
                '}';
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
