package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityAboutControllerBinding

class about_controller : AppCompatActivity() {
    lateinit var binding: ActivityAboutControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAboutControllerBinding.inflate(layoutInflater)

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
                R.id.StatisticsNavMenuController -> {
                    val intent = Intent(this, statistics_controller::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenuController -> {
                    val intent = Intent(this, SettingsController::class.java)
                    startActivity(intent)
                }
            }
            when(it.itemId){
                R.id.reportNavMenuController ->{
                    val intent = Intent(this, ReportController::class.java)
                    startActivity(intent)
                }
            }
            true
        }



    }
}