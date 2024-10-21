package com.example.eje8_reciclerview;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SearchView searchView;
    CustomAdapter customAdapter;
    ArrayList<CustomModel> customModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemDisplay();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

    }

    private void filter(String newText) {
        ArrayList<CustomModel> filteredList = new ArrayList<>();
        for (CustomModel item : customModelArrayList) {
            if (item.getTitle().toLowerCase().contains(newText.toLowerCase())) {
                filteredList.add(item);
            }
            customAdapter.filterList(filteredList);
        }


    }
    private void itemDisplay(){
        customModelArrayList.add(new CustomModel(R.drawable.python,"Python","Programación en Python"));
        customModelArrayList.add(new CustomModel(R.drawable.java,"Java","Programación en Java"));
        customModelArrayList.add(new CustomModel(R.drawable.kotlin,"Kotlin","Programación en Kotlin"));
        customModelArrayList.add(new CustomModel(R.drawable.csharp,"C#","Programación en C#"));
        customModelArrayList.add(new CustomModel(R.drawable.c,"C","Programación en C"));
        customModelArrayList.add(new CustomModel(R.drawable.cpp,"C++","Programación en C++"));
        customModelArrayList.add(new CustomModel(R.drawable.php,"PHP","Programación en PHP"));
        customModelArrayList.add(new CustomModel(R.drawable.ruby,"Ruby","Programación en Ruby"));
        customModelArrayList.add(new CustomModel(R.drawable.swift,"Swift","Programación en Swift"));
        customModelArrayList.add(new CustomModel(R.drawable.typescript,"TypeScript","Programación en TypeScript"));
        customModelArrayList.add(new CustomModel(R.drawable.javascript,"JavaScript","Programación en JavaScript"));
        customModelArrayList.add(new CustomModel(R.drawable.css,"CSS","Diseño y estilos con CSS3"));


        customAdapter = new CustomAdapter(this, customModelArrayList);
        recyclerView.setAdapter(customAdapter);
    }
}