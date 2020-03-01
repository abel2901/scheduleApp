package com.example.myapplication.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.dao.StudentDao;
import com.example.myapplication.ui.model.Student;

public class StudentFormActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText phoneInput;
    private EditText emailInput;

    final StudentDao dao = new StudentDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);

        setTitle("New student");

        initializeInputs();

        Button saveButton = findViewById(R.id.activity_student_form_save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student createStudent = createStudents();
                save(createStudent);
            }
        });
    }

    private void initializeInputs() {
        nameInput = findViewById(R.id.activity_student_form_name);
        phoneInput = findViewById(R.id.activity_student_form_phone);
        emailInput = findViewById(R.id.activity_student_form_email);
    }

    private void save(Student createStudent) {
        dao.save(createStudent);
        finish();
    }

    private Student createStudents() {
        String name = nameInput.getText().toString();
        String phone = phoneInput.getText().toString();
        String email = emailInput.getText().toString();

        return new Student(name, phone, email);
    }
}
