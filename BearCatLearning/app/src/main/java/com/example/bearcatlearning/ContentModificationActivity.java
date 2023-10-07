package com.example.bearcatlearning;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

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

            }
        });

        uploadVideobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Implementing the logic here to upload the video
            }
        });
    }
}
