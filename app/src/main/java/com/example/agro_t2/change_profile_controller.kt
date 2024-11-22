package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityChangeProfileControllerBinding

class change_profile_controller : AppCompatActivity() {
    lateinit var binding: ActivityChangeProfileControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChangeProfileControllerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenuController -> {
                    val intent = Intent(this@change_profile_controller, DriveOorderController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenuController -> {
                    val intent = Intent(this@change_profile_controller, ChatControllerController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenuController -> {
                    val intent = Intent(this@change_profile_controller, RatingController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenuController -> {
                    val intent = Intent(this@change_profile_controller, DriverOrderController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenuController -> {
                    val intent = Intent(this@change_profile_controller, SettingsController::class.java)
                    startActivity(intent)
                }
            }
            when(it.itemId){
                R.id.reportNavMenuController ->{
                    val intent = Intent(this@change_profile_controller, ReportController::class.java)
                    startActivity(intent)
                }
            }
            true
        }



    }
}