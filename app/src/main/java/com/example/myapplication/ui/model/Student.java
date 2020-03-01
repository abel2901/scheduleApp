package com.example.myapplication.ui.model;

public class Student {

    private final String name;
    private final String email;
    private final String phone;

    public Student(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}
