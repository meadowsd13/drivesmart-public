//This class sets the content of each state from the arrayList to the recycler View
//by passing in an adapter

package com.example.drivingtutorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class RyclerViewMain extends AppCompatActivity {

    //references for our recyclerView, adapter and layout Manager
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rycler_view_main);

        //array containing out state items
        ArrayList<StatesItems> stateItems = new ArrayList<>();

        //adding the states information into the array
        stateItems.add(new StatesItems(R.mipmap.alabama_flag, "Alabama", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.alaska_flag, "Alaska", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.arizona_flag, "Arizona", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.arkansas_flag, "Arkansas", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.california_flag, "California", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.colorado_flag, "Colorado", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.connecticut_flag, "Connecticut", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.delaware_flag, "Delaware", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.florida_flag, "Florida", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.georgia_flag, "Georgia", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.hawaii_flag, "Hawaii", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.idaho_flag, "Idaho", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.illinois_flag, "Illinois", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.indiana_flag, "Indiana", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.iowa_flag, "Iowa", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.kansas_flag, "Kansas", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.kentucky_flag, "Kentucky", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.louisiana_flag, "Louisiana", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.maine_flag, "Maine", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.maryland_flag, "Maryland", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.massachusetts_flag, "Massachussets", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.michigan_flag, "Michigan", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.minnesota_flag, "Minnesota", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.missisi_flag, "Mississippi", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.missouri_flag, "Missouri", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.montana_flag, "Montana", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.nebraska_flag, "Nebraska", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.nevada_flag, "Nevada", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.new_hamphier_flag, "New Hampshire", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.new_jersey_flag, "New Jersey", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.new_mexico_flag, "New Mexico", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.new_york_flag, "New York", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.north_caroline_flag, "North Caroline", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.north_dakota_flag, "North Dakota", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.ohio_flag, "Ohio", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.oklahoma_flag, "Oklahoma", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.oregon_flag, "Oregon", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.pennsyl_flag, "Pennsylvania", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.rhode_island_flag, "Rhode Island", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.south_caroline_flag, "South Coraline", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.south_dakota_flag, "South Dakota", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.tennese_flag, "Tennessee", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.texas_flag, "Texas", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.utah_flag, "Utah", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.vermont_flag, "Vermont", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.virginia_flag, "Virginia", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.washington_flag, "Washington", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.west_virginia_flag, "West Virginia", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.wisconsin_flag, "Wisconsin", "Manual"));
        stateItems.add(new StatesItems(R.mipmap.wyoming_flag, "Wyoming", "Manual"));


        // we initialized our recycler view,layout manager and adapter
        mRecyclerView = findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(stateItems);

        //our recycler view will not change in size
        mRecyclerView.setHasFixedSize(true);

        //we pass our adapter and layout manager to our recyclerView
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        //listener for each item on the recyclerView.
        //It has an intent to take the user to the respective DMV  manual
        mAdapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                browserIntent( position);
            }
        });
    }

    //this method is in charge of the intent to take the user to the specific
    //state website. also notifies to the adapter that the data has changed
    public void browserIntent (int position){

        Resources res = getResources();
        String[] webLinks = res.getStringArray(R.array.web_links_array);

        Intent goWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse(webLinks[position]));
        mAdapter.notifyItemChanged(position);
        startActivity(goWebsite);
    }
}
