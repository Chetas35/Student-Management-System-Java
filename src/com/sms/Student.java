package com.sms;

public class Student {
    private int id;
    private String name;
    private int age;
    private String branch;

    // No-argument constructor
    public Student() {
    }

    // Constructor without id (for inserting new student)
    public Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Constructor with id (for reading/updating student)
    public Student(int id, String name, int age, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public void setId(int id) {
        this.id = id;
    }
}
