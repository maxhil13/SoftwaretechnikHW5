package com.company;

import java.util.Vector;

public class Student {
    public String name;
    public int studentId;
    public Project project;
    public Vector<Course> courses;
    public Vector<Exam> exams;

    public Student(Vector<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        return project;
    }
}
