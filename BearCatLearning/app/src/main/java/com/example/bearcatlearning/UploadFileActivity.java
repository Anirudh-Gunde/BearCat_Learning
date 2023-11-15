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

import android.content.Context;
import android.net.Uri;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class UploadFileActivity {

    public static void uploadFileToFirebase(Context context, Uri fileUri) {
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        StorageReference fileRef = storageRef.child("uploads/" + fileUri.getLastPathSegment());

        // Start the upload process
        fileRef.putFile(fileUri)
                .addOnSuccessListener(taskSnapshot -> {
                    // File upload is successful
                    // Handle successful uploads (e.g., show a success message)
                    Toast.makeText(context, "File uploaded successfully", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> {
                    // Handle unsuccessful uploads (e.g., display an error message)
                    Toast.makeText(context, "Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }
}
