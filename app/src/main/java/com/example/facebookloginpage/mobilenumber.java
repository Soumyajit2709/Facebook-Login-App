package com.example.facebookloginpage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mobilenumber extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilenumber);
        Button nxt4 = findViewById(R.id.nxt4);
        nxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mobilenumber.this, password.class);
                startActivity(intent);
            }
        });

        TextView ea = (TextView) this.findViewById(R.id.ea);
        ea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mobilenumber.this, email.class);
                startActivity(intent);
            }
        });

        ActionBar actionBar = getSupportActionBar();
    }

}