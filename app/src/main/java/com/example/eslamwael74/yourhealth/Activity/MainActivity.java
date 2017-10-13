package com.example.eslamwael74.yourhealth.Activity;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.eslamwael74.yourhealth.Fragment.AddFragment;
import com.example.eslamwael74.yourhealth.Fragment.HomeFragment;
import com.example.eslamwael74.yourhealth.Fragment.ProfileFragment;
import com.example.eslamwael74.yourhealth.R;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView navigation;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager = getSupportFragmentManager();
        FragmentTransaction hTransaction = fragmentManager.beginTransaction();
        hTransaction.replace(R.id.content, HomeFragment.newInstance("Home"));
        hTransaction.commit();

        mTextMessage = findViewById(R.id.message);
        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = HomeFragment.newInstance("hello");
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.setCustomAnimations(R.anim.slide_up, R.anim.slide_out);
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    AddFragment addFragment = AddFragment.newInstance("hello");
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction2.setCustomAnimations(R.anim.slide_up, R.anim.slide_out);
                    fragmentTransaction2.replace(R.id.content, addFragment);
                    fragmentTransaction2.commit();
                    fragmentTransaction2.addToBackStack(null);
                    return true;
                    //omgsad
                case R.id.navigation_notifications:
                    ProfileFragment profileFragment = ProfileFragment.newInstance("hello");
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction3.setCustomAnimations(R.anim.slide_up, R.anim.slide_out);
                    fragmentTransaction3.addToBackStack(null);
                    fragmentTransaction3.commit();
                    fragmentTransaction3.replace(R.id.content, profileFragment);
                    return true;
            }
            return false;
        }
    };
}
