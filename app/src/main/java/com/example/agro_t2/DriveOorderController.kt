package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityDriveOorderControllerBinding

class DriveOorderController : AppCompatActivity() {
    lateinit var binding: ActivityDriveOorderControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDriveOorderControllerBinding.inflate(layoutInflater)

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
                    val intent = Intent(this, RatingController::class.java)
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