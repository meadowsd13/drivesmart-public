
// This class contains the code that inflates the views
// for the special scenarios fragment

package com.example.drivingtutorapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SpecialsFragment extends Fragment {


    //Override onCreateView, set title of the current fragment
    //and inflates the content for this fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Special Scenarios");
        return inflater.inflate(R.layout.frag_special,container,false);
    }

}
