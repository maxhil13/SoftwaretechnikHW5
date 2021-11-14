package com.company;

import java.util.Vector;

public class Department {
    public String name;
    public Vector<Employee> employees;
    public Professor chair;
    public Vector<Course> courses;

    public Department(String name, Professor chair) {
        this.name = name;
        this.chair = chair;
    }

    public Vector<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getChair() {
        return chair;
    }

    public void setChair(Professor chair) {
        this.chair = chair;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
