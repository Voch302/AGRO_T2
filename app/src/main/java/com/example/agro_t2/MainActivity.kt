package com.example.agro_t2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val user_email:EditText = findViewById(R.id.user_email_reg)
        val user_login:EditText = findViewById(R.id.user_login_reg)
        val user_pass:EditText = findViewById(R.id.user_pass_reg)
        val button_reg:Button = findViewById(R.id.button_reg)








    }
}