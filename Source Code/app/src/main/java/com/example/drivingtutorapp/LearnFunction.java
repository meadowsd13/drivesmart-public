package com.example.drivingtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LearnFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_function1);
    }

    public void back(View v) {
        Intent open = new Intent(LearnFunction.this, MainActivity.class);
        startActivity(open);
    }
}
