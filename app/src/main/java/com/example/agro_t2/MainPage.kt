package com.example.agro_t2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.TextView
import com.example.agro_t2.databinding.ActivityMainPageBinding

class MainPage : AppCompatActivity() {
    lateinit var binding: ActivityMainPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainPageBinding.inflate(layoutInflater)

        setContentView(binding.root)

            binding.nav.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.orderNavMenu -> {
                        val intent = Intent(this, orderActivity::class.java)
                        startActivity(intent)
                    }
                }
                when (it.itemId) {
                    R.id.orderHistoryNavMenu -> {
                        val intent = Intent(this, OrderHistory::class.java)
                        startActivity(intent)
                    }
                }
                when (it.itemId) {
                    R.id.ratingNavMenu -> {
                        val intent = Intent(this, MainRating::class.java)
                        startActivity(intent)
                    }
                }
                when (it.itemId) {
                    R.id.controllerNavMenu -> {
                        val intent = Intent(this, Chat_Contoller::class.java)
                        startActivity(intent)
                    }
                }
                when (it.itemId) {
                    R.id.settingsNavMenu -> {
                        val intent = Intent(this, settings::class.java)
                        startActivity(intent)
                    }
                }
                true
            }

    }
}