package com.example.eje8_reciclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    ImageView getImageView;
    TextView tvGetTitle, tvGetDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getImageView = findViewById(R.id.getImageView);
        tvGetTitle = findViewById(R.id.tvGetTitle);
        tvGetDesc = findViewById(R.id.tvGetDesc);

        Intent intent = getIntent();

        String getTitle = intent.getStringExtra("title");
        String getDesc = intent.getStringExtra("desc");
        int getImage = intent.getIntExtra("icon", R.drawable.python);

        getImageView.setImageResource(getImage);
        tvGetTitle.setText(getTitle);
        tvGetDesc.setText(getDesc);

    }
}