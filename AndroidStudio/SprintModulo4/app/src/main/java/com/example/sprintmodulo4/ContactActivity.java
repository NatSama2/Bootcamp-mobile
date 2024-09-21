package com.example.sprintmodulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {

    private Button buttonLinkedIn, buttonWhatsApp, buttonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        buttonLinkedIn = findViewById(R.id.buttonLinkedIn);
        buttonWhatsApp = findViewById(R.id.buttonWhatsApp);
        buttonEmail = findViewById(R.id.buttonEmail);

        // LinkedIn
        buttonLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String linkedInUrl = "https://www.linkedin.com/in/giselle-cifuentes-m/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInUrl));
                startActivity(intent);
            }
        });

        // WhatsApp
        buttonWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+56971721451";
                String message = "Hola, estoy interesado en contactarte.";
                Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + Uri.encode(message));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Email
        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] destinatarios = {"vet.nat.c@gmail.com"};
                String asunto = "Contacto desde la App";
                String cuerpo = "Hola,\n\nMe gustaría ponerme en contacto contigo.";

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, destinatarios);
                intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
                intent.putExtra(Intent.EXTRA_TEXT, cuerpo);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}