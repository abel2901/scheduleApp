package com.example.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.ui.model.Student;

public class StudentFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);

        final EditText nameField = findViewById(R.id.activity_student_form_name);
        final EditText phoneField = findViewById(R.id.activity_student_form_phone);
        final EditText emailField = findViewById(R.id.activity_student_form_email);

        Button saveButton = findViewById(R.id.activity_student_form_save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameField.getText().toString();
                String phone = phoneField.getText().toString();
                String email = emailField.getText().toString();

                Student createStudent = new Student(name, phone, email);
            }
        });
    }
}
