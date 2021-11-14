package com.company;

import java.util.Vector;

public class Department {
    public String name;
    public Vector<Employee> employees;
    public Professor chair;
    public Vector<Course> courses;

    public Vector<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }
}
