package com.company;

import java.util.Vector;

public class Professor extends Employee {
    public Vector<Course> courses;
    public Vector<Exam> exams;

    public Professor(String name, int eId, Department department) {
        super(name, eId, department);
    }

    public void addNewCourse(int id, String name, int maxCapacity, Professor prof, Vector<Exam> exams) {
        this.courses.add(new Course(id, name, maxCapacity, prof, exams));
    }
}
