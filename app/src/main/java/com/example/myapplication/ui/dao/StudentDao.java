package com.example.myapplication.ui.dao;

import com.example.myapplication.ui.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private final static List<Student> students = new ArrayList<>();

    public void save(Student student){
        students.add(student);

    }

    public List<Student> all() {
        return new ArrayList<>(students);
    }
}
