package com.example.myapplication.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.dao.StudentDao;
import com.example.myapplication.ui.model.Student;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        setTitle("Student List");

        FloatingActionButton newStudent = findViewById(R.id.floatingActionButton);
        newStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentListActivity.this, StudentFormActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        setupList();
    }

    private void setupList() {
        StudentDao dao = new StudentDao();

        ListView studentList = findViewById(R.id.activity_main_student_list_listview);
        final List<Student> students = dao.all();
        studentList.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                students));
        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Student chosenStudent = students.get(position);
                Intent moveToFormActivity = new Intent(StudentListActivity.this, StudentFormActivity.class);
                moveToFormActivity.putExtra("student", chosenStudent);
                startActivity(moveToFormActivity);
            }
        });
    }
}
