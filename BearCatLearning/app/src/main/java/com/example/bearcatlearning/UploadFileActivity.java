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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == FILE_UPLOAD_REQUEST_CODE && resultCode == RESULT_OK) {
            Uri fileUri = data.getData();

            if (fileUri != null) {
                uploadFileToFirebaseStorage(fileUri);
            } else {
                showToast("File selection failed");
            }
            finish();
        } else {
            showToast("File selection canceled");
            finish();
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void uploadFileToFirebaseStorage(Uri fileUri) {
        // Create a unique key for the file
        String fileId = databaseReference.push().getKey();

        // Define the StorageReference for the file in Firebase Storage
        StorageReference fileRef = storageReference.child(fileId);

        try {
            InputStream inputStream = getContentResolver().openInputStream(fileUri);

            UploadTask uploadTask = fileRef.putStream(inputStream);

            uploadTask.addOnSuccessListener(taskSnapshot -> {
                // File uploaded successfully, get the download URL
                fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                    String downloadUrl = uri.toString();
                    storeFileMetadataInDatabase(fileId, downloadUrl);
                });
            }).addOnFailureListener(e -> showToast("File upload failed: " + e.getMessage()));
        } catch (IOException e) {
            e.printStackTrace();
            showToast("Failed to read file: " + e.getMessage());
        }
    }
    private void storeFileMetadataInDatabase(String fileId, String downloadUrl) {
        // Create a data object to represent the file metadata
        FileMetadata fileMetadata = new FileMetadata(downloadUrl);

        // Store the metadata in Firebase Realtime Database
        databaseReference.child(fileId).setValue(fileMetadata)
                .addOnSuccessListener(aVoid -> showToast("File metadata stored in Firebase Database"))
                .addOnFailureListener(e -> showToast("Failed to store file metadata: " + e.getMessage()));
    }

    private class FileMetadata {
        private String downloadUrl;

        public FileMetadata() {
            // Default constructor required for Firebase Realtime Database
        }

        public FileMetadata(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }
    }
}
