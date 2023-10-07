package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserID, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserID = findViewById(R.id.student_id_edittext);
        editTextPassword = findViewById(R.id.password_edittext);
        buttonLogin = findViewById(R.id.login_button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userID = editTextUserID.getText().toString();
                String password = editTextPassword.getText().toString();


                if (isStudent(userID, password)) {

                    Intent intent = new Intent(MainActivity.this, dashboardActivity.class);
                    startActivity(intent);
                } else if (isAdmin(userID, password)) {

                    Intent intent = new Intent(MainActivity.this, AdminDashboardActivity.class);
                    startActivity(intent);
                } else {
                    // Invalid credentials, show error message
                    // ...
                }
            }
        });
    }

    private boolean isStudent(String userID, String password) {
        if(userID.equals("Student") && password.equals("123456"))
        {
            return true;
        }
        return false;
    }

    private boolean isAdmin(String userID, String password) {

        if(userID.equals("Professor") && password.equals("123456"))
        {
            return true;
        }
        return false;
    }


}
