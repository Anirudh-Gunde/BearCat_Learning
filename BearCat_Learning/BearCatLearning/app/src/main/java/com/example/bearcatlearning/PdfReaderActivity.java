package com.example.bearcatlearning;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class PdfReaderActivity extends AppCompatActivity {

    private WebView pdfWebView;
    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfreader);

        pdfWebView = findViewById(R.id.pdfWebView);
        firebaseStorage = FirebaseStorage.getInstance();
        storageReference = firebaseStorage.getReference().child("JavaIntro-notes.pdf"); // Replace with your PDF file name

        displayPdf();
    }

    private void displayPdf() {
        WebSettings webSettings = pdfWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        pdfWebView.setWebViewClient(new WebViewClient() {
           // @Override
            //public boolean shouldOverrideUrlLoading(WebView view, String url) {
              //  view.loadUrl(url);
                //return true;
            //}

            // Override shouldOverrideUrlLoading with WebResourceRequest for API level 24 and above
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    view.loadUrl(request.getUrl().toString());
                    return true;
                }
                return super.shouldOverrideUrlLoading(view, request);
            }
        });

        storageReference.getDownloadUrl().addOnSuccessListener(uri -> {
            pdfWebView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + uri.toString());
        }).addOnFailureListener(e -> {
            // Handle the error, e.g., log or display a message
            e.printStackTrace();
        });
    }
}
