package com.example.myapplication.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Student List");
        List<String> students = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose"));
        ListView studentList = findViewById(R.id.activity_main_student_list);
        studentList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students));

    }
}
