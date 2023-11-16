package com.example.bearcatlearning;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PdfReaderActivity extends AppCompatActivity {

    private TextView documentDataTextView;
    //added code for firebase storage
    //private FirebaseFirestore db;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfreader);
        /** added code for database loading pdf files from firebase and reading it to the layout
         // Initialize the Firestore instance
         db = FirebaseFirestore.getInstance();

         // Reference to the Firestore document you want to read
         DocumentReference documentRef = db.collection("your_collection").document("your_document_id");
*/
         // Initialize the TextView
         documentDataTextView = findViewById(R.id.document_data);
/**
         // Fetch the document data
         documentRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
        @Override
        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
        if (task.isSuccessful()) {
        DocumentSnapshot document = task.getResult();
        if (document.exists()) {
        // Document data exists; display it in the TextView
        String documentData = document.getData().toString();
        documentDataTextView.setText(documentData);
        } else {
        documentDataTextView.setText("Document does not exist");
        }
        } else {
        // Handle errors
        documentDataTextView.setText("Error fetching document");
        }
        }
        });
         **/
    }
}
