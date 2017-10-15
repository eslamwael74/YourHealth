package com.example.eslamwael74.yourhealth.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eslamwael74.yourhealth.Adapter.HomeAdapter;
import com.example.eslamwael74.yourhealth.Model.HealthHistory;
import com.example.eslamwael74.yourhealth.R;

import java.util.ArrayList;


/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    HomeAdapter homeAdapter;
    ArrayList<HealthHistory> healthHistories;

    private static final String ARG_Ex = "ContractDetailFragment";
    private String example;

    public HomeFragment() {
    }

    public static HomeFragment newInstance(String example) {
        HomeFragment firstFragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_Ex, example);
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        healthHistories = new ArrayList<>();

        HealthHistory history = new HealthHistory("Panadol","ayHaga","Eslam","20/11/2017");

        for (int i = 0; i <55 ; i++) {
            healthHistories.add(history);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        homeAdapter = new HomeAdapter(healthHistories,getActivity());
        recyclerView.setAdapter(homeAdapter);

        return view;

    }
}
