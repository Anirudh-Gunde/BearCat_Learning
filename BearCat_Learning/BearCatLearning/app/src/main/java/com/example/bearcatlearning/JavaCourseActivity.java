package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaCourseActivity extends AppCompatActivity {
    private TextView headerTV, courseTV,introJavaTV, objAndClassesTV,primitiveTV, conditionsTV, selectionTV, repetitionTV, fileIOTV, arraysTV, debuggingTV, testingTV, enumTV, abstractTV, interfaceTV, exceptionTV, recursionTV;
    private Button introJavaNotesBTN, objAndClassesNotesBTN, primitiveNotesBTN, conditionsNotesBTN, selectionNotesBTN, repetitionNotesBTN, fileIONotesBTN, arraysNotesBTN, debuggingNotesBTN, testingNotesBTN, enumNotesBTN, abstractNotesBTN, interfaceNotesBTN, exceptionNotesBTN, recursionNotesBTN;
    private Button introJavaVideoBTN, objAndClassesVideoBTN, primitiveVideoBTN, conditionsVideoBTN, selectionVideoBTN, repetitionVideoBTN, fileIOVideoBTN, arraysVideoBTN, debuggingVideoBTN, testingVideoBTN, enumVideoBTN, abstractVideoBTN, interfaceVideoBTN, exceptionVideoBTN, recursionVideoBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_course_syllabus);
        headerTV=findViewById(R.id.headerTV);
        courseTV=findViewById(R.id.courseTV);
        introJavaTV=findViewById(R.id.introJavaTV);
        introJavaNotesBTN=findViewById(R.id.introNotesBTN);
        introJavaVideoBTN=findViewById(R.id.introVideoBTN);
        objAndClassesTV=findViewById(R.id.objAndClassesTV);
        objAndClassesNotesBTN=findViewById(R.id.objAndClassesNotesBTN);
        objAndClassesVideoBTN=findViewById(R.id.objAndClassesVideoBTN);
        primitiveTV=findViewById(R.id.primitiveTV);
        primitiveNotesBTN=findViewById(R.id.primitiveNotesBTN);
        primitiveVideoBTN=findViewById(R.id.primitiveVideoBTN);
        conditionsTV=findViewById(R.id.conditionsTV);
        conditionsNotesBTN=findViewById(R.id.conditionNotesBTN);
        conditionsVideoBTN=findViewById(R.id.conditionVideoBTN);
        selectionTV=findViewById(R.id.selectionTV);
        selectionNotesBTN=findViewById(R.id.selectionNotesBTN);
        selectionVideoBTN=findViewById(R.id.selectionVideoBTN);
        repetitionTV=findViewById(R.id.repetitionTV);
        repetitionNotesBTN=findViewById(R.id.repetitionNotesBTN);
        repetitionVideoBTN=findViewById(R.id.repetitionVideoBTN);
        fileIOTV=findViewById(R.id.fileIOTV);
        fileIONotesBTN=findViewById(R.id.fileIONotesBTN);
        fileIOVideoBTN=findViewById(R.id.fileIOVideoBTN);
        arraysTV=findViewById(R.id.arraysTV);
        arraysNotesBTN=findViewById(R.id.arraysNotesBTN);
        arraysVideoBTN=findViewById(R.id.arraysVideoBTN);
        debuggingTV=findViewById(R.id.debuggingTV);
        debuggingNotesBTN=findViewById(R.id.debuggingNotesBTN);
        debuggingVideoBTN=findViewById(R.id.debuggingVideoBTN);
        testingTV=findViewById(R.id.testingTV);
        testingNotesBTN=findViewById(R.id.testingNotesBTN);
        testingVideoBTN=findViewById(R.id.testingVideoBTN);
        enumTV=findViewById(R.id.enumTV);
        enumNotesBTN=findViewById(R.id.enumNotesBTN);
        enumVideoBTN=findViewById(R.id.enumVideoBTN);
        abstractTV=findViewById(R.id.abstractTV);
        abstractNotesBTN=findViewById(R.id.abstractNotesBTN);
        abstractVideoBTN=findViewById(R.id.abstractVideoBTN);
        interfaceTV=findViewById(R.id.interfaceTV);
        interfaceNotesBTN=findViewById(R.id.interfaceNotesBTN);
        interfaceVideoBTN=findViewById(R.id.interfaceVideoBTN);
        exceptionTV=findViewById(R.id.exceptionsTV);
        exceptionNotesBTN=findViewById(R.id.exceptionNotesBTN);
        exceptionVideoBTN=findViewById(R.id.exceptionVideoBTN);
        recursionTV=findViewById(R.id.recursionTV);
        recursionNotesBTN=findViewById(R.id.recursionNotesBTN);
        recursionVideoBTN=findViewById(R.id.recursionVideoBTN);
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
        objAndClassesVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        objAndClassesNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        primitiveVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        primitiveNotesBTN.setOnClickListener(new View.OnClickListener() {
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
        selectionVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        selectionNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        repetitionVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        repetitionNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        fileIOVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        fileIONotesBTN.setOnClickListener(new View.OnClickListener() {
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
        debuggingVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        debuggingNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        testingVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        testingNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        enumVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        enumNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        abstractVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        abstractNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        interfaceVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        interfaceNotesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,PdfReaderActivity.class);
                startActivity(intent);
            }
        });
        exceptionVideoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaCourseActivity.this,contentActivity.class);
                startActivity(intent);
            }
        });
        exceptionNotesBTN.setOnClickListener(new View.OnClickListener() {
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
    }

}
