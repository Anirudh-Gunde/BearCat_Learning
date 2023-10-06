package com.example.bearcatlearning;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContentModificationActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_modification);
        // Find the TextView and buttons by their IDs
        TextView subjectTitleTextView = findViewById(R.id.subjectTitleTextView);
        Button uploadFileButton = findViewById(R.id.uploadFileButton);
        Button uploadVideoButton = findViewById(R.id.uploadVideoButton);
        String subjectTitle = getIntent().getStringExtra("subject_title");
        subjectTitleTextView.setText(subjectTitle);

        uploadFileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // You can start a file upload activity
                //startActivity(new Intent(ContentModificationActivity.this, UploadFileActivity.class));
            }
        });

        uploadVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // You can start a video upload activity or perform the video upload operation here
                // startActivity(new Intent(ContentModificationActivity.this, UploadVideoActivity.class));
            }
        });
    }
}
