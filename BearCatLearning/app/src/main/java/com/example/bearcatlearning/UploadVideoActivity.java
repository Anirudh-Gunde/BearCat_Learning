package com.example.bearcatlearning;
import android.app.*;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.io.InputStream;
public class UploadVideoActivity {

    public static void uploadVideoToFirebase(Context context, Uri videoUri) {
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        StorageReference videoRef = storageRef.child("videos/" + videoUri.getLastPathSegment());

        videoRef.putFile(videoUri)
                .addOnSuccessListener(taskSnapshot -> {
                    // Handle successful uploads (e.g., show a success message)
                    // You can display a toast or perform other actions upon successful upload
                    Toast.makeText(context, "Video Uploaded successfully", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> {
                    // Handle unsuccessful uploads (e.g., display an error message)
                    // You can display a toast or perform other actions upon failure
                    Toast.makeText(context, "Video Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

}
