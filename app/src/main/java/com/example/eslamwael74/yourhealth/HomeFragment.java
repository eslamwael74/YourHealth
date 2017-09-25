package com.example.eslamwael74.yourhealth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class HomeFragment extends Fragment {

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


        return view;

    }
}
