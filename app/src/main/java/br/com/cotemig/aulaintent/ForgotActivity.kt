package br.com.cotemig.aulaintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        var email = findViewById<EditText>(R.id.email)

        email.setText(intent.getStringExtra("email")) // <- "email" - nome do parâmetro


    }
}