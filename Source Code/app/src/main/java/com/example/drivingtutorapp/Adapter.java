
// The adapter class, it is like the bridge between our data and
// the recycler view
package com.example.drivingtutorapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<StatesItems> mItemList;
    private OnItemClickListener mListener;

    //it holds the position of the item clicked
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    //sets the parameter provided to set the info to the @mListener variable
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    //Here we hold the view that we are going to be passing information to
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        //constructor
        public ViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.state_flag);
            mTextView1 = itemView.findViewById(R.id.text1);
            mTextView2 = itemView.findViewById(R.id.text2);

            //gets the current itemView and sets a click listener to it
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();

                        //making sure the position is actually valid
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }

    }

    //this method gets the list passed into it and assign its content
    //to our item array variable
    public Adapter(ArrayList<StatesItems> itemsList) {

        mItemList = itemsList;
    }


    // it inflates the content the layout that is going to contain the
    // the information of our items
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.manual_items, parent,
                false);
        ViewHolder vh = new ViewHolder(v, mListener);
        return vh;
    }

    //it binds or fill the info that it is going to be shown in
    //the current state item by its position
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        StatesItems currentItem = mItemList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());


    }

    //Here we define how many item are going to be in our list
    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
