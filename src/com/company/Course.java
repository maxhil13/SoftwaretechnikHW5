package com.company;

import java.util.Vector;

public class Course {
    public int id;
    public String name;
    public int maxCapacity;
    public boolean isFull;
    public Professor prof;
    public Vector<Student> student;
    public Vector<Exam> exams;
    public Vector<Project> projects;
    public Vector<TA> tas;

    public Course(int id, String name, int maxCapacity, Professor prof, Vector<Exam> exams) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.prof = prof;
        this.exams = exams;
    }

    public void enroll(Student student) {
        this.student.add(student);
        System.out.println("Student " + student.name + " has successfully enrolled.");
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProf() {
        return prof;
    }

    public Vector<Project> getProjects() {
        return projects;
    }

    public void setProjects(Vector<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void setNewTA(TA ta) {
        this.tas.add(ta);
    }

    public Vector<TA> getTas() {
        return tas;
    }
}
