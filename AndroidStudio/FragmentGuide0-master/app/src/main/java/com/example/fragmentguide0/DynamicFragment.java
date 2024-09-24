package com.example.fragmentguide0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.fragmentguide0.databinding.FragmentDynamicBinding;

public class DynamicFragment extends Fragment {

    private FragmentDynamicBinding binding;
    private boolean isYesSelected = false;

    public DynamicFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDynamicBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Lógica para manejar la selección de RadioButtons
        binding.radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioYes) {
                isYesSelected = true;
                binding.textView.setText("Has seleccionado Sí");
            } else if (checkedId == R.id.radioNo) {
                isYesSelected = false;
                binding.textView.setText("Has seleccionado No");
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}