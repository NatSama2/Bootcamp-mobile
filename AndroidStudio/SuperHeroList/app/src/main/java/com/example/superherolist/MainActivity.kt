package com.example.superherolist

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val superheroList = mutableListOf<Superhero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val addHeroButton = findViewById<Button>(R.id.btnAddHero)


        addHeroButton.setOnClickListener {
            addSuperheroes()
            resultTextView.text = superheroList.joinToString(separator = "\n") { hero ->
                "${hero.superhero} - ${hero.publisher} - ${hero.realName} - ${hero.photo}"
            }
        }
    }

    private fun addSuperheroes() {
        superheroList.add(Superhero("Spider-Man", "Marvel", "Peter Parker", "spiderman_photo.jpg"))
        superheroList.add(Superhero("Batman", "DC", "Bruce Wayne", "batman_photo.jpg"))
        superheroList.add(Superhero("Superman", "DC", "Clark Kent", "superman_photo.jpg"))
    }
}