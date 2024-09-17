package com.example.individual11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btnShowFragment;
    private Button btnCloseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowFragment = findViewById(R.id.btnShowFragment);
        btnCloseApp = findViewById(R.id.btnCloseApp);

        // Botón para mostrar los dos fragmentos
        btnShowFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragments();
            }
        });

        // Botón para cerrar la aplicación
        btnCloseApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la aplicación
            }
        });
    }

    // Método para cargar los dos fragmentos
    private void loadFragments() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Cargar fragmento de Radio Buttons en el primer contenedor
        fragmentTransaction.replace(R.id.fragment_radio_container, new RadioButtonsFragment());

        // Cargar fragmento de Imagen (Pikachu) en el segundo contenedor
        fragmentTransaction.replace(R.id.fragment_image_container, new ImageFragment());

        fragmentTransaction.commit();
    }
}