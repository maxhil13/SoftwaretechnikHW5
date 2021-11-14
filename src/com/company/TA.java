package com.company;

import java.util.Vector;

public class TA {
    public String name;
    public Vector<Course> courses;
    public Vector<Exam> exams;

    public TA(Vector<Course> courses, Vector<Exam> exams) {
        this.courses = courses;
        this.exams = exams;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void extendContract(Course course) {
        this.courses.add(course);
    }
}
