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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val userEmail: EditText = findViewById(R.id.user_email_reg)
        val userLogin: EditText = findViewById(R.id.user_login_reg)
        val userPass: EditText = findViewById(R.id.user_pass_reg)
        val buttonReg: Button = findViewById(R.id.button_reg)
        val textToAuth: TextView = findViewById(R.id.textToAuth_reg)

        buttonReg.setOnClickListener {
            val email = userEmail.text.toString()
            val login = userLogin.text.toString()
            val pass = userPass.text.toString()
            if (email == "" || login == "" || pass == "")
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            else {
                val user = User(login, email, pass)
                Toast.makeText(
                    this, "Пользователь $login успешно зарегистрирован",
                    Toast.LENGTH_LONG).show()
                }


        }



        textToAuth.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }







    }
}