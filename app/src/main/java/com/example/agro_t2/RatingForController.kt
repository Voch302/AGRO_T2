package com.example.agro_t2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView

import com.example.agro_t2.databinding.ActivityRatingForControllerBinding


class RatingForController : AppCompatActivity() {
    lateinit var binding: ActivityRatingForControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRatingForControllerBinding.inflate(layoutInflater)

        setContentView(binding.root)

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



    }
}