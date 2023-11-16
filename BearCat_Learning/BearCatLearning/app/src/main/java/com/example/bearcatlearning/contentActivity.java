package com.example.bearcatlearning;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class contentActivity extends AppCompatActivity {

    private VideoView videoView;
    private Button playButton, pauseButton, stopButton;
    private ListView materialsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        // Initialize UI elements
        videoView = findViewById(R.id.video_view);
        playButton = findViewById(R.id.play_button);
        pauseButton = findViewById(R.id.pause_button);
        stopButton = findViewById(R.id.stop_button);
        materialsListView = findViewById(R.id.materials_list);


    }
}

