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

        Button btnSumar = findViewById(R.id.sumar);
        Button btnRestar = findViewById(R.id.restar);
        Button btnMultiplicar = findViewById(R.id.multiplicar);
        Button btnDividir = findViewById(R.id.dividir);

        // Función común para manejar operaciones
        View.OnClickListener operar = new View.OnClickListener() {
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
                    int resultado = 0;

                    switch (view.getId()) {
                        case R.id.sumar:
                            resultado = numero1 + numero2;
                            break;
                        case R.id.restar:
                            resultado = numero1 - numero2;
                            break;
                        case R.id.multiplicar:
                            resultado = numero1 * numero2;
                            break;
                        case R.id.dividir:
                            if (numero2 != 0) {
                                resultado = numero1 / numero2;
                            } else {
                                Toast.makeText(getApplicationContext(), "No se puede dividir por cero", Toast.LENGTH_LONG).show();
                                return;
                            }
                            break;
                    }

                    txt3.setText("El resultado es: " + resultado);
                    // Limpiar los campos después de la operación
                    txt1.setText("");
                    txt2.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Ingrese valores numéricos válidos", Toast.LENGTH_LONG).show();
                    Log.e("Error", "Error al convertir texto a número", e);
                }
            }
        };

        // Asignar el mismo evento a todos los botones
        btnSumar.setOnClickListener(operar);
        btnRestar.setOnClickListener(operar);
        btnMultiplicar.setOnClickListener(operar);
        btnDividir.setOnClickListener(operar);
    }
}