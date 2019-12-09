
//This class is the object (item) that contains the information
// to be displayed for each state manual of the app


package com.example.drivingtutorapp;


public class StatesItems {

    //information that each item is going to hold
    private int mStateFlag;
    private String mNameState;
    private String mManual;

    //Constructor
    public StatesItems(int imageResource, String text1, String text2) {

        mStateFlag = imageResource;
        mNameState = text1;
        mManual = text2;

    }

    // getters
    public int getmImageResource() {
        return mStateFlag;
    }

    public String getmText1() {
        return mNameState;
    }


    public String getmText2() {
        return mManual;
    }
}


