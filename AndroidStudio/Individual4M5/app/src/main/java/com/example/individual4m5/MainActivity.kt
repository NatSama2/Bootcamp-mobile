package com.example.individual4m5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foldablePhone = FoldablePhone()

        // Acciones en el teléfono plegable
        foldablePhone.switchOn()
        foldablePhone.fold()
        foldablePhone.unfold()
        foldablePhone.switchOn()
        foldablePhone.checkPhoneScreenLight()

        // Mostramos el resultado en un TextView
        val resultTextView: TextView = findViewById(R.id.resultTextView)
        resultTextView.text = "Foldable phone screen: ${if (foldablePhone.isScreenLightOn) "on" else "off"}"
    }
}