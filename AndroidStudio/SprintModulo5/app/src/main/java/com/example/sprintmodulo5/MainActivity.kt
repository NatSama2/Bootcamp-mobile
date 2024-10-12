package com.example.sprintmodulo5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var shoeAdapter: ShoeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shoeList = getShoeList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        shoeAdapter = ShoeAdapter(shoeList) { shoe ->
            // Aquí puedes implementar la navegación al detalle del zapato
        }
        recyclerView.adapter = shoeAdapter
    }

    // Lista de productos (zapatos)
    private fun getShoeList(): List<Shoe> {
        return listOf(
            Shoe("Zapato 1", "https://nyplovers.cl/wp-content/uploads/2023/04/Zapatillas-pikachu-pokemon-anime-nyplovers-naruto-dragon-ball-one-piece-demon-slayer-kimetsu-no-yaiba-otaku-02.png", 99.99),
            Shoe("Zapato 2", "https://nyplovers.cl/wp-content/uploads/2023/07/charmander-zapatillaspokemonanimeregaloninospikachupokemongo-nyplovers-01-600x600.jpg", 79.99),
            Shoe("Zapato 3", "https://ae01.alicdn.com/kf/S6be690fc57764bdb871778318fa3a49a2.jpg_960x960.jpg", 149.99),
            Shoe("Zapato 4", "https://home.ripley.cl/store/Attachment/WOP/D312/2000391957042/2000391957042-1.jpg", 129.99),
            Shoe("Zapato 5", "https://home.ripley.cl/store/Attachment/WOP/D312/2000391957592/2000391957592_2.jpg", 109.99)
        )
    }
}