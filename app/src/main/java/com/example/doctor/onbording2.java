package com.example.doctor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class onbording2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onbording2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //declear element
        TextView tv = findViewById(R.id.tv_skip);
        Button btnnext = findViewById(R.id.btnNext);

        //event
        btnnext.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(onbording2.this, onbording3.class);

            @Override
            public void onClick(View v) {
                btnnext.setBackgroundColor(Color.LTGRAY);
                startActivity(intent);
            }
        });
        // event in skip
        tv.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(onbording2.this, login.class);

            @Override
            public void onClick(View v) {
                tv.setTextColor(getColor( R.color.blue));
                startActivity(intent);
            }
        });

    }
}