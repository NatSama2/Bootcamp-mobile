package com.example.individual6m5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.math.RoundingMode
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val sumButton = findViewById<Button>(R.id.btnSum)
        val roundButton = findViewById<Button>(R.id.btnRound)
        val formatButton = findViewById<Button>(R.id.btnFormat)

        // Botón para la suma
        sumButton.setOnClickListener {
            val result = suma(10.5, 5.0f)
            resultTextView.text = "Resultado de la suma: $result"
        }

        // Botón para redondear
        roundButton.setOnClickListener {
            val result = redondeo(15.73)
            resultTextView.text = "Resultado redondeado: $result"
        }

        // Botón para mostrar en formato de moneda
        formatButton.setOnClickListener {
            val result = muestraResultado(1234.56)
            resultTextView.text = "Formato de moneda: $result"
        }
    }

    // Función suma
    private fun suma(a: Double, b: Float): Double {
        return a + b
    }

    // Función redondeo
    private fun redondeo(num: Double): Double {
        return num.toBigDecimal().setScale(0, RoundingMode.UP).toDouble()
    }

    // Función resultado en formato de moneda
    private fun muestraResultado(num: Double): String {
        val format = NumberFormat.getCurrencyInstance(Locale.getDefault())
        return format.format(num)
    }
}