package com.example.individual11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RadioButtonsFragment extends Fragment {

    private TextView tvResult;
    private RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radio_buttons, container, false);

        tvResult = view.findViewById(R.id.tvResult);
        radioGroup = view.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbSi) {
                    tvResult.setText("¡Conoces a Pikachu!");
                } else if (checkedId == R.id.rbNo) {
                    tvResult.setText("¡No conoces a Pikachu!");
                }
            }
        });

        return view;
    }
}