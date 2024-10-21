package com.example.eje13_contrasea.model

class PasswordModel {
    fun getPasswordStrength(password: String): String {
        return when {
            password.length < 6 -> "Contraseña muy débil"
            password.length < 10 -> "Contraseña débil"
            password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{10,}".toRegex()) -> "Contraseña fuerte"
            else -> "Contraseña moderada"
        }
    }
}