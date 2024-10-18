package com.example.individual9m5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val resultTextView = findViewById<TextView>(R.id.resultTextView)


        val buttonFilter1 = findViewById<Button>(R.id.buttonFilter1)
        buttonFilter1.setOnClickListener {

            val filteredList = numbersList.filter { it.contains("o") }
            resultTextView.text = filteredList.joinToString(", ")
        }


        val buttonFilter2 = findViewById<Button>(R.id.buttonFilter2)
        buttonFilter2.setOnClickListener {

            val filteredList = instanceList.filterIsInstance<String>()
            resultTextView.text = filteredList.joinToString(", ")
        }


        val buttonFilter3 = findViewById<Button>(R.id.buttonFilter3)
        buttonFilter3.setOnClickListener {

            val sortedList = unsortedList.sorted()
            resultTextView.text = sortedList.joinToString(", ")
        }
    }
}