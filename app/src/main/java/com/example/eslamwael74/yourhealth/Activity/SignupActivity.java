package com.example.eslamwael74.yourhealth.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.eslamwael74.yourhealth.Fragment.HomeFragment;
import com.example.eslamwael74.yourhealth.R;

public class SignupActivity extends AppCompatActivity {

    TextInputLayout mNameTEnput, mPhoneTextInput, mEmailTextInput, mPasswordTextInput;
    TextInputEditText mNameEditText, mPhoneEditText, mEmailEditText, mPasswordEditText;
    AppCompatButton mBtnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getWidget();

        mBtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    return;
                }
                Toast.makeText(SignupActivity.this, "Signup!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void getWidget() {

        mNameTEnput = findViewById(R.id.name_text_input);
        mPhoneTextInput = findViewById(R.id.phone_text_input);
        mEmailTextInput = findViewById(R.id.email_text_input);
        mPasswordTextInput = findViewById(R.id.password_text_input);

        mNameEditText = findViewById(R.id.name_edit_text);
        mPhoneEditText = findViewById(R.id.phone_edit_text);
        mEmailEditText = findViewById(R.id.email_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);

        mBtnSignup = findViewById(R.id.btn_signup);
    }

    private boolean validate() {

        String name = mNameEditText.getText().toString();
        String phone = mPhoneEditText.getText().toString();
        String email = mEmailEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();

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
    }

}
