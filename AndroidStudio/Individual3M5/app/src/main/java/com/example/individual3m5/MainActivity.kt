package com.example.individual3m5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.individual3m5.ui.theme.Individual3M5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Individual3M5Theme {
                Column(modifier = Modifier.fillMaxSize()) {
                    FirstExercise()
                    SecondExercise()
                    ThirdExercise()
                }
            }
        }
    }
}

// Primer ejercicio
@Composable
fun FirstExercise() {
    // Declarar tres variables numéricas
    val num1 = 10
    val num2 = 33
    val num3 = 66

     val suma = num1 + num2 + num3
    println("La suma de los números es: $suma")

    val nuevoNum1 = 55
    println("El nuevo valor de num1 es: $nuevoNum1")

    val promedio = (num1 + num2 + num3) / 3.0
    println("El promedio de los números es: $promedio")

    Text(text = "Suma: $suma, Promedio: $promedio")
}

// Segundo ejercicio
@Composable
fun SecondExercise() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {

        println("Name: $name")
        println("Age: $age")
        hobby?.let {
            println("Likes to $hobby.")
        } ?: run {
            println("Doesn't have a hobby.")
        }
        referrer?.let {
            println("Has a referrer named ${it.name}, who likes to ${it.hobby}.")
        } ?: run {
            println("Doesn't have a referrer.")
        }
    }
}

// Tercer ejercicio
@Composable
fun ThirdExercise() {
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    return bid?.amount ?: minimumPrice
}