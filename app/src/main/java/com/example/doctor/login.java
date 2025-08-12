package com.example.doctor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declear element
        Button btn_start  = findViewById(R.id.btn_start);
        EditText email =findViewById(R.id.et_emailAdd);
        EditText pass = findViewById(R.id.et_pass);
        TextView signup =findViewById(R.id.tv_signup);

        //event btn
        btn_start.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(login.this, home.class);

            @Override
            public void onClick(View v) {
                btn_start.setBackgroundColor(Color.LTGRAY);
                startActivity(intent);
            }
        });
        //event Signup
        signup.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(login.this, signup.class);

            @Override
            public void onClick(View v) {
                signup.setTextColor(getColor(R.color.gray));
                startActivity(intent);
            }
        });
    }
}