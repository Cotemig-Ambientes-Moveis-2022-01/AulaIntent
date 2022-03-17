package br.com.cotemig.aulaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            loginClick()
        }

        var btnForgot = findViewById<Button>(R.id.btnForgot)

        btnForgot.setOnClickListener {
            forgotClick()
        }
    }

    fun forgotClick() {
        var email = findViewById<EditText>(R.id.email)

        var intent = Intent(this, ForgotActivity::class.java) // Criando uma Intent "abrir uma Activity"
        intent.putExtra("email", email.text.toString()) // <--- adicionando um parâmetro chamado email na intent
        startActivity(intent) // iniciando Activity

        finish()
    }

    fun loginClick() {
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)

        if (email.text.toString() == "dirceu@cotemig.com.br" &&
            password.text.toString() == "123"
        ) {

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()

        }

    }
}