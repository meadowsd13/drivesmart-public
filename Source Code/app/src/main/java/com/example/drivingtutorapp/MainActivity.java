package com.example.drivingtutorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find our navigation view and we set to it our navigation listener method
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //switches to the home fragment
        switchingFrag(new HomeFragment());

    }

    //This is the listener that switches between fragments when an item
    //from the navigation bar is pressed
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {

                //It listens what menu item has been selected and according to its ID
                // it will switch to that specific fragment
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFrag = null;
                    switch (menuItem.getItemId()) {
                        case R.id.home_item:
                            selectedFrag = new HomeFragment();
                            break;

                        case R.id.my_car_item:
                            selectedFrag = new MycarFragment();
                            break;

                        case R.id.specials_item:
                            selectedFrag = new SpecialsFragment();
                            break;
                        case R.id.rules_item:
                            selectedFrag = new GeneralRules()
                            ;
                    }

                    switchingFrag(selectedFrag);

                    // we return true to confirm the selection of our item
                    return true;
                }
            };


    //This method switches the current fragment for the one passed in
    //from the itemSelectedListener
    public void switchingFrag(Fragment selectedFrag) {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFrag).commit();
    }

    //It gets the id of the button pressed and by intent, it takes
    //to the manual activity
    public void buttons(View v) {

        switch (v.getId()) {
            case R.id.manuals:
                Intent goManuals = new Intent(getBaseContext(), RyclerViewMain.class);
                startActivity(goManuals);
                break;
        }
    }

    //creating intent to move on quiz class to start challenging with the quiz
    public void getInQuiz(View v) {
        Intent openQuiz = new Intent(MainActivity.this, MainQuiz.class);
        startActivity(openQuiz);
    }

    //creating intent to move on practice class to start practicing
    public void getInPractice(View v) {
        Intent openPractice = new Intent(MainActivity.this, MainPractice.class);
        startActivity(openPractice);
    }

    //using intent to make the button shift the user to the learn function
    public void learnFunction1(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction.class);
        startActivity(open);
    }

    //using intent to make the button shift the user to the learn function
    public void learnFunction2(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction2.class);
        startActivity(open);
    }

    //using intent to make the button shift the user to the learn function
    public void learnFunction3(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction3.class);
        startActivity(open);
    }

    //using intent to make the button shift the user to the learn function
    public void learnFunction4(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction4.class);
        startActivity(open);
    }

}
