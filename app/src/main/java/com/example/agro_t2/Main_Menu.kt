package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.agro_t2.User


class Main_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)

        val user = User()
        val emailMainMenu: TextView = findViewById(R.id.email_main_menu)
        emailMainMenu.text = user.login
        val SNP: TextView = findViewById(R.id.SNP_main_menu)

        val buttonToOrder: TextView = findViewById(R.id.ToOrder_main_menu)
        val buttonToOrderHistory: TextView = findViewById(R.id.ToOrderHistory_main_menu)
        val buttonToRating: TextView = findViewById(R.id.ToRating_main_menu)
        val buttonToChatController: TextView = findViewById(R.id.ToChatController_main_menu)
        val buttonToSettings: TextView = findViewById(R.id.ToSettings_main_menu)

        buttonToOrder.setOnClickListener {
            val intent: Intent = Intent(this, orderActivity::class.java)
            startActivity(intent)
        }
        buttonToSettings.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        buttonToOrderHistory.setOnClickListener {
            val intent = Intent(this, orderActivity::class.java)
            startActivity(intent)
        }
/*
        buttonToChatController.setOnClickListener {
            val intent = Intent(this, ChatController::class.java)
            startActivity(intent)
        }

        buttonToRating.setOnClickListener {
            val intent = Intent(this, Rating::class.java)
            startActivity(intent)
        }
*/


    }
}