package com.example.eslamwael74.yourhealth.Fragment;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.eslamwael74.yourhealth.R;


/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class ProfileFragment extends Fragment {

    FragmentActivity fragmentActivity;

    ImageView mImgProfile;
    TextInputLayout mNameTEnput, mPhoneTextInput, mEmailTextInput, mPasswordTextInput;
    TextInputEditText mNameEditText, mPhoneEditText, mEmailEditText, mPasswordEditText;
    AppCompatButton mBtnUpdate;

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

    private void getWidget(View view) {
        mImgProfile = view.findViewById(R.id.image_profile);

        mNameTEnput = view.findViewById(R.id.name_text_input);
        mPhoneTextInput = view.findViewById(R.id.phone_text_input);
        mEmailTextInput = view.findViewById(R.id.email_text_input);
        mPasswordTextInput = view.findViewById(R.id.password_text_input);

        mNameEditText = view.findViewById(R.id.name_edit_text);
        mPhoneEditText = view.findViewById(R.id.phone_edit_text);
        mEmailEditText = view.findViewById(R.id.email_edit_text);
        mPasswordEditText = view.findViewById(R.id.password_edit_text);

        mBtnUpdate = view.findViewById(R.id.btn_update);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        getWidget(view);

        mBtnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnUpdate.setTextColor(getResources().getColor(R.color.cyan_64bebd));
                if (!validate()) {
                    return;
                }
            }
        });

        return view;

    }

    private boolean validate() {

        String name = mNameEditText.getText().toString();
        String phone = mPhoneEditText.getText().toString();
        String email = mEmailEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();


        if (name.length() != 0 || phone.length() != 0 ||
                email.length() != 0 || password.length() != 0) {

            if (name.length() < 6) {
                mNameTEnput.setError("Your name less than 6 character");
            } else if (name.length() == 0) {
                mNameTEnput.setError("your phone empty!");
            }
            if (phone.length() < 11) {
                mPhoneTextInput.setError("Your phone less than 11 number");
            } else if (phone.length() == 0) {
                mPhoneTextInput.setError("Your phone empty");

            }
            if (email.length() == 0) {
                mEmailTextInput.setError("Your email empty!");
            }
            if (password.length() < 6) {
                mPasswordTextInput.setError("Your password less than 6 character");
            } else if (password.length() == 0) {
                mPasswordTextInput.setError("Your password empty");
            }
            return false;
        } else {
            if (name.length() != 0 && phone.length() != 0 &&
                    email.length() != 0 && password.length() != 0) {
                Toast.makeText(getActivity(), "Updated!", Toast.LENGTH_SHORT).show();
                return true;
            }
            return true;
        }
    }

}
