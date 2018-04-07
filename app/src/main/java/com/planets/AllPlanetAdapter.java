package com.planets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AllPlanetAdapter extends RecyclerView.Adapter<AllPlanetAdapter.CustomViewHolder> {

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public CustomViewHolder(View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public AllPlanetAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_planet_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AllPlanetAdapter.CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
