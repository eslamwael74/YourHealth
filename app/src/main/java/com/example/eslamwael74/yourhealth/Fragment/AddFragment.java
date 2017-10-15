package com.example.eslamwael74.yourhealth.Fragment;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eslamwael74.yourhealth.R;


/**
 * Created by Eslam Wael on 9/24/2017.
 */

public class AddFragment extends Fragment {

    TextInputLayout mDiseaseTextInput, mMedicineTextInput, mDoctorTextInput, mDateTextInput;
    TextInputEditText mDiseaseEditText, mMedicineEditText, mDoctorEditText;
    EditText mDateEditText;
    AppCompatButton mBtnAdd;

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

        getWidget(view);


        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnAdd.setTextColor(getResources().getColor(R.color.cyan_64bebd));
                if(!validate()){
                    return;
                }

            }
        });
        return view;
    }

    private void getWidget(View view) {

        mDiseaseTextInput = view.findViewById(R.id.name_text_input);
        mMedicineTextInput = view.findViewById(R.id.phone_text_input);
        mDoctorTextInput = view.findViewById(R.id.email_text_input);
        mDateTextInput = view.findViewById(R.id.password_text_input);

        mDiseaseEditText = view.findViewById(R.id.name_edit_text);
        mDoctorEditText = view.findViewById(R.id.email_edit_text);
        mMedicineEditText = view.findViewById(R.id.phone_edit_text);
        mDateEditText = view.findViewById(R.id.password_edit_text);

        mBtnAdd = view.findViewById(R.id.btn_save);
    }

    private boolean validate() {

        String disease = mDiseaseEditText.getText().toString().trim();
        String medicine = mMedicineEditText.getText().toString().trim();
        String doctor = mDoctorEditText.getText().toString().trim();
        String date = mDateEditText.getText().toString().trim();

        if(disease.length() != 0  || medicine.length() != 0  ||
                doctor.length() != 0  || date.length() != 0){


        if (disease.length() < 6) {
            mDiseaseTextInput.setError("Your disease less than 6 character");
        }
        if (medicine.length() == 1) {
            mMedicineTextInput.setError("Your medicine less than 1 character");
        }
        if (doctor.length() < 6) {
            mDoctorTextInput.setError("Your doctor name less than 6 cahracter");
        }
        if (date.length() == 0) {
            mDoctorTextInput.setError("date is empty!");
        }
        mBtnAdd.setVisibility(View.VISIBLE);
        return false;
        }
        else {

            if(disease.length() != 0  || medicine.length() != 0  ||
                    doctor.length() != 0  || date.length() != 0) {

                Toast.makeText(getActivity(), "Added!", Toast.LENGTH_SHORT).show();
                mDiseaseEditText.setText("");
                mMedicineEditText.setText("");
                mDoctorEditText.setText("");
                mDateEditText.setText("");
                mBtnAdd.setVisibility(View.GONE);
                return true;
            }
            return true;
        }
    }
}
