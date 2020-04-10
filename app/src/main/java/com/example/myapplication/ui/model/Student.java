package com.example.myapplication.ui.model;

import java.io.Serializable;

public class Student implements Serializable {

    private final String name;
    private final String email;
    private final String phone;

    public Student(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name;
    }
}
