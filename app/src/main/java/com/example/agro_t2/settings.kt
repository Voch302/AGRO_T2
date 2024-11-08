package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.agro_t2.databinding.ActivitySettingsBinding

class settings : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySettingsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val notifButton:Button = findViewById(R.id.button5)
        val changeProfileButton: Button = findViewById(R.id.buttonNewProfile)
        val changePassButton: Button = findViewById(R.id.button6)
        val aboutButton:Button =findViewById(R.id.button7)
        val buttonExit: Button = findViewById(R.id.buttonExitAccount)

        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenu -> {
                    val intent = Intent(this@settings, orderActivity::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenu -> {
                    val intent = Intent(this@settings, OrderHistory::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenu -> {
                    val intent = Intent(this@settings, MainRating::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenu -> {
                    val intent = Intent(this@settings, Chat_Contoller::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenu -> {
                    val intent = Intent(this@settings, settings::class.java)
                    startActivity(intent)
                }
            }
            true
        }


        notifButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }
        changeProfileButton.setOnClickListener {
            val intent = Intent(this, change_profile::class.java)
            startActivity(intent)
        }
        changePassButton.setOnClickListener {
            val intent = Intent(this, change_pass::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {
            val intent = Intent(this, about::class.java)
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