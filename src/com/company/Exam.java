package com.company;

import java.util.Vector;

public class Exam {
    public int max_value;
    public Course course;
    public final Vector<Question> questions;
    public Vector<Student> students;
    public Vector<TA> tas;

    public Exam(Course course, Vector<Question> questions, Vector<TA> tas, int max_value) {
        this.course = course;
        this.questions = questions;
        this.tas = tas;
        this.max_value = max_value;
    }

    public void register(Student student) {
        if (students.size() <= max_value) {
            this.students.add(student);
        } else {
            System.err.println("Student couldn't be added to the course. This course is full.");
        }
    }

    public void addQuestion(int id, String task, int value) {
        this.questions.add(new Question(task, value, id));
    }

    public Vector<Student> getRegisteredStudents() {
        return students;
    }

    public void setMax_value(int max_value) {
        this.max_value = max_value;
    }
}
