package com.example.individual5m5

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<EditText>(R.id.input_name)
        val inputLastName = findViewById<EditText>(R.id.input_lastname)
        val inputAge = findViewById<EditText>(R.id.input_age)
        val inputEmail = findViewById<EditText>(R.id.input_email)
        val spinnerHealthSystem = findViewById<Spinner>(R.id.spinner_health_system)
        val registerButton = findViewById<Button>(R.id.btn_register)
        val outputText = findViewById<TextView>(R.id.output_text)


        registerButton.setOnClickListener {
            val name = inputName.text.toString()
            val lastName = inputLastName.text.toString()
            val age = inputAge.text.toString().toIntOrNull()
            val email = inputEmail.text.toString()
            val healthSystem = spinnerHealthSystem.selectedItem.toString()

            if (validateInput(name, lastName, age, email)) {
                val userInfo = "Nombre: $name\nApellido: $lastName\nEdad: $age\nCorreo: $email\nSistema de Salud: $healthSystem"
                outputText.text = userInfo
                outputText.visibility = TextView.VISIBLE
            } else {
                Toast.makeText(this, "Por favor, ingrese datos válidos", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun validateInput(name: String, lastName: String, age: Int?, email: String): Boolean {
        if (name.isBlank() || lastName.isBlank() || age == null || !email.contains("@")) {
            return false
        }
        return true
    }
}