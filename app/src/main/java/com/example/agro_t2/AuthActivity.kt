package com.example.agro_t2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
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

        val loginAuth: EditText = findViewById(R.id.user_login_auth)
        val passAuth: EditText = findViewById(R.id.user_pass_auth)
        val buttonAuth: Button = findViewById(R.id.button)
        val textToReg: TextView = findViewById(R.id.textToReg_auth)


        buttonAuth.setOnClickListener {
            val login = loginAuth.text.toString()
            val pass = passAuth.text.toString()


                if (login == "" || pass == "")
                    Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
                else {
                    if ((login == "dri") && (pass == "dri")) {
                        Toast.makeText(this, "Успешный вход", Toast.LENGTH_LONG).show()
                        val intentLogIn = Intent(this, orderActivity::class.java)
                        startActivity(intentLogIn)
                    }
                    if ((login == "con") && (pass == "con")) {
                        Toast.makeText(this, "Успешный вход", Toast.LENGTH_LONG).show()
                        val intentLogIn = Intent(this, DriveOorderController::class.java)
                        startActivity(intentLogIn)
                    }
            }

        }
    }
}