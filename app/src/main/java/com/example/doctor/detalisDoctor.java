package com.example.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detalisDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalis_doctor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declar element
        ImageView back =findViewById(R.id.iv_back);
        Button booknow  = findViewById(R.id.btn_booknow);

        // event back
        back.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(detalisDoctor.this, home.class);

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        // event toast
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(detalisDoctor.this,"booking confirmed successfuly!",Toast.LENGTH_LONG).show();
            }
        });
    }
}