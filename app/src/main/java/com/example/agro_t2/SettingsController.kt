package com.example.agro_t2

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivitySettingsControllerBinding

class SettingsController : AppCompatActivity() {
    lateinit var binding: ActivitySettingsControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySettingsControllerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val notifButton: Button = findViewById(R.id.button_notification)
        val changeProfileButton: Button = findViewById(R.id.button_edit_profile)
        val changePassButton: Button = findViewById(R.id.button_change_password)
        val aboutButton: Button =findViewById(R.id.button_about)
        val buttonExit: Button = findViewById(R.id.button_logout)





        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.OrderListNavMenuController -> {
                    val intent = Intent(this, DriverOrderListController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ChatWithDriverNavMenuController -> {
                    val intent = Intent(this, ChatControllerController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenuController -> {
                    val intent = Intent(this, RatingForController::class.java)
                    startActivity(intent)
                }
            }

            when (it.itemId) {
                R.id.settingsNavMenuController -> {
                    val intent = Intent(this, SettingsController::class.java)
                    startActivity(intent)
                }
            }

            true
        }


        var isGreen = false

        notifButton.setOnClickListener {
            if (isGreen) {
                notifButton.setBackgroundColor(Color.RED)
                Toast.makeText(this, "Уведомления выключены", Toast.LENGTH_LONG).show()
            } else {
                notifButton.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "Уведомления включены", Toast.LENGTH_LONG).show()
            }
            isGreen = !isGreen
        }
        changeProfileButton.setOnClickListener {
            val intent = Intent(this, change_profile_controller::class.java)
            startActivity(intent)
        }
        changePassButton.setOnClickListener {
            val intent = Intent(this, change_pass_controller::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {
            val intent = Intent(this, about_controller::class.java)
            startActivity(intent)
        }






        buttonExit.setOnClickListener{
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            // когда будет бд :
            // приравнять данные пользователя к 0
        }



    }
}