package com.example.agro_t2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AuthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        val emailAuth: EditText = findViewById(R.id.user_email_auth)
        val passAuth: EditText = findViewById(R.id.user_pass_auth)
        val buttonAuth: Button = findViewById(R.id.button)
        val textToReg: TextView = findViewById(R.id.textToReg_auth)

        buttonAuth.setOnClickListener {
            val email = emailAuth.text.toString()
            val pass = passAuth.text.toString()

            if (email == "" || pass == "")
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Успешный вход", Toast.LENGTH_LONG).show()
        }


        textToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




    }
}

