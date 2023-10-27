package com.example.bearcatlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserID, editTextPassword;
    private Button buttonLogin;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserID = findViewById(R.id.student_id_edittext);
        editTextPassword = findViewById(R.id.password_edittext);
        buttonLogin = findViewById(R.id.login_button);
        firebaseAuth = FirebaseAuth.getInstance();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userID = editTextUserID.getText().toString();
                String password = editTextPassword.getText().toString();
                firebaseAuth.signInWithEmailAndPassword(userID, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Check if user exists in the Realtime Database
                                    Toast.makeText(getApplicationContext(),
                                                    "Login successful!!",
                                                    Toast.LENGTH_LONG)
                                            .show();

                                    // If sign-in is successful, navigate to the dashboard activity
                                    Intent intent = new Intent(MainActivity.this, dashboardActivity.class);
                                    startActivity(intent);
                                    finish(); // Close the current activity to prevent the user from going back
                                } else {
                                    // Sign-in failed
                                    Toast.makeText(getApplicationContext(),
                                                    "Login failed!!",
                                                    Toast.LENGTH_LONG)
                                            .show();
                                    // Handle failed login
                                }
                            }
                        });
            }
        });
    }
}
