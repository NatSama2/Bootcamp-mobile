package com.example.triviaapp2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        assert navHostFragment != null;


        String nombreUsuario = getIntent().getStringExtra("nombreUsuario");
        Bundle bundle = new Bundle();
        bundle.putString("nombreUsuario", nombreUsuario);
        navHostFragment.getNavController().setGraph(R.navigation.nav_graph, bundle);
    }
}