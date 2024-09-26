package com.example.calculadorakotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadorakotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botones
        binding.buttonAdd.setOnClickListener {
            val result = add(
                binding.editTextNumber1.text.toString().toInt(),
                binding.editTextNumber2.text.toString().toInt()
            )
            binding.textViewResult.text = "Resultado: $result"
            Log.d("CalculatorApp", "Suma realizada: $result")
        }

        binding.buttonSubtract.setOnClickListener {
            val result = subtract(
                binding.editTextNumber1.text.toString().toInt(),
                binding.editTextNumber2.text.toString().toInt()
            )
            binding.textViewResult.text = "Resultado: $result"
            Log.d("CalculatorApp", "Resta realizada: $result")
        }

        binding.buttonMultiply.setOnClickListener {
            val result = multiply(
                binding.editTextNumber1.text.toString().toInt(),
                binding.editTextNumber2.text.toString().toInt()
            )
            binding.textViewResult.text = "Resultado: $result"
            Log.d("CalculatorApp", "Multiplicación realizada: $result")
        }

        binding.buttonDivide.setOnClickListener {
            val number2 = binding.editTextNumber2.text.toString().toInt()
            if (number2 != 0) {
                val result = divide(
                    binding.editTextNumber1.text.toString().toInt(),
                    number2
                )
                binding.textViewResult.text = "Resultado: $result"
                Log.d("CalculatorApp", "División realizada: $result")
            } else {
                binding.textViewResult.text = "Error: División por cero"
                Log.d("CalculatorApp", "Error: División por cero")
            }
        }
    }

    // Funciones para las operaciones
    private fun add(a: Int, b: Int): Int = a + b

    private fun subtract(a: Int, b: Int): Int = a - b

    private fun multiply(a: Int, b: Int): Int = a * b

    private fun divide(a: Int, b: Int): Int = a / b
}