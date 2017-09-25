package com.example.eslamwael74.yourhealth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class AddFragment extends Fragment {

    private static final String ARG_Ex = "ContractDetailFragment";
    private String example;

    public AddFragment() {
    }

    public static AddFragment newInstance(String example) {
        AddFragment firstFragment = new AddFragment();
        Bundle args = new Bundle();
        args.putString(ARG_Ex, example);
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add, container, false);


        return view;

    }
}
