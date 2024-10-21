package com.example.eje13_contrasea

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eje13_contrasea.presenter.PasswordPresenter
import com.example.eje13_contrasea.view.PasswordView

class MainActivity : AppCompatActivity(), PasswordView {

    private lateinit var presenter: PasswordPresenter
    private lateinit var passwordInput: EditText
    private lateinit var passwordStrength: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa las vistas aquí
        passwordInput = findViewById(R.id.passwordInput)
        passwordStrength = findViewById(R.id.passwordStrength)

        presenter = PasswordPresenter(this)
        passwordInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                presenter.onPasswordChanged(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    override fun updatePasswordStrength(strength: String) {
        passwordStrength.text = strength
    }
}
