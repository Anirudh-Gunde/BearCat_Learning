package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
        String studentID = getIntent().getStringExtra("studentID");
        userIDTV.setText(studentID);
        logoutButton = findViewById(R.id.logoutButton);
        javaIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Java button is clicked, start MaterialAndVideosJavaActivity
                Intent intent = new Intent(dashboardActivity.this, contentActivity.class);
                startActivity(intent);
            }
        });
    }
}
