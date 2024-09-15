package com.example.individual9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView selectedImage = findViewById(R.id.selectedImage);
        Button buttonBack = findViewById(R.id.buttonBack);

        // Obtener el recurso de la imagen del Intent
        int imageResource = getIntent().getIntExtra("imageResource", 0);
        selectedImage.setImageResource(imageResource);

        // Regresar a la primera actividad
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}