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

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        switchingFrag(new HomeFragment());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
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

                    return true;
                }
            };


    public void switchingFrag(Fragment selectedFrag) {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFrag).commit();
    }

    public void buttons(View v) {

        switch (v.getId()) {
            case R.id.manuals:
                Intent goManuals = new Intent(getBaseContext(), RyclerViewMain.class);
                startActivity(goManuals);
                break;
        }
    }

    public void getInQuiz(View v) {
        Intent openQuiz = new Intent(MainActivity.this, MainQuiz.class);
        startActivity(openQuiz);
    }

    public void getInPractice(View v) {
        Intent openPractice = new Intent(MainActivity.this, MainPractice.class);
        startActivity(openPractice);
    }

    public void learnFunction1(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction.class);
        startActivity(open);
    }

    public void learnFunction2(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction2.class);
        startActivity(open);
    }

    public void learnFunction3(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction3.class);
        startActivity(open);
    }

    public void learnFunction4(View v) {
        Intent open = new Intent(MainActivity.this, LearnFunction4.class);
        startActivity(open);
    }

}
