package com.example.temperatura

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Conversor de temperatura")
    println("Selecciona la opción de conversión:")
    println("1: Celsius a Fahrenheit")
    println("2: Kelvin a Celsius")
    println("3: Fahrenheit a Kelvin")

    print("Ingresa tu opción (1, 2 o 3): ")
    val opcion = scanner.nextInt()

    when (opcion) {
        1 -> {
            print("Ingresa la temperatura en grados Celsius: ")
            val celsius = scanner.nextDouble()
            val fahrenheit = celsiusToFahrenheit(celsius)
            println("${String.format("%.2f", celsius)} grados Celsius son ${String.format("%.2f", fahrenheit)} grados Fahrenheit.")
        }
        2 -> {
            print("Ingresa la temperatura en grados Kelvin: ")
            val kelvin = scanner.nextDouble()
            val celsius = kelvinToCelsius(kelvin)
            println("${String.format("%.2f", kelvin)} grados Kelvin son ${String.format("%.2f", celsius)} grados Celsius.")
        }
        3 -> {
            print("Ingresa la temperatura en grados Fahrenheit: ")
            val fahrenheit = scanner.nextDouble()
            val kelvin = fahrenheitToKelvin(fahrenheit)
            println("${String.format("%.2f", fahrenheit)} grados Fahrenheit son ${String.format("%.2f", kelvin)} grados Kelvin.")
        }
        else -> println("Opción no válida. Por favor, selecciona 1, 2 o 3.")
    }
}

// Celsius a Fahrenheit
fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}

//  Kelvin a Celsius
fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

//  Fahrenheit a Kelvin
fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5/9 + 273.15
}