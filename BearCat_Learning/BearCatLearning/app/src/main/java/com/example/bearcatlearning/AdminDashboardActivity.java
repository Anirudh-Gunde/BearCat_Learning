package com.example.bearcatlearning;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class AdminDashboardActivity extends  AppCompatActivity{
    private ImageButton javaImgButn;
    private ImageButton androidImgButn;
    private ImageButton webDevImgButn;
    private TextView usernameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dashboard);

        // Finding  the ImageButtons by their IDs
        javaImgButn = findViewById(R.id.imgbutton1);
        androidImgButn = findViewById(R.id.imageButton2);
        webDevImgButn = findViewById(R.id.imageButton3);
        usernameTV = findViewById(R.id.usernameTV);


        String studentID = getIntent().getStringExtra("Admin");
        usernameTV.setText(studentID);

        // Set click listeners for each ImageButton
        javaImgButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startSubjectDetailActivity("Java");
            }
        });
        androidImgButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startSubjectDetailActivity("Android");
            }
        });
        webDevImgButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSubjectDetailActivity("Web Development");
            }
        });

    }
    private void startSubjectDetailActivity(String subjectTitle) {
        Intent intent = new Intent(this, ContentModificationActivity.class);
        intent.putExtra("subject_title", subjectTitle);
        startActivity(intent);
    }

}
