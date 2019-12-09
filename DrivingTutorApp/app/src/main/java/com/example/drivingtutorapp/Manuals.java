// This class (activity)contains the code that sets the content
// of the manuals to its respective layout

package com.example.drivingtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class Manuals extends AppCompatActivity {

    // set title and the content view to its layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuals);
        setTitle("Manuals");
    }

}
