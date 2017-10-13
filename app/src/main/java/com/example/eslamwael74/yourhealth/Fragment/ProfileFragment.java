package com.example.eslamwael74.yourhealth.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eslamwael74.yourhealth.R;

/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class ProfileFragment extends Fragment {

    private static final String ARG_Ex = "ContractDetailFragment";
    private String example;

    public ProfileFragment() {
    }


    public static ProfileFragment newInstance(String example) {
        ProfileFragment firstFragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_Ex, example);
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        return view;

    }
}
