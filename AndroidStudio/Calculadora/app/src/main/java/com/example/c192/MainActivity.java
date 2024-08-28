package com.example.c192;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recibir los elementos del layout
        EditText txt1 = findViewById(R.id.num1);
        EditText txt2 = findViewById(R.id.num2);
        TextView txt3 = findViewById(R.id.resul);
        Button btn = findViewById(R.id.sumar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = txt1.getText().toString().trim();
                String num2 = txt2.getText().toString().trim();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "INGRESE TODOS LOS VALORES", Toast.LENGTH_LONG).show();
                    return;
                }

                try {
                    int numero1 = Integer.parseInt(num1);
                    int numero2 = Integer.parseInt(num2);

                    int resul = numero1 + numero2;
                    txt3.setText("El resultado es: " + resul);

                    // Limpiar los campos después de la operación
                    txt1.setText("");
                    txt2.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Ingrese valores numéricos válidos", Toast.LENGTH_LONG).show();
                    Log.e("Error", "Error al convertir texto a número", e);
                }
            }
        });
    }
}