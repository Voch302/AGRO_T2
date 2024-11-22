package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        val notifButton: Button = findViewById(R.id.button15)
        val changeProfileButton: Button = findViewById(R.id.button16)
        val changePassButton: Button = findViewById(R.id.button17)
        val aboutButton: Button =findViewById(R.id.button18)
        val buttonExit: Button = findViewById(R.id.button19)





        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenuController -> {
                    val intent = Intent(this@SettingsController, DriveOorderController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenuController -> {
                    val intent = Intent(this@SettingsController, ChatControllerController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenuController -> {
                    val intent = Intent(this@SettingsController, RatingController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenuController -> {
                    val intent = Intent(this@SettingsController, DriverOrderController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenuController -> {
                    val intent = Intent(this@SettingsController, SettingsController::class.java)
                    startActivity(intent)
                }
            }
            when(it.itemId){
                R.id.reportNavMenuController ->{
                    val intent = Intent(this@SettingsController, ReportController::class.java)
                    startActivity(intent)
                }
            }
            true
        }


        notifButton.setOnClickListener {
            val intent = Intent(this, notification_controller::class.java)
            startActivity(intent)
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