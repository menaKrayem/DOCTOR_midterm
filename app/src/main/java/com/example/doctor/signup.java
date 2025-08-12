package com.example.doctor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declear element
        Button signup = findViewById(R.id.btn_signup);
        EditText etfullname = findViewById(R.id.et_fullname);
        EditText etemailAdd = findViewById(R.id.et_emailAdd);
        EditText etpass = findViewById(R.id.et_pass);
        EditText etConfPass =findViewById(R.id.et_confpass);
        EditText etphone = findViewById(R.id.et_phone);

        //event btn
        signup.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(signup.this, home.class);

            @Override
            public void onClick(View v) {
                signup.setBackgroundColor(Color.LTGRAY);
                startActivity(intent);
            }
        });
    }
}