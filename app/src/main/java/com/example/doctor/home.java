package com.example.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declare element
        ImageView brain =findViewById(R.id.iv_brain);
        ImageView top3 =findViewById(R.id.iv_top3);
        ImageView iv_calender = findViewById(R.id.iv_calender);
        ImageView profile = findViewById(R.id.iv_profile);

        // event in image
        brain.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(home.this, detalisDoctor.class);

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        //event in image doctor
        top3.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(home.this, detalisDoctor.class);

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        //event in calender
        iv_calender.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(home.this, appointment.class);

            @Override
            public void onClick(View v) {
                iv_calender.setImageResource(R.drawable.calendarblue);
                startActivity(intent);
            }
        });
        //event in profile
        profile.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(home.this, profile.class);

            @Override
            public void onClick(View v) {
                profile.setImageResource(R.drawable.userblue);
                startActivity(intent);
            }
        });
    }
}