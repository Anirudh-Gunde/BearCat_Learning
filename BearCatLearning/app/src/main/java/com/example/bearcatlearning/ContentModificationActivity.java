package com.example.bearcatlearning;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ContentModificationActivity extends AppCompatActivity{
    private TextView subjctTxtvw;
    private Button uploadFilebtn;
    private  Button uploadVideobtn;
    private String subjectTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_modification);
        // Find the TextView and buttons by their IDs
       subjctTxtvw = findViewById(R.id.subjectTitleTextView);
       uploadFilebtn = findViewById(R.id.uploadFileButton);
       uploadVideobtn = findViewById(R.id.uploadVideoButton);
       subjectTitle = getIntent().getStringExtra("subject_title");
       subjctTxtvw.setText(subjectTitle);

        uploadFilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Implementing the logic here to upload the file
                //Working on the implementation for UploadFileActivity class
               // Intent intent = new Intent(ContentModificationActivity.this, UploadFileActivity.class);
               // startActivity(intent);
               //Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
               //intent.setType("*/*"); // Set MIME type to select any type of file
                //startActivityForResult(intent, 1);
               openFilePicker();
            }
        });

        uploadVideobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Implementing the logic here to upload the video
                //Working on the implementation for UploadFileActivity class
                // Intent intent = new Intent(ContentModificationActivity.this, UploadVideoActivity.class);
                // startActivity(intent);
                //Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                //intent.setType("video/*"); // Set MIME type to select video files
                //startActivityForResult(intent, 2);
                openVideoPicker();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null) {
            Uri selectedUri = data.getData();

            if (requestCode == 1) {
                UploadFileActivity.uploadFileToFirebase(this, selectedUri);
            } else if (requestCode == 2) {
                UploadVideoActivity.uploadVideoToFirebase(this, selectedUri);
            }
        }
    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*"); // Set MIME type to select any type of file
        startActivityForResult(intent, 1);
    }
    private void openVideoPicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("video/*"); // Set MIME type to select video files
        startActivityForResult(intent, 2);
    }
}
