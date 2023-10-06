package com.example.bearcatlearning;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class dashboardActivity extends AppCompatActivity {
    private ImageButton javaIB;
    private ImageButton adbIB;
    private ImageButton webdevIB;
    private ImageButton androidIB;
    private ImageButton patternsIB;
    private ImageButton gdpIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        javaIB=findViewById(R.id.javaIB);
        adbIB=findViewById(R.id.adbIB);
        webdevIB=findViewById(R.id.webdevIB);
        androidIB=findViewById(R.id.androidIB);
        patternsIB=findViewById(R.id.patternsIB);
        gdpIB=findViewById(R.id.gdpIB);
    }
}
