package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaCourseActivity extends AppCompatActivity {
    private TextView headerTV, courseTV,introTV, classesTV,ternaryTV, conditionsTV, inheritanceTV, recursionTV, sortingTV, arraysTV;
    private Button introJavaNotesBTN, classesNotesBTN, ternaryNotesBTN, conditionsNotesBTN, inheritanceNotesBTN, recursionNotesBTN, sortingNotesBTN, arraysNotesBTN;
    private Button introJavaVideoBTN, classesVideoBTN, ternaryVideoBTN, conditionsVideoBTN, inheritanceVideoBTN, recursionVideoBTN, sortingVideoBTN, arraysVideoBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_course_syllabus);
        headerTV=findViewById(R.id.headerTV);
        courseTV=findViewById(R.id.courseTV);
        introTV=findViewById(R.id.introJavaTV);
        introJavaNotesBTN=findViewById(R.id.introNotesBTN);
        introJavaVideoBTN=findViewById(R.id.introVideoBTN);
        classesTV=findViewById(R.id.classesTV);
        classesNotesBTN=findViewById(R.id.classesNotesBTN);
        classesVideoBTN=findViewById(R.id.classesVideoBTN);
        ternaryTV=findViewById(R.id.ternaryTV);
        ternaryNotesBTN=findViewById(R.id.ternaryNotesBTN);
        ternaryVideoBTN=findViewById(R.id.ternaryVideoBTN);
        conditionsTV=findViewById(R.id.conditionsTV);
        conditionsNotesBTN=findViewById(R.id.conditionNotesBTN);
        conditionsVideoBTN=findViewById(R.id.conditionVideoBTN);
        inheritanceTV=findViewById(R.id.inheritanceTV);
        inheritanceNotesBTN=findViewById(R.id.inheritanceNotesBTN);
        inheritanceVideoBTN=findViewById(R.id.inheritanceVideoBTN);
        recursionTV=findViewById(R.id.recursiveTV);
        recursionNotesBTN=findViewById(R.id.recursiveNotesBTN);
        recursionVideoBTN=findViewById(R.id.recursiveVideoBTN);
        sortingTV=findViewById(R.id.sortingTV);
        sortingNotesBTN=findViewById(R.id.sortingNotesBTN);
        sortingVideoBTN=findViewById(R.id.sortingVideosBTN);
        arraysTV=findViewById(R.id.arraysTV);
        arraysNotesBTN=findViewById(R.id.arraysNotesBTN);
        arraysVideoBTN=findViewById(R.id.arraysVideoBTN);
        introJavaVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        introJavaNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        classesVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        classesNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        ternaryVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        ternaryNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        conditionsVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        conditionsNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        inheritanceVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        inheritanceNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        recursionVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        recursionNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        sortingVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        sortingNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        arraysVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        arraysNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });

    }

}
