package com.example.drivingtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LearnFunction3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_function3);
    }

    public void back(View v) {
        Intent open = new Intent(LearnFunction3.this, MainActivity.class);
        startActivity(open);
    }
}
