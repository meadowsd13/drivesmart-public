// This class contains the code that inflates the views
// for the general rules fragment

package com.example.drivingtutorapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GeneralRules extends Fragment {

    //Override onCreateView, set title of the current fragment
    //and inflates the content for this fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("General Rules");
        return inflater.inflate(R.layout.frag_genereal_rules, container, false);
    }



}
