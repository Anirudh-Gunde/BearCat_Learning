package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class dashboardActivity extends AppCompatActivity {
    private ImageButton javaIB;
    private ImageButton adbIB;
    private ImageButton webdevIB;
    private ImageButton androidIB;
    private ImageButton patternsIB;
    private ImageButton gdpIB;
    private TextView userIDTV;

    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        javaIB=findViewById(R.id.javaIB);
        adbIB=findViewById(R.id.adbIB);
        webdevIB=findViewById(R.id.webdevIB);
        androidIB=findViewById(R.id.androidIB);
        patternsIB=findViewById(R.id.patternsIB);
        gdpIB=findViewById(R.id.gdpIB);
        userIDTV=findViewById(R.id.profileNameTV);
        String studentID = getIntent().getStringExtra("Student");
        userIDTV.setText(studentID);
        logoutButton = findViewById(R.id.logoutButton);
        javaIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        adbIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        webdevIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        androidIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        patternsIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        gdpIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, JavaCourseActivity.class);
                startActivity(intent);
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Sign out the user from Firebase Authentication
                FirebaseAuth.getInstance().signOut();

                // Navigate back to the login screen (MainActivity)
                Intent intent = new Intent(dashboardActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish(); // Close the current activity to prevent the user from going back

            }
        });
    }
}
