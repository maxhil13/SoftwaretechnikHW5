package com.company;

import java.util.Vector;

public class Project {
    public String name;
    public Vector<Student> members;
    public Course course;

    public Project(Vector<Student> members, Course course) {
        this.members = members;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Student> getMembers() {
        return members;
    }

    public void addNewMember(Student student) {
        members.add(student);
    }
}
