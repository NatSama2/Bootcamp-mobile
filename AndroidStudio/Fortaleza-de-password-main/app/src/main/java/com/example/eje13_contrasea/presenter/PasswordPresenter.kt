package com.example.eje13_contrasea.presenter

import com.example.eje13_contrasea.model.PasswordModel
import com.example.eje13_contrasea.view.PasswordView

class PasswordPresenter (private val view: PasswordView){
    private val model = PasswordModel()
    fun onPasswordChanged(password: String) {
        val strength = model.getPasswordStrength(password)
        view.updatePasswordStrength(strength)
    }
}