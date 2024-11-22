package com.example.agro_t2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView

import com.example.agro_t2.databinding.ActivityStatisticsControllerBinding


class statistics_controller : AppCompatActivity() {
    lateinit var binding: ActivityStatisticsControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityStatisticsControllerBinding.inflate(layoutInflater)

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