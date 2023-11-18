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
    private Button logoutButton;
    private ImageButton adbimgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dashboard);

        // Finding  the ImageButtons by their IDs
        javaImgButn = findViewById(R.id.imgbutton1);
        androidImgButn = findViewById(R.id.imageButton2);
        webDevImgButn = findViewById(R.id.imageButton3);
        usernameTV = findViewById(R.id.usernameTV);
        logoutButton = findViewById(R.id.LogoutButton);
        adbimgButton = findViewById(R.id.imageButton4);


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
        adbimgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSubjectDetailActivity("Advance Database Systems");
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Sign out the user from Firebase Authentication
                FirebaseAuth.getInstance().signOut();

                // Navigate back to the login screen (MainActivity)
                Intent intent = new Intent(AdminDashboardActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish(); // Close the current activity to prevent the user from going back

            }
        });

    }
    private void startSubjectDetailActivity(String subjectTitle) {
        Intent intent = new Intent(this, ContentModificationActivity.class);
        intent.putExtra("subject_title", subjectTitle);
        startActivity(intent);
    }

}
