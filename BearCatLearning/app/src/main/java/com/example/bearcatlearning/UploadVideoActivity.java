package com.example.bearcatlearning;
import android.app.*;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.io.InputStream;
public class UploadVideoActivity extends Activity{

    private static final int VIDEO_UPLOAD_REQUEST_CODE = 2;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openVideoPicker();

        // Initialize Firebase Realtime Database reference
        databaseReference = FirebaseDatabase.getInstance().getReference().child("videos"); // Replace with your desired database path

        // Initialize Firebase Storage reference
        storageReference = FirebaseStorage.getInstance().getReference().child("video_uploads"); // Replace with your desired storage path
    }

    private void openVideoPicker() {
        Intent videoIntent = new Intent(Intent.ACTION_GET_CONTENT);
        videoIntent.setType("video/*"); // Allow only video files
        startActivityForResult(videoIntent, VIDEO_UPLOAD_REQUEST_CODE);
    }

}
