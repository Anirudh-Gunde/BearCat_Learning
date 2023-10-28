package com.example.bearcatlearning;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.IOException;
import java.io.InputStream;

public class UploadFileActivity extends Activity{

    private static final int FILE_UPLOAD_REQUEST_CODE = 1;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openFilePicker();

        // Initialize Firebase Realtime Database reference
        databaseReference = FirebaseDatabase.getInstance().getReference().child("files"); // Replace with your desired database path

        // Initialize Firebase Storage reference
        storageReference = FirebaseStorage.getInstance().getReference().child("uploads"); // Replace with your desired storage path
    }

    private void openFilePicker() {
        Intent fileIntent = new Intent(Intent.ACTION_GET_CONTENT);
        fileIntent.setType("*/*"); // Allow all file types extensions
        startActivityForResult(fileIntent, FILE_UPLOAD_REQUEST_CODE);
    }

}
