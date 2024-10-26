package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.agro_t2.databinding.ActivityMainRatingBinding

class MainRating : AppCompatActivity() {
    lateinit var binding: ActivityMainRatingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainRatingBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenu -> {
                    val intent = Intent(this@MainRating, orderActivity::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenu -> {
                    val intent = Intent(this@MainRating, OrderHistory::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenu -> {
                    val intent = Intent(this@MainRating, MainRating::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenu -> {
                    val intent = Intent(this@MainRating, Chat_Contoller::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenu -> {
                    val intent = Intent(this@MainRating, settings::class.java)
                    startActivity(intent)
                }
            }
            true
        }










    }
}