package com.example.eslamwael74.yourhealth.Activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eslamwael74.yourhealth.Fragment.HomeFragment;
import com.example.eslamwael74.yourhealth.R;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout mPhoneTextInput, mPasswordTextInput;
    TextInputEditText mPhoneEditText, mPasswordEditText;
    AppCompatButton mBtnLogin;
    TextView singupActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        getWidget();

        singupActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    return;
                }
                Toast.makeText(LoginActivity.this, "Login!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getWidget() {

        singupActivity = findViewById(R.id.singup_activity);


        mPhoneTextInput = findViewById(R.id.phone_text_input);
        mPasswordTextInput = findViewById(R.id.password_text_input);

        mPhoneEditText = findViewById(R.id.phone_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);

        mBtnLogin = findViewById(R.id.btn_login);
    }

    private boolean validate() {

        String phone = mPhoneEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();

        if (phone.length() < 11) {
            mPhoneTextInput.setError("Your phone less than 11 number");
        } else if (phone.length() == 0) {
            mPhoneTextInput.setError("Your phone empty");
        }
        if (password.length() < 6) {
            mPasswordTextInput.setError("Your password less than 6 character");
        } else if (password.length() == 0) {
            mPasswordTextInput.setError("Your password empty");
        }
        return false;
    }

}
