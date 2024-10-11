package com.example.individual7m5

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var saldo: Double = 1000.0 // Saldo inicial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val buttonOK: Button = findViewById(R.id.btnOK)

        buttonOK.setOnClickListener {

            when (radioGroup.checkedRadioButtonId) {
                R.id.rbVerSaldo -> verSaldo()
                R.id.rbIngresar -> ingresarDinero()
                R.id.rbRetirar -> retirarDinero()
                R.id.rbSalir -> salir()
                else -> Toast.makeText(this, "Seleccione una opción", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun verSaldo() {
        Toast.makeText(this, "Su saldo es: $$saldo", Toast.LENGTH_LONG).show()
    }


    private fun ingresarDinero() {
        val montoIngresar = 100.0
        saldo += montoIngresar
        Toast.makeText(this, "Has ingresado $$montoIngresar. Saldo actualizado: $$saldo", Toast.LENGTH_LONG).show()
    }

    private fun retirarDinero() {
        val montoRetirar = 50.0
        if (montoRetirar > saldo) {
            Toast.makeText(this, "No puedes retirar más dinero del saldo disponible.", Toast.LENGTH_LONG).show()
        } else {
            saldo -= montoRetirar
            Toast.makeText(this, "Has retirado $$montoRetirar. Saldo restante: $$saldo", Toast.LENGTH_LONG).show()
        }
    }

    // Función para salir de la app
    private fun salir() {
        finishAffinity()
    }
}