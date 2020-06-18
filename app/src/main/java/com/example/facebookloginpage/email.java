package com.example.facebookloginpage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        Button nxt5 =findViewById(R.id.nxt5);
        nxt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(email.this, password.class);
                startActivity(intent);
            }
        });

        TextView mn = (TextView) this.findViewById(R.id.mn);
        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(email.this, mobilenumber.class);
                startActivity(intent);
            }
        });

        ActionBar actionBar = getSupportActionBar();
    }
}