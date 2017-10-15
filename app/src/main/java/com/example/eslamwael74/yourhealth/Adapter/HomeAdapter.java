package com.example.eslamwael74.yourhealth.Adapter;

import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eslamwael74.yourhealth.Model.HealthHistory;
import com.example.eslamwael74.yourhealth.R;

import java.util.ArrayList;

/**
 * Created by Eslam Wael on 10/14/2017.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    FragmentActivity fragmentActivity;
    ArrayList<HealthHistory> healthHistories;


    public HomeAdapter(ArrayList<HealthHistory> healthHistories, FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
        this.healthHistories = healthHistories;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomeAdapter.MyViewHolder(LayoutInflater.from(fragmentActivity)
                .inflate(R.layout.history_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tvDisease.setText(healthHistories.get(position).getDisease());
        holder.tvMedicine.setText(healthHistories.get(position).getMedicine());
        holder.tvDoctor.setText(healthHistories.get(position).getDoctor());
        holder.tvDate.setText(healthHistories.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return healthHistories.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvDisease, tvMedicine, tvDoctor, tvDate;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvDisease = itemView.findViewById(R.id.disease);
            tvMedicine = itemView.findViewById(R.id.medicine);
            tvDoctor = itemView.findViewById(R.id.doctor);
            tvDate = itemView.findViewById(R.id.date);


        }
    }
}
