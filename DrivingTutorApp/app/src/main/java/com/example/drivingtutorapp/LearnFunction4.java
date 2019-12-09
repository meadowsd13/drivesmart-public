package com.example.drivingtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LearnFunction4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_function4);
    }
    public void back(View v) {
        Intent open = new Intent(LearnFunction4.this, MainActivity.class);
        startActivity(open);
    }
}
