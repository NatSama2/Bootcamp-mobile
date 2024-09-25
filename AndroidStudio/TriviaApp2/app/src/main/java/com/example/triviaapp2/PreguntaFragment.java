package com.example.triviaapp2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class PreguntaFragment extends Fragment {

    public PreguntaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pregunta, container, false);

           RadioGroup rgOpciones = view.findViewById(R.id.rgOpciones);
        Button btnResponder = view.findViewById(R.id.btnResponder);


        btnResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = rgOpciones.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = view.findViewById(selectedId);

                if (selectedId == -1) {
                    Toast.makeText(getActivity(), "Por favor selecciona una respuesta", Toast.LENGTH_SHORT).show();
                } else {

                    if (selectedRadioButton.getText().toString().equals("Opción 2")) {

                        NavController navController = Navigation.findNavController(view);
                        navController.navigate(R.id.action_preguntaFragment_to_finalFragment);
                    } else {

                        Toast.makeText(getActivity(), "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        return view;
    }
}