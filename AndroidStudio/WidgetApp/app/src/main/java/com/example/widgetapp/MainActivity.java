package com.example.widgetapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mensaje de bienvenida
        Toast.makeText(this, "Bienvenido a la aplicación", Toast.LENGTH_SHORT).show();
    }
}