package com.example.individual10m5

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private val conversionRates = mapOf(
        "USD to EUR" to 0.85,
        "EUR to USD" to 1.18,
        "USD to CLP" to 840.00,
        "CLP to USD" to 0.0012
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val amountEditText = findViewById<EditText>(R.id.amountEditText)
        val currencySpinner = findViewById<Spinner>(R.id.currencySpinner)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val resetButton = findViewById<Button>(R.id.resetButton)


        val options = listOf("USD to EUR", "EUR to USD", "USD to CLP", "CLP to USD")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        currencySpinner.adapter = adapter


        convertButton.setOnClickListener {
            val amount = amountEditText.text.toString().toDoubleOrNull()
            val selectedConversion = currencySpinner.selectedItem.toString()

            if (amount != null && conversionRates.containsKey(selectedConversion)) {
                val conversionRate = conversionRates[selectedConversion] ?: 1.0
                val convertedAmount = amount * conversionRate
                resultTextView.text = "Converted Amount: $convertedAmount"
            } else {
                resultTextView.text = "Invalid input or conversion."
            }
        }


        resetButton.setOnClickListener {
            amountEditText.text.clear()
            resultTextView.text = ""
        }
    }
}