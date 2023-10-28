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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == VIDEO_UPLOAD_REQUEST_CODE && resultCode == RESULT_OK) {
            Uri videoUri = data.getData();

            if (videoUri != null) {
                uploadVideoToFirebaseStorage(videoUri);
            } else {
                showToast("Video selection failed");
            }
            finish();
        } else {
            showToast("Video selection canceled");
            finish();
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void uploadVideoToFirebaseStorage(Uri videoUri) {
        // Create a unique key for the video
        String videoId = databaseReference.push().getKey();
        // Define the StorageReference for the video in Firebase Storage
        StorageReference videoRef = storageReference.child(videoId);
        try
        {
            InputStream inputStream = getContentResolver().openInputStream(videoUri);

            UploadTask uploadTask = videoRef.putStream(inputStream);

            uploadTask.addOnSuccessListener(taskSnapshot -> {
                // Video uploaded successfully, get the download URL
                videoRef.getDownloadUrl().addOnSuccessListener(uri -> {
                    String downloadUrl = uri.toString();
                    storeVideoMetadataInDatabase(videoId, downloadUrl);
                });
            }).addOnFailureListener(e -> showToast("Video upload failed: " + e.getMessage()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            showToast("Failed to read video: " + e.getMessage());
        }
    }

    private void storeVideoMetadataInDatabase(String videoId, String downloadUrl) {
        // Create a data object to represent the video metadata
        VideoMetadata videoMetadata = new VideoMetadata(downloadUrl);

        // Store the metadata in Firebase Realtime Database
        databaseReference.child(videoId).setValue(videoMetadata)
                .addOnSuccessListener(aVoid -> showToast("Video metadata stored in Firebase Database"))
                .addOnFailureListener(e -> showToast("Failed to store video metadata: " + e.getMessage()));
    }

    private class VideoMetadata {
        private String downloadUrl;

        public VideoMetadata()
        {
            // Default constructor required for Firebase Realtime Database
        }

        public VideoMetadata(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }
    }
}
