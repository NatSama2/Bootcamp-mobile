package com.example.individual10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl = findViewById(R.id.etUrl);
        Button btnOpenWeb = findViewById(R.id.btnOpenWeb);

        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etUrl.getText().toString().trim();

                // Validar que la URL no esté vacía
                if (url.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, ingrese una URL", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Pasar la URL a la actividad WebViewActivity
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }
}