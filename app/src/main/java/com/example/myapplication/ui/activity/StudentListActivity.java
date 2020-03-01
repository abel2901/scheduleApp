package com.example.myapplication.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.dao.StudentDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        StudentDao dao = new StudentDao();

        setTitle("Student List");
        List<String> students = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose"));
        ListView studentList = findViewById(R.id.activity_main_student_list_listview);
        studentList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.all()));

    }
}
