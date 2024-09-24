package com.example.fragmentguide0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnShowFragment;
    private Button btnCloseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowFragment = findViewById(R.id.btnShowFragment);
        btnCloseApp = findViewById(R.id.btnCloseApp);


        btnShowFragment.setOnClickListener(v -> {
            Fragment dynamicFragment = new DynamicFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, dynamicFragment)
                    .commit();
        });


        btnCloseApp.setOnClickListener(v -> finish());
    }
}